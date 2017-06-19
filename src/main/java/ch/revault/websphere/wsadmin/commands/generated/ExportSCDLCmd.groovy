/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Export the SCA SCDL
*/
@Generated("with GenerateAdminCommands")
class ExportSCDLCmd extends AdminCmd<Void> {
    ExportSCDLCmd() {
        super("exportSCDL")
    }

    /**
     * Composition Unit Name
     */
    def 'cuName'(String value) {
        parameter("cuName", value)
    }

    /**
     * Absolute path of the file to export the SCDL
     */
    def 'exportFile'(String value) {
        parameter("exportFile", value)
    }

}
