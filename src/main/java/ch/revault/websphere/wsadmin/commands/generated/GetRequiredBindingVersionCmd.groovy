/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The getRequiredBindingVersion command returns the binding version that is required for a specified asset.
*/
@Generated("with GenerateAdminCommands")
class GetRequiredBindingVersionCmd extends AdminCmd<Void> {
    GetRequiredBindingVersionCmd() {
        super("getRequiredBindingVersion")
    }

    /**
     * Specifies the asset, such as the application name. (Properties)
     */
    def 'assetProps'(java.util.Properties value) {
        parameter("assetProps", value)
    }

}
