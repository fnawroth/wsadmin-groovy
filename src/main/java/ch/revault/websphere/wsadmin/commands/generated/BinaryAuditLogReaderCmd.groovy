/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Binary Audit Log Reader Command
*/
@Generated("with GenerateAdminCommands")
class BinaryAuditLogReaderCmd extends AdminCmd<Void> {
    BinaryAuditLogReaderCmd() {
        super("binaryAuditLogReader")
    }

    /**
     * Specifies the fully qualified path of the Binary Audit Log
     */
    def 'fileName'(String value) {
        parameter("fileName", value)
    }

    /**
     * Specifies the type of report: basic, complete or custom
     */
    def 'reportMode'(String value) {
        parameter("reportMode", value)
    }

    /**
     * Specifies which audit event type(s) to read and report
     */
    def 'eventFilter'(String value) {
        parameter("eventFilter", value)
    }

    /**
     * Specifies which audit event outcome(s) to read and report
     */
    def 'outcomeFilter'(String value) {
        parameter("outcomeFilter", value)
    }

    /**
     * Specifies which sequence of records to read and report
     */
    def 'sequenceFilter'(String value) {
        parameter("sequenceFilter", value)
    }

    /**
     * Specifies which timestamp range of records to read and report
     */
    def 'timeStampFilter'(String value) {
        parameter("timeStampFilter", value)
    }

    /**
     * Specifies the password to open the key store.
     */
    def 'keyStorePassword'(String value) {
        parameter("keyStorePassword", value)
    }

    /**
     * Specifies the location of the output HTML report
     */
    def 'outputLocation'(String value) {
        parameter("outputLocation", value)
    }

    /**
     * Specifies the specific data points to be reported for each audit record
     */
    def 'dataPoints'(String value) {
        parameter("dataPoints", value)
    }

}
