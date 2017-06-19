/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create properties file template for create/delete objects
*/
@Generated("with GenerateAdminCommands")
class CreatePropertiesFileTemplatesCmd extends AdminCmd<Void> {
    CreatePropertiesFileTemplatesCmd() {
        super("createPropertiesFileTemplates")
    }

    /**
     * Name of template properties file to create.
     */
    def 'propertiesFileName'(com.ibm.websphere.management.cmdframework.DownloadFile value) {
        parameter("propertiesFileName", value)
    }

    /**
     * Configuration type for which template properties to be created.
     */
    def 'configType'(java.lang.String value) {
        parameter("configType", value)
    }

    /**
     * Options. Applicable only when configType selected is GenericType. Supported options are commandName and configType. When commandName option is used, properties required to execute the specified command will be generated. And when configType option is used, properties required to create a config object of type specified by configType will be generated. Only one option can be specified at a time.
     */
    def 'options'(java.util.Properties value) {
        parameter("options", value)
    }

}
