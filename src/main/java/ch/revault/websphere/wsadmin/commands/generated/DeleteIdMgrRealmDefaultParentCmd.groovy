/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes the default parent of an entity type for a realm. If * is specified as entityTypeName, default parent mapping for all entity types is deleted. If the realm name is not specified, default realm is used. 
*/
@Generated("with GenerateAdminCommands")
class DeleteIdMgrRealmDefaultParentCmd extends AdminCmd<Void> {
    DeleteIdMgrRealmDefaultParentCmd() {
        super("deleteIdMgrRealmDefaultParent")
    }

    /**
     * Name of the entity type.
     */
    def 'entityTypeName'(String value) {
        parameter("entityTypeName", value)
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
