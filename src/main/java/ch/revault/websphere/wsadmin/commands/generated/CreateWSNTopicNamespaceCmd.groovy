/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a WS-Notification topic namespace
*/
@Generated("with GenerateAdminCommands")
class CreateWSNTopicNamespaceCmd extends AdminCmd<Void> {
    CreateWSNTopicNamespaceCmd() {
        super("createWSNTopicNamespace")
    }

    /**
     * Namespace of the WS-Notification topic namespace
     */
    def 'namespace'(String value) {
        parameter("namespace", value)
    }

    /**
     * Name of the service integration bus topic space to assign to this WS-Notification topic namespace
     */
    def 'busTopicSpace'(String value) {
        parameter("busTopicSpace", value)
    }

    /**
     * The service integration bus reliability to be applied to all messages published using this topic namespace
     */
    def 'reliability'(String value) {
        parameter("reliability", value)
    }

}
