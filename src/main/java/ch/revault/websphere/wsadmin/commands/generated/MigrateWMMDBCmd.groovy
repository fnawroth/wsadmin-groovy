/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Migrates WMM Database data to virtual member manager Database, includes wmmDB, wmmLookaside, and wmmFederation, if applicable.
*/
@Generated("with GenerateAdminCommands")
class MigrateWMMDBCmd extends AdminCmd<Void> {
    MigrateWMMDBCmd() {
        super("migrateWMMDB")
    }

    /**
     * The database URL for WMM
     */
    def 'wmmDBURL'(String value) {
        parameter("wmmDBURL", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * The administrator id for WMM database
     */
    def 'wmmDBAdminId'(String value) {
        parameter("wmmDBAdminId", value)
    }

    /**
     * The administrator password for WMM database
     */
    def 'wmmDBAdminPassword'(String value) {
        parameter("wmmDBAdminPassword", value)
    }

}
