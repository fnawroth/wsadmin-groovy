/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists JAXRS Providers supported by this version of WebSphere.
*/
@Generated("with GenerateAdminCommands")
class ListSupportedJaxrsProvidersCmd extends AdminCmd<Void> {
    ListSupportedJaxrsProvidersCmd() {
        super("listSupportedJaxrsProviders")
    }

    /**
     * Whether to list the supported JAXRS Providers in a machine friendly format.
     */
    def 'versionOnly'(java.lang.Boolean value) {
        parameter("versionOnly", value)
    }

}
