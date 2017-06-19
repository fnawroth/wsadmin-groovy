/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List keystore objects in a particular scope.
*/
@Generated("with GenerateAdminCommands")
class ListKeyStoresCmd extends AdminCmd<Void> {
    ListKeyStoresCmd() {
        super("listKeyStores")
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

    /**
     * Specify true to list all keystores.  True overrides the scopeName parameter.
     */
    def 'all'(Boolean value) {
        parameter("all", value)
    }

    /**
     * List keystores for a particular usage.
     */
    def 'keyStoreUsage'(String value) {
        parameter("keyStoreUsage", value)
    }

}
