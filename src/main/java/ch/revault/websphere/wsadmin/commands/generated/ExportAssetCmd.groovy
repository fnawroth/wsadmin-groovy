/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Export an asset which has been imported into the product configuration repository.  Only the asset file itself is exported.  No import options for the asset are exported.
*/
@Generated("with GenerateAdminCommands")
class ExportAssetCmd extends AdminCmd<Void> {
    ExportAssetCmd() {
        super("exportAsset")
    }

    /**
     * ID for the asset in any of the following forms:  <asset name>; assetname=<asset name>; WebSphere:assetname=<asset name>; or WebSphere:assetname=<asset name>,assetversion=<asset version>.  The version does not need to be specified unless there is more than one version.
     */
    def 'assetID'(String value) {
        parameter("assetID", value)
    }

    /**
     * The name of the exported asset file.
     */
    def 'filename'(com.ibm.websphere.management.cmdframework.DownloadFile value) {
        parameter("filename", value)
    }

    /**
     * 
     */
    def 'ADTCommandProps'(java.util.Hashtable value) {
        parameter("ADTCommandProps", value)
    }

}
