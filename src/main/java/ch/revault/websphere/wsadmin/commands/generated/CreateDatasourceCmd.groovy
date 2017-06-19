/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a new Datasource to access the backend data store.  Application components use the Datasource to access connection instances to your database. A connection pool is associated with each Datasource.
*/
@Generated("with GenerateAdminCommands")
class CreateDatasourceCmd extends AdminCmd<Void> {
    CreateDatasourceCmd() {
        super("createDatasource")
    }

    /**
     * The name of the Datasource.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The Java Naming and Directory Interface (JNDI) name for this Datasource.
     */
    def 'jndiName'(String value) {
        parameter("jndiName", value)
    }

    /**
     * The description for the Datasource.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * The category that can be used to classify or group the resource.
     */
    def 'category'(String value) {
        parameter("category", value)
    }

    /**
     * The name of the DataStoreHelper implementation class that extends the capabilities of the implementation class of the JDBC driver to perform functions that are specific to the data.
     */
    def 'dataStoreHelperClassName'(String value) {
        parameter("dataStoreHelperClassName", value)
    }

    /**
     * The alias used for database authentication at run time.  This alias is only used when the application resource reference is using res-auth=Application.
     */
    def 'componentManagedAuthenticationAlias'(String value) {
        parameter("componentManagedAuthenticationAlias", value)
    }

    /**
     * Specifies if this Datasource is used for container-managed persistence of enterprise beans. The default value is true.
     */
    def 'containerManagedPersistence'(Boolean value) {
        parameter("containerManagedPersistence", value)
    }

    /**
     * The alias used database authentication during XA recovery processing. When this property is specified, the default value is the alias for application authentication.
     */
    def 'xaRecoveryAuthAlias'(String value) {
        parameter("xaRecoveryAuthAlias", value)
    }

}
