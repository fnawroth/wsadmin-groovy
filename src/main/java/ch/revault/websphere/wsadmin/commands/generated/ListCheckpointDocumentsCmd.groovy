/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List the existing checkpoint documents specified by the "checkpointName"
*/
@Generated("with GenerateAdminCommands")
class ListCheckpointDocumentsCmd extends AdminCmd<Void> {
    ListCheckpointDocumentsCmd() {
        super("listCheckpointDocuments")
    }

    /**
     * Repository checkpoint name
     */
    def 'checkpointName'(String value) {
        parameter("checkpointName", value)
    }

}
