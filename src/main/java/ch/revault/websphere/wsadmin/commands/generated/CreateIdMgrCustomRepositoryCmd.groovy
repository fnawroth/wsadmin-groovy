/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Creates a custom repository configuration.
*/
@Generated("with GenerateAdminCommands")
class CreateIdMgrCustomRepositoryCmd extends AdminCmd<Void> {
    CreateIdMgrCustomRepositoryCmd() {
        super("createIdMgrCustomRepository")
    }

    /**
     * The unique identifier of the repository.
     */
    def 'id'(String value) {
        parameter("id", value)
    }

    /**
     * The implementation class name for the repository adapter.
     */
    def 'adapterClassName'(String value) {
        parameter("adapterClassName", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
