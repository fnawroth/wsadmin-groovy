/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns a string containing all of the property values and step inputs for the updateRAR command.
*/
@Generated("with GenerateAdminCommands")
class GetNewRAObjectPropertiesCmd extends AdminCmd<Void> {
    GetNewRAObjectPropertiesCmd() {
        super("getNewRAObjectProperties")
    }

    /**
     * The absolute path to the new RAR file.
     */
    def 'rarPath'(String value) {
        parameter("rarPath", value)
    }

    /**
     * The format in which the command will return information, which is jacl or jython.  The default is jython.
     */
    def 'returnType'(String value) {
        parameter("returnType", value)
    }

}
