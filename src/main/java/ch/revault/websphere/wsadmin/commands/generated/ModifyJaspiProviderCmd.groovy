/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Modify configuration data for a given authentication provider.
*/
@Generated("with GenerateAdminCommands")
class ModifyJaspiProviderCmd extends AdminCmd<Void> {
    ModifyJaspiProviderCmd() {
        super("modifyJaspiProvider")
    }

    /**
     * Specify a unique name that identifies the authentication provider.
     */
    def 'providerName'(java.lang.String value) {
        parameter("providerName", value)
    }

    /**
     * Specify the package-qualified name of the class that implements the authentication provider.
     */
    def 'className'(java.lang.String value) {
        parameter("className", value)
    }

    /**
     * Specify the name of the security domain.
     */
    def 'securityDomainName'(java.lang.String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Specify a explanatory description of the authentication provider.
     */
    def 'description'(java.lang.String value) {
        parameter("description", value)
    }

    /**
     * Specify any additional configuration options needed to initialize the authentication provider.
     */
    def 'properties'(java.util.Properties value) {
        parameter("properties", value)
    }

}
