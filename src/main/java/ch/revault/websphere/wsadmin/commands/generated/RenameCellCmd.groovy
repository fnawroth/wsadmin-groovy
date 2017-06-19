/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Change the name of the cell.  This command can only run in local mode i.e.with wsadmin conntype NONE.1. Backing up your node configuration with the backupConfig tool fromprofile_root/bin directory is recommended before you change the cell name forthat node using the renameCell command.  If you are not satisfied with theresults of the renameCell command and if the renameCell command executionfailed unexpectedly, you use the restoreConfig tool to restore your backupconfiguration.2. Back up profile_root/bin/setupCmdLine script file. The command updates thecell name in this file with the new cell name as well, but is unable to changeit back if a user decides to discard the configuration change resulting fromthis command execution. If you decide to do so, you will need to restore thefile after you discard the configuration change; otherwise, you won't be ableto start a server in this profile. 
*/
@Generated("with GenerateAdminCommands")
class RenameCellCmd extends AdminCmd<Void> {
    RenameCellCmd() {
        super("renameCell")
    }

    /**
     * New Cell Name
     */
    def 'newCellName'(String value) {
        parameter("newCellName", value)
    }

    /**
     * SSL certificates
     */
    def 'regenCerts'(Boolean value) {
        parameter("regenCerts", value)
    }

    /**
     * Context ID of applications used by JACC provider
     */
    def 'updateJaccContextID'(Boolean value) {
        parameter("updateJaccContextID", value)
    }

    /**
     * Deployment Manager Host Name
     */
    def 'dmgr_host'(String value) {
        parameter("dmgr_host", value)
    }

    /**
     * Deployment Manager Connection Port
     */
    def 'dmgr_port'(String value) {
        parameter("dmgr_port", value)
    }

    /**
     * JMX Connection Type
     */
    def 'connType'(String value) {
        parameter("connType", value)
    }

    /**
     * User Name
     */
    def 'userName'(String value) {
        parameter("userName", value)
    }

    /**
     * Password
     */
    def 'password'(String value) {
        parameter("password", value)
    }

}
