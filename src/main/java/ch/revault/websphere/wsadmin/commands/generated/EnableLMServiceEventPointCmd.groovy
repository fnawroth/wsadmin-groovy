/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Use the "enableLMServiceEventPoint" command to enable a local mapping service event point, in order to generate service mapping events.
*/
@Generated("with GenerateAdminCommands")
class EnableLMServiceEventPointCmd extends AdminCmd<Void> {
    EnableLMServiceEventPointCmd() {
        super("enableLMServiceEventPoint")
    }

    /**
     * The name of the local mapping service with the event point.
     */
    def 'lmService'(String value) {
        parameter("lmService", value)
    }

}
