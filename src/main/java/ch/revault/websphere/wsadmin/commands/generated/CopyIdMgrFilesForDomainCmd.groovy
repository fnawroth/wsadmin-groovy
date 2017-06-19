/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Copies the files related to virtual member manager from the specified source domain to the specified destination domain.
*/
@Generated("with GenerateAdminCommands")
class CopyIdMgrFilesForDomainCmd extends AdminCmd<Void> {
    CopyIdMgrFilesForDomainCmd() {
        super("copyIdMgrFilesForDomain")
    }

    /**
     * Name of the destination domain.
     */
    def 'destDomainName'(String value) {
        parameter("destDomainName", value)
    }

    /**
     * Name of the source domain. Permitted values are: admin - for admin domain , global - for global domain , <any_identifier> - any existing domain name.
     */
    def 'srcDomainName'(String value) {
        parameter("srcDomainName", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
