/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Sets the user registry user or group attribute mapping for a realm. 
*/
@Generated("with GenerateAdminCommands")
class SetIdMgrRealmURAttrMappingCmd extends AdminCmd<Void> {
    SetIdMgrRealmURAttrMappingCmd() {
        super("setIdMgrRealmURAttrMapping")
    }

    /**
     * The user registry user or group attribute whose mapping is to be set. The valid values are: uniqueUserId, userDisplayName, userSecurityName, uniqueGroupId, groupDisplayName and groupSecurityName.
     */
    def 'URAttrName'(String value) {
        parameter("URAttrName", value)
    }

    /**
     * The virtual member manager property that maps to the user registry attribute for input. The valid values are: uniqueId, uniqueName, externalId, externalName and the attributes of PersonAccount and Group entity types.
     */
    def 'propertyForInput'(String value) {
        parameter("propertyForInput", value)
    }

    /**
     * The virtual member manager property that maps to the user registry attribute for output. The valid values are: uniqueId, uniqueName, externalId, externalName and the attributes of PersonAccount and Group entity types.
     */
    def 'propertyForOutput'(String value) {
        parameter("propertyForOutput", value)
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
