/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a new business-level application with no composition units.
*/
@Generated("with GenerateAdminCommands")
class CreateEmptyBLACmd extends AdminCmd<Void> {
    CreateEmptyBLACmd() {
        super("createEmptyBLA")
    }

    /**
     * Business-level application name. The name must be unique in a cell, must be non-empty, cannot have leading or trailing blanks or a leading dot, and cannot contain any of the following characters: \/,#$@:;"*?<>|=+&%'
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Description of the business-level application being created.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * 
     */
    def 'ADTCommandProps'(java.util.Hashtable value) {
        parameter("ADTCommandProps", value)
    }

}
