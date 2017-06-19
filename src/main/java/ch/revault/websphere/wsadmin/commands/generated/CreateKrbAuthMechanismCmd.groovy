/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The KRB5 authentication mechanism security object field in the security configuration file is created based on the user input. 
*/
@Generated("with GenerateAdminCommands")
class CreateKrbAuthMechanismCmd extends AdminCmd<Void> {
    CreateKrbAuthMechanismCmd() {
        super("createKrbAuthMechanism")
    }

    /**
     * Supply value for Kerberos realm name.
     */
    def 'krb5Realm'(String value) {
        parameter("krb5Realm", value)
    }

    /**
     * Supply directory location and file name of the configuration (krb5.ini or krb5.conf) file.
     */
    def 'krb5Config'(String value) {
        parameter("krb5Config", value)
    }

    /**
     * Supply directory location and file name of the Kerberos keytab file.
     */
    def 'krb5Keytab'(String value) {
        parameter("krb5Keytab", value)
    }

    /**
     * Supply value for the service name. It is the first component of the Kerberos service principal name. 
     */
    def 'serviceName'(String value) {
        parameter("serviceName", value)
    }

    /**
     * Supply value for trimUserName: true/false.
     */
    def 'trimUserName'(Boolean value) {
        parameter("trimUserName", value)
    }

    /**
     * Indicate whether or not to extract and place the client GSS delegation credential in the subject.
     */
    def 'enabledGssCredDelegate'(Boolean value) {
        parameter("enabledGssCredDelegate", value)
    }

    /**
     * Supply value for allowKrbAuthForCsiInbound: true/false.
     */
    def 'allowKrbAuthForCsiInbound'(Boolean value) {
        parameter("allowKrbAuthForCsiInbound", value)
    }

    /**
     * Supply value for allowKrbAuthForCsiOutbound: true/false.
     */
    def 'allowKrbAuthForCsiOutbound'(Boolean value) {
        parameter("allowKrbAuthForCsiOutbound", value)
    }

}
