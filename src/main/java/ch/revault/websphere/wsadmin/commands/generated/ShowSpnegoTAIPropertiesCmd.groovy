/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command displays the SPNEGO TAI properties in the security configuration. If an spnId is not specified, all the SPNEGO TAI properties are displayed.
*/
@Generated("with GenerateAdminCommands")
class ShowSpnegoTAIPropertiesCmd extends AdminCmd<Void> {
    ShowSpnegoTAIPropertiesCmd() {
        super("showSpnegoTAIProperties")
    }

    /**
     * Supply SPN identifier number. If not specified, all SPNEGO TAI configuration properties are displayed.
     */
    def 'spnId'(Integer value) {
        parameter("spnId", value)
    }

}
