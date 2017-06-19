/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Shows the current configuration with unsaved changes.
*/
@Generated("with GenerateAdminCommands")
class ShowIdMgrConfigCmd extends AdminCmd<Void> {
    ShowIdMgrConfigCmd() {
        super("showIdMgrConfig")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * File name where the configuration XML string should be saved.
     */
    def 'file'(String value) {
        parameter("file", value)
    }

}
