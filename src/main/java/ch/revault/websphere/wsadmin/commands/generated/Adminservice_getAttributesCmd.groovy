/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* WASX7044I: Method: getAttributes

	Arguments: object name, attributes
	Returns a string listing the values of the attributes named in 
	"attributes" for the object named by "object name". 
*/
@Generated("with GenerateAdminCommands")
class Adminservice_getAttributesCmd extends AdminCmd<Void> {
    Adminservice_getAttributesCmd() {
        super("adminservice_getAttributes")
    }

    /**
     * null
     */
    def 'attributes'(java.lang.String[] value) {
        parameter("attributes", value)
    }

}
