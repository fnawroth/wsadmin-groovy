/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a new Server Type e.g. (APPLICATION_SERVER)
*/
@Generated("with GenerateAdminCommands")
class CreateServerTypeCmd extends AdminCmd<Void> {
    CreateServerTypeCmd() {
        super("createServerType")
    }

    /**
     * The Product Version
     */
    def 'version'(String value) {
        parameter("version", value)
    }

    /**
     * The ServerType eg: APPLICATION_SERVER
     */
    def 'serverType'(String value) {
        parameter("serverType", value)
    }

    /**
     * The Command used to create a Server Template
     */
    def 'createTemplateCommand'(String value) {
        parameter("createTemplateCommand", value)
    }

    /**
     * The Command used to create a Server
     */
    def 'createCommand'(String value) {
        parameter("createCommand", value)
    }

    /**
     * The name of the default Template (non-z/OS)
     */
    def 'defaultTemplateName'(String value) {
        parameter("defaultTemplateName", value)
    }

    /**
     * The name of the default z/OS Template (non-z/OS)
     */
    def 'defaultzOSTemplateName'(String value) {
        parameter("defaultzOSTemplateName", value)
    }

    /**
     * The name of the Config Validator class
     */
    def 'configValidator'(String value) {
        parameter("configValidator", value)
    }

}
