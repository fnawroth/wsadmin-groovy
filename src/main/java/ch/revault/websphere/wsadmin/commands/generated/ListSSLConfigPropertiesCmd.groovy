/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List the properties for a given SSL configuration.
*/
@Generated("with GenerateAdminCommands")
class ListSSLConfigPropertiesCmd extends AdminCmd<Void> {
    ListSSLConfigPropertiesCmd() {
        super("listSSLConfigProperties")
    }

    /**
     * Specifies alias that uniquely identifies a SSL configuration.
     */
    def 'alias'(String value) {
        parameter("alias", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

    /**
     * Specify true to display the list output as ObjectNames and false to return SSL configuration alias names.
     */
    def 'displayObjectName'(Boolean value) {
        parameter("displayObjectName", value)
    }

}
