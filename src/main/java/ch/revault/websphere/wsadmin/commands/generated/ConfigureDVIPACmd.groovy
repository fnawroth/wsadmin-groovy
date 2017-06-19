/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* configureDVIPA.desc
*/
@Generated("with GenerateAdminCommands")
class ConfigureDVIPACmd extends AdminCmd<Void> {
    ConfigureDVIPACmd() {
        super("configureDVIPA")
    }

    /**
     * dvipa.serverName.desc
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

    /**
     * dvipa.nodeDesc.desc
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * dvipa.hostname.desc
     */
    def 'hostName'(String value) {
        parameter("hostName", value)
    }

}
