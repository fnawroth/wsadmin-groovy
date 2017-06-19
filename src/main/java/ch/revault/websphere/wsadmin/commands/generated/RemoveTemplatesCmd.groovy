/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes set of templates that are not required anymore when a feature pack or stack product is removed.
*/
@Generated("with GenerateAdminCommands")
class RemoveTemplatesCmd extends AdminCmd<Void> {
    RemoveTemplatesCmd() {
        super("removeTemplates")
    }

    /**
     * Feature pack or stack product templates to be removed.
     */
    def 'featureTemplateNames'(java.lang.String[] value) {
        parameter("featureTemplateNames", value)
    }

    /**
     * Server type that needs removal of some templates
     */
    def 'serverType'(String value) {
        parameter("serverType", value)
    }

    /**
     * Remove template documents also or not. By default template documents are removed
     */
    def 'removeDocuments'(Boolean value) {
        parameter("removeDocuments", value)
    }

}
