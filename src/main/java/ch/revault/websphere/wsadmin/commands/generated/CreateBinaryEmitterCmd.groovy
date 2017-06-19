/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Creates an entry in the audit.xml to reference the configuration of the Binary File Emitter implementation of the Service Provider interface.
*/
@Generated("with GenerateAdminCommands")
class CreateBinaryEmitterCmd extends AdminCmd<Void> {
    CreateBinaryEmitterCmd() {
        super("createBinaryEmitter")
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
     * Supply the file location for the audit log.
     */
    def 'fileLocation'(String value) {
        parameter("fileLocation", value)
    }

    /**
     * Supply the maximum size, in MB, of each binary audit log.
     */
    def 'maxFileSize'(Integer value) {
        parameter("maxFileSize", value)
    }

    /**
     * Supply the maximum number of audit logs to generate before the oldest is rewritten.
     */
    def 'maxLogs'(Integer value) {
        parameter("maxLogs", value)
    }

    /**
     * Supply the default behavior for binary audit log wrapping.
     */
    def 'wrapBehavior'(String value) {
        parameter("wrapBehavior", value)
    }

    /**
     * Supply references to pre-defined audit filters to apply to this implementation.
     */
    def 'auditFilters'(String value) {
        parameter("auditFilters", value)
    }

}
