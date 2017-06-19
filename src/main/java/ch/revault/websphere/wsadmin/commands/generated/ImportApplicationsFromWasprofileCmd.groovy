/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Import the applications from a configuration archive file to a sepcified application server target.
*/
@Generated("with GenerateAdminCommands")
class ImportApplicationsFromWasprofileCmd extends AdminCmd<Void> {
    ImportApplicationsFromWasprofileCmd() {
        super("importApplicationsFromWasprofile")
    }

    /**
     * the fully qualified file path of a config archive.
     */
    def 'archive'(com.ibm.websphere.management.cmdframework.UploadFile value) {
        parameter("archive", value)
    }

    /**
     * targetNodeNameDesc
     */
    def 'targetNodeName'(String value) {
        parameter("targetNodeName", value)
    }

    /**
     * targetServerNameDesc
     */
    def 'targetServerName'(String value) {
        parameter("targetServerName", value)
    }

    /**
     * targetClusterNameDesc
     */
    def 'targetClusterName'(String value) {
        parameter("targetClusterName", value)
    }

    /**
     * sourceServerNameDesc
     */
    def 'sourceServerName'(String value) {
        parameter("sourceServerName", value)
    }

}
