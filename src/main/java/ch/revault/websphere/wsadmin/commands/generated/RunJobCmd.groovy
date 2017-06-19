/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* run jobs locally without going through job manager
*/
@Generated("with GenerateAdminCommands")
class RunJobCmd extends AdminCmd<Void> {
    RunJobCmd() {
        super("runJob")
    }

    /**
     * uuid of target
     */
    def 'target'(String value) {
        parameter("target", value)
    }

    /**
     * job type
     */
    def 'jobType'(String value) {
        parameter("jobType", value)
    }

    /**
     * job parameters
     */
    def 'jobParams'(java.util.Properties value) {
        parameter("jobParams", value)
    }

    /**
     * locale
     */
    def 'locale'(String value) {
        parameter("locale", value)
    }

    /**
     * name of parameter that refers to content element
     */
    def 'contentParamName'(String value) {
        parameter("contentParamName", value)
    }

    /**
     * content element Properties
     */
    def 'contentElement'(java.util.Properties value) {
        parameter("contentElement", value)
    }

}
