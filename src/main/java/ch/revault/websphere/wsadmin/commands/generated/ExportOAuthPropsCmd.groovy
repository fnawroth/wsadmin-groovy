/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get OAuth Configuration to edit
*/
@Generated("with GenerateAdminCommands")
class ExportOAuthPropsCmd extends AdminCmd<Void> {
    ExportOAuthPropsCmd() {
        super("exportOAuthProps")
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
