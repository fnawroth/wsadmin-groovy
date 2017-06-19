/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a key set group.
*/
@Generated("with GenerateAdminCommands")
class CreateKeySetGroupCmd extends AdminCmd<Void> {
    CreateKeySetGroupCmd() {
        super("createKeySetGroup")
    }

    /**
     * Specifies the name that uniquely identifies the key set group.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

    /**
     * Specify true to automatically regenerate keys in the key set group, false otherwise.
     */
    def 'autoGenerate'(Boolean value) {
        parameter("autoGenerate", value)
    }

    /**
     * Specifies the schedule to use when if keys are auto generated.
     */
    def 'wsScheduleName'(String value) {
        parameter("wsScheduleName", value)
    }

    /**
     * Colon separated list of key set object names that are included in the key set group.
     */
    def 'keySetObjectNames'(String value) {
        parameter("keySetObjectNames", value)
    }

}
