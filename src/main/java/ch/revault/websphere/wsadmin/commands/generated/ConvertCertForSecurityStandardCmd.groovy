/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Converts certificates used by SSL configuration and plugins so that they comply with specified FIPS level.  Also lists certificates that cannot be converted by WebSphere. 
*/
@Generated("with GenerateAdminCommands")
class ConvertCertForSecurityStandardCmd extends AdminCmd<Void> {
    ConvertCertForSecurityStandardCmd() {
        super("convertCertForSecurityStandard")
    }

    /**
     * Determines the level of the FIPS security standard to use. Valid values include: (FIPS140-2, transition, SP800-131). 
     */
    def 'fipsLevel'(String value) {
        parameter("fipsLevel", value)
    }

    /**
     * Sets the level of the suiteB level. This flag is only used if fipsLevel flag is set to SP800-131. Valid values include (128, 192). 
     */
    def 'suiteBLevel'(String value) {
        parameter("suiteBLevel", value)
    }

    /**
     * Specifies the signatureAlgorithm for creating certificate or certificate request. 
     */
    def 'signatureAlgorithm'(String value) {
        parameter("signatureAlgorithm", value)
    }

    /**
     * Specifies the size used by the private key of the personal certificate.
     */
    def 'keySize'(String value) {
        parameter("keySize", value)
    }

}
