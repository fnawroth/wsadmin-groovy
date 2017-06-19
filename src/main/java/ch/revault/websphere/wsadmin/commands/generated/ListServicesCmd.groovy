/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists the services based on a generic query properties. It provides more generic query functions than listWebServices, listWebServiceEndpoints, listWebServiceOperations, and getWebService commands.
*/
@Generated("with GenerateAdminCommands")
class ListServicesCmd extends AdminCmd<Void> {
    ListServicesCmd() {
        super("listServices")
    }

    /**
     * The query properties for services.
     */
    def 'queryProps'(java.util.Properties value) {
        parameter("queryProps", value)
    }

    /**
     * Expand endpoint or operation resource in the service.
     */
    def 'expandResource'(String value) {
        parameter("expandResource", value)
    }

}
