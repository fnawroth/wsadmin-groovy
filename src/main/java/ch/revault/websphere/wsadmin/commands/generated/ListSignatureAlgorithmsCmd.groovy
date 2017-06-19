/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List signature algorithms available for the current FIPS configuration. If FIPS is not enabled, then the full list of valid Signature Algorithms are returned. 
*/
@Generated("with GenerateAdminCommands")
class ListSignatureAlgorithmsCmd extends AdminCmd<Void> {
    ListSignatureAlgorithmsCmd() {
        super("listSignatureAlgorithms")
    }

}
