/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* This command creates a Kerberos configuration file (krb5.ini or krb5.conf).
*/
@Generated("with GenerateAdminCommands")
class CreateKrbConfigFileCmd extends AdminCmd<Void> {
    CreateKrbConfigFileCmd() {
        super("createKrbConfigFile")
    }

    /**
     * Supply directory location and file name of the configuration (krb5.ini or krb5.conf) file.
     */
    def 'krbPath'(String value) {
        parameter("krbPath", value)
    }

    /**
     * Supply Kerberos realm name.
     */
    def 'realm'(String value) {
        parameter("realm", value)
    }

    /**
     * Supply host name of the Kerberos Key Distribution Center.
     */
    def 'kdcHost'(String value) {
        parameter("kdcHost", value)
    }

    /**
     * Supply port number of the Kerberos Key Distribution Center (default: 88).
     */
    def 'kdcPort'(Integer value) {
        parameter("kdcPort", value)
    }

    /**
     * Supply the Domain Name Service (DNS).
     */
    def 'dns'(String value) {
        parameter("dns", value)
    }

    /**
     * Supply directory location and file name of the Kerberos keytab file.
     */
    def 'keytabPath'(String value) {
        parameter("keytabPath", value)
    }

    /**
     * Supply encryption type (default: rc4-hmac des-cbc-md5).
     */
    def 'encryption'(String value) {
        parameter("encryption", value)
    }

}
