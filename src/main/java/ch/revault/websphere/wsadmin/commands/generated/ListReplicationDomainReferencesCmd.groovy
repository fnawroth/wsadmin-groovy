/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List search object that participates in a specific data replication domain.  An object participates in a data replication domain if the object references the provided data replication domain name.  The command returns the objects that reference the data replication domain name regardless of whether replication is enabled or disabled for that object.
*/
@Generated("with GenerateAdminCommands")
class ListReplicationDomainReferencesCmd extends AdminCmd<Void> {
    ListReplicationDomainReferencesCmd() {
        super("listReplicationDomainReferences")
    }

    /**
     * Specifies the name of the data replication domain to use to query for objects that participate in the data replication domain.
     */
    def 'dataReplicationDomainName'(String value) {
        parameter("dataReplicationDomainName", value)
    }

}
