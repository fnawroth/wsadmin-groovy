/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Configures an external authorization provider in global security or in an application security domain.
*/
@Generated("with GenerateAdminCommands")
class ConfigureAuthzConfigCmd extends AdminCmd<Void> {
    ConfigureAuthzConfigCmd() {
        super("configureAuthzConfig")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Enables the JAAC authorization provider.
     */
    def 'useJACCProvider'(Boolean value) {
        parameter("useJACCProvider", value)
    }

    /**
     * Name of the authorization provider.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Description of the authorization provider.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * Specifies the class name of an implementation class that represents the javax.security.jacc.policy.provider property according to the specification.
     */
    def 'j2eePolicyImplClassName'(String value) {
        parameter("j2eePolicyImplClassName", value)
    }

    /**
     * Policy configuration factory class name
     */
    def 'policyConfigurationFactoryImplClassName'(String value) {
        parameter("policyConfigurationFactoryImplClassName", value)
    }

    /**
     * Specifies the class name of an implementation class that implements the com.ibm.wsspi.security.authorization.RoleConfigurationFactory interface.
     */
    def 'roleConfigurationFactoryImplClassName'(String value) {
        parameter("roleConfigurationFactoryImplClassName", value)
    }

    /**
     * Requires the EJB arguments policy context handler for access decisions (true/false)
     */
    def 'requiresEJBArgumentsPolicyContextHandler'(Boolean value) {
        parameter("requiresEJBArgumentsPolicyContextHandler", value)
    }

    /**
     * Specifies the class name of an implementation class that implements the com.ibm.wsspi.security.authorization.InitializeJACCProvider interface.
     */
    def 'initializeJACCProviderClassName'(String value) {
        parameter("initializeJACCProviderClassName", value)
    }

    /**
     * Supports dynamic module updates (true/false)
     */
    def 'supportsDynamicModuleUpdates'(Boolean value) {
        parameter("supportsDynamicModuleUpdates", value)
    }

    /**
     * Add, modify, or remove custom properties on the security object.
     */
    def 'customProperties'(String value) {
        parameter("customProperties", value)
    }

}
