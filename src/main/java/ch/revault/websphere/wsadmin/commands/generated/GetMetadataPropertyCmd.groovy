/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns the specified managed object metadata property for agiven node.
*/
@Generated("with GenerateAdminCommands")
class GetMetadataPropertyCmd extends AdminCmd<Void> {
    GetMetadataPropertyCmd() {
        super("getMetadataProperty")
    }

    /**
     * Name of node.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * Metadata property name.
     */
    def 'propertyName'(String value) {
        parameter("propertyName", value)
    }

}
