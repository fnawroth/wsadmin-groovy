/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Export WSDL and XSD documents for a specific Composition Unit
*/
@Generated("with GenerateAdminCommands")
class ExportWSDLArtifactsCmd extends AdminCmd<Void> {
    ExportWSDLArtifactsCmd() {
        super("exportWSDLArtifacts")
    }

    /**
     * Composition Unit Name
     */
    def 'cuName'(String value) {
        parameter("cuName", value)
    }

    /**
     * Absolute path of the directory to export the Artifacts
     */
    def 'exportDir'(String value) {
        parameter("exportDir", value)
    }

}
