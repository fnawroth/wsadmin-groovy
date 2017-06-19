/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Exports composites under specified domain
*/
@Generated("with GenerateAdminCommands")
class ExportCompositeToDomainCmd extends AdminCmd<Void> {
    ExportCompositeToDomainCmd() {
        super("exportCompositeToDomain")
    }

    /**
     * Domain name
     */
    def 'domainName'(String value) {
        parameter("domainName", value)
    }

    /**
     * Absolute path to the export file
     */
    def 'fileName'(String value) {
        parameter("fileName", value)
    }

}
