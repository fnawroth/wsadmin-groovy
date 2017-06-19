/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists JPA Specification levels supported by this version of WebSphere.
*/
@Generated("with GenerateAdminCommands")
class ListSupportedJPASpecificationsCmd extends AdminCmd<Void> {
    ListSupportedJPASpecificationsCmd() {
        super("listSupportedJPASpecifications")
    }

    /**
     * Whether to list the supported JPA Specification levels in a machine friendly format.
     */
    def 'versionOnly'(java.lang.String value) {
        parameter("versionOnly", value)
    }

}
