/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* creates a server Template based on a server configuration
*/
@Generated("with GenerateAdminCommands")
class CreateServerTemplateCmd extends AdminCmd<Void> {
    CreateServerTemplateCmd() {
        super("createServerTemplate")
    }

    /**
     * The Template Name
     */
    def 'templateName'(String value) {
        parameter("templateName", value)
    }

    /**
     * The Server Name
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

    /**
     * The Node Name
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * Description for the created Server Template.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * The location where the template is stored. Use system defined location if it is not specified. Using system defined location is recommended.
     */
    def 'templateLocation'(javax.management.ObjectName value) {
        parameter("templateLocation", value)
    }

}
