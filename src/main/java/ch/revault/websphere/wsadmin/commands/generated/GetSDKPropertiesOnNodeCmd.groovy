/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns properties for the SDKs. If the SDK name is not given, all properties for all avaiable SDKs are returned.  If the SDK attributes are specified, only properties for given SDK attributes are returned.
*/
@Generated("with GenerateAdminCommands")
class GetSDKPropertiesOnNodeCmd extends AdminCmd<Void> {
    GetSDKPropertiesOnNodeCmd() {
        super("getSDKPropertiesOnNode")
    }

    /**
     * Name of node.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * Name of a SDK
     */
    def 'sdkName'(String value) {
        parameter("sdkName", value)
    }

    /**
     * List of SDK attributes
     */
    def 'sdkAttributes'(java.lang.String[] value) {
        parameter("sdkAttributes", value)
    }

}
