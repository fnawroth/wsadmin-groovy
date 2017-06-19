/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List key sets within a scope.
*/
@Generated("with GenerateAdminCommands")
class ListKeySetsCmd extends AdminCmd<Void> {
    ListKeySetsCmd() {
        super("listKeySets")
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

    /**
     * Specify true to display the list output as ObjectNames and false to return SSL configuration alias names.
     */
    def 'displayObjectName'(Boolean value) {
        parameter("displayObjectName", value)
    }

    /**
     * Specify true to list all key sets.  True overrides the scopeName parameter.
     */
    def 'all'(Boolean value) {
        parameter("all", value)
    }

}
