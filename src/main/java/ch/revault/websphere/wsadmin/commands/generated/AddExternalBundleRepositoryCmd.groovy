/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Adds an external bundle repository to the configuration.  Requires a repository name and a URL.
*/
@Generated("with GenerateAdminCommands")
class AddExternalBundleRepositoryCmd extends AdminCmd<Void> {
    AddExternalBundleRepositoryCmd() {
        super("addExternalBundleRepository")
    }

    /**
     * The name of the external bundle repository configuration. (REQUIRED)
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * An optional description of the external bundle repository.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * The URL of the external bundle repository XML file. (REQUIRED when adding the repository)
     */
    def 'url'(String value) {
        parameter("url", value)
    }

}
