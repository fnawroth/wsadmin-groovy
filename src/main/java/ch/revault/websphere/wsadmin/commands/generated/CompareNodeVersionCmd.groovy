/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Compares the version of a given node with the specified version.  Only the number of levels in the specified version number are compared.  For example, if "6.0" compared to a node version of "6.0.1.0", they will compare as equal.  The possible return values are -1, 0, and 1. They are defined as follows:
	-1: node version is less than the specified version
	 0: node version is equal to the specified version
	 1: node version is greater than the specified version
*/
@Generated("with GenerateAdminCommands")
class CompareNodeVersionCmd extends AdminCmd<Void> {
    CompareNodeVersionCmd() {
        super("compareNodeVersion")
    }

    /**
     * Name of node.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * Version to compare
     */
    def 'version'(String value) {
        parameter("version", value)
    }

}
