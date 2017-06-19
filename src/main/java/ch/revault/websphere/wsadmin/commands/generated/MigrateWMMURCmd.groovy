/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Migrates WMM UserRegistry properties information to virtual member manager realm configuration.
*/
@Generated("with GenerateAdminCommands")
class MigrateWMMURCmd extends AdminCmd<Void> {
    MigrateWMMURCmd() {
        super("migrateWMMUR")
    }

    /**
     * The location of wmmur.xml file. e.g. c:\WAS5\config\wmm\xml\wmmur.xml
     */
    def 'wmmurFile'(String value) {
        parameter("wmmurFile", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * The virtual member manager property for uniqueUserId(default: uniqueName).
     */
    def 'uniqueUserIdProperty'(String value) {
        parameter("uniqueUserIdProperty", value)
    }

    /**
     * The virtual member manager property for userSecurityName(default: principalName).
     */
    def 'userSecurityNameProperty'(String value) {
        parameter("userSecurityNameProperty", value)
    }

    /**
     * The virtual member manager property for userDisplayName(default: principalName).
     */
    def 'userDisplayNameProperty'(String value) {
        parameter("userDisplayNameProperty", value)
    }

    /**
     * The virtual member manager property for uniqueGroupId(default: uniqueName).
     */
    def 'uniqueGroupIdProperty'(String value) {
        parameter("uniqueGroupIdProperty", value)
    }

    /**
     * The virtual member manager property for groupSecurityName(default: cn).
     */
    def 'groupSecurityNameProperty'(String value) {
        parameter("groupSecurityNameProperty", value)
    }

    /**
     * The virtual member manager property for groupDisplayName(default: cn).
     */
    def 'groupDisplayNameProperty'(String value) {
        parameter("groupDisplayNameProperty", value)
    }

}
