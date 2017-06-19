/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Show the properties of a WSNTopicNamespace object in a human readable form.
*/
@Generated("with GenerateAdminCommands")
class ShowWSNTopicNamespaceCmd extends AdminCmd<Void> {
    ShowWSNTopicNamespaceCmd() {
        super("showWSNTopicNamespace")
    }

    /**
     * Namespace
     */
    def 'namespace'(String value) {
        parameter("namespace", value)
    }

}
