/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List all SIB JMS connection factories of the specified type at the specified scope.
*/
@Generated("with GenerateAdminCommands")
class ListSIBJMSConnectionFactoriesCmd extends AdminCmd<Void> {
    ListSIBJMSConnectionFactoriesCmd() {
        super("listSIBJMSConnectionFactories")
    }

    /**
     * Type of SIB JMS connection factory to list - all, queue or topic. If absent, generic SIB JMS connection factories are listed.
     */
    def 'type'(String value) {
        parameter("type", value)
    }

}
