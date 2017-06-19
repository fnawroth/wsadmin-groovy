/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List trusted realms trusted by a security realm, resource, or security domain.
*/
@Generated("with GenerateAdminCommands")
class ListTrustedRealmsCmd extends AdminCmd<Void> {
    ListTrustedRealmsCmd() {
        super("listTrustedRealms")
    }

    /**
     * The type of trusted communication.  Valid values are inbound and outbound.
     */
    def 'communicationType'(String value) {
        parameter("communicationType", value)
    }

    /**
     * Realm name for which the a list of trusted realms will be returned.
     */
    def 'securityRealmName'(String value) {
        parameter("securityRealmName", value)
    }

    /**
     * Resource name for which the a list of trusted realms will be returned.
     */
    def 'resourceName'(String value) {
        parameter("resourceName", value)
    }

    /**
     * Security domain name for which the a list of trusted realms will be returned.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Specify true to return the list of all realm name when the trustAllRealms property is enabled, and false to just return trustAllRealms.
     */
    def 'expandRealmList'(Boolean value) {
        parameter("expandRealmList", value)
    }

    /**
     * Specify true to include the current realm in the list of realms or specify false to not inlcude the current realm in the list of trusted realms.
     */
    def 'includeCurrentRealm'(Boolean value) {
        parameter("includeCurrentRealm", value)
    }

}
