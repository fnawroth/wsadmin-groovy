/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Creates an entry in the audit.xml to reference an Audit Specification. Enables the specification by default.
*/
@Generated("with GenerateAdminCommands")
class CreateAuditFilterCmd extends AdminCmd<Void> {
    CreateAuditFilterCmd() {
        super("createAuditFilter")
    }

    /**
     * Supply a unique name to identify the audit specification.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Supply a valid event type.
     */
    def 'eventType'(String value) {
        parameter("eventType", value)
    }

    /**
     * Supply a valid audit outcome.
     */
    def 'outcome'(String value) {
        parameter("outcome", value)
    }

}
