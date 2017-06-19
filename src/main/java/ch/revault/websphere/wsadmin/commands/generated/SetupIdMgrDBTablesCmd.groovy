/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Creates and populates tables for database in virtual member manager.
*/
@Generated("with GenerateAdminCommands")
class SetupIdMgrDBTablesCmd extends AdminCmd<Void> {
    SetupIdMgrDBTablesCmd() {
        super("setupIdMgrDBTables")
    }

    /**
     * Specifies whether to report sql errors while setting up databases.
     */
    def 'reportSqlError'(String value) {
        parameter("reportSqlError", value)
    }

    /**
     * The location of <vmm_install>/setup directory.
     */
    def 'schemaLocation'(String value) {
        parameter("schemaLocation", value)
    }

    /**
     * The location of database repository property definition xml file.
     */
    def 'dbPropXML'(String value) {
        parameter("dbPropXML", value)
    }

    /**
     * The type of database. Virtual member manager supports "db2", "oracle", "informix", "derby", "sqlserver", "db2zos", and "db2iseries".
     */
    def 'databaseType'(String value) {
        parameter("databaseType", value)
    }

    /**
     * The database URL for direct access mode. Example: jdbc:db2:wim
     */
    def 'dbURL'(String value) {
        parameter("dbURL", value)
    }

    /**
     * The database schema where virtual member manager tables must be created. The specified schema should already exist in the database.
     */
    def 'dbSchema'(String value) {
        parameter("dbSchema", value)
    }

    /**
     * The tablespace prefix. The maximum length is 3 characters. This value is required when the dbSchema option is used. It is specific to db2zos and is ignored for any other database type.
     */
    def 'tablespacePrefix'(String value) {
        parameter("tablespacePrefix", value)
    }

    /**
     * The name of the database driver. Example: COM.ibm.db2.jdbc.app.DB2Driver 
     */
    def 'dbDriver'(String value) {
        parameter("dbDriver", value)
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
     * The home location of the derby system if setting up a derby database.
     */
    def 'derbySystemHome'(String value) {
        parameter("derbySystemHome", value)
    }

    /**
     * Specifies the organization name used as the DN, for example, o=ibm.com.  If you do not specify a value, the default value used is o=Default Organization.
     */
    def 'dn'(String value) {
        parameter("dn", value)
    }

    /**
     * The WebSphere Application Server admin user/ server id. For example: wsadmin. After creation, the uniqueName will be "uid=wsadmin, <defaultOrg>".
     */
    def 'wasAdminId'(String value) {
        parameter("wasAdminId", value)
    }

    /**
     * The WebSphere Application Server admin user/ server id password. If was_admin_id is set, this parameter is mandatory.
     */
    def 'wasAdminPassword'(String value) {
        parameter("wasAdminPassword", value)
    }

    /**
     * The password encryption key. If not set, the default encryptionKey will be used.
     */
    def 'encryptionKey'(String value) {
        parameter("encryptionKey", value)
    }

    /**
     * The salt length of the randomly generated salt for password hashing. Default value is 12.
     */
    def 'saltLength'(String value) {
        parameter("saltLength", value)
    }

    /**
     * The full path to a file containing the input parameters. Each input parameter must exactly match a corresponding parameter as would be typed on the command line, and be placed in a Key=Value pair. Each pair must be on a separate line.
     */
    def 'file'(String value) {
        parameter("file", value)
    }

    /**
     * The buffer pool variable for default tables for DB2 for z/OS. The default value is BP0.
     */
    def 'tablesBufferPool'(String value) {
        parameter("tablesBufferPool", value)
    }

    /**
     * The buffer pool variable for auxiliary LOB tables for DB2 for z/OS. The default value is BP0.
     */
    def 'LOBTablesBufferPool'(String value) {
        parameter("LOBTablesBufferPool", value)
    }

    /**
     * The buffer pool variable for unique index tables for DB2 for z/OS. The default value is BP0.
     */
    def 'indexTablesBufferPool'(String value) {
        parameter("indexTablesBufferPool", value)
    }

}
