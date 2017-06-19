/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get information about a key manager.
*/
@Generated("with GenerateAdminCommands")
class GetKeyManagerCmd extends AdminCmd<Void> {
    GetKeyManagerCmd() {
        super("getKeyManager")
    }

    /**
     * Specifies a name to uniquely identify a key manager.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

}
