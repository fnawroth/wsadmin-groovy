/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists the Web service operations defined in a logical endpoint.
*/
@Generated("with GenerateAdminCommands")
class ListWebServiceOperationsCmd extends AdminCmd<Void> {
    ListWebServiceOperationsCmd() {
        super("listWebServiceOperations")
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
     * The name of the logical endpoint that is associated with a Web service.
     */
    def 'logicalEndpoint'(String value) {
        parameter("logicalEndpoint", value)
    }

    /**
     * Indicate if the service is a service client.
     */
    def 'client'(Boolean value) {
        parameter("client", value)
    }

}
