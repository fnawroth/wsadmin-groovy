/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists all the WSNService objects in the configuration that match the specified input parameters.
*/
@Generated("with GenerateAdminCommands")
class ListWSNServicesCmd extends AdminCmd<Void> {
    ListWSNServicesCmd() {
        super("listWSNServices")
    }

    /**
     * Bus
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * Name
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Used to filter the results depending on the type of the service. Valid values are V6.1 and V7.0.
     */
    def 'type'(String value) {
        parameter("type", value)
    }

}
