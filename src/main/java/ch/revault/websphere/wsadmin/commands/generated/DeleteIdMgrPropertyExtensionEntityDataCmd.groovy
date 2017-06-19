/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes the property data from the property extension repository. It also deletes any entity IDs with which there is no property data associated, from the property extension repository in virtual member manager.
*/
@Generated("with GenerateAdminCommands")
class DeleteIdMgrPropertyExtensionEntityDataCmd extends AdminCmd<Void> {
    DeleteIdMgrPropertyExtensionEntityDataCmd() {
        super("deleteIdMgrPropertyExtensionEntityData")
    }

    /**
     * Name of the property. A valid namespace prefix can be used for a property name, to refer to the property definition in a specific existing namespace.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Names of one or more existing entity types. Use ';' as delimiter while specifying multiple entity types. A valid namespace prefix can be used to refer to entity type names in a specific namespace.
     */
    def 'entityTypeNames'(String value) {
        parameter("entityTypeNames", value)
    }

    /**
     * The database administrator ID for direct access mode. Example: db2admin
     */
    def 'dbAdminId'(String value) {
        parameter("dbAdminId", value)
    }

    /**
     * The database administrator password for direct access mode.
     */
    def 'dbAdminPassword'(String value) {
        parameter("dbAdminPassword", value)
    }

}
