/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Add a configuration group.
*/
@Generated("with GenerateAdminCommands")
class AddSTSConfigurationGroupCmd extends AdminCmd<Void> {
    AddSTSConfigurationGroupCmd() {
        super("addSTSConfigurationGroup")
    }

    /**
     * Path of group names to the desired group.
     */
    def 'groupPath'(java.lang.String[] value) {
        parameter("groupPath", value)
    }

}
