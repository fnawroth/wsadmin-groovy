/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* null
*/
@Generated("with GenerateAdminCommands")
class LookupResourcesCmd extends AdminCmd<Void> {
    LookupResourcesCmd() {
        super("lookupResources")
    }

    /**
     * null
     */
    def 'scope'(javax.management.ObjectName value) {
        parameter("scope", value)
    }

    /**
     * null
     */
    def 'jndiName'(String value) {
        parameter("jndiName", value)
    }

    /**
     * null
     */
    def 'currentScopeOnly'(Boolean value) {
        parameter("currentScopeOnly", value)
    }

}
