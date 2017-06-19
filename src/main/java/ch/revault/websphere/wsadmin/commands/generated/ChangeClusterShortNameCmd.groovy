/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* A command that can be used to change the cluster's short name. 
*/
@Generated("with GenerateAdminCommands")
class ChangeClusterShortNameCmd extends AdminCmd<Void> {
    ChangeClusterShortNameCmd() {
        super("changeClusterShortName")
    }

    /**
     * The cluster short name is applicable only on zOS platforms. This represents the short name of the cluster. Every cluster should have unique short name. This parameter is optional and when it is not specified a unique short name is automatically assigned. The value should be 8 chars or less and all upper case.
     */
    def 'clusterName'(String value) {
        parameter("clusterName", value)
    }

    /**
     * The cluster short name is applicable only on zOS platforms. This represents the short name of the cluster. Every cluster should have unique short name. This parameter is optional and when it is not specified a unique short name is automatically assigned. The value should be 8 chars or less and all upper case.
     */
    def 'shortName'(String value) {
        parameter("shortName", value)
    }

}
