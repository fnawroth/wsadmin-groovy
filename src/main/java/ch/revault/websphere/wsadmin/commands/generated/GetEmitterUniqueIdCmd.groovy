/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns the unique ID associated with the supplied emitter reference.
*/
@Generated("with GenerateAdminCommands")
class GetEmitterUniqueIdCmd extends AdminCmd<Void> {
    GetEmitterUniqueIdCmd() {
        super("getEmitterUniqueId")
    }

    /**
     * Supply a valid reference to an audit service provider implementation.
     */
    def 'emitterRef'(String value) {
        parameter("emitterRef", value)
    }

}
