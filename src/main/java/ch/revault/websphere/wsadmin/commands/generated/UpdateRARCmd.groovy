/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Update an existing resource adapter with the supplied RAR file and configure any new properties that exist on deployed objects within the resource adapter to be updated.
Before using the updateRAR command, use the compareResourceAdapterToRAR command to verify the RAR is compatible for upgrading the resource adapter, and use the findOtherRAsToUpdate command to determine the set of resources adapters that need be updated using the supplied RAR.
*/
@Generated("with GenerateAdminCommands")
class UpdateRARCmd extends AdminCmd<Void> {
    UpdateRARCmd() {
        super("updateRAR")
    }

    /**
     * The absolute path to the new RAR file.
     */
    def 'rarPath'(String value) {
        parameter("rarPath", value)
    }

}
