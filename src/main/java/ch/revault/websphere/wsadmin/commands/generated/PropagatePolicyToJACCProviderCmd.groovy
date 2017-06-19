/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Propagate the security policies of the applications to the JACC provider.
*/
@Generated("with GenerateAdminCommands")
class PropagatePolicyToJACCProviderCmd extends AdminCmd<Void> {
    PropagatePolicyToJACCProviderCmd() {
        super("propagatePolicyToJACCProvider")
    }

    /**
     * The names of the applications separated by ":".
     */
    def 'appNames'(String value) {
        parameter("appNames", value)
    }

}
