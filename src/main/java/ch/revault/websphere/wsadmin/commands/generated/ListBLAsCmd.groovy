/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List business-level applications in the cell.
*/
@Generated("with GenerateAdminCommands")
class ListBLAsCmd extends AdminCmd<Void> {
    ListBLAsCmd() {
        super("listBLAs")
    }

    /**
     * ID for the business-level application in any of the following forms:  <bla name>; blaname=<bla name>; WebSphere:blaname=<bla name>; or WebSphere:blaname=<bla name>,blaedition=<bla edition>.  The edition does not need to be specified unless there is more than one edition.
     */
    def 'blaID'(String value) {
        parameter("blaID", value)
    }

    /**
     * Controls whether or not the description is included in list output.  Specify a value of "true" to include descriptions, or "false" to omit them.  The default is "false".
     */
    def 'includeDescription'(String value) {
        parameter("includeDescription", value)
    }

    /**
     * 
     */
    def 'ADTCommandProps'(java.util.Hashtable value) {
        parameter("ADTCommandProps", value)
    }

}
