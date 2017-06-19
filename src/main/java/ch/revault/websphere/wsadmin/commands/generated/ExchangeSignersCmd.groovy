/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Exchange Signer Certificates
*/
@Generated("with GenerateAdminCommands")
class ExchangeSignersCmd extends AdminCmd<Void> {
    ExchangeSignersCmd() {
        super("exchangeSigners")
    }

    /**
     * Keystore name that will exchange signers with another keystore.
     */
    def 'keyStoreName1'(String value) {
        parameter("keyStoreName1", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'keyStoreScope1'(String value) {
        parameter("keyStoreScope1", value)
    }

    /**
     * Specifies colon separated list of certificates whose signer will be added to another keystore.
     */
    def 'certificateAliasList1'(String value) {
        parameter("certificateAliasList1", value)
    }

    /**
     * Keystore name that will exchange signers with another keystore.
     */
    def 'keyStoreName2'(String value) {
        parameter("keyStoreName2", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'keyStoreScope2'(String value) {
        parameter("keyStoreScope2", value)
    }

    /**
     * Specifies colon separated list of certificates whose signer will be added to another keystore.
     */
    def 'certificateAliasList2'(String value) {
        parameter("certificateAliasList2", value)
    }

}
