/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Sends a request to a certificate authority to create a certificate authority (CA) personal certificate.
*/
@Generated("with GenerateAdminCommands")
class RequestCACertificateCmd extends AdminCmd<Void> {
    RequestCACertificateCmd() {
        super("requestCACertificate")
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
     * Specifies the size used by the private key of the personal certificate.
     */
    def 'certificateSize'(Integer value) {
        parameter("certificateSize", value)
    }

    /**
     * Specifies the common name portion of the distinguished name (DN).
     */
    def 'certificateCommonName'(String value) {
        parameter("certificateCommonName", value)
    }

    /**
     * Specifies the organization portion of the distinguished name
     */
    def 'certificateOrganization'(String value) {
        parameter("certificateOrganization", value)
    }

    /**
     * Specifies the organization unit portion of the distinguished name.
     */
    def 'certificateOrganizationalUnit'(String value) {
        parameter("certificateOrganizationalUnit", value)
    }

    /**
     * Specifies the locality portion of the distinguished name.
     */
    def 'certificateLocality'(String value) {
        parameter("certificateLocality", value)
    }

    /**
     * Specifies the state portion of the distinguished name.
     */
    def 'certificateState'(String value) {
        parameter("certificateState", value)
    }

    /**
     * Specifies the zip code portion of the distinguished name.
     */
    def 'certificateZip'(String value) {
        parameter("certificateZip", value)
    }

    /**
     * Specifies the country portion of the distinguished name.
     */
    def 'certificateCountry'(String value) {
        parameter("certificateCountry", value)
    }

    /**
     * The password used to revoke the certificate at a later time.
     */
    def 'revocationPassword'(String value) {
        parameter("revocationPassword", value)
    }

    /**
     * Specifies the name that uniquely identifies the certificate authority (CA) configurator.
     */
    def 'caClientName'(String value) {
        parameter("caClientName", value)
    }

    /**
     * The scope of the certificate authority (CA) client object used to create the certificate.
     */
    def 'caClientScope'(String value) {
        parameter("caClientScope", value)
    }

}
