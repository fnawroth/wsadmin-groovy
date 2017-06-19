/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes a group from the default realm.
*/
@Generated("with GenerateAdminCommands")
class DeleteGroupCmd extends AdminCmd<Void> {
    DeleteGroupCmd() {
        super("deleteGroup")
    }

    /**
     * The name that uniquely identifies an object of a virtual member manager entity.
     */
    def 'uniqueName'(String value) {
        parameter("uniqueName", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
