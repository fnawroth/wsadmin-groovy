/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Sets a list of references to defined filters for the supplied audit service provider.
*/
@Generated("with GenerateAdminCommands")
class SetAuditEmitterFiltersCmd extends AdminCmd<Void> {
    SetAuditEmitterFiltersCmd() {
        super("setAuditEmitterFilters")
    }

    /**
     * Supply a valid reference to an audit service provider implementation.
     */
    def 'emitterRef'(String value) {
        parameter("emitterRef", value)
    }

    /**
     * Supply a list of valid references to defined audit specifications.
     */
    def 'filtersRef'(String value) {
        parameter("filtersRef", value)
    }

}
