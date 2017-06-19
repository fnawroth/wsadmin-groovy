/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Creates an entry in the audit.xml to reference the configuration of an SMF Emitter implementation of the Service Provider interface.
*/
@Generated("with GenerateAdminCommands")
class CreateSMFEmitterCmd extends AdminCmd<Void> {
    CreateSMFEmitterCmd() {
        super("createSMFEmitter")
    }

    /**
     * Supply a unique name to identify the implementation.
     */
    def 'uniqueName'(String value) {
        parameter("uniqueName", value)
    }

    /**
     * Supply references to pre-defined audit filters to apply to this implementation.
     */
    def 'auditFilters'(String value) {
        parameter("auditFilters", value)
    }

}
