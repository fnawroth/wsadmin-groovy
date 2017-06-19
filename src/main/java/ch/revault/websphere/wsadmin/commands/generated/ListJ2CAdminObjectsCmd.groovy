/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List the J2C administrative objects that have a specified administrative object interface defined in the specified J2C resource adapter.
*/
@Generated("with GenerateAdminCommands")
class ListJ2CAdminObjectsCmd extends AdminCmd<Void> {
    ListJ2CAdminObjectsCmd() {
        super("listJ2CAdminObjects")
    }

    /**
     * An administrative object factory interface of the J2C administrative object to list.
     */
    def 'adminObjectInterface'(String value) {
        parameter("adminObjectInterface", value)
    }

}
