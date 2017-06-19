/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a J2C administrative object.
*/
@Generated("with GenerateAdminCommands")
class CreateJ2CAdminObjectCmd extends AdminCmd<Void> {
    CreateJ2CAdminObjectCmd() {
        super("createJ2CAdminObject")
    }

    /**
     * An administrative object factory interface that is defined in the deployment description of the parent J2C resource adapter.
     */
    def 'adminObjectInterface'(String value) {
        parameter("adminObjectInterface", value)
    }

    /**
     * The name of the J2C administrative object.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The JNDI name of the created J2C administrative object.
     */
    def 'jndiName'(String value) {
        parameter("jndiName", value)
    }

    /**
     * The description for the created J2C administrative object.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

}
