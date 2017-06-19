/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists certificate authority (CA) client configurator objects.
*/
@Generated("with GenerateAdminCommands")
class ListCAClientsCmd extends AdminCmd<Void> {
    ListCAClientsCmd() {
        super("listCAClients")
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

    /**
     * Specify true to list all certificate authority (CA) configurator objects. (Overrides the scopeName parameter if true.)
     */
    def 'all'(Boolean value) {
        parameter("all", value)
    }

}
