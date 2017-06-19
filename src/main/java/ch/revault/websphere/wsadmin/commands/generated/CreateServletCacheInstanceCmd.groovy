/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a Servlet Cache Instance.  A servlet cache instance is a location where the dynamic cache can store, distribute, and share data.
*/
@Generated("with GenerateAdminCommands")
class CreateServletCacheInstanceCmd extends AdminCmd<Void> {
    CreateServletCacheInstanceCmd() {
        super("createServletCacheInstance")
    }

    /**
     * Name of the Servlet Cache Instance.
     */
    def 'name'(java.lang.String value) {
        parameter("name", value)
    }

    /**
     * The JNDI name for this Servlet Cache Instance.
     */
    def 'jndiName'(java.lang.String value) {
        parameter("jndiName", value)
    }

}
