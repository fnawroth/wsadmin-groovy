/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists the deployed Web services in enterprise applications. If there is no application name supplied, then all the Web services in the enterprise applications will are be listed. 
*/
@Generated("with GenerateAdminCommands")
class ListWebServicesCmd extends AdminCmd<Void> {
    ListWebServicesCmd() {
        super("listWebServices")
    }

    /**
     * The enterprise application name that is deployed.
     */
    def 'application'(String value) {
        parameter("application", value)
    }

    /**
     * Indicate if the service is a service client.
     */
    def 'client'(Boolean value) {
        parameter("client", value)
    }

}
