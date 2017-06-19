/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a CMS KeyStore with password stash file.
*/
@Generated("with GenerateAdminCommands")
class CreateCMSKeyStoreCmd extends AdminCmd<Void> {
    CreateCMSKeyStoreCmd() {
        super("createCMSKeyStore")
    }

    /**
     * Specifies the path to where the plugin-key.kdb file resides.
     */
    def 'cmsKeyStoreURI'(String value) {
        parameter("cmsKeyStoreURI", value)
    }

    /**
     * Specifies the fully-qualified DNS hostname of the node where the plugin-key.kdb will reside.
     */
    def 'pluginHostName'(String value) {
        parameter("pluginHostName", value)
    }

}
