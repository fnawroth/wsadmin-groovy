/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns the configured audit service provider for the supplied event factory.
*/
@Generated("with GenerateAdminCommands")
class GetAuditEventFactoryProviderCmd extends AdminCmd<Void> {
    GetAuditEventFactoryProviderCmd() {
        super("getAuditEventFactoryProvider")
    }

    /**
     * Supply a valid reference to an audit event factory implementation.
     */
    def 'eventFactoryRef'(String value) {
        parameter("eventFactoryRef", value)
    }

}
