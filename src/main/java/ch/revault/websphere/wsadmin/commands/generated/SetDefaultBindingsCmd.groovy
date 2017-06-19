/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The setDefaultBindings command updates the default binding names for a specified domain or server.
*/
@Generated("with GenerateAdminCommands")
class SetDefaultBindingsCmd extends AdminCmd<Void> {
    SetDefaultBindingsCmd() {
        super("setDefaultBindings")
    }

    /**
     * Specifies the names of the default bindings for the provider, client, or both. (Properties) 
     */
    def 'defaultBindings'(java.util.Properties value) {
        parameter("defaultBindings", value)
    }

    /**
     * Specifies the location of the binding. This value could be the cell-wide default binding, server-specific default binding, or attachment-specific binding. (Properties)
     */
    def 'bindingLocation'(java.util.Properties value) {
        parameter("bindingLocation", value)
    }

    /**
     * Specifies the name of the domain. The domain name is only required when the domain is not the global security domain. (String) 
     */
    def 'domainName'(String value) {
        parameter("domainName", value)
    }

    /**
     * Specifies the default bindings to be removed. (String[]) 
     */
    def 'removeDefault'(java.lang.String[] value) {
        parameter("removeDefault", value)
    }

}
