/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Shows the information about a bundle in the internal bundle repository.
*/
@Generated("with GenerateAdminCommands")
class ShowLocalRepositoryBundleCmd extends AdminCmd<Void> {
    ShowLocalRepositoryBundleCmd() {
        super("showLocalRepositoryBundle")
    }

    /**
     * The symbolic name of the bundle.
     */
    def 'symbolicName'(String value) {
        parameter("symbolicName", value)
    }

    /**
     * The version of the bundle.
     */
    def 'version'(String value) {
        parameter("version", value)
    }

}
