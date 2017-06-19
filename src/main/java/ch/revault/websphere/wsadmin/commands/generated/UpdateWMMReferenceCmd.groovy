/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Updates WMM database references from other repositories.
*/
@Generated("with GenerateAdminCommands")
class UpdateWMMReferenceCmd extends AdminCmd<Void> {
    UpdateWMMReferenceCmd() {
        super("updateWMMReference")
    }

    /**
     * The repository to update (0: database repository, 1: property extension repository, 2: both repositories)
     */
    def 'reposType'(Integer value) {
        parameter("reposType", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
