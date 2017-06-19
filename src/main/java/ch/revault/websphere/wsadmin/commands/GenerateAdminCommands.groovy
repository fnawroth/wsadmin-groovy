/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands

import ch.revault.websphere.wsadmin.Client
import com.ibm.websphere.management.cmdframework.CommandMgr
import com.ibm.websphere.management.cmdframework.commandmetadata.CommandMetadata
import com.ibm.websphere.management.cmdframework.commandmetadata.ParameterMetadata

/**
 * Created by urs on 6/16/2017.
 */
class GenerateAdminCommands extends BaseCommand<Void> {
    @Override
    Tuple2<Client, Void> execute(Client client) {

        def mgr = CommandMgr.getCommandMgr(client.getClient())
        def metas = mgr.listAllCommands().collect { mgr.getCommandMetadata(it) }
        makeGeneratedScript(metas)
        makeCommands(metas)
        return [client, null]
    }

    private ArrayList<Object> makeCommands(metas) {
        metas.each {
            Object className = className(it)
            File f = new File("./DevEnvSetup/src/main/groovy/ch.revault.websphere.wsadmin/commands/generated",
                    "${className}.groovy")
            def parameters = createParameters(it)

            f.write("""package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* ${it.description}
*/
@Generated("with GenerateAdminCommands")
class ${className} extends AdminCmd<Void> {
    ${className}() {
        super("${it.name}")
    }
${parameters}
}
""")
        }
    }

    private void makeGeneratedScript(metas) {
        def methods = metas.collect {
            """
    /**
     * ${it.description}
     * @param block to configure
     */
    def ${it.name}(@DelegatesTo(${className(it)}) Closure<?> block) {
        runDelegate(new ${className(it)}(), block)
    }
"""
        }.join("")

        new File("./DevEnvSetup/src/main/groovy/ch.revault.websphere.wsadmin", "GeneratedScript.groovy").write(
                """package ch.revault.websphere.wsadmin
import ch.revault.websphere.wsadmin.commands.generated.*
import javax.annotation.Generated

@Generated("with GenerateAdminCommands")
trait GeneratedScript implements ScriptInterface {
${methods}
}""")
    }

    private def className(CommandMetadata meta) {
        "${meta.name.capitalize()}Cmd"
    }

    private String createParameters(CommandMetadata meta) {
        def parameters = new StringBuffer()
        meta.parameters.each { ParameterMetadata param ->

            Object paramType = paramType(param)
            parameters.append("""
    /**
     * ${param.description}
     */
    def '${param.name.replaceAll("[^a-zA-Z0-9_]", "_")}'(${paramType} value) {
        parameter("${param.name}", value)
    }
""")
        }
        parameters.toString()
    }

    private Object paramType(ParameterMetadata param) {
        if (param.type.startsWith("[")) {
            Class.forName(param.type).canonicalName
        } else {
            param.type
        }
    }
}
