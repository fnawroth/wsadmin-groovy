/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* View options for a specified asset.
*/
@Generated("with GenerateAdminCommands")
class ViewAssetCmd extends AdminCmd<Void> {
    ViewAssetCmd() {
        super("viewAsset")
    }

    /**
     * ID for the asset in any of the following forms:  <asset name>; assetname=<asset name>; WebSphere:assetname=<asset name>; or WebSphere:assetname=<asset name>,assetversion=<asset version>.  The version does not need to be specified unless there is more than one version.
     */
    def 'assetID'(String value) {
        parameter("assetID", value)
    }

    /**
     * 
     */
    def 'ADTCommandProps'(java.util.Hashtable value) {
        parameter("ADTCommandProps", value)
    }

}
