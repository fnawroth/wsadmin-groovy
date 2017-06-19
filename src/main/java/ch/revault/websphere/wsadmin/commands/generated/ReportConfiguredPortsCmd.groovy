/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Generates a report of the ports configured in the cell
*/
@Generated("with GenerateAdminCommands")
class ReportConfiguredPortsCmd extends AdminCmd<Void> {
    ReportConfiguredPortsCmd() {
        super("reportConfiguredPorts")
    }

    /**
     * Limit the report to a node
     */
    def 'node'(String value) {
        parameter("node", value)
    }

}
