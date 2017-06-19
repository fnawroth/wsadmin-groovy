/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* import the configuration of a node from a config archive. This is a private command that is only invoked by addNode command.
*/
@Generated("with GenerateAdminCommands")
class ImportNodeCmd extends AdminCmd<Void> {
    ImportNodeCmd() {
        super("importNode")
    }

    /**
     * configArchiveDesc
     */
    def 'archive'(com.ibm.websphere.management.cmdframework.UploadFile value) {
        parameter("archive", value)
    }

    /**
     * the node name of the added node. If the node name is not specified, then the node name in the config archive is assumed.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * NodeGroupNameDesc
     */
    def 'nodeGroupName'(String value) {
        parameter("nodeGroupName", value)
    }

    /**
     * null
     */
    def 'options'(java.util.Properties value) {
        parameter("options", value)
    }

}
