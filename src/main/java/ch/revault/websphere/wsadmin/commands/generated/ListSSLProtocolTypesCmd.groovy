/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists the SSL protocols valid for the current FIPS configuration. If FIPS is not enabled, then the full list of valid SSL protocols are returned. 
*/
@Generated("with GenerateAdminCommands")
class ListSSLProtocolTypesCmd extends AdminCmd<Void> {
    ListSSLProtocolTypesCmd() {
        super("listSSLProtocolTypes")
    }

}
