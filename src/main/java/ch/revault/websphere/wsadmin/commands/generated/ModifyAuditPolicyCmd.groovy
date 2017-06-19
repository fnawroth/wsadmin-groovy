/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modifies the audit policy attributes.
*/
@Generated("with GenerateAdminCommands")
class ModifyAuditPolicyCmd extends AdminCmd<Void> {
    ModifyAuditPolicyCmd() {
        super("modifyAuditPolicy")
    }

    /**
     * Describes the state of audit enablement.
     */
    def 'auditEnabled'(Boolean value) {
        parameter("auditEnabled", value)
    }

    /**
     * Describes the behavior of the WebSphere process in the event of an audit failure.
     */
    def 'auditPolicy'(String value) {
        parameter("auditPolicy", value)
    }

    /**
     * Supply the name of a person given the Auditor role.
     */
    def 'auditorId'(String value) {
        parameter("auditorId", value)
    }

    /**
     * Supply a unique name to identify the audit specification.
     */
    def 'auditorPwd'(String value) {
        parameter("auditorPwd", value)
    }

    /**
     * Enables signing of the audit records.
     */
    def 'sign'(Boolean value) {
        parameter("sign", value)
    }

    /**
     * Enables the encryption of audit records.
     */
    def 'encrypt'(Boolean value) {
        parameter("encrypt", value)
    }

    /**
     * Enables the verbose capture of audit data.
     */
    def 'verbose'(Boolean value) {
        parameter("verbose", value)
    }

    /**
     * Reference ID of encryption certificate used to encrypt the audit records.
     */
    def 'encryptionCert'(String value) {
        parameter("encryptionCert", value)
    }

}
