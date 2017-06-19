/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The copyBinding command creates a copy of an existing binding.
*/
@Generated("with GenerateAdminCommands")
class CopyBindingCmd extends AdminCmd<Void> {
    CopyBindingCmd() {
        super("copyBinding")
    }

    /**
     * Specifies the name of the existing binding. (String) 
     */
    def 'sourceBinding'(String value) {
        parameter("sourceBinding", value)
    }

    /**
     * Specifies the name of the binding to which the bindings are copied. (String) 
     */
    def 'newBinding'(String value) {
        parameter("newBinding", value)
    }

    /**
     * Adds a description for the policy set or binding. (String) 
     */
    def 'newDescription'(String value) {
        parameter("newDescription", value)
    }

    /**
     * Specifies the name of the domain. The domain name is only required when the domain is not the global security domain. (String) 
     */
    def 'domainName'(String value) {
        parameter("domainName", value)
    }

}
