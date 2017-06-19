/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Export the deployment manifest from an EBA asset.
*/
@Generated("with GenerateAdminCommands")
class ExportDeploymentManifestCmd extends AdminCmd<Void> {
    ExportDeploymentManifestCmd() {
        super("exportDeploymentManifest")
    }

    /**
     * The file path for exporting the deployment manifest
     */
    def 'path'(String value) {
        parameter("path", value)
    }

    /**
     * The EBA asset name 
     */
    def 'asset'(String value) {
        parameter("asset", value)
    }

}
