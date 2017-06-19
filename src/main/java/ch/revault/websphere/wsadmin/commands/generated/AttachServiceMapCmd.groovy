/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Use the "attachServiceMap" command to attach a service map to a local mapping service.
*/
@Generated("with GenerateAdminCommands")
class AttachServiceMapCmd extends AdminCmd<Void> {
    AttachServiceMapCmd() {
        super("attachServiceMap")
    }

    /**
     * The name of the service map which you want to attach to the target local mapping service. The service map name is returned by the "installServiceMap" command.
     */
    def 'smName'(String value) {
        parameter("smName", value)
    }

}
