/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Add a configuration property under a configuration group.
*/
@Generated("with GenerateAdminCommands")
class AddSTSPropertyCmd extends AdminCmd<Void> {
    AddSTSPropertyCmd() {
        super("addSTSProperty")
    }

    /**
     * Value of the property.
     */
    def 'propertyValue'(String value) {
        parameter("propertyValue", value)
    }

}
