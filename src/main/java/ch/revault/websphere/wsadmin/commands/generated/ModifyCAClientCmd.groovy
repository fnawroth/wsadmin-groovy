/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modifies a certificate authority (CA) client configurator object.
*/
@Generated("with GenerateAdminCommands")
class ModifyCAClientCmd extends AdminCmd<Void> {
    ModifyCAClientCmd() {
        super("modifyCAClient")
    }

    /**
     * Specifies the name that uniquely identifies the certificate authority (CA) configurator.
     */
    def 'caClientName'(String value) {
        parameter("caClientName", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

    /**
     * Specifies the implementation class used to access the certificate authority (CA).
     */
    def 'pkiClientImplClass'(String value) {
        parameter("pkiClientImplClass", value)
    }

    /**
     * Specifies the host name of the certificate authority (CA).
     */
    def 'host'(String value) {
        parameter("host", value)
    }

    /**
     * Specifies port used to connect to the certificate authority (CA).
     */
    def 'port'(String value) {
        parameter("port", value)
    }

    /**
     * Specifies the user name to authenticate to the certificate authority (CA).
     */
    def 'userName'(String value) {
        parameter("userName", value)
    }

    /**
     * Specifies the password of the user use to authenticate to the certificate authority (CA).
     */
    def 'password'(String value) {
        parameter("password", value)
    }

    /**
     * Specifies the frequency, in minutes, for how often to check to see if a certificate has been created.
     */
    def 'frequencyCheck'(String value) {
        parameter("frequencyCheck", value)
    }

    /**
     * Specifies the number of times to check with the certificate authority (CA) to see if the certificate is created.
     */
    def 'retryCheck'(String value) {
        parameter("retryCheck", value)
    }

    /**
     * Specifies a comma separated list of attribute=value custom property pairs to be modified on the CAClient object.  The properties can be created, modified, or removed.
     */
    def 'customProperties'(String value) {
        parameter("customProperties", value)
    }

}
