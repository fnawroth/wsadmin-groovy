/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get information about a personal certificate.
*/
@Generated("with GenerateAdminCommands")
class GetAuditCertificateCmd extends AdminCmd<Void> {
    GetAuditCertificateCmd() {
        super("getAuditCertificate")
    }

    /**
     * Specifies the unique name to identify the key store.
     */
    def 'keyStoreName'(String value) {
        parameter("keyStoreName", value)
    }

    /**
     * Specifies the scope of the key store.
     */
    def 'keyStoreScope'(String value) {
        parameter("keyStoreScope", value)
    }

    /**
     * Certificate alias name.
     */
    def 'certificateAlias'(String value) {
        parameter("certificateAlias", value)
    }

}
