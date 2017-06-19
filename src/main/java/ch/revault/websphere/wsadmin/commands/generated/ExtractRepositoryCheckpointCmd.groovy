/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Extract the repository checkpoint specified by the "checkpointName" to the file specified by the "extractToFile".
*/
@Generated("with GenerateAdminCommands")
class ExtractRepositoryCheckpointCmd extends AdminCmd<Void> {
    ExtractRepositoryCheckpointCmd() {
        super("extractRepositoryCheckpoint")
    }

    /**
     * Repository checkpoint name
     */
    def 'checkpointName'(String value) {
        parameter("checkpointName", value)
    }

    /**
     * The zip file name to extract the repository checkpoint
     */
    def 'extractToFile'(com.ibm.websphere.management.cmdframework.DownloadFile value) {
        parameter("extractToFile", value)
    }

}
