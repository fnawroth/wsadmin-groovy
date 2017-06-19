/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns all managed object metadata properties for a given node.
*/
@Generated("with GenerateAdminCommands")
class GetMetadataPropertiesCmd extends AdminCmd<Void> {
    GetMetadataPropertiesCmd() {
        super("getMetadataProperties")
    }

    /**
     * Name of node.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

}
