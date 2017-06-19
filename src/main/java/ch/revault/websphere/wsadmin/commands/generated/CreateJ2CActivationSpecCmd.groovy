/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a J2C activation specification.
*/
@Generated("with GenerateAdminCommands")
class CreateJ2CActivationSpecCmd extends AdminCmd<Void> {
    CreateJ2CActivationSpecCmd() {
        super("createJ2CActivationSpec")
    }

    /**
     * A message listener type that is defined in the deployment description of the parent J2C resource adapter.
     */
    def 'messageListenerType'(String value) {
        parameter("messageListenerType", value)
    }

    /**
     * The name of the J2C activation specification.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The JNDI name of the created J2C activation specification.
     */
    def 'jndiName'(String value) {
        parameter("jndiName", value)
    }

    /**
     * the destination JNDI name of the created J2C activation specification
     */
    def 'destinationJndiName'(String value) {
        parameter("destinationJndiName", value)
    }

    /**
     * The description for the created J2C activation specification.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * the authentication alias of the created J2C activation specification
     */
    def 'authenticationAlias'(String value) {
        parameter("authenticationAlias", value)
    }

}
