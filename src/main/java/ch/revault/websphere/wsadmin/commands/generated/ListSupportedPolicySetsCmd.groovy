/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* listSupportedPolicySetsCmdDesc
*/
@Generated("with GenerateAdminCommands")
class ListSupportedPolicySetsCmd extends AdminCmd<Void> {
    ListSupportedPolicySetsCmd() {
        super("listSupportedPolicySets")
    }

    /**
     * Specifies the asset, such as the application name. (Properties)
     */
    def 'assetProps'(java.util.Properties value) {
        parameter("assetProps", value)
    }

}
