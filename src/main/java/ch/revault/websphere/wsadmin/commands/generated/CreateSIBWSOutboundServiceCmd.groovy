/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create an outbound service.
*/
@Generated("with GenerateAdminCommands")
class CreateSIBWSOutboundServiceCmd extends AdminCmd<Void> {
    CreateSIBWSOutboundServiceCmd() {
        super("createSIBWSOutboundService")
    }

    /**
     * Administrative name of the outbound service.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Web service WSDL location.
     */
    def 'wsdlLocation'(String value) {
        parameter("wsdlLocation", value)
    }

    /**
     * Web service namespace.
     */
    def 'wsdlServiceNamespace'(String value) {
        parameter("wsdlServiceNamespace", value)
    }

    /**
     * Web service name.
     */
    def 'wsdlServiceName'(String value) {
        parameter("wsdlServiceName", value)
    }

    /**
     * UDDI reference.
     */
    def 'uddiReference'(String value) {
        parameter("uddiReference", value)
    }

    /**
     * Name to use for the associated service destination.
     */
    def 'destination'(String value) {
        parameter("destination", value)
    }

    /**
     * User ID to be used if WSDL is obtained through an authorizing proxy.
     */
    def 'userId'(String value) {
        parameter("userId", value)
    }

    /**
     * Password to be used if WSDL is obtained through an authorizing proxy.
     */
    def 'password'(String value) {
        parameter("password", value)
    }

}
