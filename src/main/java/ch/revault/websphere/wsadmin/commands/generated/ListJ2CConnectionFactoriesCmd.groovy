/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List J2C connection factories that have a specified connection factory interface defined in the specified J2C resource adapter.
*/
@Generated("with GenerateAdminCommands")
class ListJ2CConnectionFactoriesCmd extends AdminCmd<Void> {
    ListJ2CConnectionFactoriesCmd() {
        super("listJ2CConnectionFactories")
    }

    /**
     * A connection factory interface of the J2C connection factory to list.
     */
    def 'connectionFactoryInterface'(String value) {
        parameter("connectionFactoryInterface", value)
    }

}
