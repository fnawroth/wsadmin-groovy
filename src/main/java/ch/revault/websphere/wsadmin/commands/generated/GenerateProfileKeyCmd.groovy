/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Generate profile key
*/
@Generated("with GenerateAdminCommands")
class GenerateProfileKeyCmd extends AdminCmd<Void> {
    GenerateProfileKeyCmd() {
        super("generateProfileKey")
    }

    /**
     * Properties
     */
    def 'properties'(java.util.Properties value) {
        parameter("properties", value)
    }

}
