/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Exports Lightweight Third Party Authentication keys to a file.
*/
@Generated("with GenerateAdminCommands")
class ExportLTPAKeysCmd extends AdminCmd<Void> {
    ExportLTPAKeysCmd() {
        super("exportLTPAKeys")
    }

    /**
     * File where the Lightweight Third Party Authentication will be written.
     */
    def 'ltpaKeyFile'(java.lang.String value) {
        parameter("ltpaKeyFile", value)
    }

    /**
     * Password for the Lightweight Third Party Authentication keys.
     */
    def 'password'(java.lang.String value) {
        parameter("password", value)
    }

}
