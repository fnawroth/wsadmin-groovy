/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Updates the configuration of the specified realm.
*/
@Generated("with GenerateAdminCommands")
class UpdateIdMgrRealmCmd extends AdminCmd<Void> {
    UpdateIdMgrRealmCmd() {
        super("updateIdMgrRealm")
    }

    /**
     * Name of the realm.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * A string that indicates if this realm is currently used in security, currently not used in security, but used later, or is never used in security. Acceptable values include 'active', 'inactive', 'notSelectable'.
     */
    def 'securityUse'(String value) {
        parameter("securityUse", value)
    }

    /**
     * Delimiter used for this realm
     */
    def 'delimiter'(String value) {
        parameter("delimiter", value)
    }

    /**
     * Whether to allow operation if a repository is down.  Default value is false.
     */
    def 'allowOperationIfReposDown'(Boolean value) {
        parameter("allowOperationIfReposDown", value)
    }

}
