/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Creates an entry in the audit.xml to reference the configuration of a Third Party Emitter implementation of the Service Provider interface.
*/
@Generated("with GenerateAdminCommands")
class CreateThirdPartyEmitterCmd extends AdminCmd<Void> {
    CreateThirdPartyEmitterCmd() {
        super("createThirdPartyEmitter")
    }

    /**
     * Supply a unique name to identify the implementation.
     */
    def 'uniqueName'(String value) {
        parameter("uniqueName", value)
    }

    /**
     * Supply the class name to identify the implementation.
     */
    def 'className'(String value) {
        parameter("className", value)
    }

    /**
     * Supply the class name to identify the event formatter.
     */
    def 'eventFormatterClass'(String value) {
        parameter("eventFormatterClass", value)
    }

    /**
     * Specifies a comma separated list of attribute=value custom property pairs to be added to the security object.
     */
    def 'customProperties'(String value) {
        parameter("customProperties", value)
    }

    /**
     * Supply references to pre-defined audit filters to apply to this implementation.
     */
    def 'auditFilters'(String value) {
        parameter("auditFilters", value)
    }

}
