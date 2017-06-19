/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns information about the FIPS settings in the current WebSphere configuration.  It will print out whether the FIPS is enabled or not and if it is, then what level FIPS setting is enabled. If suite B is enabled, the level of suite B is also returned. 
*/
@Generated("with GenerateAdminCommands")
class GetFipsInfoCmd extends AdminCmd<Void> {
    GetFipsInfoCmd() {
        super("getFipsInfo")
    }

}
