/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* WASX7046I: Method: setAttributes

	Arguments: object name, attributes

	Description: Sets attributes given in "attributes" for the MBean
	described by "object name."
*/
@Generated("with GenerateAdminCommands")
class Adminservice_setAttributesCmd extends AdminCmd<Void> {
    Adminservice_setAttributesCmd() {
        super("adminservice_setAttributes")
    }

    /**
     * null
     */
    def 'attributeList'(javax.management.AttributeList value) {
        parameter("attributeList", value)
    }

}
