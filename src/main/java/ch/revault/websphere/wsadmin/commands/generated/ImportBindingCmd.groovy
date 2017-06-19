/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The importBinding command imports a binding from a compressed archive onto a server environment.
*/
@Generated("with GenerateAdminCommands")
class ImportBindingCmd extends AdminCmd<Void> {
    ImportBindingCmd() {
        super("importBinding")
    }

    /**
     * Specifies the path name of the archive file to import. (String)
     */
    def 'importFile'(String value) {
        parameter("importFile", value)
    }

    /**
     * Specifies the name for the binding. The binding name is optional when you are creating a new binding. A name is generated if it is not specified. The binding name is required when you are changing an attachment to use a different existing binding. (String) 
     */
    def 'bindingName'(String value) {
        parameter("bindingName", value)
    }

    /**
     * Specifies the name of the domain. The domain name is only required when the domain is not the global security domain. (String) 
     */
    def 'domainName'(String value) {
        parameter("domainName", value)
    }

    /**
     * Verifies the binding is of this type. (String)
     */
    def 'verifyBindingType'(String value) {
        parameter("verifyBindingType", value)
    }

}
