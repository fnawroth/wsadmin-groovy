/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Command that creates a server
*/
@Generated("with GenerateAdminCommands")
class CreateWebServerCmd extends AdminCmd<Void> {
    CreateWebServerCmd() {
        super("createWebServer")
    }

    /**
     * The Server Name
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The Template Name
     */
    def 'templateName'(String value) {
        parameter("templateName", value)
    }

    /**
     * Parameter to generate unique http ports for a server.
     */
    def 'genUniquePorts'(Boolean value) {
        parameter("genUniquePorts", value)
    }

    /**
     * The location where the template is stored. Use system defined location if it is not specified. Using system defined location is recommended.
     */
    def 'templateLocation'(javax.management.ObjectName value) {
        parameter("templateLocation", value)
    }

    /**
     * The server specific short name is applicable only on zOS platforms. This represents the specific short name of the server. All servers should have unique specific short name. This parameter is optional and when it is not specified a unique specific short name is automatically assigned. The value should be 8 chars or less and all upper case. 
     */
    def 'specificShortName'(String value) {
        parameter("specificShortName", value)
    }

    /**
     * The server generic short name is applicable only on zOS platforms. This represents the generic short name of the server. All members of a cluster should share the same generic short name. Individual servers should have unique generic short name. This parameter is optional and when it is not specified a unique generic short name is automatically assigned. The value should be 8 chars or less and all upper case.
     */
    def 'genericShortName'(String value) {
        parameter("genericShortName", value)
    }

    /**
     * clusterName
     */
    def 'clusterName'(String value) {
        parameter("clusterName", value)
    }

    /**
     * bitmode
     */
    def 'bitmode'(String value) {
        parameter("bitmode", value)
    }

}
