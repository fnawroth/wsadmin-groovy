/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes one or more bundles from the internal bundle repository in a single operation.
*/
@Generated("with GenerateAdminCommands")
class RemoveLocalRepositoryBundlesCmd extends AdminCmd<Void> {
    RemoveLocalRepositoryBundlesCmd() {
        super("removeLocalRepositoryBundles")
    }

    /**
     * A list of bundle identifiers specified as <bundle symbolic name>;<bundle version>
     */
    def 'bundles'(String value) {
        parameter("bundles", value)
    }

}
