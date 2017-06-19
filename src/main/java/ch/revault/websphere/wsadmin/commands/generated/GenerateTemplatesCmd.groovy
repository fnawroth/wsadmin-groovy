/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Generates new set of templates by combining WebSphere Application Server base product templates with feature pack and/or stack product templates
*/
@Generated("with GenerateAdminCommands")
class GenerateTemplatesCmd extends AdminCmd<Void> {
    GenerateTemplatesCmd() {
        super("generateTemplates")
    }

    /**
     * Feature pack or stack product templates that need to be combined with base templates
     */
    def 'featureTemplateNames'(java.lang.String[] value) {
        parameter("featureTemplateNames", value)
    }

    /**
     * Server type that needs generation of templates
     */
    def 'serverType'(String value) {
        parameter("serverType", value)
    }

}
