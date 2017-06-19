/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete OAuth Provider
*/
@Generated("with GenerateAdminCommands")
class DeleteOAuthProviderCmd extends AdminCmd<Void> {
    DeleteOAuthProviderCmd() {
        super("deleteOAuthProvider")
    }

    /**
     * OAuth Provider Name
     */
    def 'providerName'(String value) {
        parameter("providerName", value)
    }

}
