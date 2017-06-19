/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* WASX7036I: Method: queryNames

	Arguments: object name 

	Description: Returns a String containing the ObjectNames that match 
	the input object name, which may be a wild card.
*/
@Generated("with GenerateAdminCommands")
class Adminservice_queryNamesCmd extends AdminCmd<Void> {
    Adminservice_queryNamesCmd() {
        super("adminservice_queryNames")
    }

    /**
     * null
     */
    def 'objname'(javax.management.ObjectName value) {
        parameter("objname", value)
    }

    /**
     * null
     */
    def 'query'(javax.management.QueryExp value) {
        parameter("query", value)
    }

}
