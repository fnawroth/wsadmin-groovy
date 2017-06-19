/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Import the configuration of a wasprofile profile from a configuration archive. This command overwrites the configuration of the current wasprofile configuration.
*/
@Generated("with GenerateAdminCommands")
class ImportWasprofileCmd extends AdminCmd<Void> {
    ImportWasprofileCmd() {
        super("importWasprofile")
    }

    /**
     * the fully qualified file path of a config archive.
     */
    def 'archive'(com.ibm.websphere.management.cmdframework.UploadFile value) {
        parameter("archive", value)
    }

    /**
     * null
     */
    def 'options'(java.util.Properties value) {
        parameter("options", value)
    }

    /**
     * Remove existing servers in the profile and copy servers from a configuration archive.
     */
    def 'deleteExistingServers'(Boolean value) {
        parameter("deleteExistingServers", value)
    }

}
