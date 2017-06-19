/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns the keystore containing the certificate used to encrypt the audit records.
*/
@Generated("with GenerateAdminCommands")
class GetEncryptionKeyStoreCmd extends AdminCmd<Void> {
    GetEncryptionKeyStoreCmd() {
        super("getEncryptionKeyStore")
    }

}
