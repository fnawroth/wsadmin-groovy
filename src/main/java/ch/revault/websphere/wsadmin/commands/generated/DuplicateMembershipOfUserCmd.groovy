/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Makes a user a member of the same groups as another user.
*/
@Generated("with GenerateAdminCommands")
class DuplicateMembershipOfUserCmd extends AdminCmd<Void> {
    DuplicateMembershipOfUserCmd() {
        super("duplicateMembershipOfUser")
    }

    /**
     * The uniqueName of the virtual member manager entity to add to the same groups as the specified copyFromUniqueName entity.
     */
    def 'copyToUniqueName'(String value) {
        parameter("copyToUniqueName", value)
    }

    /**
     * The uniqueName of the virtual member manager entity from which the membership is copied.
     */
    def 'copyFromUniqueName'(String value) {
        parameter("copyFromUniqueName", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
