/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Shows the current extensions attached to the composition unit.
*/
@Generated("with GenerateAdminCommands")
class ListOSGiExtensionsCmd extends AdminCmd<Void> {
    ListOSGiExtensionsCmd() {
        super("listOSGiExtensions")
    }

    /**
     * The name of the composition unit.
     */
    def 'cuName'(String value) {
        parameter("cuName", value)
    }

}
