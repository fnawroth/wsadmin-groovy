/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Security registration of an agent with a job manager.
*/
@Generated("with GenerateAdminCommands")
class AgentToJobManagerRegistrationCmd extends AdminCmd<Void> {
    AgentToJobManagerRegistrationCmd() {
        super("agentToJobManagerRegistration")
    }

    /**
     * Profile path for the admin agent being registered.
     */
    def 'agentProfilePath'(String value) {
        parameter("agentProfilePath", value)
    }

    /**
     * Hostname of the target job manager.
     */
    def 'jobManagerHost'(String value) {
        parameter("jobManagerHost", value)
    }

    /**
     * The file transfer servlet SSL port on the job manager.
     */
    def 'jobManagerFTSecurePort'(Integer value) {
        parameter("jobManagerFTSecurePort", value)
    }

    /**
     * The file transfer servlet TCP port on the job manager.
     */
    def 'jobManagerFTPort'(Integer value) {
        parameter("jobManagerFTPort", value)
    }

    /**
     * The determination of whether to register or unregister the agent from the job manager.
     */
    def 'register'(Boolean value) {
        parameter("register", value)
    }

    /**
     * The userid to use when making a secure call to the job manager.
     */
    def 'jobManagerUserid'(String value) {
        parameter("jobManagerUserid", value)
    }

    /**
     * The password to use when making a secure call to the job manager.
     */
    def 'jobManagerPassword'(String value) {
        parameter("jobManagerPassword", value)
    }

}
