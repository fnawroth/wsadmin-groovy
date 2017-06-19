/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete an asset which was imported into the product configuration repository.
*/
@Generated("with GenerateAdminCommands")
class DeleteAssetCmd extends AdminCmd<Void> {
    DeleteAssetCmd() {
        super("deleteAsset")
    }

    /**
     * ID for the asset in any of the following forms:  <asset name>; assetname=<asset name>; WebSphere:assetname=<asset name>; or WebSphere:assetname=<asset name>,assetversion=<asset version>.  The version does not need to be specified unless there is more than one version.
     */
    def 'assetID'(String value) {
        parameter("assetID", value)
    }

    /**
     * A value of "true" removes all dependency relationships that other assets declare on this asset.  A value of "false" allows the asset to be deleted only if no other assets declare a dependency on this asset.  The default is "false".
     */
    def 'force'(String value) {
        parameter("force", value)
    }

    /**
     * 
     */
    def 'ADTCommandProps'(java.util.Hashtable value) {
        parameter("ADTCommandProps", value)
    }

}
