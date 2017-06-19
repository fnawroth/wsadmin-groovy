/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a JAX-WS Handler List
*/
@Generated("with GenerateAdminCommands")
class CreateJAXWSHandlerListCmd extends AdminCmd<Void> {
    CreateJAXWSHandlerListCmd() {
        super("createJAXWSHandlerList")
    }

    /**
     * The name given to the JAX-WS Handler List
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The description associated with the JAX-WS Handler List
     */
    def 'description'(String value) {
        parameter("description", value)
    }

}
