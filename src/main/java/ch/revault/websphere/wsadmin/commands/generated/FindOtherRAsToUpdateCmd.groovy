/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Find other Resource Adapters that are copies of the entered Resource Adapter.  Since an update will replace binary files, these copies of the Resource Adapter should be updated after the current Resource Adapter is updated.
*/
@Generated("with GenerateAdminCommands")
class FindOtherRAsToUpdateCmd extends AdminCmd<Void> {
    FindOtherRAsToUpdateCmd() {
        super("findOtherRAsToUpdate")
    }

}
