/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Import a Secure Proxy Profile into this cell.
*/
@Generated("with GenerateAdminCommands")
class ImportProxyProfileCmd extends AdminCmd<Void> {
    ImportProxyProfileCmd() {
        super("importProxyProfile")
    }

    /**
     * the fully qualified file path of a config archive.
     */
    def 'archive'(com.ibm.websphere.management.cmdframework.UploadFile value) {
        parameter("archive", value)
    }

    /**
     * Boolean value that indicates whether existing proxy servers should be deleted after the profile or the proxy server is exported.
     */
    def 'deleteExistingServers'(Boolean value) {
        parameter("deleteExistingServers", value)
    }

    /**
     * null
     */
    def 'options'(java.util.Properties value) {
        parameter("options", value)
    }

}
