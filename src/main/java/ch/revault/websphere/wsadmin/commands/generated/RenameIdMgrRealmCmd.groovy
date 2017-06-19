/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Renames the specified realm configuration.
*/
@Generated("with GenerateAdminCommands")
class RenameIdMgrRealmCmd extends AdminCmd<Void> {
    RenameIdMgrRealmCmd() {
        super("renameIdMgrRealm")
    }

    /**
     * Name of the realm.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The new name of the realm.
     */
    def 'newName'(String value) {
        parameter("newName", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
