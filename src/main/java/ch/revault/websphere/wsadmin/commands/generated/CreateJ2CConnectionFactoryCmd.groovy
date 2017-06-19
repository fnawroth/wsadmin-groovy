/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a J2C connection factory
*/
@Generated("with GenerateAdminCommands")
class CreateJ2CConnectionFactoryCmd extends AdminCmd<Void> {
    CreateJ2CConnectionFactoryCmd() {
        super("createJ2CConnectionFactory")
    }

    /**
     * A connection factory interface that is defined in the deployment description of the parent J2C resource adapter.
     */
    def 'connectionFactoryInterface'(String value) {
        parameter("connectionFactoryInterface", value)
    }

    /**
     * The name of the J2C connection factory.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The JNDI name of the created J2C connection factory.
     */
    def 'jndiName'(String value) {
        parameter("jndiName", value)
    }

    /**
     * The description for the created J2C connection factory.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * component-managed authentication data alias of the created J2C connection factory.
     */
    def 'authDataAlias'(String value) {
        parameter("authDataAlias", value)
    }

}
