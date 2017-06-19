/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Remove feature pack or stack product information from product info.
*/
@Generated("with GenerateAdminCommands")
class RemoveProductInfoCmd extends AdminCmd<Void> {
    RemoveProductInfoCmd() {
        super("removeProductInfo")
    }

    /**
     * Feature Pack or Stack Product Short Name
     */
    def 'featureShortName'(String value) {
        parameter("featureShortName", value)
    }

    /**
     * Feature pack or stack product property name
     */
    def 'featurePropertyName'(String value) {
        parameter("featurePropertyName", value)
    }

    /**
     * Feature pack or stack product version
     */
    def 'featureVersion'(String value) {
        parameter("featureVersion", value)
    }

    /**
     * Compatible Feature pack or stack product start version 
     */
    def 'featureStartVersion'(String value) {
        parameter("featureStartVersion", value)
    }

    /**
     * Compatible Feature pack or stack product end version 
     */
    def 'featureEndVersion'(String value) {
        parameter("featureEndVersion", value)
    }

    /**
     * Compatible Base product start version 
     */
    def 'baseStartVersion'(String value) {
        parameter("baseStartVersion", value)
    }

    /**
     * Compatible Base product end version 
     */
    def 'baseEndVersion'(String value) {
        parameter("baseEndVersion", value)
    }

}
