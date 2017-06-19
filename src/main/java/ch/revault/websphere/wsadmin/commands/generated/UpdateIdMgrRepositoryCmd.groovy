/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Updates the configuration of the specified repository. To add multiple values to a multivalued parameter, call this command repeatedly.
*/
@Generated("with GenerateAdminCommands")
class UpdateIdMgrRepositoryCmd extends AdminCmd<Void> {
    UpdateIdMgrRepositoryCmd() {
        super("updateIdMgrRepository")
    }

    /**
     * The unique identifier of the repository.
     */
    def 'id'(String value) {
        parameter("id", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * The implementation class name for the repository adapter.
     */
    def 'adapterClassName'(String value) {
        parameter("adapterClassName", value)
    }

    /**
     * Name of the entity type that cannot be created in this repository. To add to the parameter, specify a list. To reset all the values of this parameter, specify an empty list.
     */
    def 'EntityTypesNotAllowCreate'(String value) {
        parameter("EntityTypesNotAllowCreate", value)
    }

    /**
     * Name of the entity type that cannot be updated in this repository. To add to the parameter, specify a list. To reset all the values of this parameter, specify an empty list.
     */
    def 'EntityTypesNotAllowUpdate'(String value) {
        parameter("EntityTypesNotAllowUpdate", value)
    }

    /**
     * Name of the entity type that cannot be read from this repository. To add to the parameter, specify a list. To reset all the values of this parameter, specify an empty list.
     */
    def 'EntityTypesNotAllowRead'(String value) {
        parameter("EntityTypesNotAllowRead", value)
    }

    /**
     * Name of the entity type that cannot be deleted from this repository. To add to the parameter, specify a list. To reset all the values of this parameter, specify an empty list.
     */
    def 'EntityTypesNotAllowDelete'(String value) {
        parameter("EntityTypesNotAllowDelete", value)
    }

    /**
     * Repository ID where group data is stored.
     */
    def 'repositoriesForGroups'(String value) {
        parameter("repositoriesForGroups", value)
    }

    /**
     * A semicolon separated list of virtual member manager properties that can be used for login. To add to the parameter, specify a list. To reset all the values of this parameter, specify an empty list.
     */
    def 'loginProperties'(String value) {
        parameter("loginProperties", value)
    }

    /**
     * A boolean representing if the repository supports paging
     */
    def 'supportPaging'(Boolean value) {
        parameter("supportPaging", value)
    }

    /**
     * A boolean representing if the repository supports sorting
     */
    def 'supportSorting'(Boolean value) {
        parameter("supportSorting", value)
    }

    /**
     * A boolean representing if the repository supports transactions
     */
    def 'supportTransactions'(Boolean value) {
        parameter("supportTransactions", value)
    }

    /**
     * A boolean representing if the external ID for entities in the repository is unique
     */
    def 'isExtIdUnique'(Boolean value) {
        parameter("isExtIdUnique", value)
    }

    /**
     * A boolean representing if the repository supports external names
     */
    def 'supportExternalName'(Boolean value) {
        parameter("supportExternalName", value)
    }

    /**
     * A boolean representing if the adapter supports asynchronous mode
     */
    def 'supportAsyncMode'(Boolean value) {
        parameter("supportAsyncMode", value)
    }

    /**
     * Is this a read only repository?
     */
    def 'readOnly'(Boolean value) {
        parameter("readOnly", value)
    }

    /**
     * A string representing the type of support for change tracking. Acceptable values include 'none', 'native'.
     */
    def 'supportChangeLog'(String value) {
        parameter("supportChangeLog", value)
    }

}
