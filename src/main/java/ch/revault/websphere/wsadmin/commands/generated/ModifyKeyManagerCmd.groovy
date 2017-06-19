/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modify a key manager.
*/
@Generated("with GenerateAdminCommands")
class ModifyKeyManagerCmd extends AdminCmd<Void> {
    ModifyKeyManagerCmd() {
        super("modifyKeyManager")
    }

    /**
     * Specifies a name to uniquely identify a key manager.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

    /**
     * Specifies the provider.
     */
    def 'provider'(String value) {
        parameter("provider", value)
    }

    /**
     * Specifies the algorithm name of the TrustManager or KeyManager.
     */
    def 'algorithm'(String value) {
        parameter("algorithm", value)
    }

    /**
     * Specifies the custom class that implements the KeyManager interface.
     */
    def 'keyManagerClass'(String value) {
        parameter("keyManagerClass", value)
    }

}
