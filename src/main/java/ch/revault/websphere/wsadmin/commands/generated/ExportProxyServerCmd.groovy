/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* export the configuration of a server to a config archive.
*/
@Generated("with GenerateAdminCommands")
class ExportProxyServerCmd extends AdminCmd<Void> {
    ExportProxyServerCmd() {
        super("exportProxyServer")
    }

    /**
     * the name of a server
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

    /**
     * the name of a node. This parameter becomes optional if the specified server name is unique across the cell.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * the fully qualified file path of a config archive.
     */
    def 'archive'(com.ibm.websphere.management.cmdframework.DownloadFile value) {
        parameter("archive", value)
    }

}
