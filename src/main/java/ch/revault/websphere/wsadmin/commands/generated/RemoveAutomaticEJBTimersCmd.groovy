/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command removes automatically created persistent EJBTimers for a specific application or module on a specific server.  Refer to the product InfoCenter for scenarios where this command might be used.
*/
@Generated("with GenerateAdminCommands")
class RemoveAutomaticEJBTimersCmd extends AdminCmd<Void> {
    RemoveAutomaticEJBTimersCmd() {
        super("removeAutomaticEJBTimers")
    }

    /**
     * The name of the application that contains the automatic persistent EJBTimers you are removing.
     */
    def 'appName'(String value) {
        parameter("appName", value)
    }

    /**
     * The name of the module that contains the automatic persistent EJBTimers you are removing.
     */
    def 'moduleName'(String value) {
        parameter("moduleName", value)
    }

    /**
     * The name of the server that runs the application that contains the EJBTimers you are removing.
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

    /**
     * The name of the node that contains the server you are targeting.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * The JNDI name of the scheduler instance that supports the automatic EJBTimers you are removing.  If the default scheduler instance was used to support your EJBTimers, then you do not need to specify this parm.
     */
    def 'schedulerJNDIName'(String value) {
        parameter("schedulerJNDIName", value)
    }

}
