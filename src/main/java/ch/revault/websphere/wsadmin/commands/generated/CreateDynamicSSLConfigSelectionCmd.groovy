/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a Dynamic SSL configuration Selection.
*/
@Generated("with GenerateAdminCommands")
class CreateDynamicSSLConfigSelectionCmd extends AdminCmd<Void> {
    CreateDynamicSSLConfigSelectionCmd() {
        super("createDynamicSSLConfigSelection")
    }

    /**
     * Specifies the name that uniquely identifies the dynamic SSL configuration selection.
     */
    def 'dynSSLConfigSelectionName'(String value) {
        parameter("dynSSLConfigSelectionName", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

    /**
     * Specifies a description of the dynamic SSL configuration selection.
     */
    def 'dynSSLConfigSelectionDescription'(String value) {
        parameter("dynSSLConfigSelectionDescription", value)
    }

    /**
     * Specifies the host and port information needed for dynamic SSL configuration.
     */
    def 'dynSSLConfigSelectionInfo'(String value) {
        parameter("dynSSLConfigSelectionInfo", value)
    }

    /**
     * Specifies the SSL Configuration used for this dynamic SSL configuration selection.
     */
    def 'sslConfigName'(String value) {
        parameter("sslConfigName", value)
    }

    /**
     * Specifies the scope name of the SSL configuration.   
     */
    def 'sslConfigScope'(String value) {
        parameter("sslConfigScope", value)
    }

    /**
     * Specifies a unique name to identify a certificate.
     */
    def 'certificateAlias'(String value) {
        parameter("certificateAlias", value)
    }

}
