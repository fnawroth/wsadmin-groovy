/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modifies an audit specification entry in the audit.xml that matches the reference Id.
*/
@Generated("with GenerateAdminCommands")
class ModifyAuditFilterCmd extends AdminCmd<Void> {
    ModifyAuditFilterCmd() {
        super("modifyAuditFilter")
    }

    /**
     * Supply a valid audit specification reference.
     */
    def 'filterRef'(String value) {
        parameter("filterRef", value)
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

    /**
     * Supply the state of enablement for this audit specification.
     */
    def 'enableFilter'(Boolean value) {
        parameter("enableFilter", value)
    }

}
