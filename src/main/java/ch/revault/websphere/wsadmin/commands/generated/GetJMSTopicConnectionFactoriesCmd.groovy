/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get the available JMS connection factories
*/
@Generated("with GenerateAdminCommands")
class GetJMSTopicConnectionFactoriesCmd extends AdminCmd<Void> {
    GetJMSTopicConnectionFactoriesCmd() {
        super("getJMSTopicConnectionFactories")
    }

    /**
     * The type of object to be used with this provider
     */
    def 'allscopes'(java.lang.Boolean value) {
        parameter("allscopes", value)
    }

}
