/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns a list of defined filters for the supplied event factory in shortened format.
*/
@Generated("with GenerateAdminCommands")
class GetAuditEventFactoryFiltersCmd extends AdminCmd<Void> {
    GetAuditEventFactoryFiltersCmd() {
        super("getAuditEventFactoryFilters")
    }

    /**
     * Supply a valid reference to an audit event factory implementation.
     */
    def 'eventFactoryRef'(String value) {
        parameter("eventFactoryRef", value)
    }

}
