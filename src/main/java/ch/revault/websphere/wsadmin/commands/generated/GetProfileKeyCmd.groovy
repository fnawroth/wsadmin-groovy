/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get the profile key
*/
@Generated("with GenerateAdminCommands")
class GetProfileKeyCmd extends AdminCmd<Void> {
    GetProfileKeyCmd() {
        super("getProfileKey")
    }

    /**
     * Profile path of profile to locate the profile key
     */
    def 'profilePath'(String value) {
        parameter("profilePath", value)
    }

}
