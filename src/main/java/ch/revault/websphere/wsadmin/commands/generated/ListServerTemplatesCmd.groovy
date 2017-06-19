/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Lists the available Server Templates
*/
@Generated("with GenerateAdminCommands")
class ListServerTemplatesCmd extends AdminCmd<Void> {
    ListServerTemplatesCmd() {
        super("listServerTemplates")
    }

    /**
     * The Product Version
     */
    def 'version'(String value) {
        parameter("version", value)
    }

    /**
     * The ServerType eg: APPLICATION_SERVER
     */
    def 'serverType'(String value) {
        parameter("serverType", value)
    }

    /**
     * The Template Name
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The Platform e.g. (windows - linux - z/os)
     */
    def 'queryExp'(java.lang.String[] value) {
        parameter("queryExp", value)
    }

    /**
     * List only templates that macthes the node specified
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

}
