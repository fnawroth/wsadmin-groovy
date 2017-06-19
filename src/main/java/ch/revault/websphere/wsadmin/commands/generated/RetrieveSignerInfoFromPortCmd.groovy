/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Retrieve signer information from a port.
*/
@Generated("with GenerateAdminCommands")
class RetrieveSignerInfoFromPortCmd extends AdminCmd<Void> {
    RetrieveSignerInfoFromPortCmd() {
        super("retrieveSignerInfoFromPort")
    }

    /**
     * Specifies the name of the host where the signer certificate will be retrieved.
     */
    def 'host'(String value) {
        parameter("host", value)
    }

    /**
     * Specifies the port on the host where the signer certificate will be retrieved.
     */
    def 'port'(Integer value) {
        parameter("port", value)
    }

    /**
     * Specifies the SSL configuration used to connect to the host.
     */
    def 'sslConfigName'(String value) {
        parameter("sslConfigName", value)
    }

    /**
     * Specifies the scope name of the SSL configuration.   
     */
    def 'sslConfigScopeName'(String value) {
        parameter("sslConfigScopeName", value)
    }

}
