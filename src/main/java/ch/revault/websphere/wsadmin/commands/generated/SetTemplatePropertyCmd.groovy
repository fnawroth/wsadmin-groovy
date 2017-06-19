/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Set a property in server template's metadata. Use this command with caution. Changing a template metadata property incorrectly will result in new server creation failure.
*/
@Generated("with GenerateAdminCommands")
class SetTemplatePropertyCmd extends AdminCmd<Void> {
    SetTemplatePropertyCmd() {
        super("setTemplateProperty")
    }

    /**
     * Server type of the template
     */
    def 'serverType'(String value) {
        parameter("serverType", value)
    }

    /**
     * Template Name
     */
    def 'templateName'(String value) {
        parameter("templateName", value)
    }

    /**
     * Property Name
     */
    def 'propertyName'(String value) {
        parameter("propertyName", value)
    }

    /**
     * Property Value
     */
    def 'propertyValue'(String value) {
        parameter("propertyValue", value)
    }

}
