/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Sets an Admin Protocol enabled for a server or cell
*/
@Generated("with GenerateAdminCommands")
class SetAdminProtocolEnabledCmd extends AdminCmd<Void> {
    SetAdminProtocolEnabledCmd() {
        super("setAdminProtocolEnabled")
    }

    /**
     * The JMX Connector type you want to set as enabled
     */
    def 'conntype'(String value) {
        parameter("conntype", value)
    }

    /**
     * Either true or false to enable the connector
     */
    def 'enable'(String value) {
        parameter("enable", value)
    }

}
