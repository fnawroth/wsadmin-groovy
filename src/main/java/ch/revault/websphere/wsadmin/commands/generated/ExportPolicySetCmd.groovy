/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The exportPolicySet command exports a policy set as an archive that can be copied onto a client environment or imported onto a server environment.
*/
@Generated("with GenerateAdminCommands")
class ExportPolicySetCmd extends AdminCmd<Void> {
    ExportPolicySetCmd() {
        super("exportPolicySet")
    }

    /**
     * Specifies the policy set name. For a list of all policy set names, use the listPolicySets command. (String) 
     */
    def 'policySet'(String value) {
        parameter("policySet", value)
    }

    /**
     * Specifies the path name of the archive file. (String)
     */
    def 'pathName'(String value) {
        parameter("pathName", value)
    }

}
