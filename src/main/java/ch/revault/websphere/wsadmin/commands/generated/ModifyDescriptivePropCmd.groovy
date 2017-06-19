/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modify a descriptive property under an object.
*/
@Generated("with GenerateAdminCommands")
class ModifyDescriptivePropCmd extends AdminCmd<Void> {
    ModifyDescriptivePropCmd() {
        super("modifyDescriptiveProp")
    }

    /**
     * Specify the parent object data type of the descriptive property. Valid values are keyStores, trustStores, keyManagers and trustManagers.
     */
    def 'parentDataType'(String value) {
        parameter("parentDataType", value)
    }

    /**
     * Specify the parent object name of the descriptive property.
     */
    def 'parentClassName'(String value) {
        parameter("parentClassName", value)
    }

    /**
     * Specifies the management scope of the parent object.
     */
    def 'parentScopeName'(String value) {
        parameter("parentScopeName", value)
    }

    /**
     * Specifies the name of the descriptive property.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Specifies the value of the descriptive property.
     */
    def 'value'(String value) {
        parameter("value", value)
    }

    /**
     * Specifies the type of the descriptive property.
     */
    def 'type'(String value) {
        parameter("type", value)
    }

    /**
     * Specifies the display name key of the descriptive property.
     */
    def 'displayNameKey'(String value) {
        parameter("displayNameKey", value)
    }

    /**
     * Specifies the NLS Range Key of the descriptive property.
     */
    def 'nlsRangeKey'(String value) {
        parameter("nlsRangeKey", value)
    }

    /**
     * Specifies the Hover Help Key of the descriptive property.
     */
    def 'hoverHelpKey'(String value) {
        parameter("hoverHelpKey", value)
    }

    /**
     * Specifies the range of the descriptive property.
     */
    def 'range'(String value) {
        parameter("range", value)
    }

    /**
     * Specifies the inclusive of the descriptive property.
     */
    def 'inclusive'(Boolean value) {
        parameter("inclusive", value)
    }

    /**
     * Specifies the firstclass of the descriptive property.            
     */
    def 'firstClass'(Boolean value) {
        parameter("firstClass", value)
    }

}
