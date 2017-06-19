/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* WASX7043I: Method: getAttribute

	Arguments: object name, attribute

	Description: Returns value of "attribute" for the MBean described by 
	"object name."
*/
@Generated("with GenerateAdminCommands")
class Adminservice_getAttributeCmd extends AdminCmd<Void> {
    Adminservice_getAttributeCmd() {
        super("adminservice_getAttribute")
    }

    /**
     * null
     */
    def 'attribute'(java.lang.String value) {
        parameter("attribute", value)
    }

}
