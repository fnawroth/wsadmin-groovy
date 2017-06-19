/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns mappings between user and group attributes of user registry to virtual member manager properties for a realm.
*/
@Generated("with GenerateAdminCommands")
class ListIdMgrRealmURAttrMappingsCmd extends AdminCmd<Void> {
    ListIdMgrRealmURAttrMappingsCmd() {
        super("listIdMgrRealmURAttrMappings")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Name of the realm.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

}
