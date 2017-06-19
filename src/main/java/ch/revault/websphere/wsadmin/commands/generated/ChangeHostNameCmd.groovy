/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Change the host name of a node
*/
@Generated("with GenerateAdminCommands")
class ChangeHostNameCmd extends AdminCmd<Void> {
    ChangeHostNameCmd() {
        super("changeHostName")
    }

    /**
     * The name of the node whose host name will be changed
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * The new host name
     */
    def 'hostName'(String value) {
        parameter("hostName", value)
    }

    /**
     * The name of the system 
     */
    def 'systemName'(String value) {
        parameter("systemName", value)
    }

    /**
     * Regenerate the default certificates
     */
    def 'regenDefaultCert'(String value) {
        parameter("regenDefaultCert", value)
    }

}
