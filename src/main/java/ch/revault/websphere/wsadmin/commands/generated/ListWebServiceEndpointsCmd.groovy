/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists the Web service endpoints that are port names defined in a Web service in an enterprise application.
*/
@Generated("with GenerateAdminCommands")
class ListWebServiceEndpointsCmd extends AdminCmd<Void> {
    ListWebServiceEndpointsCmd() {
        super("listWebServiceEndpoints")
    }

    /**
     * The enterprise application name that is deployed.
     */
    def 'application'(String value) {
        parameter("application", value)
    }

    /**
     * The module name within a specified application.
     */
    def 'module'(String value) {
        parameter("module", value)
    }

    /**
     * The Web service name that is deployed within a specified application.
     */
    def 'service'(String value) {
        parameter("service", value)
    }

    /**
     * Indicate if the service is a service client.
     */
    def 'client'(Boolean value) {
        parameter("client", value)
    }

}
