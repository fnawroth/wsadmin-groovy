/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Renew a Certificate with a newly generated certificate.
*/
@Generated("with GenerateAdminCommands")
class RenewCertificateCmd extends AdminCmd<Void> {
    RenewCertificateCmd() {
        super("renewCertificate")
    }

    /**
     * Specifies the unique name to identify the keystore.
     */
    def 'keyStoreName'(String value) {
        parameter("keyStoreName", value)
    }

    /**
     * Specifies the scope of the keystore.
     */
    def 'keyStoreScope'(String value) {
        parameter("keyStoreScope", value)
    }

    /**
     * Specifies a unique name to identify a certificate.
     */
    def 'certificateAlias'(String value) {
        parameter("certificateAlias", value)
    }

    /**
     * Specify true to delete the old signers associated with the old certificate, false to retain the old signers.
     */
    def 'deleteOldSigners'(Boolean value) {
        parameter("deleteOldSigners", value)
    }

}
