/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete a mediation.
*/
@Generated("with GenerateAdminCommands")
class DeleteSIBMediationCmd extends AdminCmd<Void> {
    DeleteSIBMediationCmd() {
        super("deleteSIBMediation")
    }

    /**
     * The name of the bus that owns the mediation.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * Name of the mediation to be deleted.
     */
    def 'mediationName'(String value) {
        parameter("mediationName", value)
    }

}
