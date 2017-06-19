/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get the available JMS providers
*/
@Generated("with GenerateAdminCommands")
class GetJMSProvidersCmd extends AdminCmd<Void> {
    GetJMSProvidersCmd() {
        super("getJMSProviders")
    }

    /**
     * The type of object to be used with this provider
     */
    def 'objectType'(String value) {
        parameter("objectType", value)
    }

    /**
     * The type of object to be used with this provider
     */
    def 'allscopes'(java.lang.Boolean value) {
        parameter("allscopes", value)
    }

}
