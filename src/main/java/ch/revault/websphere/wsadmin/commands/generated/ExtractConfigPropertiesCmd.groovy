/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Extracts configuration of the object specified by ConfigId or ConfigData parameter to a specified properies file. Either ConfigId or ConfigData parameter should be specified, but not both. ConfigId parameter should be in the form that is returned by "AdminConfig list configType". Example of ConfigId is cellName(cells/cellName|cell.xml#Cell_1). ConfigData parameter should be in the form of configType=value[:configType=value]*. Examples of configData are Deployment=appName or Node=nodeName:Server=serverName.
*/
@Generated("with GenerateAdminCommands")
class ExtractConfigPropertiesCmd extends AdminCmd<Void> {
    ExtractConfigPropertiesCmd() {
        super("extractConfigProperties")
    }

    /**
     * Name of file to extract configuration properties.
     */
    def 'propertiesFileName'(com.ibm.websphere.management.cmdframework.DownloadFile value) {
        parameter("propertiesFileName", value)
    }

    /**
     * Configuration scope to be extracted. Example, Node=nodeName or Node=nodeName:Server=serverName
     */
    def 'configData'(java.lang.String value) {
        parameter("configData", value)
    }

    /**
     * Additional options (GenerateTemplates=true) , (PortablePropertiesFile=true). Two options are available: (1) When the PortablePropertiesFile option is set to true, the extracted properties file contains no environment specific data or XMI IDs and, therefore, can be applied to another environment. (2) When the GenerateTemplates option is set to true, the product generates a properties file for creating objects such as Server, Application, ServerCluster, AuthorizationGroup in a properties file.
     */
    def 'options'(java.util.Properties value) {
        parameter("options", value)
    }

    /**
     * Filter Mechanism [All, NO_SUBTYPES, SELECTED_SUBTYPES]
     */
    def 'filterMechanism'(java.lang.String value) {
        parameter("filterMechanism", value)
    }

    /**
     * Selected SubTypes (Example of Server SubTypes: ApplicationServer, EJBContainer)
     */
    def 'selectedSubTypes'(java.lang.String[] value) {
        parameter("selectedSubTypes", value)
    }

    /**
     * FileName containing configuration files that cannot be converted to properties format.
     */
    def 'zipFileName'(com.ibm.websphere.management.cmdframework.DownloadFile value) {
        parameter("zipFileName", value)
    }

}
