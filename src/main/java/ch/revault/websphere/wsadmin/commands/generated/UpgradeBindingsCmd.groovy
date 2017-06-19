/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The upgradeBindings command upgrades bindings of an older version to the current version.
*/
@Generated("with GenerateAdminCommands")
class UpgradeBindingsCmd extends AdminCmd<Void> {
    UpgradeBindingsCmd() {
        super("upgradeBindings")
    }

    /**
     * Specifies the asset, such as the application name. (Properties)
     */
    def 'assetProps'(java.util.Properties value) {
        parameter("assetProps", value)
    }

}
