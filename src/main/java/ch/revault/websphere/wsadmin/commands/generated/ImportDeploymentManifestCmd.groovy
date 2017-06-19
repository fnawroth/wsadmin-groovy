/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Import the deployment manifest into the EBA asset. If the deployment manifest is resolved successfully, it will replace the existing deployment manifest in the asset.
*/
@Generated("with GenerateAdminCommands")
class ImportDeploymentManifestCmd extends AdminCmd<Void> {
    ImportDeploymentManifestCmd() {
        super("importDeploymentManifest")
    }

    /**
     * The file location of the deployment manifest
     */
    def 'file'(com.ibm.websphere.management.cmdframework.UploadFile value) {
        parameter("file", value)
    }

    /**
     * The EBA asset name 
     */
    def 'asset'(String value) {
        parameter("asset", value)
    }

}
