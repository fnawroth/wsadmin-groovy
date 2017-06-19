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
class GetMWSConfigFileCmd extends AdminCmd<Void> {
    GetMWSConfigFileCmd() {
        super("getMWSConfigFile")
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
    def 'inputFileName'(java.lang.String value) {
        parameter("inputFileName", value)
    }

    /**
     * null
     */
    def 'outputFileName'(com.ibm.websphere.management.cmdframework.DownloadFile value) {
        parameter("outputFileName", value)
    }

}
