/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List assets which have been imported into the product configuration repository.
*/
@Generated("with GenerateAdminCommands")
class ListAssetsCmd extends AdminCmd<Void> {
    ListAssetsCmd() {
        super("listAssets")
    }

    /**
     * ID for the asset in any of the following forms:  <asset name>; assetname=<asset name>; WebSphere:assetname=<asset name>; or WebSphere:assetname=<asset name>,assetversion=<asset version>.  The version does not need to be specified unless there is more than one version.
     */
    def 'assetID'(String value) {
        parameter("assetID", value)
    }

    /**
     * Controls whether or not the description is included in list output.  Specify a value of "true" to include descriptions, or "false" to omit them.  The default is "false".
     */
    def 'includeDescription'(String value) {
        parameter("includeDescription", value)
    }

    /**
     * Include deployable units in listing.
     */
    def 'includeDeplUnit'(String value) {
        parameter("includeDeplUnit", value)
    }

    /**
     * 
     */
    def 'ADTCommandProps'(java.util.Hashtable value) {
        parameter("ADTCommandProps", value)
    }

}
