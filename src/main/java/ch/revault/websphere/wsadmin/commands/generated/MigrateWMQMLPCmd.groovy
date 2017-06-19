/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Migrates a IBM MQ message listener port definition to an activation specification definition.
*/
@Generated("with GenerateAdminCommands")
class MigrateWMQMLPCmd extends AdminCmd<Void> {
    MigrateWMQMLPCmd() {
        super("migrateWMQMLP")
    }

    /**
     * Specifies the name of the activation specification to be created.
     */
    def 'asName'(String value) {
        parameter("asName", value)
    }

    /**
     * Specifies the JNDI name of the activation specification to be created.
     */
    def 'asJNDIName'(String value) {
        parameter("asJNDIName", value)
    }

    /**
     * The type of scope at which to create the activation specification ("server", "node", "cluster" or "cell")
     */
    def 'asScope'(String value) {
        parameter("asScope", value)
    }

}
