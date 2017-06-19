/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The getDefaultBindings command returns the default binding names for a specified domain or server.
*/
@Generated("with GenerateAdminCommands")
class GetDefaultBindingsCmd extends AdminCmd<Void> {
    GetDefaultBindingsCmd() {
        super("getDefaultBindings")
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

}
