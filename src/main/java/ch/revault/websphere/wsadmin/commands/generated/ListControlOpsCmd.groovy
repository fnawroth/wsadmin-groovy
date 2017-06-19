/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists control operations defined for a business-level application and its composition units.
*/
@Generated("with GenerateAdminCommands")
class ListControlOpsCmd extends AdminCmd<Void> {
    ListControlOpsCmd() {
        super("listControlOps")
    }

    /**
     * The ID of a business-level application for which to list control operations.  (See output from the listBLAs command for the format of a fully-qualified of a business-level application ID.)
     */
    def 'blaID'(String value) {
        parameter("blaID", value)
    }

    /**
     * The ID of the specific composition unit for which to list control operations.  (See output from the listCompUnits command for the format of a fully-qualified composition unit ID.)  If no composition unit ID is specified, control operations for the specified business-level application are listed.
     */
    def 'cuID'(String value) {
        parameter("cuID", value)
    }

    /**
     * The specific operation to list.  If no operation is specified, all control operations are listed.
     */
    def 'opName'(String value) {
        parameter("opName", value)
    }

    /**
     * The "long" option is used to generate a listing with additional control operation details.  The details are of interest mainly to developers of business-level application content providers which must provide start and stop operation handlers for assets they configure.  Specify a value of "true" to list the additional details.  The default value for this option is "false".
     */
    def 'long'(String value) {
        parameter("long", value)
    }

}
