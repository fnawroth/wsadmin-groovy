/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Start all composition units of a specified business-level application.
*/
@Generated("with GenerateAdminCommands")
class StartBLACmd extends AdminCmd<Void> {
    StartBLACmd() {
        super("startBLA")
    }

    /**
     * ID for the business-level application in any of the following forms:  <bla name>; blaname=<bla name>; WebSphere:blaname=<bla name>; or WebSphere:blaname=<bla name>,blaedition=<bla edition>.  The edition does not need to be specified unless there is more than one edition.
     */
    def 'blaID'(String value) {
        parameter("blaID", value)
    }

}
