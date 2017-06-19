/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Enable or disable "autostart"
*/
@Generated("with GenerateAdminCommands")
class SetCompUnitTargetAutoStartCmd extends AdminCmd<Void> {
    SetCompUnitTargetAutoStartCmd() {
        super("setCompUnitTargetAutoStart")
    }

    /**
     * ID for the business-level application in any of the following forms:  <bla name>; blaname=<bla name>; WebSphere:blaname=<bla name>; or WebSphere:blaname=<bla name>,blaedition=<bla edition>.  The edition does not need to be specified unless there is more than one edition.
     */
    def 'blaID'(String value) {
        parameter("blaID", value)
    }

    /**
     * ID for the composition unit in any of the following forms:  <cu name>; cuname=<cu name>; WebSphere:cuname=<cu name>; or WebSphere:cuname=<cu name>,cuedition=<cu edition>.  The edition does not need to be specified unless there is more than one edition.
     */
    def 'cuID'(String value) {
        parameter("cuID", value)
    }

    /**
     * The ID of the specified composition unit's target.  Target ID format is as follows: <server name>; <cluster name>; WebSphere:node=<node name>,server=<server name>; or WebSphere:cluster=<cluster name>.
     */
    def 'targetID'(String value) {
        parameter("targetID", value)
    }

    /**
     * Specify "true" to enable "autostart", or "false" to disable "autostart".
     */
    def 'enable'(String value) {
        parameter("enable", value)
    }

    /**
     * 
     */
    def 'ADTCommandProps'(java.util.Hashtable value) {
        parameter("ADTCommandProps", value)
    }

}
