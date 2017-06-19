/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Displays information about the keystore used during Audit Record encryption
*/
@Generated("with GenerateAdminCommands")
class ShowAuditLogEncryptionInfoCmd extends AdminCmd<Void> {
    ShowAuditLogEncryptionInfoCmd() {
        super("showAuditLogEncryptionInfo")
    }

    /**
     * Specifies the fully qualified path of the Binary Audit Log
     */
    def 'fileName'(String value) {
        parameter("fileName", value)
    }

}
