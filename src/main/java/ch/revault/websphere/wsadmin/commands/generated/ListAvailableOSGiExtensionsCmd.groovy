/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Shows the possible extensions available to be attached to the composition unit.
*/
@Generated("with GenerateAdminCommands")
class ListAvailableOSGiExtensionsCmd extends AdminCmd<Void> {
    ListAvailableOSGiExtensionsCmd() {
        super("listAvailableOSGiExtensions")
    }

    /**
     * The name of the composition unit.
     */
    def 'cuName'(String value) {
        parameter("cuName", value)
    }

}
