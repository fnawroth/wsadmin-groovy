/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Remove feature pack or stack product features from existing server
*/
@Generated("with GenerateAdminCommands")
class RemoveFeaturesFromServerCmd extends AdminCmd<Void> {
    RemoveFeaturesFromServerCmd() {
        super("removeFeaturesFromServer")
    }

    /**
     * Node name of server
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * Server name which require update with features being removed
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

    /**
     * Feature pack or stack product template that needs to be removed from the server
     */
    def 'featureTemplateName'(String value) {
        parameter("featureTemplateName", value)
    }

    /**
     * Servertype of Feature pack or stack product template that needs to be added to the server
     */
    def 'serverType'(String value) {
        parameter("serverType", value)
    }

}
