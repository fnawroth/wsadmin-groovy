/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Use the "inspectServiceMapLibrary" command to display details about the service maps within a service map library.
*/
@Generated("with GenerateAdminCommands")
class InspectServiceMapLibraryCmd extends AdminCmd<Void> {
    InspectServiceMapLibraryCmd() {
        super("inspectServiceMapLibrary")
    }

    /**
     * Path to the service map file being inspected.
     */
    def 'source'(com.ibm.websphere.management.cmdframework.UploadFile value) {
        parameter("source", value)
    }

}
