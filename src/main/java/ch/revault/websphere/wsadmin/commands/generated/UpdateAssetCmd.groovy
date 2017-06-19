/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Update an imported asset file.
*/
@Generated("with GenerateAdminCommands")
class UpdateAssetCmd extends AdminCmd<Void> {
    UpdateAssetCmd() {
        super("updateAsset")
    }

    /**
     * ID for the asset in any of the following forms:  <asset name>; assetname=<asset name>; WebSphere:assetname=<asset name>; or WebSphere:assetname=<asset name>,assetversion=<asset version>.  The version does not need to be specified unless there is more than one version.
     */
    def 'assetID'(String value) {
        parameter("assetID", value)
    }

    /**
     * Specify the type of update operation you want to perform.  Specify "replace" to replace the entire asset.  Specify "add" to add a single file to the asset archive.  Specify "update" to update a single existing file in the asset archive.  Specify "addupdate" to add or update a single file in the asset archive.  Specify "delete" to delete a single file in the asset archive.  Specify "merge" to add, update, and delete multiple asset archive files.  To delete files from an archive, place META-INF/ibm-partialapp-delete.props file in the input archive. This file should contain the URIs of the files to be deleted from the asset archive with one URI on each line.
     */
    def 'operation'(String value) {
        parameter("operation", value)
    }

    /**
     * Specify contents for asset update. This option is required for "operation" parameter values except "delete".  If the "operation" parameter value is "replace", the "contents" value is the file pathname of the archive file that completely replaces the existing asset archive.  If the "operation" parameter value is "add", "update", or "addupdate", the "contents" value must be the file pathname of a single file.  In addtion, the "contenturi" paramter must be specified.  If the "operation" parameter value is "merge", the "contents" value is the file pathname of an archive of files.   Those files are merged into the asset being updated.  That is, all files in the input archive are added to or replace the target asset files.
     */
    def 'contents'(com.ibm.websphere.management.cmdframework.UploadFile value) {
        parameter("contents", value)
    }

    /**
     * If you specified a single input file, that is, if you specfied an "operation" parameter value other than "replace" or "merge", specify a content URI.  The value specifies the URI within the asset archive which is being added, updated, or deleted.
     */
    def 'contenturi'(String value) {
        parameter("contenturi", value)
    }

    /**
     * 
     */
    def 'ADTCommandProps'(java.util.Hashtable value) {
        parameter("ADTCommandProps", value)
    }

}
