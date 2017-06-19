/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create OAuth Provider
*/
@Generated("with GenerateAdminCommands")
class CreateOAuthProviderCmd extends AdminCmd<Void> {
    CreateOAuthProviderCmd() {
        super("createOAuthProvider")
    }

    /**
     * OAuth Provider Name
     */
    def 'providerName'(String value) {
        parameter("providerName", value)
    }

    /**
     * Configuration File
     */
    def 'fileName'(String value) {
        parameter("fileName", value)
    }

}
