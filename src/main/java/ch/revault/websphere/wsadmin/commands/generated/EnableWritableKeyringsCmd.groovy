/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modify keystore for writable SAF support.  This task is used during the migration process and will create additional writable keystore objects for the control region and servant region keyrings for SSL keystores.
*/
@Generated("with GenerateAdminCommands")
class EnableWritableKeyringsCmd extends AdminCmd<Void> {
    EnableWritableKeyringsCmd() {
        super("enableWritableKeyrings")
    }

    /**
     * Specifies the unique name to identify the keystore.
     */
    def 'keyStoreName'(String value) {
        parameter("keyStoreName", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

    /**
     * Specify this field if creating a writable keystore object for the control regions keyring.
     */
    def 'controlRegionUser'(String value) {
        parameter("controlRegionUser", value)
    }

    /**
     * Specify this field if creating a writable keystore object for the servant regions keyring.
     */
    def 'servantRegionUser'(String value) {
        parameter("servantRegionUser", value)
    }

}
