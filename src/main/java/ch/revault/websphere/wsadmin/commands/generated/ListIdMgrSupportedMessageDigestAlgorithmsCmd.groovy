/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns a list of supported message digest algorithms.
*/
@Generated("with GenerateAdminCommands")
class ListIdMgrSupportedMessageDigestAlgorithmsCmd extends AdminCmd<Void> {
    ListIdMgrSupportedMessageDigestAlgorithmsCmd() {
        super("listIdMgrSupportedMessageDigestAlgorithms")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
