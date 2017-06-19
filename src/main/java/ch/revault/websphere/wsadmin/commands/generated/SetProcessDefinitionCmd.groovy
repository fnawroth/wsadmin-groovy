/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Set the process definition of an application server.
*/
@Generated("with GenerateAdminCommands")
class SetProcessDefinitionCmd extends AdminCmd<Void> {
    SetProcessDefinitionCmd() {
        super("setProcessDefinition")
    }

    /**
     * The name of the Server whose process definition is modified. If there is only one server in the entire configuration, then this parameter is optional.
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

    /**
     * The name of the node. This is only needed for the server scopes that do not have a unique name across nodes.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * The process type of the server.  This is for zOS only.
     */
    def 'processType'(String value) {
        parameter("processType", value)
    }

    /**
     * The executable name that is invoked to start the process. This parameter is only applicable to WebSphere Application Server.
     */
    def 'executableName'(String value) {
        parameter("executableName", value)
    }

    /**
     * The arguments that are passed to the process when it is started. This parameter is only applicable to WebSphere Application Server only.
     */
    def 'executableArguments'(java.lang.String[] value) {
        parameter("executableArguments", value)
    }

    /**
     * This command applies to the z/OS platform only. It specifies the platform-specific command to launch the server process.
     */
    def 'startCommand'(String value) {
        parameter("startCommand", value)
    }

    /**
     * TThis command applies to the z/OS platform only. It specifies any additional arguments required by the start command.
     */
    def 'startCommandArgs'(java.lang.String[] value) {
        parameter("startCommandArgs", value)
    }

    /**
     * This parameter applies to the z/OS platform only. It specifies the platform-specific command to stop the server process
     */
    def 'stopCommand'(String value) {
        parameter("stopCommand", value)
    }

    /**
     * This parameter applies to the z/OS platform only. It specifies any additional arguments required by the stop command.
     */
    def 'stopCommandArgs'(java.lang.String[] value) {
        parameter("stopCommandArgs", value)
    }

    /**
     * This parameter only applies to the z/OS platform. It specifies the platform-specific command to terminate the server process.
     */
    def 'terminateCommand'(String value) {
        parameter("terminateCommand", value)
    }

    /**
     * This parameter only applies to the z/OS platform. It specifies any additional arguments required by the terminate command.
     */
    def 'terminateCommandArgs'(java.lang.String[] value) {
        parameter("terminateCommandArgs", value)
    }

    /**
     * The file system directory that the process uses as its current working directory.
     */
    def 'workingDirectory'(String value) {
        parameter("workingDirectory", value)
    }

    /**
     * The type of the executable target. <JAVA_CLASS | EXECUTABLE_JAR>
     */
    def 'executableTargetKind'(String value) {
        parameter("executableTargetKind", value)
    }

    /**
     * The name of the executable target (a Java class containing a main() method, or the name of an executable jar), depending on the executable target.
     */
    def 'executableTarget'(String value) {
        parameter("executableTarget", value)
    }

}
