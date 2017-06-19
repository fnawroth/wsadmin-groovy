/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Creates a file repository configuration.
*/
@Generated("with GenerateAdminCommands")
class CreateIdMgrFileRepositoryCmd extends AdminCmd<Void> {
    CreateIdMgrFileRepositoryCmd() {
        super("createIdMgrFileRepository")
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
     * Base directory where the file is created to store the data
     */
    def 'baseDirectory'(String value) {
        parameter("baseDirectory", value)
    }

    /**
     * File name of the repository
     */
    def 'fileName'(String value) {
        parameter("fileName", value)
    }

    /**
     * The salt length of the randomly generated salt for password hashing. Default value is 12.
     */
    def 'saltLength'(Integer value) {
        parameter("saltLength", value)
    }

    /**
     * The message digest algorithm to use for hashing the password
     */
    def 'messageDigestAlgorithm'(String value) {
        parameter("messageDigestAlgorithm", value)
    }

}
