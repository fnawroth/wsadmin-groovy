/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Creates a supported entity type configuration.
*/
@Generated("with GenerateAdminCommands")
class CreateIdMgrSupportedEntityTypeCmd extends AdminCmd<Void> {
    CreateIdMgrSupportedEntityTypeCmd() {
        super("createIdMgrSupportedEntityType")
    }

    /**
     * The name of the supported entity type.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The default parent of the supported entity type. By default, this is where the supported entity type is created.
     */
    def 'defaultParent'(String value) {
        parameter("defaultParent", value)
    }

    /**
     * A semicolon separated list of relative distinguished name properties for the supported entity. To reset all the values of the rdnProperties parameter, specify a blank string ("").
     */
    def 'rdnProperties'(String value) {
        parameter("rdnProperties", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
