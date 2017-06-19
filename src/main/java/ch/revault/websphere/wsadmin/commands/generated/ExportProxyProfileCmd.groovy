/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* export the configuration of a wsprofile to a config archive.
*/
@Generated("with GenerateAdminCommands")
class ExportProxyProfileCmd extends AdminCmd<Void> {
    ExportProxyProfileCmd() {
        super("exportProxyProfile")
    }

    /**
     * the fully qualified file path of a config archive.
     */
    def 'archive'(com.ibm.websphere.management.cmdframework.DownloadFile value) {
        parameter("archive", value)
    }

    /**
     * null
     */
    def 'options'(java.util.Properties value) {
        parameter("options", value)
    }

}
