/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete configuration specified in properties file
*/
@Generated("with GenerateAdminCommands")
class DeleteConfigPropertiesCmd extends AdminCmd<Void> {
    DeleteConfigPropertiesCmd() {
        super("deleteConfigProperties")
    }

    /**
     * Name of file containing configuration properties to be deleted
     */
    def 'propertiesFileName'(com.ibm.websphere.management.cmdframework.UploadFile value) {
        parameter("propertiesFileName", value)
    }

    /**
     * Name of file containing variables map to expand variables used in properties file
     */
    def 'variablesMapFileName'(com.ibm.websphere.management.cmdframework.UploadFile value) {
        parameter("variablesMapFileName", value)
    }

    /**
     * Variables map to expand variables used in properties file
     */
    def 'variablesMap'(java.util.Properties value) {
        parameter("variablesMap", value)
    }

    /**
     * Report file name
     */
    def 'reportFileName'(com.ibm.websphere.management.cmdframework.DownloadFile value) {
        parameter("reportFileName", value)
    }

    /**
     * Report filter mechanism [Select one of these : All, Errors, Errors_And_Changes]
     */
    def 'reportFilterMechanism'(java.lang.String value) {
        parameter("reportFilterMechanism", value)
    }

    /**
     * ValidateProperties before applying
     */
    def 'validate'(Boolean value) {
        parameter("validate", value)
    }

    /**
     * FileName containing configuration files that cannot be converted to properties format.
     */
    def 'zipFileName'(com.ibm.websphere.management.cmdframework.UploadFile value) {
        parameter("zipFileName", value)
    }

}
