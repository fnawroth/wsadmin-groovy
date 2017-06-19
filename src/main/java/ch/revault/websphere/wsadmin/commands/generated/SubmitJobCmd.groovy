/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Submits a new job for execution.
*/
@Generated("with GenerateAdminCommands")
class SubmitJobCmd extends AdminCmd<Void> {
    SubmitJobCmd() {
        super("submitJob")
    }

    /**
     * Type associated with the job.
     */
    def 'jobType'(java.lang.String value) {
        parameter("jobType", value)
    }

    /**
     * List of managed node names for the target.
     */
    def 'targetList'(java.lang.String[] value) {
        parameter("targetList", value)
    }

    /**
     * Name of the group for the target.
     */
    def 'group'(java.lang.String value) {
        parameter("group", value)
    }

    /**
     * Job specific parameters.
     */
    def 'jobParams'(java.util.Properties value) {
        parameter("jobParams", value)
    }

    /**
     * The name of the user
     */
    def 'username'(java.lang.String value) {
        parameter("username", value)
    }

    /**
     * The password of the user
     */
    def 'password'(java.lang.String value) {
        parameter("password", value)
    }

    /**
     * Private keyfile path
     */
    def 'privateKeyFile'(java.lang.String value) {
        parameter("privateKeyFile", value)
    }

    /**
     * Pass phrase
     */
    def 'passphrase'(java.lang.String value) {
        parameter("passphrase", value)
    }

    /**
     * Use sudo
     */
    def 'useSudo'(java.lang.String value) {
        parameter("useSudo", value)
    }

    /**
     * Sudo username
     */
    def 'sudoUsername'(java.lang.String value) {
        parameter("sudoUsername", value)
    }

    /**
     * Sudo password
     */
    def 'sudoPassword'(java.lang.String value) {
        parameter("sudoPassword", value)
    }

    /**
     * Description of the job.
     */
    def 'description'(java.lang.String value) {
        parameter("description", value)
    }

    /**
     * Time when this job will become active.
     */
    def 'activationDateTime'(java.lang.String value) {
        parameter("activationDateTime", value)
    }

    /**
     * Expiration date of the Job.
     */
    def 'expirationDateTime'(java.lang.String value) {
        parameter("expirationDateTime", value)
    }

    /**
     * Recurring interval for the job.
     */
    def 'executionWindow'(java.lang.String value) {
        parameter("executionWindow", value)
    }

    /**
     * Recurring Interval Unit for the job [DAILY|WEEKLY|MONTHLY|YEARLY|CONNECTION].
     */
    def 'executionWindowUnit'(java.lang.String value) {
        parameter("executionWindowUnit", value)
    }

    /**
     * Email address where the job notification will be sent.
     */
    def 'email'(java.lang.String value) {
        parameter("email", value)
    }

}
