/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modify a named WebSphere MQ server bus member.
*/
@Generated("with GenerateAdminCommands")
class ModifySIBWMQServerBusMemberCmd extends AdminCmd<Void> {
    ModifySIBWMQServerBusMemberCmd() {
        super("modifySIBWMQServerBusMember")
    }

    /**
     * The name of the WebSphere MQ server bus member.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The name of the bus the WebSphere MQ server is a member of.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * New value for the overridden WebSphere MQ server "host" attribute.
     */
    def 'host'(String value) {
        parameter("host", value)
    }

    /**
     * New value for the overridden WebSphere MQ server "port" attribute.
     */
    def 'port'(Integer value) {
        parameter("port", value)
    }

    /**
     * New value for the overridden WebSphere MQ server "channel" attribute.
     */
    def 'channel'(String value) {
        parameter("channel", value)
    }

    /**
     * New value for the overridden WebSphere MQ server "securityAuthAlias" attribute.
     */
    def 'securityAuthAlias'(String value) {
        parameter("securityAuthAlias", value)
    }

    /**
     * New value for the overridden WebSphere MQ server "transportChain" attribute.
     */
    def 'transportChain'(String value) {
        parameter("transportChain", value)
    }

    /**
     * New value for the overridden WebSphere MQ server "trustUserIds" attribute.
     */
    def 'trustUserIds'(Boolean value) {
        parameter("trustUserIds", value)
    }

    /**
     * The virtual queue manager name of the SIBus that the WebSphere MQ queue manager sees.
     */
    def 'virtualQueueManagerName'(String value) {
        parameter("virtualQueueManagerName", value)
    }

}
