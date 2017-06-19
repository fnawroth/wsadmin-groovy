/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Sends a request to a certificate authority (CA) to revoke the certificate.
*/
@Generated("with GenerateAdminCommands")
class RevokeCACertificateCmd extends AdminCmd<Void> {
    RevokeCACertificateCmd() {
        super("revokeCACertificate")
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
     * Password needed to revoke a certificate.
     */
    def 'revocationPassword'(String value) {
        parameter("revocationPassword", value)
    }

    /**
     * Reason for revoking the certificate.
     */
    def 'revocationReason'(String value) {
        parameter("revocationReason", value)
    }

}
