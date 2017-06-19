/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command removes SPNEGO TAI properties from the security configuration. If an spnId is not specified, all the SPNEGO TAI properties are removed.
*/
@Generated("with GenerateAdminCommands")
class DeleteSpnegoTAIPropertiesCmd extends AdminCmd<Void> {
    DeleteSpnegoTAIPropertiesCmd() {
        super("deleteSpnegoTAIProperties")
    }

    /**
     * Supply SPN identifier number. If not specified, all SPNEGO TAI configuration properties are deleted.
     */
    def 'spnId'(Integer value) {
        parameter("spnId", value)
    }

}
