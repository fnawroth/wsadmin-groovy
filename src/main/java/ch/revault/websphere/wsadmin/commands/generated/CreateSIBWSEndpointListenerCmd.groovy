/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Creates an endpoint listener configuration.This command is supported only in the connected mode.
*/
@Generated("with GenerateAdminCommands")
class CreateSIBWSEndpointListenerCmd extends AdminCmd<Void> {
    CreateSIBWSEndpointListenerCmd() {
        super("createSIBWSEndpointListener")
    }

    /**
     * Name of the endpoint listener.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Root of the endpoint address URL for Web services accessed using this endpoint listener.
     */
    def 'urlRoot'(String value) {
        parameter("urlRoot", value)
    }

    /**
     * Root of the HTTP URL where WSDL associated with this endpoint listener is located.
     */
    def 'wsdlUrlRoot'(String value) {
        parameter("wsdlUrlRoot", value)
    }

    /**
     * Location of the endpoint listener application EAR file.
     */
    def 'earFile'(com.ibm.websphere.management.cmdframework.UploadFile value) {
        parameter("earFile", value)
    }

}
