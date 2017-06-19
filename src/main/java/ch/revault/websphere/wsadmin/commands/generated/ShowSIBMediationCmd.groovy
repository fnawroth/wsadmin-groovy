/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Show the attributes of a mediation.
*/
@Generated("with GenerateAdminCommands")
class ShowSIBMediationCmd extends AdminCmd<Void> {
    ShowSIBMediationCmd() {
        super("showSIBMediation")
    }

    /**
     * The name of the bus that owns the mediation.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * The name of the mediation to be shown.
     */
    def 'mediationName'(String value) {
        parameter("mediationName", value)
    }

}
