/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Adds the input administrative user to admin-authz.xml.
*/
@Generated("with GenerateAdminCommands")
class AddToAdminAuthzCmd extends AdminCmd<Void> {
    AddToAdminAuthzCmd() {
        super("addToAdminAuthz")
    }

    /**
     * Supply an administrative user name. 
     */
    def 'adminUser'(String value) {
        parameter("adminUser", value)
    }

}
