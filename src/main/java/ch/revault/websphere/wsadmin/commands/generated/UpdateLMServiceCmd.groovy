/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Use the "updateLMService" command to update details about an existing local mapping service.
*/
@Generated("with GenerateAdminCommands")
class UpdateLMServiceCmd extends AdminCmd<Void> {
    UpdateLMServiceCmd() {
        super("updateLMService")
    }

    /**
     * A updated name for the local mapping service. The name must be unique and non-empty.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * An updated description of the local mapping service.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * The name of the service map to be attached to the local mapping service that is being updated.
     */
    def 'attachSMName'(String value) {
        parameter("attachSMName", value)
    }

}
