/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Mediate a destination.
*/
@Generated("with GenerateAdminCommands")
class MediateSIBDestinationCmd extends AdminCmd<Void> {
    MediateSIBDestinationCmd() {
        super("mediateSIBDestination")
    }

    /**
     * The name of the bus where the destination is to be mediated.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * The name of the destination to be mediated.
     */
    def 'destinationName'(String value) {
        parameter("destinationName", value)
    }

    /**
     * The name to be given to the mediation.
     */
    def 'mediationName'(String value) {
        parameter("mediationName", value)
    }

    /**
     * If mediating a destination to a server, specify the node and server name, but not the cluster name.  If the destination being mediated is localized in WebSphere MQ then if node is specified this becomes the mediation execution point.
     */
    def 'node'(String value) {
        parameter("node", value)
    }

    /**
     * If mediating a destination to a server, specify the node and server name, but not the cluster name.   If the destination being mediated is localized in WebSphere MQ then if server is specified this becomes the mediation execution point.
     */
    def 'server'(String value) {
        parameter("server", value)
    }

    /**
     * If mediating a destination to a cluster, specify the cluster name, but not the node or server name.   If the destination being mediated is localized in WebSphere MQ then a cluster is specified the cluster becomes the mediation execution point.
     */
    def 'cluster'(String value) {
        parameter("cluster", value)
    }

    /**
     * To assign the destination from which a mediation should read message to process from a queue localized on a WebSphere MQ server, supply a WebSphere MQ server name.
     */
    def 'wmqServer'(String value) {
        parameter("wmqServer", value)
    }

    /**
     * The quality of service used for inbound messages which WebSphere MQ regards as being non-persistent.  Allowable values are { BEST_EFFORT | EXPRESS | RELIABLE }.
     */
    def 'nonPersistentReliability'(String value) {
        parameter("nonPersistentReliability", value)
    }

    /**
     * The quality of service used for inbound messages which WebSphere MQ regards as being persistent.  Allowable values are { RELIABLE | ASSURED }.
     */
    def 'persistentReliability'(String value) {
        parameter("persistentReliability", value)
    }

    /**
     * Determines if messages sent to the WebSphere MQ destination have an RFH2 header or not.  This can only be specified with the WebSphere MQ server name.
     */
    def 'useRFH2'(Boolean value) {
        parameter("useRFH2", value)
    }

    /**
     * The name of the WebSphere MQ queue for messages.  This must be specified when the WebSphere MQ server name parameter is specified.
     */
    def 'wmqQueueName'(String value) {
        parameter("wmqQueueName", value)
    }

    /**
     * If the destination is assigned to WebSphere MQ then an external application can mediate the WebSphere MQ queue.
     */
    def 'externallyMediated'(Boolean value) {
        parameter("externallyMediated", value)
    }

}
