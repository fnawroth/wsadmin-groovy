/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete an existing notifier.
*/
@Generated("with GenerateAdminCommands")
class DeleteWSNotifierCmd extends AdminCmd<Void> {
    DeleteWSNotifierCmd() {
        super("deleteWSNotifier")
    }

    /**
     * Specifies the name that uniquely identifies a notifier.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

}
