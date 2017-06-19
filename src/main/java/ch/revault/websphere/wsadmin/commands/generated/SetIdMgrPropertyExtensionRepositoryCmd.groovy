/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Sets or updates the property mapping repository configuration.
*/
@Generated("with GenerateAdminCommands")
class SetIdMgrPropertyExtensionRepositoryCmd extends AdminCmd<Void> {
    SetIdMgrPropertyExtensionRepositoryCmd() {
        super("setIdMgrPropertyExtensionRepository")
    }

    /**
     * The datasource JNDI name.
     */
    def 'dataSourceName'(String value) {
        parameter("dataSourceName", value)
    }

    /**
     * The type of database. Virtual member manager supports "db2", "oracle", "informix", "derby", "sqlserver", "db2zos", and "db2iseries".
     */
    def 'databaseType'(String value) {
        parameter("databaseType", value)
    }

    /**
     * The database URL for direct access mode.
     */
    def 'dbURL'(String value) {
        parameter("dbURL", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * The database schema where virtual member manager tables must be created. The specified schema should already exist in the database.
     */
    def 'dbSchema'(String value) {
        parameter("dbSchema", value)
    }

    /**
     * The database administrator ID for direct access mode. Example: db2admin
     */
    def 'dbAdminId'(String value) {
        parameter("dbAdminId", value)
    }

    /**
     * The database administrator password for direct access mode.
     */
    def 'dbAdminPassword'(String value) {
        parameter("dbAdminPassword", value)
    }

    /**
     * The name of the database driver for direct access mode. Example: COM.ibm.db2.jdbc.app.DB2Driver 
     */
    def 'JDBCDriverClass'(String value) {
        parameter("JDBCDriverClass", value)
    }

    /**
     * The maximum number of results to retrieve for one SQL call.
     */
    def 'entityRetrievalLimit'(Integer value) {
        parameter("entityRetrievalLimit", value)
    }

}
