/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns the deployedObject that represents the configuration of the OSGi application given the name of its composition unit.
*/
@Generated("with GenerateAdminCommands")
class GetOSGiApplicationDeployedObjectCmd extends AdminCmd<Void> {
    GetOSGiApplicationDeployedObjectCmd() {
        super("getOSGiApplicationDeployedObject")
    }

    /**
     * The name of the composition unit.
     */
    def 'cuName'(String value) {
        parameter("cuName", value)
    }

}
