/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Migrates WMM general configuration, supported member types, out-of-the-box member repositories, and LDAP attributes information to virtual member manager configuration.
*/
@Generated("with GenerateAdminCommands")
class MigrateWMMConfigCmd extends AdminCmd<Void> {
    MigrateWMMConfigCmd() {
        super("migrateWMMConfig")
    }

    /**
     * WMM configuration path in WAS 5.x driver. e.g. c:\WAS5\config\wmm.
     */
    def 'wmmConfigPath'(String value) {
        parameter("wmmConfigPath", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
