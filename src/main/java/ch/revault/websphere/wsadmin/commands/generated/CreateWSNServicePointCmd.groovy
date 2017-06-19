/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a WS-Notification service point
*/
@Generated("with GenerateAdminCommands")
class CreateWSNServicePointCmd extends AdminCmd<Void> {
    CreateWSNServicePointCmd() {
        super("createWSNServicePoint")
    }

    /**
     * Name of the WS-Notification service point
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Description of the WS-Notification service point
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * To specify a cluster endpoint, supply a cluster name but not a node and a server name.
     */
    def 'cluster'(String value) {
        parameter("cluster", value)
    }

    /**
     * To specify a server endpoint, supply a node and a server name, but not a cluster name.
     */
    def 'node'(String value) {
        parameter("node", value)
    }

    /**
     * To specify a server endpoint, supply a node and a server name, but not a cluster name.
     */
    def 'server'(String value) {
        parameter("server", value)
    }

    /**
     * Either the name of an existing endpoint listener to use or the name of the new endpoint listener to be created.
     */
    def 'eplName'(String value) {
        parameter("eplName", value)
    }

    /**
     * The URL root to use when creating a new endpoint listener
     */
    def 'eplURLRoot'(String value) {
        parameter("eplURLRoot", value)
    }

    /**
     * The WSDL serving URL root to use when creating a new endpoint listener
     */
    def 'eplWSDLServingURLRoot'(String value) {
        parameter("eplWSDLServingURLRoot", value)
    }

    /**
     * The name of an existing WS-Notification service point from which to copy inbound port JAX-RPC handler and security settings from.
     */
    def 'copyServicePoint'(String value) {
        parameter("copyServicePoint", value)
    }

    /**
     * The root of the externally visible endpoint address URL for web services accessed using this endpoint listener. The format of this attribute os <protocol>://<host>:<port>/<contextRoot>. 
     */
    def 'transportURLRoot'(String value) {
        parameter("transportURLRoot", value)
    }

    /**
     * Defines the version of SOAP supported by the service point. This affects the WSDL definition that will be exposed by the web service. Valid values are "1.1" for SOAP 1.1, and "1.2" for SOAP 1.2.
     */
    def 'transportSoapVersion'(String value) {
        parameter("transportSoapVersion", value)
    }

    /**
     * The JAX-WS handler list that is applied to inbound requests from an application to the NotificationBroker endpoint of the WS-Notification service point.
     */
    def 'jaxwsHandlerListNB'(String value) {
        parameter("jaxwsHandlerListNB", value)
    }

    /**
     * The JAX-WS handler list that is applied to inbound requests from an application to the SubscriptionManager endpoint of the WS-Notification service point.
     */
    def 'jaxwsHandlerListSM'(String value) {
        parameter("jaxwsHandlerListSM", value)
    }

    /**
     * The JAX-WS handler list that is applied to inbound requests from an application to the PublisherRegistrationManager endpoint of the WS-Notification service point.
     */
    def 'jaxwsHandlerListPRM'(String value) {
        parameter("jaxwsHandlerListPRM", value)
    }

}
