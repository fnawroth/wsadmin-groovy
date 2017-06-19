/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns the file location of the Binary audit log.
*/
@Generated("with GenerateAdminCommands")
class GetBinaryFileLocationCmd extends AdminCmd<Void> {
    GetBinaryFileLocationCmd() {
        super("getBinaryFileLocation")
    }

    /**
     * Supply a valid reference to an audit service provider implementation.
     */
    def 'emitterRef'(String value) {
        parameter("emitterRef", value)
    }

}
