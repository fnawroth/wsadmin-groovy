/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Sets the auditor identity in the audit.xml file.
*/
@Generated("with GenerateAdminCommands")
class SetAuditorIdCmd extends AdminCmd<Void> {
    SetAuditorIdCmd() {
        super("setAuditorId")
    }

    /**
     * Supply the name of a person given the Auditor role.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

}
