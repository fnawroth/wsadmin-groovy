/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Import a tunnel template and its children into the cell-scoped config.
*/
@Generated("with GenerateAdminCommands")
class ImportTunnelTemplateCmd extends AdminCmd<Void> {
    ImportTunnelTemplateCmd() {
        super("importTunnelTemplate")
    }

    /**
     * Name of the input file with tunnel template information.
     */
    def 'inputFileName'(String value) {
        parameter("inputFileName", value)
    }

    /**
     * The Node Name of the secure proxy node to use for the CGB interface.
     */
    def 'bridgeInterfaceNodeName'(String value) {
        parameter("bridgeInterfaceNodeName", value)
    }

    /**
     * The Server Name of the secure proxy to use for the CGB interface.
     */
    def 'bridgeInterfaceServerName'(String value) {
        parameter("bridgeInterfaceServerName", value)
    }

}
