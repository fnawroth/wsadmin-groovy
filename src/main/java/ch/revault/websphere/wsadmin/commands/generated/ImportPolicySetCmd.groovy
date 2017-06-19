/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The importPolicySet command imports a policy set from a compressed archive onto a server environment.
*/
@Generated("with GenerateAdminCommands")
class ImportPolicySetCmd extends AdminCmd<Void> {
    ImportPolicySetCmd() {
        super("importPolicySet")
    }

    /**
     * Specifies the path name of the archive file to import. (String)
     */
    def 'importFile'(String value) {
        parameter("importFile", value)
    }

    /**
     * The name of the default policy set to import (String)
     */
    def 'defaultPolicySet'(String value) {
        parameter("defaultPolicySet", value)
    }

    /**
     * Specifies the policy set name. For a list of all policy set names, use the listPolicySets command. (String) 
     */
    def 'policySet'(String value) {
        parameter("policySet", value)
    }

    /**
     * Verifies the policy set is of this type. (String)
     */
    def 'verifyPolicySetType'(String value) {
        parameter("verifyPolicySetType", value)
    }

}
