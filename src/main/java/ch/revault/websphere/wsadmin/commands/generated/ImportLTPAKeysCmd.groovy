/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Imports Lightweight Third Party Authentication keys into the configuration.
*/
@Generated("with GenerateAdminCommands")
class ImportLTPAKeysCmd extends AdminCmd<Void> {
    ImportLTPAKeysCmd() {
        super("importLTPAKeys")
    }

    /**
     * File where the Lightweight Third Party Authentication keys will be read from to be imported.
     */
    def 'ltpaKeyFile'(java.lang.String value) {
        parameter("ltpaKeyFile", value)
    }

    /**
     * Password for the Lightweight Third Party Authentication keys.
     */
    def 'password'(java.lang.String value) {
        parameter("password", value)
    }

}
