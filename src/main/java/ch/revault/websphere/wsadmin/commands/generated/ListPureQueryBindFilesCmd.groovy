/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List the pureQuery bind files in an installed application.
*/
@Generated("with GenerateAdminCommands")
class ListPureQueryBindFilesCmd extends AdminCmd<Void> {
    ListPureQueryBindFilesCmd() {
        super("listPureQueryBindFiles")
    }

    /**
     * The name of an installed application that contains the pureQuery bind files to be processed.
     */
    def 'appName'(String value) {
        parameter("appName", value)
    }

}
