/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modifies the JavaServer Faces implementation used by the WebSphere runtime for an application
*/
@Generated("with GenerateAdminCommands")
class ModifyJSFImplementationCmd extends AdminCmd<Void> {
    ModifyJSFImplementationCmd() {
        super("modifyJSFImplementation")
    }

    /**
     * Name of the implementation to be used for the specified application.  This may be SunRI1.2 or MyFaces1.2
     */
    def 'implName'(java.lang.String value) {
        parameter("implName", value)
    }

}
