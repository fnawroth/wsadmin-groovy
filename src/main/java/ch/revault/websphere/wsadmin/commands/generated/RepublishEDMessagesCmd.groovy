/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Use the command to republish messages from the exception destination to the original destination. The messages are picked based on the criteria provided in the command execution.
*/
@Generated("with GenerateAdminCommands")
class RepublishEDMessagesCmd extends AdminCmd<Void> {
    RepublishEDMessagesCmd() {
        super("republishEDMessages")
    }

    /**
     * Name of the bus to which the destination and its exception destination belong.
     */
    def 'busName'(String value) {
        parameter("busName", value)
    }

    /**
     * REPUBLISH_ED_MESSAGES_DEST_PARAM_DESCRIPTION
     */
    def 'destination'(String value) {
        parameter("destination", value)
    }

    /**
     * The subscription name for which the messages have to be picked up. This is a mandatory parameter when the destination provided in the command is a Topic Space. User can specify both durable and nondurable subscription IDs. Note that the nondurable subscription changes with each restart.
     */
    def 'subscriptionId'(String value) {
        parameter("subscriptionId", value)
    }

    /**
     * The selection criteria is used to filter the messages in the Exception destination, in addition to the Destination Name and Subscription ID.
     */
    def 'messageSelector'(String value) {
        parameter("messageSelector", value)
    }

    /**
     * The maximum duration of time the command can execute on the messaging engine. The value needs to be specified in seconds.
     */
    def 'timeout'(Integer value) {
        parameter("timeout", value)
    }

}
