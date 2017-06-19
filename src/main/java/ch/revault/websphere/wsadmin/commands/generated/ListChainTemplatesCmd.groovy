/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Displays a list of templates that can be used to create chains in this configuration. All templates have a certain type of transport channel as the last transport channel in the chain.
*/
@Generated("with GenerateAdminCommands")
class ListChainTemplatesCmd extends AdminCmd<Void> {
    ListChainTemplatesCmd() {
        super("listChainTemplates")
    }

    /**
     * Templates returned by this method should all have a transport channel instance of the specified type as the last transport channel in the chain.
     */
    def 'acceptorFilter'(String value) {
        parameter("acceptorFilter", value)
    }

}
