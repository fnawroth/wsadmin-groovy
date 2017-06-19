/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes the named external bundle repository from the configuration.
*/
@Generated("with GenerateAdminCommands")
class RemoveExternalBundleRepositoryCmd extends AdminCmd<Void> {
    RemoveExternalBundleRepositoryCmd() {
        super("removeExternalBundleRepository")
    }

    /**
     * The name of the external bundle repository configuration. (REQUIRED)
     */
    def 'name'(String value) {
        parameter("name", value)
    }

}
