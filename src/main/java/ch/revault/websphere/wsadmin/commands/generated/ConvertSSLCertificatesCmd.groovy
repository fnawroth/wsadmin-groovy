/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Converts SSL personal certificates to a certificate that is created with the desired signature algorithm or lists SSL personal certificates that are not created with the desired signature algorithm.
*/
@Generated("with GenerateAdminCommands")
class ConvertSSLCertificatesCmd extends AdminCmd<Void> {
    ConvertSSLCertificatesCmd() {
        super("convertSSLCertificates")
    }

    /**
     * Specify LIST to list certificate that are not using the desired signature algorithm or specify REPLACE to replace SSL certificate the SSL certificate with one that that has the desired signature algorithm.
     */
    def 'convertSSLCertAction'(String value) {
        parameter("convertSSLCertAction", value)
    }

    /**
     * Specifies the signature algorithm that the SSL certificate will get created with.
     */
    def 'signatureAlgorithm'(String value) {
        parameter("signatureAlgorithm", value)
    }

}
