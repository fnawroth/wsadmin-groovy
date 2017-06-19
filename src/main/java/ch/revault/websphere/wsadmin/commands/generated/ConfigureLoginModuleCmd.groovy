/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Configures a login module in the administrative security configuration or in an application security domain.
*/
@Generated("with GenerateAdminCommands")
class ConfigureLoginModuleCmd extends AdminCmd<Void> {
    ConfigureLoginModuleCmd() {
        super("configureLoginModule")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Specifies the login module type.  Valid values are: system, application
     */
    def 'loginType'(String value) {
        parameter("loginType", value)
    }

    /**
     * The alias name that identifies the login module entry.
     */
    def 'loginEntryAlias'(String value) {
        parameter("loginEntryAlias", value)
    }

    /**
     * The login module class file name
     */
    def 'loginModule'(String value) {
        parameter("loginModule", value)
    }

    /**
     * Use a login module proxy
     */
    def 'useLoginModuleProxy'(Boolean value) {
        parameter("useLoginModuleProxy", value)
    }

    /**
     * The login module authentication strategy, Values include REQUIRED, REQUISITE, SUFFICIENT, and OPTIONAL.
     */
    def 'authStrategy'(String value) {
        parameter("authStrategy", value)
    }

    /**
     * Specifies a comma separated list of attribute=value custom property pairs to be added to the security object.
     */
    def 'customProperties'(String value) {
        parameter("customProperties", value)
    }

    /**
     * New login module
     */
    def 'newModule'(Boolean value) {
        parameter("newModule", value)
    }

    /**
     * Modify login module specified by the ordinal number starting from 1.
     */
    def 'modifyModule'(Integer value) {
        parameter("modifyModule", value)
    }

}
