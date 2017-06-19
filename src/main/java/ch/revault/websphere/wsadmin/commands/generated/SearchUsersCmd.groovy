/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Searches PersonAccounts.
*/
@Generated("with GenerateAdminCommands")
class SearchUsersCmd extends AdminCmd<Void> {
    SearchUsersCmd() {
        super("searchUsers")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * The common name of the entity.
     */
    def 'cn'(String value) {
        parameter("cn", value)
    }

    /**
     * The surname of the entity.
     */
    def 'sn'(String value) {
        parameter("sn", value)
    }

    /**
     * The principal name of a PersonAccount.
     */
    def 'principalName'(String value) {
        parameter("principalName", value)
    }

    /**
     * The e-mail address of the PersonAccount.
     */
    def 'mail'(String value) {
        parameter("mail", value)
    }

    /**
     * The UID of the PersonAccount.
     */
    def 'uid'(String value) {
        parameter("uid", value)
    }

    /**
     * A maximum amount of time, in milliseconds, to run a search.
     */
    def 'timeLimit'(Integer value) {
        parameter("timeLimit", value)
    }

    /**
     * The maximum number of entities to return.
     */
    def 'countLimit'(Integer value) {
        parameter("countLimit", value)
    }

    /**
     * The mode of clearing cache before the operation. Valid value is 'clearAll'.
     */
    def 'clearCache'(String value) {
        parameter("clearCache", value)
    }

}
