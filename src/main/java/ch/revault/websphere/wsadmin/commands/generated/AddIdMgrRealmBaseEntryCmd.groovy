/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Adds a base entry to a specified realm configuration.
*/
@Generated("with GenerateAdminCommands")
class AddIdMgrRealmBaseEntryCmd extends AdminCmd<Void> {
    AddIdMgrRealmBaseEntryCmd() {
        super("addIdMgrRealmBaseEntry")
    }

    /**
     * Name of the realm.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The name of a base entry.
     */
    def 'baseEntry'(String value) {
        parameter("baseEntry", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
