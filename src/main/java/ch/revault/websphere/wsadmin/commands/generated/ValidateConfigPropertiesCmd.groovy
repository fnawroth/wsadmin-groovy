/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Validate configuration properties in properites file
*/
@Generated("with GenerateAdminCommands")
class ValidateConfigPropertiesCmd extends AdminCmd<Void> {
    ValidateConfigPropertiesCmd() {
        super("validateConfigProperties")
    }

    /**
     * Name of file containing configuration properties to be validated
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
     * Merge Mechanism to be applied when there is an object that cannot be uniquely identified. (replace will replace existing objects of a given type with new objects specified in properties file. append option will append new objects from properties file to existing objects of a given type)
     */
    def 'mergeMechanism'(java.lang.String value) {
        parameter("mergeMechanism", value)
    }

    /**
     * FileName containing configuration files that cannot be converted to properties format.
     */
    def 'zipFileName'(com.ibm.websphere.management.cmdframework.UploadFile value) {
        parameter("zipFileName", value)
    }

}
