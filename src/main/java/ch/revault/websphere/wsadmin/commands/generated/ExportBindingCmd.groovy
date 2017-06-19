/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The exportBinding command exports a binding as an archive that can be copied onto a client environment or imported onto a server environment.
*/
@Generated("with GenerateAdminCommands")
class ExportBindingCmd extends AdminCmd<Void> {
    ExportBindingCmd() {
        super("exportBinding")
    }

    /**
     * Specifies the name for the binding. The binding name is optional when you are creating a new binding. A name is generated if it is not specified. The binding name is required when you are changing an attachment to use a different existing binding. (String) 
     */
    def 'bindingName'(String value) {
        parameter("bindingName", value)
    }

    /**
     * Specifies the path name of the archive file. (String)
     */
    def 'pathName'(String value) {
        parameter("pathName", value)
    }

}
