/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns the configured maximum number of Binary audit logs.
*/
@Generated("with GenerateAdminCommands")
class GetMaxNumBinaryLogsCmd extends AdminCmd<Void> {
    GetMaxNumBinaryLogsCmd() {
        super("getMaxNumBinaryLogs")
    }

    /**
     * Supply a valid reference to an audit service provider implementation.
     */
    def 'emitterRef'(String value) {
        parameter("emitterRef", value)
    }

}
