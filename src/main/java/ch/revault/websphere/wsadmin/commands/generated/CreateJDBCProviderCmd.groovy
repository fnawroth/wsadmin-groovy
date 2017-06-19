/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a new JDBC provider that is used to connect with a relational database for data access.
*/
@Generated("with GenerateAdminCommands")
class CreateJDBCProviderCmd extends AdminCmd<Void> {
    CreateJDBCProviderCmd() {
        super("createJDBCProvider")
    }

    /**
     * The scope for the new JDBC provider in the form type=name, where type is one of Cell | Node | Server | Application | Cluster, and name is the Cell, Node, Server, Application, or Cluster instance.
     */
    def 'scope'(String value) {
        parameter("scope", value)
    }

    /**
     * The type of database used by this JDBC provider.
     */
    def 'databaseType'(String value) {
        parameter("databaseType", value)
    }

    /**
     * The JDBC provider type used by this JDBC provider.
     */
    def 'providerType'(String value) {
        parameter("providerType", value)
    }

    /**
     * The implementation type for this JDBC provider. Use 'Connection pool data source' if your application runs in a single phase or local transaction.  Use 'XA data source' to run in a global transaction.
     */
    def 'implementationType'(String value) {
        parameter("implementationType", value)
    }

    /**
     * The name of the JDBC provider.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The description for the JDBC provider.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * The name of the Java class for the implementation of the JDBC driver.
     */
    def 'implementationClassName'(String value) {
        parameter("implementationClassName", value)
    }

    /**
     * Specifies a list of paths or JAR file names that together form the location for the resource provider classes. The classpath might contain multiple elements if they are separated with a colon, semicolon, or comma.
     */
    def 'classpath'(java.lang.String[] value) {
        parameter("classpath", value)
    }

    /**
     * Specifies a list of paths that forms the location for the resource provider native libraries.  The native path might contain multiple elements if they are separated with a colon, semicolon, or comma.
     */
    def 'nativePath'(java.lang.String[] value) {
        parameter("nativePath", value)
    }

    /**
     * Load this JDBC Provider using a unique shared library classloader.
     */
    def 'isolated'(Boolean value) {
        parameter("isolated", value)
    }

}
