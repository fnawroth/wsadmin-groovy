/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The listPolicySets command returns a list of all existing policy sets.
*/
@Generated("with GenerateAdminCommands")
class ListPolicySetsCmd extends AdminCmd<Void> {
    ListPolicySetsCmd() {
        super("listPolicySets")
    }

    /**
     * Specifies the type of policy set. Specify application to list application policy sets. Specify system/trust to list the trust service policy sets. The default value for this parameter is application. (String) 
     */
    def 'policySetType'(String value) {
        parameter("policySetType", value)
    }

    /**
     * Indicates if the command should use the default repository (Boolean)
     */
    def 'fromDefaultRepository'(Boolean value) {
        parameter("fromDefaultRepository", value)
    }

}
