/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Use the "installServiceMap" command to install a service map in a service map library.
*/
@Generated("with GenerateAdminCommands")
class InstallServiceMapCmd extends AdminCmd<Void> {
    InstallServiceMapCmd() {
        super("installServiceMap")
    }

    /**
     * Path to the service map library file being installed.
     */
    def 'sourceLibrary'(com.ibm.websphere.management.cmdframework.UploadFile value) {
        parameter("sourceLibrary", value)
    }

    /**
     * The service map file located in the service map library to be installed.
     */
    def 'sourceServiceMap'(String value) {
        parameter("sourceServiceMap", value)
    }

    /**
     * A name for the service map. The name must be unique, non-empty, cannot have a leading dot, and cannot contain any of the following characters: \/,#$@:;"*?<>|=+&%'
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Description of the service map.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * The deployment targets for the service map.
     */
    def 'deploymentTargets'(String value) {
        parameter("deploymentTargets", value)
    }

}
