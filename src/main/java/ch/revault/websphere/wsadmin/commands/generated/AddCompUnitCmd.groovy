/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Add a composition unit, based on an asset or another business-level application, to a business-level application.
*/
@Generated("with GenerateAdminCommands")
class AddCompUnitCmd extends AdminCmd<Void> {
    AddCompUnitCmd() {
        super("addCompUnit")
    }

    /**
     * ID for the business-level application in any of the following forms:  <bla name>; blaname=<bla name>; WebSphere:blaname=<bla name>; or WebSphere:blaname=<bla name>,blaedition=<bla edition>.  The edition does not need to be specified unless there is more than one edition.
     */
    def 'blaID'(String value) {
        parameter("blaID", value)
    }

    /**
     * The composition unit source ID is the ID of the object which is being added to the business-level application.  The ID can be an asset ID or the ID of another business-level application.
     */
    def 'cuSourceID'(String value) {
        parameter("cuSourceID", value)
    }

    /**
     * Optional list of deployable units for this composition unit.  Applies only if the source ID is an asset ID.  By default, all deployable units for the asset are selected.
     */
    def 'deplUnits'(String value) {
        parameter("deplUnits", value)
    }

    /**
     * Specify a file name which contains custom strategy data.
     */
    def 'cuConfigStrategyFile'(com.ibm.websphere.management.cmdframework.UploadFile value) {
        parameter("cuConfigStrategyFile", value)
    }

    /**
     * Specify default binding options to use to configure a Java EE asset as a composition unit.
     */
    def 'defaultBindingOptions'(String value) {
        parameter("defaultBindingOptions", value)
    }

    /**
     * 
     */
    def 'ADTCommandProps'(java.util.Hashtable value) {
        parameter("ADTCommandProps", value)
    }

}
