/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a WS-Notification service
*/
@Generated("with GenerateAdminCommands")
class CreateWSNServiceCmd extends AdminCmd<Void> {
    CreateWSNServiceCmd() {
        super("createWSNService")
    }

    /**
     * Name of the WS-Notification service
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Used to determine what type of WSNService should be created. The two options are V6.1 (default) or V7.0, which creates a new style service that permits composability with WS-RM.
     */
    def 'type'(String value) {
        parameter("type", value)
    }

    /**
     * Name of the service integration bus to create for the WS-Notification service to be configured on
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * Description of the WS-Notification service
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * Indicates whether dynamic topic namespaces are allowed (TRUE or FALSE)
     */
    def 'permitsDynamicNamespace'(Boolean value) {
        parameter("permitsDynamicNamespace", value)
    }

    /**
     * Indicates whether publisher applications are required to register with the broker before they can publish notifications (TRUE or FALSE) 
     */
    def 'requiresRegistration'(Boolean value) {
        parameter("requiresRegistration", value)
    }

    /**
     * The name of the service integration bus topic space to use for a dynamic topic space (defaults to WSN_dynamic_<WS-Notification service name>)
     */
    def 'dynamicTopicSpace'(String value) {
        parameter("dynamicTopicSpace", value)
    }

    /**
     * The JAX-RPC handler list that is applied to inbound service requests for the WS-Notification service.
     */
    def 'jaxrpcHandlerListName'(String value) {
        parameter("jaxrpcHandlerListName", value)
    }

    /**
     * The JAX-WS handler list that is applied when the service invokes external WS-Notification service interfaces.
     */
    def 'jaxwsHandlerListName'(String value) {
        parameter("jaxwsHandlerListName", value)
    }

    /**
     * Specifies the details of how security is applied to requests and responses.
     */
    def 'outboundSecurityConfigName'(String value) {
        parameter("outboundSecurityConfigName", value)
    }

    /**
     * The security binding to be used with consumer notifications and remote publisher requests sent by this WS-Notification service.
     */
    def 'outboundSecurityRequestBindingName'(String value) {
        parameter("outboundSecurityRequestBindingName", value)
    }

    /**
     * The security binding to be used with remote publisher responses received by this WS-Notification service.
     */
    def 'outboundSecurityResponseBindingName'(String value) {
        parameter("outboundSecurityResponseBindingName", value)
    }

    /**
     * Discover remote endpoint information from published WSDL. Default value is TRUE.
     */
    def 'queryWSDL'(Boolean value) {
        parameter("queryWSDL", value)
    }

}
