/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Use the "createLMService" command to create a local mapping service, to which a service map can be attached.
*/
@Generated("with GenerateAdminCommands")
class CreateLMServiceCmd extends AdminCmd<Void> {
    CreateLMServiceCmd() {
        super("createLMService")
    }

    /**
     * A name for the local mapping service. The name must be unique and non-empty.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Description of the local mapping service.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * The name of the service map to be attached to the local mapping service that is created.
     */
    def 'attachSMName'(String value) {
        parameter("attachSMName", value)
    }

}
