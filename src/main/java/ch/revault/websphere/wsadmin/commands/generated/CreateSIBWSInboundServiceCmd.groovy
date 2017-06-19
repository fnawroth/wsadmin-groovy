/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create an inbound service.
*/
@Generated("with GenerateAdminCommands")
class CreateSIBWSInboundServiceCmd extends AdminCmd<Void> {
    CreateSIBWSInboundServiceCmd() {
        super("createSIBWSInboundService")
    }

    /**
     * Name of the inbound service.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Name of the target destination.
     */
    def 'destination'(String value) {
        parameter("destination", value)
    }

    /**
     * Location of the schema WSDL.
     */
    def 'wsdlLocation'(String value) {
        parameter("wsdlLocation", value)
    }

    /**
     * Namespace of the template Web service.
     */
    def 'wsdlServiceNamespace'(String value) {
        parameter("wsdlServiceNamespace", value)
    }

    /**
     * Name of the template Web service.
     */
    def 'wsdlServiceName'(String value) {
        parameter("wsdlServiceName", value)
    }

    /**
     * Name of the UDDI reference (if WSDL location is a UDDI key).
     */
    def 'uddiReference'(String value) {
        parameter("uddiReference", value)
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
