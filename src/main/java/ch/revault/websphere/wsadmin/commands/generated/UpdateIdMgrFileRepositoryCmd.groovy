/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Updates a file repository configuration.
*/
@Generated("with GenerateAdminCommands")
class UpdateIdMgrFileRepositoryCmd extends AdminCmd<Void> {
    UpdateIdMgrFileRepositoryCmd() {
        super("updateIdMgrFileRepository")
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
