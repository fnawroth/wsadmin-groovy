/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* copy the specified J2C resource adapter to the specified scope.
*/
@Generated("with GenerateAdminCommands")
class CopyResourceAdapterCmd extends AdminCmd<Void> {
    CopyResourceAdapterCmd() {
        super("copyResourceAdapter")
    }

    /**
     * A scope that the new J2C resource adapter is created.
     */
    def 'scope'(javax.management.ObjectName value) {
        parameter("scope", value)
    }

    /**
     * the name of the J2C resource adapter
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * A boolean to indicate deep copy
     */
    def 'useDeepCopy'(Boolean value) {
        parameter("useDeepCopy", value)
    }

}
