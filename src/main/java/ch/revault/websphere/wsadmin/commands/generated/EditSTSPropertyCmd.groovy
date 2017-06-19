/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Edit a configuration property under a configuration group.
*/
@Generated("with GenerateAdminCommands")
class EditSTSPropertyCmd extends AdminCmd<Void> {
    EditSTSPropertyCmd() {
        super("editSTSProperty")
    }

    /**
     * Value of the property.
     */
    def 'propertyValue'(String value) {
        parameter("propertyValue", value)
    }

}
