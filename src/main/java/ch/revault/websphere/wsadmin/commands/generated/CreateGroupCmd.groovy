/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Creates a group in the default realm.
*/
@Generated("with GenerateAdminCommands")
class CreateGroupCmd extends AdminCmd<Void> {
    CreateGroupCmd() {
        super("createGroup")
    }

    /**
     * The common name of the entity.
     */
    def 'cn'(String value) {
        parameter("cn", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * A description of a group.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * The parent of the entity.
     */
    def 'parent'(String value) {
        parameter("parent", value)
    }

    /**
     * The uniqueName of the member to add or remove.
     */
    def 'memberUniqueName'(String value) {
        parameter("memberUniqueName", value)
    }

}
