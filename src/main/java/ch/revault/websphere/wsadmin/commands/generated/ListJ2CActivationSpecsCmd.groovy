/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List the J2C activation specifications that have a specified message listener type defined in the specified J2C resource adapter.
*/
@Generated("with GenerateAdminCommands")
class ListJ2CActivationSpecsCmd extends AdminCmd<Void> {
    ListJ2CActivationSpecsCmd() {
        super("listJ2CActivationSpecs")
    }

    /**
     * A message listener of the J2C activation specification to list.
     */
    def 'messageListenerType'(String value) {
        parameter("messageListenerType", value)
    }

}
