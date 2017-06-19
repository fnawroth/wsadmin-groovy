/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* null
*/
@Generated("with GenerateAdminCommands")
class PutMWSInstallFileCmd extends AdminCmd<Void> {
    PutMWSInstallFileCmd() {
        super("putMWSInstallFile")
    }

    /**
     * null
     */
    def 'nodeName'(java.lang.String value) {
        parameter("nodeName", value)
    }

    /**
     * null
     */
    def 'serverName'(java.lang.String value) {
        parameter("serverName", value)
    }

    /**
     * null
     */
    def 'inputFileName'(com.ibm.websphere.management.cmdframework.UploadFile value) {
        parameter("inputFileName", value)
    }

    /**
     * null
     */
    def 'outputFileName'(java.lang.String value) {
        parameter("outputFileName", value)
    }

}
