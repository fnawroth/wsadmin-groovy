/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Creates an entry in the audit.xml to reference the configuration of an audit event factory implementation of the Audit Event Factory interface.
*/
@Generated("with GenerateAdminCommands")
class CreateAuditEventFactoryCmd extends AdminCmd<Void> {
    CreateAuditEventFactoryCmd() {
        super("createAuditEventFactory")
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
     * Supply a reference to identify the audit service provider implementation to associate with this audit event factory implementation.
     */
    def 'provider'(String value) {
        parameter("provider", value)
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
