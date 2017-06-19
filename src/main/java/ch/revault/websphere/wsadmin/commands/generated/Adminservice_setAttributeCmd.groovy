/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* WASX7045I: Method: setAttribute

	Arguments: object name, attribute name, attribute value

	Description: Sets the attribute with name "attribute name" to the
	value given by "attribute value" for the MBean described by
	"object name."
*/
@Generated("with GenerateAdminCommands")
class Adminservice_setAttributeCmd extends AdminCmd<Void> {
    Adminservice_setAttributeCmd() {
        super("adminservice_setAttribute")
    }

    /**
     * null
     */
    def 'attribute'(javax.management.Attribute value) {
        parameter("attribute", value)
    }

}
