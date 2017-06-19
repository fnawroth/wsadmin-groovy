/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Import an application file into the product configuration repository as an asset.
*/
@Generated("with GenerateAdminCommands")
class ImportAssetCmd extends AdminCmd<Void> {
    ImportAssetCmd() {
        super("importAsset")
    }

    /**
     * Pathname to the file being imported.
     */
    def 'source'(com.ibm.websphere.management.cmdframework.UploadFile value) {
        parameter("source", value)
    }

    /**
     * The store type specifies how much of the imported asset is to be stored in product configuration repository.  A value of "FULL" indicates that the complete asset file is to be stored.  A value of "METADATA" indicates that only the metadata portion of the asset file is to be stored.  The metadata portion of a jar file, for example, would include files under the "META-INF" directory. Depending on the type of jar file, metadata might include other directories, also.  A value of "NONE" indicates that no part of the asset file is to be saved.  If the storage type is "NONE", the metadata for the asset must be available through the destination URI when it is configured as a composition unit. The default storage type is that set by the asset's content handler.
     */
    def 'storageType'(String value) {
        parameter("storageType", value)
    }

    /**
     * 
     */
    def 'ADTCommandProps'(java.util.Hashtable value) {
        parameter("ADTCommandProps", value)
    }

}
