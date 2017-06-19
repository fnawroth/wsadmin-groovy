/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Adds an extension to the composition unit.
*/
@Generated("with GenerateAdminCommands")
class AddOSGiExtensionCmd extends AdminCmd<Void> {
    AddOSGiExtensionCmd() {
        super("addOSGiExtension")
    }

    /**
     * The name of the composition unit.
     */
    def 'cuName'(String value) {
        parameter("cuName", value)
    }

    /**
     * The symbolic name of the extension.
     */
    def 'symbolicName'(String value) {
        parameter("symbolicName", value)
    }

    /**
     * The version of the extension.
     */
    def 'version'(String value) {
        parameter("version", value)
    }

}
