/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Adds a bundle to the internal bundle repository.
*/
@Generated("with GenerateAdminCommands")
class AddLocalRepositoryBundleCmd extends AdminCmd<Void> {
    AddLocalRepositoryBundleCmd() {
        super("addLocalRepositoryBundle")
    }

    /**
     * The location of the bundle JAR file.
     */
    def 'file'(com.ibm.websphere.management.cmdframework.UploadFile value) {
        parameter("file", value)
    }

}
