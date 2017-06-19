/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create an Object Cache Instance.  An object cache instance is a location where an applications can store, distribute, and share data. 
*/
@Generated("with GenerateAdminCommands")
class CreateObjectCacheInstanceCmd extends AdminCmd<Void> {
    CreateObjectCacheInstanceCmd() {
        super("createObjectCacheInstance")
    }

    /**
     * Name of the Object Cache Instance.
     */
    def 'name'(java.lang.String value) {
        parameter("name", value)
    }

    /**
     * The JNDI name for this Object Cache Instance.
     */
    def 'jndiName'(java.lang.String value) {
        parameter("jndiName", value)
    }

}
