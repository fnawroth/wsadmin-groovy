/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns an audit emitter implementation object.
*/
@Generated("with GenerateAdminCommands")
class GetAuditEmitterCmd extends AdminCmd<Void> {
    GetAuditEmitterCmd() {
        super("getAuditEmitter")
    }

    /**
     * Supply a valid reference to an audit service provider implementation.
     */
    def 'emitterRef'(String value) {
        parameter("emitterRef", value)
    }

}
