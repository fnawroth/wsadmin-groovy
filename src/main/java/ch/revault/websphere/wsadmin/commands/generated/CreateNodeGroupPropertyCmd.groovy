/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* add a custom property for a node group
*/
@Generated("with GenerateAdminCommands")
class CreateNodeGroupPropertyCmd extends AdminCmd<Void> {
    CreateNodeGroupPropertyCmd() {
        super("createNodeGroupProperty")
    }

    /**
     * name of the property
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * value
     */
    def 'value'(String value) {
        parameter("value", value)
    }

    /**
     * description
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * required
     */
    def 'required'(Boolean value) {
        parameter("required", value)
    }

    /**
     * validation expression
     */
    def 'validationExpression'(String value) {
        parameter("validationExpression", value)
    }

}
