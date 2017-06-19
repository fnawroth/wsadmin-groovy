/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Sets the default parent of an entity type in a specified realm. If mapping does not exist it is added, else the mapping is updated. If realm name is not specified, default realm is used. 
*/
@Generated("with GenerateAdminCommands")
class SetIdMgrRealmDefaultParentCmd extends AdminCmd<Void> {
    SetIdMgrRealmDefaultParentCmd() {
        super("setIdMgrRealmDefaultParent")
    }

    /**
     * Name of the entity type.
     */
    def 'entityTypeName'(String value) {
        parameter("entityTypeName", value)
    }

    /**
     * The default parent of the entity type for this realm. By default this is where the entity of this type is created for this realm.
     */
    def 'parentUniqueName'(String value) {
        parameter("parentUniqueName", value)
    }

    /**
     * Name of the realm.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
