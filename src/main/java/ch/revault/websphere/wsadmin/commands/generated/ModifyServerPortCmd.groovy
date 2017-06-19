/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modifies the host or port of the named endpoint that is used by the specified server.
*/
@Generated("with GenerateAdminCommands")
class ModifyServerPortCmd extends AdminCmd<Void> {
    ModifyServerPortCmd() {
        super("modifyServerPort")
    }

    /**
     * The name of the server node. This parameter is required only if the server name is not unique in the cell.
     */
    def 'nodeName'(java.lang.String value) {
        parameter("nodeName", value)
    }

    /**
     * The name of the end point to modify.
     */
    def 'endPointName'(java.lang.String value) {
        parameter("endPointName", value)
    }

    /**
     * The new value for the host name of the end point.
     */
    def 'host'(java.lang.String value) {
        parameter("host", value)
    }

    /**
     * The new value for the port number of the end point.
     */
    def 'port'(java.lang.Integer value) {
        parameter("port", value)
    }

    /**
     * If specified, modification of the port is permitted, even if the port is shared between multiple transport chains.  If not specified, modification of the port is not permitted if the port is used in more than one transport channel chain.
     */
    def 'modifyShared'(java.lang.Boolean value) {
        parameter("modifyShared", value)
    }

    /**
     * Exacly one, either a server name for target object or the server configuration object parameter is required. Specify exactly one object, either target server object or server template parameter, to be modified with new port and/or host. 
     */
    def 'serverConfigObject'(javax.management.ObjectName value) {
        parameter("serverConfigObject", value)
    }

}
