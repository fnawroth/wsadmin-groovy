/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modifies the named external bundle repository with the given parameters. Unspecified parameters keep their existing values. To remove an existing value, specify an empty string for the parameter.
*/
@Generated("with GenerateAdminCommands")
class ModifyExternalBundleRepositoryCmd extends AdminCmd<Void> {
    ModifyExternalBundleRepositoryCmd() {
        super("modifyExternalBundleRepository")
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
