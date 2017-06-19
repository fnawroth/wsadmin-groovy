/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Determine whether a business-level application or composition unit is running or stopped.
*/
@Generated("with GenerateAdminCommands")
class GetBLAStatusCmd extends AdminCmd<Void> {
    GetBLAStatusCmd() {
        super("getBLAStatus")
    }

    /**
     * getblastatus_blaid_desc
     */
    def 'blaID'(String value) {
        parameter("blaID", value)
    }

    /**
     * The ID for the composition unit for which to obtain run status.  The ID can be specified in any of the following forms:  <cu name>; cuname=<cu name>; WebSphere:cuname=<cu name>; or WebSphere:cuname=<cu name>,cuedition=<cu edition>.  If no composition unit ID is specified, the command returns an aggregate status of all composition units comprising the business-level application.
     */
    def 'cuID'(String value) {
        parameter("cuID", value)
    }

    /**
     * The ID of the target server from which to obtain status.  If no target ID is specified, status includes all servers in the cell.  Target ID format is as follows: WebSphere:node=<node name>,server=<server name> or WebSphere:cluster=<cluster name>.
     */
    def 'targetID'(String value) {
        parameter("targetID", value)
    }

}
