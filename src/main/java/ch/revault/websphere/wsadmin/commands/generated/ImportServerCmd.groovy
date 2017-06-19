/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Import a server configuration from a configuration archive. This command creates a new server based on the server configuration defined in the archive.
*/
@Generated("with GenerateAdminCommands")
class ImportServerCmd extends AdminCmd<Void> {
    ImportServerCmd() {
        super("importServer")
    }

    /**
     * the fully qualified file path of a config archive.
     */
    def 'archive'(com.ibm.websphere.management.cmdframework.UploadFile value) {
        parameter("archive", value)
    }

    /**
     * node name where the server is imported.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * the name of the imported server. By default it is the same as the server name in archive. If the server name collides with any existing server under the node, then an exception is thrown.
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

    /**
     * the name of the core group. Default core group is assumed if this parameter is not specified.
     */
    def 'coreGroup'(String value) {
        parameter("coreGroup", value)
    }

    /**
     * the name of a node defined in the config archive. This parameter becomes optional if there is only one node in the archive.
     */
    def 'nodeInArchive'(String value) {
        parameter("nodeInArchive", value)
    }

    /**
     * the name of a server defined in the config archive. This parameter becomes optional if there is only one node in the archive.
     */
    def 'serverInArchive'(String value) {
        parameter("serverInArchive", value)
    }

}
