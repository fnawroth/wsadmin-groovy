/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create Web server definition using hostname.
*/
@Generated("with GenerateAdminCommands")
class CreateWebServerByHostNameCmd extends AdminCmd<Void> {
    CreateWebServerByHostNameCmd() {
        super("createWebServerByHostName")
    }

    /**
     * Specify the host name where the Web server is installed.
     */
    def 'hostName'(String value) {
        parameter("hostName", value)
    }

    /**
     * platformDesc
     */
    def 'platform'(String value) {
        parameter("platform", value)
    }

    /**
     * Specify the name for this Web server defintion.
     */
    def 'webserverName'(String value) {
        parameter("webserverName", value)
    }

    /**
     * TemplateNameDesc
     */
    def 'templateName'(String value) {
        parameter("templateName", value)
    }

    /**
     * Specifies the port number of the Web server. This option is required for all Web servers.
     */
    def 'webPort'(Integer value) {
        parameter("webPort", value)
    }

    /**
     * Specifies the install path directory for the Web server. This option is required for IBM HTTP Server Admin Function.           
     */
    def 'webInstallRoot'(String value) {
        parameter("webInstallRoot", value)
    }

    /**
     * Specifies the installation root directory where the plugin for the Web server is installed. This option is required for all Web servers.
     */
    def 'pluginInstallRoot'(String value) {
        parameter("pluginInstallRoot", value)
    }

    /**
     * Specifies the file path for the IBM HTTP Server. This option is required for view and edit of the IBM HTTP Server Configuration file only. 
     */
    def 'configurationFile'(String value) {
        parameter("configurationFile", value)
    }

    /**
     * Specifies the windows service name on which to start the IBM HTTP Server. This option is required for start and stop of the IBM HTTP Server Web server only.
     */
    def 'serviceName'(String value) {
        parameter("serviceName", value)
    }

    /**
     * Specifies the path for the IBM HTTP Server error log.
     */
    def 'errorLogfile'(String value) {
        parameter("errorLogfile", value)
    }

    /**
     * Specifies the path for the IBM HTTP Server access log.
     */
    def 'accessLogfile'(String value) {
        parameter("accessLogfile", value)
    }

    /**
     * Specifies the IBM HTTP Server administration server running with an unmanaged or remote Web server. Options include HTTP or HTTPS. The default is HTTP.
     */
    def 'webProtocol'(String value) {
        parameter("webProtocol", value)
    }

    /**
     * Specifies configuration information for Web application mapping.
     */
    def 'webAppMapping'(String value) {
        parameter("webAppMapping", value)
    }

    /**
     * Port of IBM HTTP Server administration.
     */
    def 'adminPort'(Integer value) {
        parameter("adminPort", value)
    }

    /**
     * The user ID. This value should match the authentication in the admin.conf file
     */
    def 'adminUserID'(String value) {
        parameter("adminUserID", value)
    }

    /**
     * The user password.
     */
    def 'adminPasswd'(String value) {
        parameter("adminPasswd", value)
    }

    /**
     * This parameter is required. The value is either HTTP or HTTPS. The default value is HTTP.
     */
    def 'adminProtocol'(String value) {
        parameter("adminProtocol", value)
    }

}
