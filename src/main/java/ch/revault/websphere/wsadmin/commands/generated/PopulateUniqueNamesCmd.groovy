/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Attempt to populate any missing unique name entries in the authorization model for the specified bus using its user repository.
*/
@Generated("with GenerateAdminCommands")
class PopulateUniqueNamesCmd extends AdminCmd<Void> {
    PopulateUniqueNamesCmd() {
        super("populateUniqueNames")
    }

    /**
     * Bus name
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * Set this option to force all authorization entries to have their unique names populated from the user repository. This may overwrite existing unique names with different values.
     */
    def 'force'(Boolean value) {
        parameter("force", value)
    }

}
