/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Sets a list of references to defined filters for the supplied event factory.
*/
@Generated("with GenerateAdminCommands")
class SetAuditEventFactoryFiltersCmd extends AdminCmd<Void> {
    SetAuditEventFactoryFiltersCmd() {
        super("setAuditEventFactoryFilters")
    }

    /**
     * Supply a valid reference to an audit event factory implementation.
     */
    def 'eventFactoryRef'(String value) {
        parameter("eventFactoryRef", value)
    }

    /**
     * Supply a list of valid references to defined audit specifications.
     */
    def 'filtersRef'(String value) {
        parameter("filtersRef", value)
    }

}
