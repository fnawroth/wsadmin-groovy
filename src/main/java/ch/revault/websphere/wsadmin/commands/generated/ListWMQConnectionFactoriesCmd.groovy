/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists the IBM MQ Connection Factories defined at the scope provided to the command.
*/
@Generated("with GenerateAdminCommands")
class ListWMQConnectionFactoriesCmd extends AdminCmd<Void> {
    ListWMQConnectionFactoriesCmd() {
        super("listWMQConnectionFactories")
    }

    /**
     * The type of IBM MQ Connection Factory to list. Valid values are "CF", "QCF", and "TCF".
     */
    def 'type'(String value) {
        parameter("type", value)
    }

}
