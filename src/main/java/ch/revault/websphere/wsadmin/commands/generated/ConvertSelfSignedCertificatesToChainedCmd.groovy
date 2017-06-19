/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Converts self-signed certificates to chained certificate in a keystore, all keystore, or the default keystores.  The new chained certificate will be signed with root certificate specified or the default root if one is not specified.  All keystores in the configuration will be searched for the self-signed certificate's signer certificate and it will be replaced with the signer of the default root certificate.
*/
@Generated("with GenerateAdminCommands")
class ConvertSelfSignedCertificatesToChainedCmd extends AdminCmd<Void> {
    ConvertSelfSignedCertificatesToChainedCmd() {
        super("convertSelfSignedCertificatesToChained")
    }

    /**
     * Specify ALL_CERTIFICATES to look for self-signed certificates in all keystores within the specified keyStoreScope parameter.  Specify DEFAULT_CERTIFICATES to look for self-signed certificates in the default keystores, CellDefaultKeyStore and NodeDefaultKeyStore, within the specified keyStoreScope parameter.  Specify KEYSTORE_CERTIFICATES to look for self-signed certificate in one particular keystore specified with the keyStoreName parameter.  Any self-signed certificate found will be replace with a chained certificate signed with a root from the default root keystore.
     */
    def 'certificateReplacementOption'(String value) {
        parameter("certificateReplacementOption", value)
    }

    /**
     * Name of the keystore where self signed certificates are to be replaced with chained certificates.
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
     * Specifies a unique name to identify the root certificate used for signing.
     */
    def 'rootCertificateAlias'(String value) {
        parameter("rootCertificateAlias", value)
    }

}
