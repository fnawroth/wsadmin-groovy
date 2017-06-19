/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete custom properties from the configuration of a token type.
*/
@Generated("with GenerateAdminCommands")
class DeleteSTSTokenTypeConfigurationCustomPropertiesCmd extends AdminCmd<Void> {
    DeleteSTSTokenTypeConfigurationCustomPropertiesCmd() {
        super("deleteSTSTokenTypeConfigurationCustomProperties")
    }

    /**
     * Names of the properties.
     */
    def 'propertyNames'(java.lang.String[] value) {
        parameter("propertyNames", value)
    }

}
