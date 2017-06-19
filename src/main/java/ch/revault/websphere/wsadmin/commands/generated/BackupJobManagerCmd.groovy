/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Backs up the job manager database to a specified location.
*/
@Generated("with GenerateAdminCommands")
class BackupJobManagerCmd extends AdminCmd<Void> {
    BackupJobManagerCmd() {
        super("backupJobManager")
    }

    /**
     * Location of the file.
     */
    def 'location'(String value) {
        parameter("location", value)
    }

    /**
     * If the file already exists, force the new file to overwrite the existing file.
     */
    def 'force'(Boolean value) {
        parameter("force", value)
    }

}
