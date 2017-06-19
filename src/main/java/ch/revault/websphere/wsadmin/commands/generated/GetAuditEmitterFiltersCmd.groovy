/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns a list of defined filters for the supplied emitter in shortened format.
*/
@Generated("with GenerateAdminCommands")
class GetAuditEmitterFiltersCmd extends AdminCmd<Void> {
    GetAuditEmitterFiltersCmd() {
        super("getAuditEmitterFilters")
    }

    /**
     * Supply a valid reference to an audit service provider implementation.
     */
    def 'emitterRef'(String value) {
        parameter("emitterRef", value)
    }

}
