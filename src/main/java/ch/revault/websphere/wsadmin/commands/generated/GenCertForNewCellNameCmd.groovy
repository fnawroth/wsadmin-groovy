/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Generates and replaces default certificates with one that is created with the new cell name.
*/
@Generated("with GenerateAdminCommands")
class GenCertForNewCellNameCmd extends AdminCmd<Void> {
    GenCertForNewCellNameCmd() {
        super("genCertForNewCellName")
    }

    /**
     * The new cell name to be used in the newly generated default certificates.
     */
    def 'cellName'(String value) {
        parameter("cellName", value)
    }

}
