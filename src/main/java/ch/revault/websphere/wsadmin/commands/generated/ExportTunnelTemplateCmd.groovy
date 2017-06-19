/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Export a tunnel template and its children into a simple properties file.
*/
@Generated("with GenerateAdminCommands")
class ExportTunnelTemplateCmd extends AdminCmd<Void> {
    ExportTunnelTemplateCmd() {
        super("exportTunnelTemplate")
    }

    /**
     * Name of the tunnel template to export.
     */
    def 'tunnelTemplateName'(String value) {
        parameter("tunnelTemplateName", value)
    }

    /**
     * The name of the properties file to be output.
     */
    def 'outputFileName'(String value) {
        parameter("outputFileName", value)
    }

}
