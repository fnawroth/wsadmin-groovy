/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin
import ch.revault.websphere.wsadmin.commands.generated.*
import javax.annotation.Generated

@Generated("with GenerateAdminCommands")
trait GeneratedScript implements ScriptInterface {

    /**
     * Set the JNDI name that is bound to java:comp/DefaultDataSource.
     * @param block to configure
     */
    def setDefaultDataSource(@DelegatesTo(SetDefaultDataSourceCmd) Closure<?> block) {
        runDelegate(new SetDefaultDataSourceCmd(), block)
    }

    /**
     * Command that creates a server
     * @param block to configure
     */
    def createApplicationServer(@DelegatesTo(CreateApplicationServerCmd) Closure<?> block) {
        runDelegate(new CreateApplicationServerCmd(), block)
    }

    /**
     * Lists the available serverTypes that have a template.
     * @param block to configure
     */
    def listServerTypes(@DelegatesTo(ListServerTypesCmd) Closure<?> block) {
        runDelegate(new ListServerTypesCmd(), block)
    }

    /**
     * Returns the class name of the event formatter associated with the audit service provider reference.
     * @param block to configure
     */
    def getEventFormatterClass(@DelegatesTo(GetEventFormatterClassCmd) Closure<?> block) {
        runDelegate(new GetEventFormatterClassCmd(), block)
    }

    /**
     * Creates a supported entity type configuration.
     * @param block to configure
     */
    def createIdMgrSupportedEntityType(@DelegatesTo(CreateIdMgrSupportedEntityTypeCmd) Closure<?> block) {
        runDelegate(new CreateIdMgrSupportedEntityTypeCmd(), block)
    }

    /**
     * List the identity rules under the specified trust authentication rule.
     * @param block to configure
     */
    def listSTSEndpointTrustAuthenticationRules(@DelegatesTo(ListSTSEndpointTrustAuthenticationRulesCmd) Closure<?> block) {
        runDelegate(new ListSTSEndpointTrustAuthenticationRulesCmd(), block)
    }

    /**
     * null
     * @param block to configure
     */
    def getClusterMemberLimit(@DelegatesTo(GetClusterMemberLimitCmd) Closure<?> block) {
        runDelegate(new GetClusterMemberLimitCmd(), block)
    }

    /**
     * Checks if the current run time is a single security domain.
     * @param block to configure
     */
    def isSingleSecurityDomain(@DelegatesTo(IsSingleSecurityDomainCmd) Closure<?> block) {
        runDelegate(new IsSingleSecurityDomainCmd(), block)
    }

    /**
     * The listAssetsAttachedToPolicySet command lists the assets to which a specific policy set is attached.
     * @param block to configure
     */
    def listAssetsAttachedToPolicySet(@DelegatesTo(ListAssetsAttachedToPolicySetCmd) Closure<?> block) {
        runDelegate(new ListAssetsAttachedToPolicySetCmd(), block)
    }

    /**
     * Returns list of supported LDAP server types.
     * @param block to configure
     */
    def listIdMgrSupportedLDAPServerTypes(@DelegatesTo(ListIdMgrSupportedLDAPServerTypesCmd) Closure<?> block) {
        runDelegate(new ListIdMgrSupportedLDAPServerTypesCmd(), block)
    }

    /**
     * A command that can be used to change the cluster's short name. 
     * @param block to configure
     */
    def changeClusterShortName(@DelegatesTo(ChangeClusterShortNameCmd) Closure<?> block) {
        runDelegate(new ChangeClusterShortNameCmd(), block)
    }

    /**
     * Sets or updates the property mapping repository configuration.
     * @param block to configure
     */
    def setIdMgrPropertyExtensionRepository(@DelegatesTo(SetIdMgrPropertyExtensionRepositoryCmd) Closure<?> block) {
        runDelegate(new SetIdMgrPropertyExtensionRepositoryCmd(), block)
    }

    /**
     * Sets the application level security active settings.
     * @param block to configure
     */
    def setAppActiveSecuritySettings(@DelegatesTo(SetAppActiveSecuritySettingsCmd) Closure<?> block) {
        runDelegate(new SetAppActiveSecuritySettingsCmd(), block)
    }

    /**
     * Returns the reference id of the configured audit notification.
     * @param block to configure
     */
    def getAuditNotificationRef(@DelegatesTo(GetAuditNotificationRefCmd) Closure<?> block) {
        runDelegate(new GetAuditNotificationRefCmd(), block)
    }

    /**
     * Create a new WebSphere MQ link.
     * @param block to configure
     */
    def createSIBMQLink(@DelegatesTo(CreateSIBMQLinkCmd) Closure<?> block) {
        runDelegate(new CreateSIBMQLinkCmd(), block)
    }

    /**
     * Show Server Instance configuration. This command only applies to the z/OS platform.
     * @param block to configure
     */
    def showServerInstance(@DelegatesTo(ShowServerInstanceCmd) Closure<?> block) {
        runDelegate(new ShowServerInstanceCmd(), block)
    }

    /**
     * Use this command to create an unmanaged node in a cell.
     * @param block to configure
     */
    def createUnmanagedNode(@DelegatesTo(CreateUnmanagedNodeCmd) Closure<?> block) {
        runDelegate(new CreateUnmanagedNodeCmd(), block)
    }

    /**
     * list all the group IDs in an AuthorizationGroups
     * @param block to configure
     */
    def listAuditGroupIDsOfAuthorizationGroup(@DelegatesTo(ListAuditGroupIDsOfAuthorizationGroupCmd) Closure<?> block) {
        runDelegate(new ListAuditGroupIDsOfAuthorizationGroupCmd(), block)
    }

    /**
     * list properties of a node group
     * @param block to configure
     */
    def listNodeGroupProperties(@DelegatesTo(ListNodeGroupPropertiesCmd) Closure<?> block) {
        runDelegate(new ListNodeGroupPropertiesCmd(), block)
    }

    /**
     * run jobs locally without going through job manager
     * @param block to configure
     */
    def runJob(@DelegatesTo(RunJobCmd) Closure<?> block) {
        runDelegate(new RunJobCmd(), block)
    }

    /**
     * Update information for a group of managed nodes. (deprecated)
     * @param block to configure
     */
    def modifyManagedNodeGroupInfo(@DelegatesTo(ModifyManagedNodeGroupInfoCmd) Closure<?> block) {
        runDelegate(new ModifyManagedNodeGroupInfoCmd(), block)
    }

    /**
     * Get information about a key set group.
     * @param block to configure
     */
    def getKeySetGroup(@DelegatesTo(GetKeySetGroupCmd) Closure<?> block) {
        runDelegate(new GetKeySetGroupCmd(), block)
    }

    /**
     * Get the name of the default core group
     * @param block to configure
     */
    def getDefaultCoreGroupName(@DelegatesTo(GetDefaultCoreGroupNameCmd) Closure<?> block) {
        runDelegate(new GetDefaultCoreGroupNameCmd(), block)
    }

    /**
     * Returns the state of verbose gathering of audit data.
     * @param block to configure
     */
    def isVerboseAuditEnabled(@DelegatesTo(IsVerboseAuditEnabledCmd) Closure<?> block) {
        runDelegate(new IsVerboseAuditEnabledCmd(), block)
    }

    /**
     * Updates a supported entity type configuration.
     * @param block to configure
     */
    def updateIdMgrSupportedEntityType(@DelegatesTo(UpdateIdMgrSupportedEntityTypeCmd) Closure<?> block) {
        runDelegate(new UpdateIdMgrSupportedEntityTypeCmd(), block)
    }

    /**
     * Deregister the node with an adminagent
     * @param block to configure
     */
    def deregisterWithAdminAgent(@DelegatesTo(DeregisterWithAdminAgentCmd) Closure<?> block) {
        runDelegate(new DeregisterWithAdminAgentCmd(), block)
    }

    /**
     * Display information about the Jaspi configuration.
     * @param block to configure
     */
    def getJaspiInfo(@DelegatesTo(GetJaspiInfoCmd) Closure<?> block) {
        runDelegate(new GetJaspiInfoCmd(), block)
    }

    /**
     * Get properties keys associated with a specific Target.
     * @param block to configure
     */
    def getTargetKeys(@DelegatesTo(GetTargetKeysCmd) Closure<?> block) {
        runDelegate(new GetTargetKeysCmd(), block)
    }

    /**
     * Removes all destination roles defined for the specified destination in the specified bus.
     * @param block to configure
     */
    def removeDestinationRoles(@DelegatesTo(RemoveDestinationRolesCmd) Closure<?> block) {
        runDelegate(new RemoveDestinationRolesCmd(), block)
    }

    /**
     * Display a named WebSphere MQ server bus members attributes.
     * @param block to configure
     */
    def showSIBWMQServerBusMember(@DelegatesTo(ShowSIBWMQServerBusMemberCmd) Closure<?> block) {
        runDelegate(new ShowSIBWMQServerBusMemberCmd(), block)
    }

    /**
     * Lists the properties that have been extended for one or more entity types.
     * @param block to configure
     */
    def listIdMgrPropertyExtensions(@DelegatesTo(ListIdMgrPropertyExtensionsCmd) Closure<?> block) {
        runDelegate(new ListIdMgrPropertyExtensionsCmd(), block)
    }

    /**
     * Show server type information.
     * @param block to configure
     */
    def showServerTypeInfo(@DelegatesTo(ShowServerTypeInfoCmd) Closure<?> block) {
        runDelegate(new ShowServerTypeInfoCmd(), block)
    }

    /**
     * Migrates WMM UserRegistry properties information to virtual member manager realm configuration.
     * @param block to configure
     */
    def migrateWMMUR(@DelegatesTo(MigrateWMMURCmd) Closure<?> block) {
        runDelegate(new MigrateWMMURCmd(), block)
    }

    /**
     * Security registration for base and admin agent.
     * @param block to configure
     */
    def baseToAgentRegistration(@DelegatesTo(BaseToAgentRegistrationCmd) Closure<?> block) {
        runDelegate(new BaseToAgentRegistrationCmd(), block)
    }

    /**
     * Imports a personal certificate from another managed key store.
     * @param block to configure
     */
    def importAuditCertFromManagedKS(@DelegatesTo(ImportAuditCertFromManagedKSCmd) Closure<?> block) {
        runDelegate(new ImportAuditCertFromManagedKSCmd(), block)
    }

    /**
     * Set Server Instance configuration. This command only applies to the z/OS platform.
     * @param block to configure
     */
    def setServerInstance(@DelegatesTo(SetServerInstanceCmd) Closure<?> block) {
        runDelegate(new SetServerInstanceCmd(), block)
    }

    /**
     * list properties of the job scheduler
     * @param block to configure
     */
    def listJobSchedulerProperties(@DelegatesTo(ListJobSchedulerPropertiesCmd) Closure<?> block) {
        runDelegate(new ListJobSchedulerPropertiesCmd(), block)
    }

    /**
     * Lists all the audit emitter implementation objects.
     * @param block to configure
     */
    def listAuditEmitters(@DelegatesTo(ListAuditEmittersCmd) Closure<?> block) {
        runDelegate(new ListAuditEmittersCmd(), block)
    }

    /**
     * Returns the specified realm configuration.
     * @param block to configure
     */
    def getIdMgrRealm(@DelegatesTo(GetIdMgrRealmCmd) Closure<?> block) {
        runDelegate(new GetIdMgrRealmCmd(), block)
    }

    /**
     * Unsets active security settings on a security domain.  The attribute is removed from the security domain configuration.
     * @param block to configure
     */
    def unsetAppActiveSecuritySettings(@DelegatesTo(UnsetAppActiveSecuritySettingsCmd) Closure<?> block) {
        runDelegate(new UnsetAppActiveSecuritySettingsCmd(), block)
    }

    /**
     * Import a Certificate from another keyStore to this KeyStore.
     * @param block to configure
     */
    def importEncryptionCertificate(@DelegatesTo(ImportEncryptionCertificateCmd) Closure<?> block) {
        runDelegate(new ImportEncryptionCertificateCmd(), block)
    }

    /**
     * Returns the state of audit encryption.
     * @param block to configure
     */
    def isAuditEncryptionEnabled(@DelegatesTo(IsAuditEncryptionEnabledCmd) Closure<?> block) {
        runDelegate(new IsAuditEncryptionEnabledCmd(), block)
    }

    /**
     * Get the JNDI name that is bound to java:comp/DefaultManagedScheduledExecutorService.
     * @param block to configure
     */
    def getDefaultManagedScheduledExecutor(@DelegatesTo(GetDefaultManagedScheduledExecutorCmd) Closure<?> block) {
        runDelegate(new GetDefaultManagedScheduledExecutorCmd(), block)
    }

    /**
     * Security registration of an agent with a job manager.
     * @param block to configure
     */
    def agentToJobManagerRegistration(@DelegatesTo(AgentToJobManagerRegistrationCmd) Closure<?> block) {
        runDelegate(new AgentToJobManagerRegistrationCmd(), block)
    }

    /**
     * Submits a new job for execution.
     * @param block to configure
     */
    def submitJob(@DelegatesTo(SubmitJobCmd) Closure<?> block) {
        runDelegate(new SubmitJobCmd(), block)
    }

    /**
     * Delete an existing chain and, optionally, the transport channels in the chain.
     * @param block to configure
     */
    def deleteChain(@DelegatesTo(DeleteChainCmd) Closure<?> block) {
        runDelegate(new DeleteChainCmd(), block)
    }

    /**
     * Create bus destinations.
     * @param block to configure
     */
    def createSIBDestinations(@DelegatesTo(CreateSIBDestinationsCmd) Closure<?> block) {
        runDelegate(new CreateSIBDestinationsCmd(), block)
    }

    /**
     * WASX7036I: Method: queryNames

	Arguments: object name 

	Description: Returns a String containing the ObjectNames that match 
	the input object name, which may be a wild card.
     * @param block to configure
     */
    def adminservice_queryNames(@DelegatesTo(Adminservice_queryNamesCmd) Closure<?> block) {
        runDelegate(new Adminservice_queryNamesCmd(), block)
    }

    /**
     * Deletes an audit notification monitor specified by the unique name.
     * @param block to configure
     */
    def deleteAuditNotificationMonitorByName(@DelegatesTo(DeleteAuditNotificationMonitorByNameCmd) Closure<?> block) {
        runDelegate(new DeleteAuditNotificationMonitorByNameCmd(), block)
    }

    /**
     * Edit the name of a configuration group.
     * @param block to configure
     */
    def editSTSConfigurationGroupName(@DelegatesTo(EditSTSConfigurationGroupNameCmd) Closure<?> block) {
        runDelegate(new EditSTSConfigurationGroupNameCmd(), block)
    }

    /**
     * Adds the input administrative user to admin-authz.xml.
     * @param block to configure
     */
    def addToAdminAuthz(@DelegatesTo(AddToAdminAuthzCmd) Closure<?> block) {
        runDelegate(new AddToAdminAuthzCmd(), block)
    }

    /**
     * Set server SDK by name or by location
     * @param block to configure
     */
    def setServerSDK(@DelegatesTo(SetServerSDKCmd) Closure<?> block) {
        runDelegate(new SetServerSDKCmd(), block)
    }

    /**
     * creates a server Template based on a server configuration
     * @param block to configure
     */
    def createServerTemplate(@DelegatesTo(CreateServerTemplateCmd) Closure<?> block) {
        runDelegate(new CreateServerTemplateCmd(), block)
    }

    /**
     * Delete the supplied SIB JMS connection factory.
     * @param block to configure
     */
    def deleteSIBJMSConnectionFactory(@DelegatesTo(DeleteSIBJMSConnectionFactoryCmd) Closure<?> block) {
        runDelegate(new DeleteSIBJMSConnectionFactoryCmd(), block)
    }

    /**
     * List all SSL configuration groups.
     * @param block to configure
     */
    def listSSLConfigGroups(@DelegatesTo(ListSSLConfigGroupsCmd) Closure<?> block) {
        runDelegate(new ListSSLConfigGroupsCmd(), block)
    }

    /**
     * Displays a list of ports that is used by a particular server, including the node name, server name, named endpoint, and host and port values.
     * @param block to configure
     */
    def listServerPorts(@DelegatesTo(ListServerPortsCmd) Closure<?> block) {
        runDelegate(new ListServerPortsCmd(), block)
    }

    /**
     * The KRB5 authentication mechanism security object field in the security configuration file is displayed. 
     * @param block to configure
     */
    def listKrbAuthMechanism(@DelegatesTo(ListKrbAuthMechanismCmd) Closure<?> block) {
        runDelegate(new ListKrbAuthMechanismCmd(), block)
    }

    /**
     * Enables audit encryption.
     * @param block to configure
     */
    def enableAuditEncryption(@DelegatesTo(EnableAuditEncryptionCmd) Closure<?> block) {
        runDelegate(new EnableAuditEncryptionCmd(), block)
    }

    /**
     * Returns the configuration of the specified supported entity type.
     * @param block to configure
     */
    def getIdMgrSupportedEntityType(@DelegatesTo(GetIdMgrSupportedEntityTypeCmd) Closure<?> block) {
        runDelegate(new GetIdMgrSupportedEntityTypeCmd(), block)
    }

    /**
     * Check to see if a core group exists.
     * @param block to configure
     */
    def doesCoreGroupExist(@DelegatesTo(DoesCoreGroupExistCmd) Closure<?> block) {
        runDelegate(new DoesCoreGroupExistCmd(), block)
    }

    /**
     * Lists all the WSNTopicNamespace objects in the configuration of the target WSNService that match the specified input parameters.
     * @param block to configure
     */
    def listWSNTopicNamespaces(@DelegatesTo(ListWSNTopicNamespacesCmd) Closure<?> block) {
        runDelegate(new ListWSNTopicNamespacesCmd(), block)
    }

    /**
     * Suspends a previously submitted job.
     * @param block to configure
     */
    def suspendJob(@DelegatesTo(SuspendJobCmd) Closure<?> block) {
        runDelegate(new SuspendJobCmd(), block)
    }

    /**
     * Deletes a group from the default realm.
     * @param block to configure
     */
    def deleteGroup(@DelegatesTo(DeleteGroupCmd) Closure<?> block) {
        runDelegate(new DeleteGroupCmd(), block)
    }

    /**
     * Lists the users in the specified topic space role for the specified topic space.
     * @param block to configure
     */
    def listUsersInTopicSpaceRootRole(@DelegatesTo(ListUsersInTopicSpaceRootRoleCmd) Closure<?> block) {
        runDelegate(new ListUsersInTopicSpaceRootRoleCmd(), block)
    }

    /**
     * List activation specifications on the SIB JMS resource adapter in given scope.
     * @param block to configure
     */
    def listSIBJMSActivationSpecs(@DelegatesTo(ListSIBJMSActivationSpecsCmd) Closure<?> block) {
        runDelegate(new ListSIBJMSActivationSpecsCmd(), block)
    }

    /**
     * modify a job scheduler attribute
     * @param block to configure
     */
    def modifyJobSchedulerAttribute(@DelegatesTo(ModifyJobSchedulerAttributeCmd) Closure<?> block) {
        runDelegate(new ModifyJobSchedulerAttributeCmd(), block)
    }

    /**
     * configureDVIPA.desc
     * @param block to configure
     */
    def configureDVIPA(@DelegatesTo(ConfigureDVIPACmd) Closure<?> block) {
        runDelegate(new ConfigureDVIPACmd(), block)
    }

    /**
     * Creates an entry in the audit.xml to reference the configuration of a Third Party Emitter implementation of the Service Provider interface.
     * @param block to configure
     */
    def createThirdPartyEmitter(@DelegatesTo(CreateThirdPartyEmitterCmd) Closure<?> block) {
        runDelegate(new CreateThirdPartyEmitterCmd(), block)
    }

    /**
     * isAuthCacheEmpty
     * @param block to configure
     */
    def isAuthCacheEmpty(@DelegatesTo(IsAuthCacheEmptyCmd) Closure<?> block) {
        runDelegate(new IsAuthCacheEmptyCmd(), block)
    }

    /**
     * Get the available JMS connection factories
     * @param block to configure
     */
    def getJMSQueueConnectionFactories(@DelegatesTo(GetJMSQueueConnectionFactoriesCmd) Closure<?> block) {
        runDelegate(new GetJMSQueueConnectionFactoriesCmd(), block)
    }

    /**
     * Deletes the configuration of the specified repository.
     * @param block to configure
     */
    def deleteIdMgrRepository(@DelegatesTo(DeleteIdMgrRepositoryCmd) Closure<?> block) {
        runDelegate(new DeleteIdMgrRepositoryCmd(), block)
    }

    /**
     * Returns custom properties of specified repository configuration.
     * @param block to configure
     */
    def listIdMgrCustomProperties(@DelegatesTo(ListIdMgrCustomPropertiesCmd) Closure<?> block) {
        runDelegate(new ListIdMgrCustomPropertiesCmd(), block)
    }

    /**
     * The listPolicySets command returns a list of all existing policy sets.
     * @param block to configure
     */
    def listPolicySets(@DelegatesTo(ListPolicySetsCmd) Closure<?> block) {
        runDelegate(new ListPolicySetsCmd(), block)
    }

    /**
     * This command displays the SPNEGO Web authentication in the security configuration. 
     * @param block to configure
     */
    def showSpnego(@DelegatesTo(ShowSpnegoCmd) Closure<?> block) {
        runDelegate(new ShowSpnegoCmd(), block)
    }

    /**
     * Lists JPA Specification levels supported by this version of WebSphere.
     * @param block to configure
     */
    def listSupportedJPASpecifications(@DelegatesTo(ListSupportedJPASpecificationsCmd) Closure<?> block) {
        runDelegate(new ListSupportedJPASpecificationsCmd(), block)
    }

    /**
     * Delete the supplied SIB JMS queue.
     * @param block to configure
     */
    def deleteSIBJMSQueue(@DelegatesTo(DeleteSIBJMSQueueCmd) Closure<?> block) {
        runDelegate(new DeleteSIBJMSQueueCmd(), block)
    }

    /**
     * List the SIB links.
     * @param block to configure
     */
    def listSIBLinks(@DelegatesTo(ListSIBLinksCmd) Closure<?> block) {
        runDelegate(new ListSIBLinksCmd(), block)
    }

    /**
     * Disable all the transport chains associated with an endpoint on a server. Returns a list of all the disabled transport chains on successful execution of the command.
     * @param block to configure
     */
    def disableServerPort(@DelegatesTo(DisableServerPortCmd) Closure<?> block) {
        runDelegate(new DisableServerPortCmd(), block)
    }

    /**
     * Removes a group from the specified role in the default security space role.
     * @param block to configure
     */
    def removeGroupFromDefaultRole(@DelegatesTo(RemoveGroupFromDefaultRoleCmd) Closure<?> block) {
        runDelegate(new RemoveGroupFromDefaultRoleCmd(), block)
    }

    /**
     * Add a configuration property under a configuration group.
     * @param block to configure
     */
    def addSTSProperty(@DelegatesTo(AddSTSPropertyCmd) Closure<?> block) {
        runDelegate(new AddSTSPropertyCmd(), block)
    }

    /**
     * returns the server type of the specified server.
     * @param block to configure
     */
    def getServerType(@DelegatesTo(GetServerTypeCmd) Closure<?> block) {
        runDelegate(new GetServerTypeCmd(), block)
    }

    /**
     * Return a list containing the SIB JMS queue's attribute names and values.
     * @param block to configure
     */
    def showSIBJMSQueue(@DelegatesTo(ShowSIBJMSQueueCmd) Closure<?> block) {
        runDelegate(new ShowSIBJMSQueueCmd(), block)
    }

    /**
     * Lists all destinations which have roles defined on them.
     * @param block to configure
     */
    def listAllDestinationsWithRoles(@DelegatesTo(ListAllDestinationsWithRolesCmd) Closure<?> block) {
        runDelegate(new ListAllDestinationsWithRolesCmd(), block)
    }

    /**
     * Shows the attributes of the IBM MQ Topic provided to the command.
     * @param block to configure
     */
    def showWMQTopic(@DelegatesTo(ShowWMQTopicCmd) Closure<?> block) {
        runDelegate(new ShowWMQTopicCmd(), block)
    }

    /**
     * Modifies an existing cookie configuration
     * @param block to configure
     */
    def modifyDisabledSessionCookie(@DelegatesTo(ModifyDisabledSessionCookieCmd) Closure<?> block) {
        runDelegate(new ModifyDisabledSessionCookieCmd(), block)
    }

    /**
     * This command configures the embedded Tivoli Access Manager Trust Association Interceptor with classname TAMTrustAsociationInterceptorPlus.
     * @param block to configure
     */
    def configureTAMTAI(@DelegatesTo(ConfigureTAMTAICmd) Closure<?> block) {
        runDelegate(new ConfigureTAMTAICmd(), block)
    }

    /**
     * This command is used to delete a group of targets.
     * @param block to configure
     */
    def deleteTargetGroup(@DelegatesTo(DeleteTargetGroupCmd) Closure<?> block) {
        runDelegate(new DeleteTargetGroupCmd(), block)
    }

    /**
     * Returns the LDAP group configuration parameters.
     * @param block to configure
     */
    def getIdMgrLDAPGroupConfig(@DelegatesTo(GetIdMgrLDAPGroupConfigCmd) Closure<?> block) {
        runDelegate(new GetIdMgrLDAPGroupConfigCmd(), block)
    }

    /**
     * Register the node with an adminagent
     * @param block to configure
     */
    def registerWithAdminAgent(@DelegatesTo(RegisterWithAdminAgentCmd) Closure<?> block) {
        runDelegate(new RegisterWithAdminAgentCmd(), block)
    }

    /**
     * Delete an existing notifier.
     * @param block to configure
     */
    def deleteWSNotifier(@DelegatesTo(DeleteWSNotifierCmd) Closure<?> block) {
        runDelegate(new DeleteWSNotifierCmd(), block)
    }

    /**
     * Configures a JAAS login module entry in the administrative security configuration or in an application security domain.
     * @param block to configure
     */
    def configureJAASLoginEntry(@DelegatesTo(ConfigureJAASLoginEntryCmd) Closure<?> block) {
        runDelegate(new ConfigureJAASLoginEntryCmd(), block)
    }

    /**
     * Delete a WS-Notification service
     * @param block to configure
     */
    def deleteWSNService(@DelegatesTo(DeleteWSNServiceCmd) Closure<?> block) {
        runDelegate(new DeleteWSNServiceCmd(), block)
    }

    /**
     * Deletes a previously submitted job.
     * @param block to configure
     */
    def deleteJob(@DelegatesTo(DeleteJobCmd) Closure<?> block) {
        runDelegate(new DeleteJobCmd(), block)
    }

    /**
     * Delete given SIB JMS activation specification.
     * @param block to configure
     */
    def deleteSIBJMSActivationSpec(@DelegatesTo(DeleteSIBJMSActivationSpecCmd) Closure<?> block) {
        runDelegate(new DeleteSIBJMSActivationSpecCmd(), block)
    }

    /**
     * Create a Key Set.
     * @param block to configure
     */
    def createKeySet(@DelegatesTo(CreateKeySetCmd) Closure<?> block) {
        runDelegate(new CreateKeySetCmd(), block)
    }

    /**
     * Shows the information about a bundle in the internal bundle repository.
     * @param block to configure
     */
    def showLocalRepositoryBundle(@DelegatesTo(ShowLocalRepositoryBundleCmd) Closure<?> block) {
        runDelegate(new ShowLocalRepositoryBundleCmd(), block)
    }

    /**
     * Remove a user's permission to connect to the specified bus.
     * @param block to configure
     */
    def removeUserFromBusConnectorRole(@DelegatesTo(RemoveUserFromBusConnectorRoleCmd) Closure<?> block) {
        runDelegate(new RemoveUserFromBusConnectorRoleCmd(), block)
    }

    /**
     * List the JDBC providers that are contained in the specified scope.
     * @param block to configure
     */
    def listJDBCProviders(@DelegatesTo(ListJDBCProvidersCmd) Closure<?> block) {
        runDelegate(new ListJDBCProvidersCmd(), block)
    }

    /**
     * Get information about a notifier.
     * @param block to configure
     */
    def getWSNotifier(@DelegatesTo(GetWSNotifierCmd) Closure<?> block) {
        runDelegate(new GetWSNotifierCmd(), block)
    }

    /**
     * Set the JVM mode to either 64-bit or 31-bit for a release prior to V9. Starting from V9, only 64-bit is supported.
     * @param block to configure
     */
    def setJVMMode(@DelegatesTo(SetJVMModeCmd) Closure<?> block) {
        runDelegate(new SetJVMModeCmd(), block)
    }

    /**
     * This command is used to delete members from a target group.
     * @param block to configure
     */
    def deleteMemberFromTargetGroup(@DelegatesTo(DeleteMemberFromTargetGroupCmd) Closure<?> block) {
        runDelegate(new DeleteMemberFromTargetGroupCmd(), block)
    }

    /**
     * Create a core group policy for a messaging engine configured for server cluster bus member with messaging engine policy assistance enabled for the "Custom" policy.
     * @param block to configure
     */
    def createMissingSIBEnginePolicy(@DelegatesTo(CreateMissingSIBEnginePolicyCmd) Closure<?> block) {
        runDelegate(new CreateMissingSIBEnginePolicyCmd(), block)
    }

    /**
     * Shows the current extensions attached to the composition unit.
     * @param block to configure
     */
    def listOSGiExtensions(@DelegatesTo(ListOSGiExtensionsCmd) Closure<?> block) {
        runDelegate(new ListOSGiExtensionsCmd(), block)
    }

    /**
     * Export a certificate to another KeyStore.
     * @param block to configure
     */
    def exportAuditCertificate(@DelegatesTo(ExportAuditCertificateCmd) Closure<?> block) {
        runDelegate(new ExportAuditCertificateCmd(), block)
    }

    /**
     * Deletes the property data from the property extension repository. It also deletes any entity IDs with which there is no property data associated, from the property extension repository in virtual member manager.
     * @param block to configure
     */
    def deleteIdMgrPropertyExtensionEntityData(@DelegatesTo(DeleteIdMgrPropertyExtensionEntityDataCmd) Closure<?> block) {
        runDelegate(new DeleteIdMgrPropertyExtensionEntityDataCmd(), block)
    }

    /**
     * Change the name of the cell.  This command can only run in local mode i.e.with wsadmin conntype NONE.1. Backing up your node configuration with the backupConfig tool fromprofile_root/bin directory is recommended before you change the cell name forthat node using the renameCell command.  If you are not satisfied with theresults of the renameCell command and if the renameCell command executionfailed unexpectedly, you use the restoreConfig tool to restore your backupconfiguration.2. Back up profile_root/bin/setupCmdLine script file. The command updates thecell name in this file with the new cell name as well, but is unable to changeit back if a user decides to discard the configuration change resulting fromthis command execution. If you decide to do so, you will need to restore thefile after you discard the configuration change; otherwise, you won't be ableto start a server in this profile. 
     * @param block to configure
     */
    def renameCell(@DelegatesTo(RenameCellCmd) Closure<?> block) {
        runDelegate(new RenameCellCmd(), block)
    }

    /**
     * Create a SIB JMS queue at the scope identified by the target object.
     * @param block to configure
     */
    def createSIBJMSQueue(@DelegatesTo(CreateSIBJMSQueueCmd) Closure<?> block) {
        runDelegate(new CreateSIBJMSQueueCmd(), block)
    }

    /**
     * null
     * @param block to configure
     */
    def getMWSInstallFile(@DelegatesTo(GetMWSInstallFileCmd) Closure<?> block) {
        runDelegate(new GetMWSInstallFileCmd(), block)
    }

    /**
     * Gives a group permission to access the topic space for the specified role.
     * @param block to configure
     */
    def addGroupToTopicSpaceRootRole(@DelegatesTo(AddGroupToTopicSpaceRootRoleCmd) Closure<?> block) {
        runDelegate(new AddGroupToTopicSpaceRootRoleCmd(), block)
    }

    /**
     * List all login modules for a JAAS login entry.
     * @param block to configure
     */
    def listLoginModules(@DelegatesTo(ListLoginModulesCmd) Closure<?> block) {
        runDelegate(new ListLoginModulesCmd(), block)
    }

    /**
     * Modifies the audit record encryption configuration.
     * @param block to configure
     */
    def modifyAuditEncryptionConfig(@DelegatesTo(ModifyAuditEncryptionConfigCmd) Closure<?> block) {
        runDelegate(new ModifyAuditEncryptionConfigCmd(), block)
    }

    /**
     * The importBinding command imports a binding from a compressed archive onto a server environment.
     * @param block to configure
     */
    def importBinding(@DelegatesTo(ImportBindingCmd) Closure<?> block) {
        runDelegate(new ImportBindingCmd(), block)
    }

    /**
     * Modifies the properties of the IBM MQ Topic provided to the command.
     * @param block to configure
     */
    def modifyWMQTopic(@DelegatesTo(ModifyWMQTopicCmd) Closure<?> block) {
        runDelegate(new ModifyWMQTopicCmd(), block)
    }

    /**
     * Lists all the NamedEndPoints endpoints that can be associated with a UDPInboundChannel
     * @param block to configure
     */
    def listUDPEndPoints(@DelegatesTo(ListUDPEndPointsCmd) Closure<?> block) {
        runDelegate(new ListUDPEndPointsCmd(), block)
    }

    /**
     * Replace a Certificate with a different certificate.
     * @param block to configure
     */
    def replaceCertificate(@DelegatesTo(ReplaceCertificateCmd) Closure<?> block) {
        runDelegate(new ReplaceCertificateCmd(), block)
    }

    /**
     * Configure a custom user registry in the administrative security configuration
     * @param block to configure
     */
    def configureAdminCustomUserRegistry(@DelegatesTo(ConfigureAdminCustomUserRegistryCmd) Closure<?> block) {
        runDelegate(new ConfigureAdminCustomUserRegistryCmd(), block)
    }

    /**
     * A command that displays all the Metadata about a given template.
     * @param block to configure
     */
    def showTemplateInfo(@DelegatesTo(ShowTemplateInfoCmd) Closure<?> block) {
        runDelegate(new ShowTemplateInfoCmd(), block)
    }

    /**
     * Import the deployment manifest into the EBA asset. If the deployment manifest is resolved successfully, it will replace the existing deployment manifest in the asset.
     * @param block to configure
     */
    def importDeploymentManifest(@DelegatesTo(ImportDeploymentManifestCmd) Closure<?> block) {
        runDelegate(new ImportDeploymentManifestCmd(), block)
    }

    /**
     * Modifies the audit record signing configuration.
     * @param block to configure
     */
    def modifyAuditSigningConfig(@DelegatesTo(ModifyAuditSigningConfigCmd) Closure<?> block) {
        runDelegate(new ModifyAuditSigningConfigCmd(), block)
    }

    /**
     * Retrieves the attributes of a group.
     * @param block to configure
     */
    def getGroup(@DelegatesTo(GetGroupCmd) Closure<?> block) {
        runDelegate(new GetGroupCmd(), block)
    }

    /**
     * Modify a mediation.
     * @param block to configure
     */
    def modifySIBMediation(@DelegatesTo(ModifySIBMediationCmd) Closure<?> block) {
        runDelegate(new ModifySIBMediationCmd(), block)
    }

    /**
     * Show the attributes of a mediation.
     * @param block to configure
     */
    def showSIBMediation(@DelegatesTo(ShowSIBMediationCmd) Closure<?> block) {
        runDelegate(new ShowSIBMediationCmd(), block)
    }

    /**
     * Set Java virtual machine (JVM) Maximum Heap Size
     * @param block to configure
     */
    def setJVMMaxHeapSize(@DelegatesTo(SetJVMMaxHeapSizeCmd) Closure<?> block) {
        runDelegate(new SetJVMMaxHeapSizeCmd(), block)
    }

    /**
     * Set Java virtual machine (JVM) Generic JVM Arguments Size
     * @param block to configure
     */
    def setGenericJVMArguments(@DelegatesTo(SetGenericJVMArgumentsCmd) Closure<?> block) {
        runDelegate(new SetGenericJVMArgumentsCmd(), block)
    }

    /**
     * Returns a string containing all of the property values and step inputs for the updateRAR command.
     * @param block to configure
     */
    def getNewRAObjectProperties(@DelegatesTo(GetNewRAObjectPropertiesCmd) Closure<?> block) {
        runDelegate(new GetNewRAObjectPropertiesCmd(), block)
    }

    /**
     * Remove realms from the trusted realm list
     * @param block to configure
     */
    def removeTrustedRealms(@DelegatesTo(RemoveTrustedRealmsCmd) Closure<?> block) {
        runDelegate(new RemoveTrustedRealmsCmd(), block)
    }

    /**
     * Get connector properties for the managed node
     * @param block to configure
     */
    def getManagedNodeConnectorProperties(@DelegatesTo(GetManagedNodeConnectorPropertiesCmd) Closure<?> block) {
        runDelegate(new GetManagedNodeConnectorPropertiesCmd(), block)
    }

    /**
     * Creates a IBM MQ Activation Specification at the scope provided to the command.
     * @param block to configure
     */
    def createWMQActivationSpec(@DelegatesTo(CreateWMQActivationSpecCmd) Closure<?> block) {
        runDelegate(new CreateWMQActivationSpecCmd(), block)
    }

    /**
     * Modify an existing WebSphere MQ link.
     * @param block to configure
     */
    def modifySIBMQLink(@DelegatesTo(ModifySIBMQLinkCmd) Closure<?> block) {
        runDelegate(new ModifySIBMQLinkCmd(), block)
    }

    /**
     * Disable provisioning on a server. All components will be started.
     * @param block to configure
     */
    def disableProvisioning(@DelegatesTo(DisableProvisioningCmd) Closure<?> block) {
        runDelegate(new DisableProvisioningCmd(), block)
    }

    /**
     * Get SSL Configuration Properties
     * @param block to configure
     */
    def getSSLConfigProperties(@DelegatesTo(GetSSLConfigPropertiesCmd) Closure<?> block) {
        runDelegate(new GetSSLConfigPropertiesCmd(), block)
    }

    /**
     * Create a key set group.
     * @param block to configure
     */
    def createKeySetGroup(@DelegatesTo(CreateKeySetGroupCmd) Closure<?> block) {
        runDelegate(new CreateKeySetGroupCmd(), block)
    }

    /**
     * Deletes a member from an application server cluster.
     * @param block to configure
     */
    def deleteClusterMember(@DelegatesTo(DeleteClusterMemberCmd) Closure<?> block) {
        runDelegate(new DeleteClusterMemberCmd(), block)
    }

    /**
     * Create an authentication data entry in the administrative security configuration or a in a security domain.
     * @param block to configure
     */
    def createAuthDataEntry(@DelegatesTo(CreateAuthDataEntryCmd) Closure<?> block) {
        runDelegate(new CreateAuthDataEntryCmd(), block)
    }

    /**
     * The KRB5 authentication mechanism security object field in the security configuration file is modified based on the user input.
     * @param block to configure
     */
    def modifyKrbAuthMechanism(@DelegatesTo(ModifyKrbAuthMechanismCmd) Closure<?> block) {
        runDelegate(new ModifyKrbAuthMechanismCmd(), block)
    }

    /**
     * null
     * @param block to configure
     */
    def getMWSLogFile(@DelegatesTo(GetMWSLogFileCmd) Closure<?> block) {
        runDelegate(new GetMWSLogFileCmd(), block)
    }

    /**
     * Modify configuration data for a given authentication provider.
     * @param block to configure
     */
    def modifyJaspiProvider(@DelegatesTo(ModifyJaspiProviderCmd) Closure<?> block) {
        runDelegate(new ModifyJaspiProviderCmd(), block)
    }

    /**
     * Delete a personal certificate from a keystore.
     * @param block to configure
     */
    def deleteCertificate(@DelegatesTo(DeleteCertificateCmd) Closure<?> block) {
        runDelegate(new DeleteCertificateCmd(), block)
    }

    /**
     * Deletes a domain object.
     * @param block to configure
     */
    def deleteSecurityDomain(@DelegatesTo(DeleteSecurityDomainCmd) Closure<?> block) {
        runDelegate(new DeleteSecurityDomainCmd(), block)
    }

    /**
     * Creates a file repository configuration.
     * @param block to configure
     */
    def createIdMgrFileRepository(@DelegatesTo(CreateIdMgrFileRepositoryCmd) Closure<?> block) {
        runDelegate(new CreateIdMgrFileRepositoryCmd(), block)
    }

    /**
     * Queries a certificate authority (CA) to see if a certificate is complete.
     * @param block to configure
     */
    def queryCACertificate(@DelegatesTo(QueryCACertificateCmd) Closure<?> block) {
        runDelegate(new QueryCACertificateCmd(), block)
    }

    /**
     * Unregister a host from the job manager.
     * @param block to configure
     */
    def unregisterHost(@DelegatesTo(UnregisterHostCmd) Closure<?> block) {
        runDelegate(new UnregisterHostCmd(), block)
    }

    /**
     * Creates a security domain by copy the global administrative security configuration.
     * @param block to configure
     */
    def copySecurityDomainFromGlobalSecurity(@DelegatesTo(CopySecurityDomainFromGlobalSecurityCmd) Closure<?> block) {
        runDelegate(new CopySecurityDomainFromGlobalSecurityCmd(), block)
    }

    /**
     * This command adds the custom properties to the security configuration for the embedded Tivoli Access Manager Trust Association Interceptor with classname TAMTrustAsociationInterceptorPlus.
     * @param block to configure
     */
    def configureTAMTAIProperties(@DelegatesTo(ConfigureTAMTAIPropertiesCmd) Closure<?> block) {
        runDelegate(new ConfigureTAMTAIPropertiesCmd(), block)
    }

    /**
     * Query the STS for the default token type.
     * @param block to configure
     */
    def querySTSDefaultTokenType(@DelegatesTo(QuerySTSDefaultTokenTypeCmd) Closure<?> block) {
        runDelegate(new QuerySTSDefaultTokenTypeCmd(), block)
    }

    /**
     * add a custom property for job scheduler
     * @param block to configure
     */
    def createJobSchedulerProperty(@DelegatesTo(CreateJobSchedulerPropertyCmd) Closure<?> block) {
        runDelegate(new CreateJobSchedulerPropertyCmd(), block)
    }

    /**
     * Deletes the virtual member manager instance cached class loaded for the domain passed.
     * @param block to configure
     */
    def deleteWIMSecurityDomainCache(@DelegatesTo(DeleteWIMSecurityDomainCacheCmd) Closure<?> block) {
        runDelegate(new DeleteWIMSecurityDomainCacheCmd(), block)
    }

    /**
     * isUserInAuthCache
     * @param block to configure
     */
    def isUserInAuthCache(@DelegatesTo(IsUserInAuthCacheCmd) Closure<?> block) {
        runDelegate(new IsUserInAuthCacheCmd(), block)
    }

    /**
     * Returns the object of the supplied event factory.
     * @param block to configure
     */
    def getAuditEventFactory(@DelegatesTo(GetAuditEventFactoryCmd) Closure<?> block) {
        runDelegate(new GetAuditEventFactoryCmd(), block)
    }

    /**
     * Gets the auditor identity defined in the audit.xml file.
     * @param block to configure
     */
    def getAuditorId(@DelegatesTo(GetAuditorIdCmd) Closure<?> block) {
        runDelegate(new GetAuditorIdCmd(), block)
    }

    /**
     * Use the "attachServiceMap" command to attach a service map to a local mapping service.
     * @param block to configure
     */
    def attachServiceMap(@DelegatesTo(AttachServiceMapCmd) Closure<?> block) {
        runDelegate(new AttachServiceMapCmd(), block)
    }

    /**
     * List all JobManagers which a given managed node is registered with
     * @param block to configure
     */
    def listJobManagers(@DelegatesTo(ListJobManagersCmd) Closure<?> block) {
        runDelegate(new ListJobManagersCmd(), block)
    }

    /**
     * Remove a configuration property under a configuration group.
     * @param block to configure
     */
    def deleteSTSProperty(@DelegatesTo(DeleteSTSPropertyCmd) Closure<?> block) {
        runDelegate(new DeleteSTSPropertyCmd(), block)
    }

    /**
     * List the endpoints currently configured with trust authentication rules.
     * @param block to configure
     */
    def listSTSTrustAuthenticationConfiguredEndpoints(@DelegatesTo(ListSTSTrustAuthenticationConfiguredEndpointsCmd) Closure<?> block) {
        runDelegate(new ListSTSTrustAuthenticationConfiguredEndpointsCmd(), block)
    }

    /**
     * Returns the file size of the Binary audit log.
     * @param block to configure
     */
    def getBinaryFileSize(@DelegatesTo(GetBinaryFileSizeCmd) Closure<?> block) {
        runDelegate(new GetBinaryFileSizeCmd(), block)
    }

    /**
     * List trusted realms trusted by a security realm, resource, or security domain.
     * @param block to configure
     */
    def listTrustedRealms(@DelegatesTo(ListTrustedRealmsCmd) Closure<?> block) {
        runDelegate(new ListTrustedRealmsCmd(), block)
    }

    /**
     * Enable provisioning on a server. Some components will be started as they are needed.
     * @param block to configure
     */
    def enableProvisioning(@DelegatesTo(EnableProvisioningCmd) Closure<?> block) {
        runDelegate(new EnableProvisioningCmd(), block)
    }

    /**
     * Removes the external JAAC authorization provider
     * @param block to configure
     */
    def unconfigureAuthzConfig(@DelegatesTo(UnconfigureAuthzConfigCmd) Closure<?> block) {
        runDelegate(new UnconfigureAuthzConfigCmd(), block)
    }

    /**
     * Modify a named WebSphere MQ server bus member.
     * @param block to configure
     */
    def modifySIBWMQServerBusMember(@DelegatesTo(ModifySIBWMQServerBusMemberCmd) Closure<?> block) {
        runDelegate(new ModifySIBWMQServerBusMemberCmd(), block)
    }

    /**
     * Get information about a key set.
     * @param block to configure
     */
    def getKeySet(@DelegatesTo(GetKeySetCmd) Closure<?> block) {
        runDelegate(new GetKeySetCmd(), block)
    }

    /**
     * Set the JNDI name that is bound to java:comp/DefaultManagedExecutorService.
     * @param block to configure
     */
    def setDefaultManagedExecutor(@DelegatesTo(SetDefaultManagedExecutorCmd) Closure<?> block) {
        runDelegate(new SetDefaultManagedExecutorCmd(), block)
    }

    /**
     * Use the "inspectServiceMapLibrary" command to display details about the service maps within a service map library.
     * @param block to configure
     */
    def inspectServiceMapLibrary(@DelegatesTo(InspectServiceMapLibraryCmd) Closure<?> block) {
        runDelegate(new InspectServiceMapLibraryCmd(), block)
    }

    /**
     * The setPolicyTypeAttribute command sets an attribute for a specific policy.
     * @param block to configure
     */
    def setPolicyTypeAttribute(@DelegatesTo(SetPolicyTypeAttributeCmd) Closure<?> block) {
        runDelegate(new SetPolicyTypeAttributeCmd(), block)
    }

    /**
     * Import a Certificate from another keyStore to this KeyStore.
     * @param block to configure
     */
    def importAuditCertificate(@DelegatesTo(ImportAuditCertificateCmd) Closure<?> block) {
        runDelegate(new ImportAuditCertificateCmd(), block)
    }

    /**
     * copy the specified J2C resource adapter to the specified scope.
     * @param block to configure
     */
    def copyResourceAdapter(@DelegatesTo(CopyResourceAdapterCmd) Closure<?> block) {
        runDelegate(new CopyResourceAdapterCmd(), block)
    }

    /**
     * Use the "detachServiceMap" command to detach a service map from a local mapping service.
     * @param block to configure
     */
    def detachServiceMap(@DelegatesTo(DetachServiceMapCmd) Closure<?> block) {
        runDelegate(new DetachServiceMapCmd(), block)
    }

    /**
     * Creates and populates tables for entry mapping database in virtual member manager.
     * @param block to configure
     */
    def setupIdMgrEntryMappingRepositoryTables(@DelegatesTo(SetupIdMgrEntryMappingRepositoryTablesCmd) Closure<?> block) {
        runDelegate(new SetupIdMgrEntryMappingRepositoryTablesCmd(), block)
    }

    /**
     * Returns LDAP context pool configuration.
     * @param block to configure
     */
    def getIdMgrLDAPContextPool(@DelegatesTo(GetIdMgrLDAPContextPoolCmd) Closure<?> block) {
        runDelegate(new GetIdMgrLDAPContextPoolCmd(), block)
    }

    /**
     * Create a bus.
     * @param block to configure
     */
    def createSIBus(@DelegatesTo(CreateSIBusCmd) Closure<?> block) {
        runDelegate(new CreateSIBusCmd(), block)
    }

    /**
     * Returns the minor version for a node, for example, "0.0.0" for v6.0.0.0.
     * @param block to configure
     */
    def getNodeMinorVersion(@DelegatesTo(GetNodeMinorVersionCmd) Closure<?> block) {
        runDelegate(new GetNodeMinorVersionCmd(), block)
    }

    /**
     * This command performs the tasks necessary to fully configure the Tivoli Access Manager Runtime for Java. The specific tasks run are PDJrteCfg and SvrSslCfg.
     * @param block to configure
     */
    def configureTAMTAIPdjrte(@DelegatesTo(ConfigureTAMTAIPdjrteCmd) Closure<?> block) {
        runDelegate(new ConfigureTAMTAIPdjrteCmd(), block)
    }

    /**
     * Use the "stopLMService" command to stop a started local mapping service.
     * @param block to configure
     */
    def stopLMService(@DelegatesTo(StopLMServiceCmd) Closure<?> block) {
        runDelegate(new StopLMServiceCmd(), block)
    }

    /**
     * Get the available JMS connection factories
     * @param block to configure
     */
    def getJMSActivationSpecs(@DelegatesTo(GetJMSActivationSpecsCmd) Closure<?> block) {
        runDelegate(new GetJMSActivationSpecsCmd(), block)
    }

    /**
     * Create a J2C activation specification.
     * @param block to configure
     */
    def createJ2CActivationSpec(@DelegatesTo(CreateJ2CActivationSpecCmd) Closure<?> block) {
        runDelegate(new CreateJ2CActivationSpecCmd(), block)
    }

    /**
     * Disables the Audit Specification.
     * @param block to configure
     */
    def disableAuditFilter(@DelegatesTo(DisableAuditFilterCmd) Closure<?> block) {
        runDelegate(new DisableAuditFilterCmd(), block)
    }

    /**
     * Get the authorization groups of a given Resource.
     * @param block to configure
     */
    def listAuthorizationGroupsOfResource(@DelegatesTo(ListAuthorizationGroupsOfResourceCmd) Closure<?> block) {
        runDelegate(new ListAuthorizationGroupsOfResourceCmd(), block)
    }

    /**
     * Returns information about the single signon settings for global security.
     * @param block to configure
     */
    def getSingleSignon(@DelegatesTo(GetSingleSignonCmd) Closure<?> block) {
        runDelegate(new GetSingleSignonCmd(), block)
    }

    /**
     * Adds an account to the file registry.
     * @param block to configure
     */
    def addFileRegistryAccount(@DelegatesTo(AddFileRegistryAccountCmd) Closure<?> block) {
        runDelegate(new AddFileRegistryAccountCmd(), block)
    }

    /**
     * List Inherit Sender For topic (deprecated - use isInheritSenderForTopic instead)
     * @param block to configure
     */
    def listInheritSenderForTopic(@DelegatesTo(ListInheritSenderForTopicCmd) Closure<?> block) {
        runDelegate(new ListInheritSenderForTopicCmd(), block)
    }

    /**
     * Sets up a backup LDAP server.
     * @param block to configure
     */
    def addIdMgrLDAPBackupServer(@DelegatesTo(AddIdMgrLDAPBackupServerCmd) Closure<?> block) {
        runDelegate(new AddIdMgrLDAPBackupServerCmd(), block)
    }

    /**
     * List all SIB JMS topics at the specified scope.
     * @param block to configure
     */
    def listSIBJMSTopics(@DelegatesTo(ListSIBJMSTopicsCmd) Closure<?> block) {
        runDelegate(new ListSIBJMSTopicsCmd(), block)
    }

    /**
     * Set the default token type for the STS.
     * @param block to configure
     */
    def setSTSDefaultTokenType(@DelegatesTo(SetSTSDefaultTokenTypeCmd) Closure<?> block) {
        runDelegate(new SetSTSDefaultTokenTypeCmd(), block)
    }

    /**
     * Sends a request to a certificate authority to create a certificate authority (CA) personal certificate.
     * @param block to configure
     */
    def requestCACertificate(@DelegatesTo(RequestCACertificateCmd) Closure<?> block) {
        runDelegate(new RequestCACertificateCmd(), block)
    }

    /**
     * Use the "listServiceMaps" command to list the installed service maps.
     * @param block to configure
     */
    def listServiceMaps(@DelegatesTo(ListServiceMapsCmd) Closure<?> block) {
        runDelegate(new ListServiceMapsCmd(), block)
    }

    /**
     * Enables Security Auditing and sets the auditEnabled field in audit.xml.
     * @param block to configure
     */
    def enableAudit(@DelegatesTo(EnableAuditCmd) Closure<?> block) {
        runDelegate(new EnableAuditCmd(), block)
    }

    /**
     * This command modifies SPNEGO Web authentication Filter attributes in the security configuration.
     * @param block to configure
     */
    def modifySpnegoFilter(@DelegatesTo(ModifySpnegoFilterCmd) Closure<?> block) {
        runDelegate(new ModifySpnegoFilterCmd(), block)
    }

    /**
     * Deletes a PersonAccount from the default realm.
     * @param block to configure
     */
    def deleteUser(@DelegatesTo(DeleteUserCmd) Closure<?> block) {
        runDelegate(new DeleteUserCmd(), block)
    }

    /**
     * Delete the Custom property
     * @param block to configure
     */
    def deleteSCClientCacheConfigurationCustomProperties(@DelegatesTo(DeleteSCClientCacheConfigurationCustomPropertiesCmd) Closure<?> block) {
        runDelegate(new DeleteSCClientCacheConfigurationCustomPropertiesCmd(), block)
    }

    /**
     * Create a trust Manager.
     * @param block to configure
     */
    def createTrustManager(@DelegatesTo(CreateTrustManagerCmd) Closure<?> block) {
        runDelegate(new CreateTrustManagerCmd(), block)
    }

    /**
     * Get the available JMS connection factories
     * @param block to configure
     */
    def deleteJMSObject(@DelegatesTo(DeleteJMSObjectCmd) Closure<?> block) {
        runDelegate(new DeleteJMSObjectCmd(), block)
    }

    /**
     * Returns a Boolean indicating if the event has at least one audit outcome for which it has been enabled.
     * @param block to configure
     */
    def isEventEnabled(@DelegatesTo(IsEventEnabledCmd) Closure<?> block) {
        runDelegate(new IsEventEnabledCmd(), block)
    }

    /**
     * The addToPolicySetAttachment command adds additional resources that apply to a policy set attachment.
     * @param block to configure
     */
    def addToPolicySetAttachment(@DelegatesTo(AddToPolicySetAttachmentCmd) Closure<?> block) {
        runDelegate(new AddToPolicySetAttachmentCmd(), block)
    }

    /**
     * Removes a users permission to access the topic space for the specified role.
     * @param block to configure
     */
    def removeUserFromTopicSpaceRootRole(@DelegatesTo(RemoveUserFromTopicSpaceRootRoleCmd) Closure<?> block) {
        runDelegate(new RemoveUserFromTopicSpaceRootRoleCmd(), block)
    }

    /**
     * Compare an existing Resource Adapter to a RAR file and determine whether the RAR is compatible for updating the Resource Adapter.
     * @param block to configure
     */
    def compareResourceAdapterToRAR(@DelegatesTo(CompareResourceAdapterToRARCmd) Closure<?> block) {
        runDelegate(new CompareResourceAdapterToRARCmd(), block)
    }

    /**
     * Returns the enabled state of the audit notification policy.
     * @param block to configure
     */
    def isAuditNotificationEnabled(@DelegatesTo(IsAuditNotificationEnabledCmd) Closure<?> block) {
        runDelegate(new IsAuditNotificationEnabledCmd(), block)
    }

    /**
     * Delete a trust manager.
     * @param block to configure
     */
    def deleteTrustManager(@DelegatesTo(DeleteTrustManagerCmd) Closure<?> block) {
        runDelegate(new DeleteTrustManagerCmd(), block)
    }

    /**
     * Imports Lightweight Third Party Authentication keys into the configuration.
     * @param block to configure
     */
    def importLTPAKeys(@DelegatesTo(ImportLTPAKeysCmd) Closure<?> block) {
        runDelegate(new ImportLTPAKeysCmd(), block)
    }

    /**
     * Create a Servlet Cache Instance.  A servlet cache instance is a location where the dynamic cache can store, distribute, and share data.
     * @param block to configure
     */
    def createServletCacheInstance(@DelegatesTo(CreateServletCacheInstanceCmd) Closure<?> block) {
        runDelegate(new CreateServletCacheInstanceCmd(), block)
    }

    /**
     * Determination of enablement state of an Audit Specification.
     * @param block to configure
     */
    def isAuditFilterEnabled(@DelegatesTo(IsAuditFilterEnabledCmd) Closure<?> block) {
        runDelegate(new IsAuditFilterEnabledCmd(), block)
    }

    /**
     * Update an existing resource adapter with the supplied RAR file and configure any new properties that exist on deployed objects within the resource adapter to be updated.
Before using the updateRAR command, use the compareResourceAdapterToRAR command to verify the RAR is compatible for upgrading the resource adapter, and use the findOtherRAsToUpdate command to determine the set of resources adapters that need be updated using the supplied RAR.
     * @param block to configure
     */
    def updateRAR(@DelegatesTo(UpdateRARCmd) Closure<?> block) {
        runDelegate(new UpdateRARCmd(), block)
    }

    /**
     * Create a management scope.
     * @param block to configure
     */
    def createManagementScope(@DelegatesTo(CreateManagementScopeCmd) Closure<?> block) {
        runDelegate(new CreateManagementScopeCmd(), block)
    }

    /**
     * Create a SIB foreign bus.
     * @param block to configure
     */
    def createSIBForeignBus(@DelegatesTo(CreateSIBForeignBusCmd) Closure<?> block) {
        runDelegate(new CreateSIBForeignBusCmd(), block)
    }

    /**
     * Create a J2C connection factory
     * @param block to configure
     */
    def createJ2CConnectionFactory(@DelegatesTo(CreateJ2CConnectionFactoryCmd) Closure<?> block) {
        runDelegate(new CreateJ2CConnectionFactoryCmd(), block)
    }

    /**
     * The importPolicySet command imports a policy set from a compressed archive onto a server environment.
     * @param block to configure
     */
    def importPolicySet(@DelegatesTo(ImportPolicySetCmd) Closure<?> block) {
        runDelegate(new ImportPolicySetCmd(), block)
    }

    /**
     * Get the groups in which a PersonAccount is a member.
     * @param block to configure
     */
    def getMembershipOfUser(@DelegatesTo(GetMembershipOfUserCmd) Closure<?> block) {
        runDelegate(new GetMembershipOfUserCmd(), block)
    }

    /**
     * Deletes the specified realm configuration.
     * @param block to configure
     */
    def deleteIdMgrRealm(@DelegatesTo(DeleteIdMgrRealmCmd) Closure<?> block) {
        runDelegate(new DeleteIdMgrRealmCmd(), block)
    }

    /**
     * Converts certificates used by SSL configuration and plugins so that they comply with specified FIPS level.  Also lists certificates that cannot be converted by WebSphere. 
     * @param block to configure
     */
    def convertCertForSecurityStandard(@DelegatesTo(ConvertCertForSecurityStandardCmd) Closure<?> block) {
        runDelegate(new ConvertCertForSecurityStandardCmd(), block)
    }

    /**
     * Sets the option to send an audit notification email.
     * @param block to configure
     */
    def setSendEmail(@DelegatesTo(SetSendEmailCmd) Closure<?> block) {
        runDelegate(new SetSendEmailCmd(), block)
    }

    /**
     * Sets the user registry user or group attribute mapping for a realm. 
     * @param block to configure
     */
    def setIdMgrRealmURAttrMapping(@DelegatesTo(SetIdMgrRealmURAttrMappingCmd) Closure<?> block) {
        runDelegate(new SetIdMgrRealmURAttrMappingCmd(), block)
    }

    /**
     * Query whether a managed node is periodically polling a JobManager
     * @param block to configure
     */
    def isPollingJobManager(@DelegatesTo(IsPollingJobManagerCmd) Closure<?> block) {
        runDelegate(new IsPollingJobManagerCmd(), block)
    }

    /**
     * Use the "disableLMServiceEventPoint" command to disable a local mapping service event point, in order to stop generation of service mapping events.
     * @param block to configure
     */
    def disableLMServiceEventPoint(@DelegatesTo(DisableLMServiceEventPointCmd) Closure<?> block) {
        runDelegate(new DisableLMServiceEventPointCmd(), block)
    }

    /**
     * Get the JNDI name that is bound to java:comp/DefaultDataSource.
     * @param block to configure
     */
    def getDefaultDataSource(@DelegatesTo(GetDefaultDataSourceCmd) Closure<?> block) {
        runDelegate(new GetDefaultDataSourceCmd(), block)
    }

    /**
     * The updatePolicySet command enables you to input an attribute list to update the policy set. You can use this command to update all attributes for the policy set, or a subset of attributes.
     * @param block to configure
     */
    def updatePolicySet(@DelegatesTo(UpdatePolicySetCmd) Closure<?> block) {
        runDelegate(new UpdatePolicySetCmd(), block)
    }

    /**
     * cleanupNodeDesc
     * @param block to configure
     */
    def cleanupNode(@DelegatesTo(CleanupNodeCmd) Closure<?> block) {
        runDelegate(new CleanupNodeCmd(), block)
    }

    /**
     * Modifies a certificate authority (CA) client configurator object.
     * @param block to configure
     */
    def modifyCAClient(@DelegatesTo(ModifyCAClientCmd) Closure<?> block) {
        runDelegate(new ModifyCAClientCmd(), block)
    }

    /**
     * Create a messaging engine.
     * @param block to configure
     */
    def createSIBEngine(@DelegatesTo(CreateSIBEngineCmd) Closure<?> block) {
        runDelegate(new CreateSIBEngineCmd(), block)
    }

    /**
     * This command sets the value of a specified property defined on a resource provider such as JDBCProvider or a connection factory such as DataSource or JMSConnectionFactory. If the property with specified key is defined already, then this command overrides the value. If none property with specified key is defined yet, then this command will add the property with specified key and value.
     * @param block to configure
     */
    def setResourceProperty(@DelegatesTo(SetResourcePropertyCmd) Closure<?> block) {
        runDelegate(new SetResourcePropertyCmd(), block)
    }

    /**
     * Query the STS for the values of the custom properties for a given token type.
     * @param block to configure
     */
    def querySTSTokenTypeConfigurationCustomProperties(@DelegatesTo(QuerySTSTokenTypeConfigurationCustomPropertiesCmd) Closure<?> block) {
        runDelegate(new QuerySTSTokenTypeConfigurationCustomPropertiesCmd(), block)
    }

    /**
     * Create a CMS KeyStore with password stash file.
     * @param block to configure
     */
    def createCMSKeyStore(@DelegatesTo(CreateCMSKeyStoreCmd) Closure<?> block) {
        runDelegate(new CreateCMSKeyStoreCmd(), block)
    }

    /**
     * Create a policy that activates group members on all of the servers in the list.
     * @param block to configure
     */
    def createStaticPolicy(@DelegatesTo(CreateStaticPolicyCmd) Closure<?> block) {
        runDelegate(new CreateStaticPolicyCmd(), block)
    }

    /**
     * Returns information about a particular keystore.
     * @param block to configure
     */
    def getKeyStoreInfo(@DelegatesTo(GetKeyStoreInfoCmd) Closure<?> block) {
        runDelegate(new GetKeyStoreInfoCmd(), block)
    }

    /**
     * Get properties keys associated with a specific managed node. (deprecated)
     * @param block to configure
     */
    def getManagedNodeKeys(@DelegatesTo(GetManagedNodeKeysCmd) Closure<?> block) {
        runDelegate(new GetManagedNodeKeysCmd(), block)
    }

    /**
     * Return information about an authentication data entry
     * @param block to configure
     */
    def getAuthDataEntry(@DelegatesTo(GetAuthDataEntryCmd) Closure<?> block) {
        runDelegate(new GetAuthDataEntryCmd(), block)
    }

    /**
     * Set SAML Issuer Configuration in the specified bindings as custom properties
     * @param block to configure
     */
    def setSAMLIssuerConfigInBinding(@DelegatesTo(SetSAMLIssuerConfigInBindingCmd) Closure<?> block) {
        runDelegate(new SetSAMLIssuerConfigInBindingCmd(), block)
    }

    /**
     * null
     * @param block to configure
     */
    def listMWSLogFiles(@DelegatesTo(ListMWSLogFilesCmd) Closure<?> block) {
        runDelegate(new ListMWSLogFilesCmd(), block)
    }

    /**
     * Create a policy that keeps one member active at a time.
     * @param block to configure
     */
    def createOneOfNPolicy(@DelegatesTo(CreateOneOfNPolicyCmd) Closure<?> block) {
        runDelegate(new CreateOneOfNPolicyCmd(), block)
    }

    /**
     * Configures a Federated repositories user registry in the administrative security configuration.
     * @param block to configure
     */
    def configureAdminWIMUserRegistry(@DelegatesTo(ConfigureAdminWIMUserRegistryCmd) Closure<?> block) {
        runDelegate(new ConfigureAdminWIMUserRegistryCmd(), block)
    }

    /**
     * This command displays the SPNEGO TAI properties in the security configuration. If an spnId is not specified, all the SPNEGO TAI properties are displayed.
     * @param block to configure
     */
    def showSpnegoTAIProperties(@DelegatesTo(ShowSpnegoTAIPropertiesCmd) Closure<?> block) {
        runDelegate(new ShowSpnegoTAIPropertiesCmd(), block)
    }

    /**
     * Adds a base entry to a specified realm configuration.
     * @param block to configure
     */
    def addIdMgrRealmBaseEntry(@DelegatesTo(AddIdMgrRealmBaseEntryCmd) Closure<?> block) {
        runDelegate(new AddIdMgrRealmBaseEntryCmd(), block)
    }

    /**
     * Query for previously submitted jobs.
     * @param block to configure
     */
    def queryJobs(@DelegatesTo(QueryJobsCmd) Closure<?> block) {
        runDelegate(new QueryJobsCmd(), block)
    }

    /**
     * Sets the name of the default realm.
     * @param block to configure
     */
    def setIdMgrDefaultRealm(@DelegatesTo(SetIdMgrDefaultRealmCmd) Closure<?> block) {
        runDelegate(new SetIdMgrDefaultRealmCmd(), block)
    }

    /**
     * Returns the operating system platform for a given node.  This valueapplies only to nodes running on the z/OS operating system.
     * @param block to configure
     */
    def getNodeSysplexName(@DelegatesTo(GetNodeSysplexNameCmd) Closure<?> block) {
        runDelegate(new GetNodeSysplexNameCmd(), block)
    }

    /**
     * Creates a custom repository configuration.
     * @param block to configure
     */
    def createIdMgrCustomRepository(@DelegatesTo(CreateIdMgrCustomRepositoryCmd) Closure<?> block) {
        runDelegate(new CreateIdMgrCustomRepositoryCmd(), block)
    }

    /**
     * Removes a cookie configuration so that applications will be able to programmatically modify
     * @param block to configure
     */
    def removeDisabledSessionCookie(@DelegatesTo(RemoveDisabledSessionCookieCmd) Closure<?> block) {
        runDelegate(new RemoveDisabledSessionCookieCmd(), block)
    }

    /**
     * Reload the STS configuration dynamically.
     * @param block to configure
     */
    def refreshSTS(@DelegatesTo(RefreshSTSCmd) Closure<?> block) {
        runDelegate(new RefreshSTSCmd(), block)
    }

    /**
     * Get the JNDI name that is bound to java:comp/DefaultManagedThreadFactory.
     * @param block to configure
     */
    def getDefaultManagedThreadFactory(@DelegatesTo(GetDefaultManagedThreadFactoryCmd) Closure<?> block) {
        runDelegate(new GetDefaultManagedThreadFactoryCmd(), block)
    }

    /**
     * Lists the uniqueName of groups for each role.
     * @param block to configure
     */
    def listIdMgrGroupsForRoles(@DelegatesTo(ListIdMgrGroupsForRolesCmd) Closure<?> block) {
        runDelegate(new ListIdMgrGroupsForRolesCmd(), block)
    }

    /**
     * Return information about an external JAAC authorization provider.
     * @param block to configure
     */
    def getAuthzConfigInfo(@DelegatesTo(GetAuthzConfigInfoCmd) Closure<?> block) {
        runDelegate(new GetAuthzConfigInfoCmd(), block)
    }

    /**
     * Map groupids to one or more audit role in the authorization group.
     * @param block to configure
     */
    def mapGroupsToAuditRole(@DelegatesTo(MapGroupsToAuditRoleCmd) Closure<?> block) {
        runDelegate(new MapGroupsToAuditRoleCmd(), block)
    }

    /**
     * Adds the adminId to the user registry object in the security.xml file
     * @param block to configure
     */
    def addAdminIdToUserRegObj(@DelegatesTo(AddAdminIdToUserRegObjCmd) Closure<?> block) {
        runDelegate(new AddAdminIdToUserRegObjCmd(), block)
    }

    /**
     * Creates and populates tables for database in virtual member manager.
     * @param block to configure
     */
    def setupIdMgrDBTables(@DelegatesTo(SetupIdMgrDBTablesCmd) Closure<?> block) {
        runDelegate(new SetupIdMgrDBTablesCmd(), block)
    }

    /**
     * List the WebSphere MQ links.
     * @param block to configure
     */
    def listSIBMQLinks(@DelegatesTo(ListSIBMQLinksCmd) Closure<?> block) {
        runDelegate(new ListSIBMQLinksCmd(), block)
    }

    /**
     * Query unused SDKs on the node
     * @param block to configure
     */
    def getUnusedSDKsOnNode(@DelegatesTo(GetUnusedSDKsOnNodeCmd) Closure<?> block) {
        runDelegate(new GetUnusedSDKsOnNodeCmd(), block)
    }

    /**
     * Returns the name of the configured audit notification.
     * @param block to configure
     */
    def getAuditNotificationName(@DelegatesTo(GetAuditNotificationNameCmd) Closure<?> block) {
        runDelegate(new GetAuditNotificationNameCmd(), block)
    }

    /**
     * Mediate a destination.
     * @param block to configure
     */
    def unmediateSIBDestination(@DelegatesTo(UnmediateSIBDestinationCmd) Closure<?> block) {
        runDelegate(new UnmediateSIBDestinationCmd(), block)
    }

    /**
     * Edit options for a specified business-level application.
     * @param block to configure
     */
    def editBLA(@DelegatesTo(EditBLACmd) Closure<?> block) {
        runDelegate(new EditBLACmd(), block)
    }

    /**
     * Get OAuth Configuration to edit
     * @param block to configure
     */
    def exportOAuthProps(@DelegatesTo(ExportOAuthPropsCmd) Closure<?> block) {
        runDelegate(new ExportOAuthPropsCmd(), block)
    }

    /**
     * null
     * @param block to configure
     */
    def listMWSConfigRoots(@DelegatesTo(ListMWSConfigRootsCmd) Closure<?> block) {
        runDelegate(new ListMWSConfigRootsCmd(), block)
    }

    /**
     * Modify a messaging engine.
     * @param block to configure
     */
    def modifySIBEngine(@DelegatesTo(ModifySIBEngineCmd) Closure<?> block) {
        runDelegate(new ModifySIBEngineCmd(), block)
    }

    /**
     * Grants a user access to a destination for the specified destination role.
     * @param block to configure
     */
    def addUserToDestinationRole(@DelegatesTo(AddUserToDestinationRoleCmd) Closure<?> block) {
        runDelegate(new AddUserToDestinationRoleCmd(), block)
    }

    /**
     * Returns a list of users in the specified security realm, security domain, or resource.
     * @param block to configure
     */
    def listRegistryUsers(@DelegatesTo(ListRegistryUsersCmd) Closure<?> block) {
        runDelegate(new ListRegistryUsersCmd(), block)
    }

    /**
     * List the serialized SQLJ profiles that are in an installed application.
     * @param block to configure
     */
    def listSqljProfiles(@DelegatesTo(ListSqljProfilesCmd) Closure<?> block) {
        runDelegate(new ListSqljProfilesCmd(), block)
    }

    /**
     * Returns the CSI outbound information for global security or in a security domain.
     * @param block to configure
     */
    def getCSIOutboundInfo(@DelegatesTo(GetCSIOutboundInfoCmd) Closure<?> block) {
        runDelegate(new GetCSIOutboundInfoCmd(), block)
    }

    /**
     * This command removes SPNEGO TAI properties from the security configuration. If an spnId is not specified, all the SPNEGO TAI properties are removed.
     * @param block to configure
     */
    def deleteSpnegoTAIProperties(@DelegatesTo(DeleteSpnegoTAIPropertiesCmd) Closure<?> block) {
        runDelegate(new DeleteSpnegoTAIPropertiesCmd(), block)
    }

    /**
     * Validate configuration properties in properites file
     * @param block to configure
     */
    def validateConfigProperties(@DelegatesTo(ValidateConfigPropertiesCmd) Closure<?> block) {
        runDelegate(new ValidateConfigPropertiesCmd(), block)
    }

    /**
     * Shows the possible extensions available to be attached to the composition unit.
     * @param block to configure
     */
    def listAvailableOSGiExtensions(@DelegatesTo(ListAvailableOSGiExtensionsCmd) Closure<?> block) {
        runDelegate(new ListAvailableOSGiExtensionsCmd(), block)
    }

    /**
     * Update the SC custom config
     * @param block to configure
     */
    def updateSCClientCacheCustomConfiguration(@DelegatesTo(UpdateSCClientCacheCustomConfigurationCmd) Closure<?> block) {
        runDelegate(new UpdateSCClientCacheCustomConfigurationCmd(), block)
    }

    /**
     * Adds an LDAP server to the LDAP repository configuration.
     * @param block to configure
     */
    def addIdMgrLDAPServer(@DelegatesTo(AddIdMgrLDAPServerCmd) Closure<?> block) {
        runDelegate(new AddIdMgrLDAPServerCmd(), block)
    }

    /**
     * Define a new authentication provider.
     * @param block to configure
     */
    def defineJaspiProvider(@DelegatesTo(DefineJaspiProviderCmd) Closure<?> block) {
        runDelegate(new DefineJaspiProviderCmd(), block)
    }

    /**
     * Set the trace specification for the server. If the server is running new trace specification takes effect immediately. This command also saves the trace specification in configuration.
     * @param block to configure
     */
    def setTraceSpecification(@DelegatesTo(SetTraceSpecificationCmd) Closure<?> block) {
        runDelegate(new SetTraceSpecificationCmd(), block)
    }

    /**
     * Add an identity rule to the specified trust authentication rule.
     * @param block to configure
     */
    def addSTSEndpointTrustAuthenticationRule(@DelegatesTo(AddSTSEndpointTrustAuthenticationRuleCmd) Closure<?> block) {
        runDelegate(new AddSTSEndpointTrustAuthenticationRuleCmd(), block)
    }

    /**
     * Delete a key set group.
     * @param block to configure
     */
    def deleteKeySetGroup(@DelegatesTo(DeleteKeySetGroupCmd) Closure<?> block) {
        runDelegate(new DeleteKeySetGroupCmd(), block)
    }

    /**
     * Use the "createLMService" command to create a local mapping service, to which a service map can be attached.
     * @param block to configure
     */
    def createLMService(@DelegatesTo(CreateLMServiceCmd) Closure<?> block) {
        runDelegate(new CreateLMServiceCmd(), block)
    }

    /**
     * Get schedule information.
     * @param block to configure
     */
    def getWSSchedule(@DelegatesTo(GetWSScheduleCmd) Closure<?> block) {
        runDelegate(new GetWSScheduleCmd(), block)
    }

    /**
     * Command that creates a server
     * @param block to configure
     */
    def createWebServer(@DelegatesTo(CreateWebServerCmd) Closure<?> block) {
        runDelegate(new CreateWebServerCmd(), block)
    }

    /**
     * Lists the IBM MQ Topics defined at the scope provided to the command.
     * @param block to configure
     */
    def listWMQTopics(@DelegatesTo(ListWMQTopicsCmd) Closure<?> block) {
        runDelegate(new ListWMQTopicsCmd(), block)
    }

    /**
     * Delete an existing certificate request from a keystore.
     * @param block to configure
     */
    def deleteCertificateRequest(@DelegatesTo(DeleteCertificateRequestCmd) Closure<?> block) {
        runDelegate(new DeleteCertificateRequestCmd(), block)
    }

    /**
     * This command removes SPNEGO Web authentication Filter from the security configuration. If a host name is not specified, all the SPNEGO Web authentication Filters are removed.
     * @param block to configure
     */
    def deleteSpnegoFilter(@DelegatesTo(DeleteSpnegoFilterCmd) Closure<?> block) {
        runDelegate(new DeleteSpnegoFilterCmd(), block)
    }

    /**
     * List the groups in the specified role in the destination security space role for the given destination.
     * @param block to configure
     */
    def listGroupsInDestinationRole(@DelegatesTo(ListGroupsInDestinationRoleCmd) Closure<?> block) {
        runDelegate(new ListGroupsInDestinationRoleCmd(), block)
    }

    /**
     * Lists all the WSNServicePoint objects in the configuration of the target WSNService that match the specified input parameters.
     * @param block to configure
     */
    def listWSNServicePoints(@DelegatesTo(ListWSNServicePointsCmd) Closure<?> block) {
        runDelegate(new ListWSNServicePointsCmd(), block)
    }

    /**
     * Set the automatic checkpoints depth value
     * @param block to configure
     */
    def setAutoCheckpointDepth(@DelegatesTo(SetAutoCheckpointDepthCmd) Closure<?> block) {
        runDelegate(new SetAutoCheckpointDepthCmd(), block)
    }

    /**
     * Delete a SSLConfig group.
     * @param block to configure
     */
    def deleteSSLConfigGroup(@DelegatesTo(DeleteSSLConfigGroupCmd) Closure<?> block) {
        runDelegate(new DeleteSSLConfigGroupCmd(), block)
    }

    /**
     * Lists the groups in the specified topic space role for the specified topic space.
     * @param block to configure
     */
    def listGroupsInTopicSpaceRootRole(@DelegatesTo(ListGroupsInTopicSpaceRootRoleCmd) Closure<?> block) {
        runDelegate(new ListGroupsInTopicSpaceRootRoleCmd(), block)
    }

    /**
     * Removes an extension from the composition unit.
     * @param block to configure
     */
    def removeOSGiExtension(@DelegatesTo(RemoveOSGiExtensionCmd) Closure<?> block) {
        runDelegate(new RemoveOSGiExtensionCmd(), block)
    }

    /**
     * List all chains configured under a particular instance of TransportChannelService.
     * @param block to configure
     */
    def listChains(@DelegatesTo(ListChainsCmd) Closure<?> block) {
        runDelegate(new ListChainsCmd(), block)
    }

    /**
     * Updates an existing LDAP entity type definition to an LDAP repository configuration. This command can be used to add more values to multivalued parameters. 
     * @param block to configure
     */
    def updateIdMgrLDAPEntityType(@DelegatesTo(UpdateIdMgrLDAPEntityTypeCmd) Closure<?> block) {
        runDelegate(new UpdateIdMgrLDAPEntityTypeCmd(), block)
    }

    /**
     * Updates the weights of the specified cluster members.
     * @param block to configure
     */
    def updateClusterMemberWeights(@DelegatesTo(UpdateClusterMemberWeightsCmd) Closure<?> block) {
        runDelegate(new UpdateClusterMemberWeightsCmd(), block)
    }

    /**
     * modify the property of the job scheduler 
     * @param block to configure
     */
    def modifyJobSchedulerProperty(@DelegatesTo(ModifyJobSchedulerPropertyCmd) Closure<?> block) {
        runDelegate(new ModifyJobSchedulerPropertyCmd(), block)
    }

    /**
     * Updates the configuration of the specified realm.
     * @param block to configure
     */
    def updateIdMgrRealm(@DelegatesTo(UpdateIdMgrRealmCmd) Closure<?> block) {
        runDelegate(new UpdateIdMgrRealmCmd(), block)
    }

    /**
     * Returns a list of defined filters for the supplied emitter in shortened format.
     * @param block to configure
     */
    def getAuditEmitterFilters(@DelegatesTo(GetAuditEmitterFiltersCmd) Closure<?> block) {
        runDelegate(new GetAuditEmitterFiltersCmd(), block)
    }

    /**
     * Create an Object Cache Instance.  An object cache instance is a location where an applications can store, distribute, and share data. 
     * @param block to configure
     */
    def createObjectCacheInstance(@DelegatesTo(CreateObjectCacheInstanceCmd) Closure<?> block) {
        runDelegate(new CreateObjectCacheInstanceCmd(), block)
    }

    /**
     * Lists control operations defined for a business-level application and its composition units.
     * @param block to configure
     */
    def listControlOps(@DelegatesTo(ListControlOpsCmd) Closure<?> block) {
        runDelegate(new ListControlOpsCmd(), block)
    }

    /**
     * Removes a user from the specified destination role for the specified destination.
     * @param block to configure
     */
    def removeUserFromDestinationRole(@DelegatesTo(RemoveUserFromDestinationRoleCmd) Closure<?> block) {
        runDelegate(new RemoveUserFromDestinationRoleCmd(), block)
    }

    /**
     * List all resources mapped to the specified security domain.
     * @param block to configure
     */
    def listResourcesInSecurityDomain(@DelegatesTo(ListResourcesInSecurityDomainCmd) Closure<?> block) {
        runDelegate(new ListResourcesInSecurityDomainCmd(), block)
    }

    /**
     * Modify a bus.
     * @param block to configure
     */
    def modifySIBus(@DelegatesTo(ModifySIBusCmd) Closure<?> block) {
        runDelegate(new ModifySIBusCmd(), block)
    }

    /**
     * Modifies the configuration of the password encryption. Note that the original value is unchanged unless the value is set by the parameter. To change the value to the default, use a blank string ("").
     * @param block to configure
     */
    def modifyPasswordEncryption(@DelegatesTo(ModifyPasswordEncryptionCmd) Closure<?> block) {
        runDelegate(new ModifyPasswordEncryptionCmd(), block)
    }

    /**
     * Check if the server is a standalone server or the node of the given server is federated with a deployment manager. Returns "true" if the node of the server is federated, "false" otherwise.
     * @param block to configure
     */
    def isFederated(@DelegatesTo(IsFederatedCmd) Closure<?> block) {
        runDelegate(new IsFederatedCmd(), block)
    }

    /**
     * Unconfigure a user registry in the administrative security configuration or an application security domain.
     * @param block to configure
     */
    def unconfigureUserRegistry(@DelegatesTo(UnconfigureUserRegistryCmd) Closure<?> block) {
        runDelegate(new UnconfigureUserRegistryCmd(), block)
    }

    /**
     * Check if a specified node can be added to a specified node group.
     * @param block to configure
     */
    def canNodeJoinNodeGroup(@DelegatesTo(CanNodeJoinNodeGroupCmd) Closure<?> block) {
        runDelegate(new CanNodeJoinNodeGroupCmd(), block)
    }

    /**
     * Removes the groups from the specified virtual member manager role. If value for groupId parameter is specified as "*" all groups mapped for the role are removed.
     * @param block to configure
     */
    def removeIdMgrGroupsFromRole(@DelegatesTo(RemoveIdMgrGroupsFromRoleCmd) Closure<?> block) {
        runDelegate(new RemoveIdMgrGroupsFromRoleCmd(), block)
    }

    /**
     * Removes a users permission to access the topic for the specified role.
     * @param block to configure
     */
    def removeUserFromTopicRole(@DelegatesTo(RemoveUserFromTopicRoleCmd) Closure<?> block) {
        runDelegate(new RemoveUserFromTopicRoleCmd(), block)
    }

    /**
     * Displays a list of certificate key sizes.
     * @param block to configure
     */
    def listKeySizes(@DelegatesTo(ListKeySizesCmd) Closure<?> block) {
        runDelegate(new ListKeySizesCmd(), block)
    }

    /**
     * list all the AuthorizationGroups that a given user has access to.
     * @param block to configure
     */
    def listAuthorizationGroupsForUserID(@DelegatesTo(ListAuthorizationGroupsForUserIDCmd) Closure<?> block) {
        runDelegate(new ListAuthorizationGroupsForUserIDCmd(), block)
    }

    /**
     * Makes a user a member of the same groups as another user.
     * @param block to configure
     */
    def duplicateMembershipOfUser(@DelegatesTo(DuplicateMembershipOfUserCmd) Closure<?> block) {
        runDelegate(new DuplicateMembershipOfUserCmd(), block)
    }

    /**
     * Modify the attributes of the supplied SIB JMS queue using the supplied attribute values.
     * @param block to configure
     */
    def modifySIBJMSQueue(@DelegatesTo(ModifySIBJMSQueueCmd) Closure<?> block) {
        runDelegate(new ModifySIBJMSQueueCmd(), block)
    }

    /**
     * Delete an existing core group. The core group must contain no servers.
     * @param block to configure
     */
    def deleteCoreGroup(@DelegatesTo(DeleteCoreGroupCmd) Closure<?> block) {
        runDelegate(new DeleteCoreGroupCmd(), block)
    }

    /**
     * Modify a Key Sets attributes.
     * @param block to configure
     */
    def modifyKeySet(@DelegatesTo(ModifyKeySetCmd) Closure<?> block) {
        runDelegate(new ModifyKeySetCmd(), block)
    }

    /**
     * Get the directory path where the configuration repository is stored 
     * @param block to configure
     */
    def getConfigRepositoryLocation(@DelegatesTo(GetConfigRepositoryLocationCmd) Closure<?> block) {
        runDelegate(new GetConfigRepositoryLocationCmd(), block)
    }

    /**
     * Delete the configuration of an application server cluster.
     * @param block to configure
     */
    def deleteCluster(@DelegatesTo(DeleteClusterCmd) Closure<?> block) {
        runDelegate(new DeleteClusterCmd(), block)
    }

    /**
     * Get information about a trust manager.
     * @param block to configure
     */
    def getTrustManager(@DelegatesTo(GetTrustManagerCmd) Closure<?> block) {
        runDelegate(new GetTrustManagerCmd(), block)
    }

    /**
     * Performs ldapsearch according to search criteria from input parameter 
     * @param block to configure
     */
    def ldapSearch(@DelegatesTo(LdapSearchCmd) Closure<?> block) {
        runDelegate(new LdapSearchCmd(), block)
    }

    /**
     * creates a server Template based on a server configuration
     * @param block to configure
     */
    def createProxyServerTemplate(@DelegatesTo(CreateProxyServerTemplateCmd) Closure<?> block) {
        runDelegate(new CreateProxyServerTemplateCmd(), block)
    }

    /**
     * Returns the RDN attributes configuration of an LDAP entity type configuration.
     * @param block to configure
     */
    def getIdMgrLDAPEntityTypeRDNAttr(@DelegatesTo(GetIdMgrLDAPEntityTypeRDNAttrCmd) Closure<?> block) {
        runDelegate(new GetIdMgrLDAPEntityTypeRDNAttrCmd(), block)
    }

    /**
     * Removes a group from the specified foreign bus role for the bus specified
     * @param block to configure
     */
    def removeGroupFromForeignBusRole(@DelegatesTo(RemoveGroupFromForeignBusRoleCmd) Closure<?> block) {
        runDelegate(new RemoveGroupFromForeignBusRoleCmd(), block)
    }

    /**
     * Checks the configuation repository and reports any structural inconsistencies
     * @param block to configure
     */
    def reportConfigInconsistencies(@DelegatesTo(ReportConfigInconsistenciesCmd) Closure<?> block) {
        runDelegate(new ReportConfigInconsistenciesCmd(), block)
    }

    /**
     * Returns mappings between user and group attributes of user registry to virtual member manager properties for a realm.
     * @param block to configure
     */
    def listIdMgrRealmURAttrMappings(@DelegatesTo(ListIdMgrRealmURAttrMappingsCmd) Closure<?> block) {
        runDelegate(new ListIdMgrRealmURAttrMappingsCmd(), block)
    }

    /**
     * The exportBinding command exports a binding as an archive that can be copied onto a client environment or imported onto a server environment.
     * @param block to configure
     */
    def exportBinding(@DelegatesTo(ExportBindingCmd) Closure<?> block) {
        runDelegate(new ExportBindingCmd(), block)
    }

    /**
     * Disables the configuration of the password encryption. As a result, the values of xor or custom are used for the encryption algorithm.
     * @param block to configure
     */
    def disablePasswordEncryption(@DelegatesTo(DisablePasswordEncryptionCmd) Closure<?> block) {
        runDelegate(new DisablePasswordEncryptionCmd(), block)
    }

    /**
     * Updates a file repository configuration.
     * @param block to configure
     */
    def updateIdMgrFileRepository(@DelegatesTo(UpdateIdMgrFileRepositoryCmd) Closure<?> block) {
        runDelegate(new UpdateIdMgrFileRepositoryCmd(), block)
    }

    /**
     * Modifies a Keystore object.
     * @param block to configure
     */
    def modifyAuditKeyStore(@DelegatesTo(ModifyAuditKeyStoreCmd) Closure<?> block) {
        runDelegate(new ModifyAuditKeyStoreCmd(), block)
    }

    /**
     * null
     * @param block to configure
     */
    def setClusterLimit(@DelegatesTo(SetClusterLimitCmd) Closure<?> block) {
        runDelegate(new SetClusterLimitCmd(), block)
    }

    /**
     * Show detail for a WebSphere MQ link.
     * @param block to configure
     */
    def showSIBMQLink(@DelegatesTo(ShowSIBMQLinkCmd) Closure<?> block) {
        runDelegate(new ShowSIBMQLinkCmd(), block)
    }

    /**
     * List variable values under a scope.
     * @param block to configure
     */
    def showVariables(@DelegatesTo(ShowVariablesCmd) Closure<?> block) {
        runDelegate(new ShowVariablesCmd(), block)
    }

    /**
     * Create a new chain of transport channels based on a chain template.
     * @param block to configure
     */
    def createChain(@DelegatesTo(CreateChainCmd) Closure<?> block) {
        runDelegate(new CreateChainCmd(), block)
    }

    /**
     * Delete a composition unit from a business-level application.
     * @param block to configure
     */
    def deleteCompUnit(@DelegatesTo(DeleteCompUnitCmd) Closure<?> block) {
        runDelegate(new DeleteCompUnitCmd(), block)
    }

    /**
     * Map users to the naming roles
     * @param block to configure
     */
    def mapUsersToNamingRole(@DelegatesTo(MapUsersToNamingRoleCmd) Closure<?> block) {
        runDelegate(new MapUsersToNamingRoleCmd(), block)
    }

    /**
     * This command sets the active authentication mechanism attribute in the security configuration. 
     * @param block to configure
     */
    def setActiveAuthMechanism(@DelegatesTo(SetActiveAuthMechanismCmd) Closure<?> block) {
        runDelegate(new SetActiveAuthMechanismCmd(), block)
    }

    /**
     * Create a Dynamic SSL configuration Selection.
     * @param block to configure
     */
    def createDynamicSSLConfigSelection(@DelegatesTo(CreateDynamicSSLConfigSelectionCmd) Closure<?> block) {
        runDelegate(new CreateDynamicSSLConfigSelectionCmd(), block)
    }

    /**
     * Removes the specified chain from the list of permitted chains for the specified bus.
     * @param block to configure
     */
    def removeSIBPermittedChain(@DelegatesTo(RemoveSIBPermittedChainCmd) Closure<?> block) {
        runDelegate(new RemoveSIBPermittedChainCmd(), block)
    }

    /**
     * Checks to make sure that at least one admin user in the admin-authz.xml file exists in the input user registry.
     * @param block to configure
     */
    def isAdminLockedOut(@DelegatesTo(IsAdminLockedOutCmd) Closure<?> block) {
        runDelegate(new IsAdminLockedOutCmd(), block)
    }

    /**
     * Shows the current configuration with unsaved changes.
     * @param block to configure
     */
    def showIdMgrConfig(@DelegatesTo(ShowIdMgrConfigCmd) Closure<?> block) {
        runDelegate(new ShowIdMgrConfigCmd(), block)
    }

    /**
     * Get the depth of the automatic checkpoints
     * @param block to configure
     */
    def getAutoCheckpointDepth(@DelegatesTo(GetAutoCheckpointDepthCmd) Closure<?> block) {
        runDelegate(new GetAutoCheckpointDepthCmd(), block)
    }

    /**
     * null
     * @param block to configure
     */
    def listClusterMemberTemplates(@DelegatesTo(ListClusterMemberTemplatesCmd) Closure<?> block) {
        runDelegate(new ListClusterMemberTemplatesCmd(), block)
    }

    /**
     * Get information about a SSL configuration group.
     * @param block to configure
     */
    def getSSLConfigGroup(@DelegatesTo(GetSSLConfigGroupCmd) Closure<?> block) {
        runDelegate(new GetSSLConfigGroupCmd(), block)
    }

    /**
     * configureDVIPA.desc
     * @param block to configure
     */
    def configureSingleHome(@DelegatesTo(ConfigureSingleHomeCmd) Closure<?> block) {
        runDelegate(new ConfigureSingleHomeCmd(), block)
    }

    /**
     * Modify an existing SIB link.
     * @param block to configure
     */
    def modifySIBLink(@DelegatesTo(ModifySIBLinkCmd) Closure<?> block) {
        runDelegate(new ModifySIBLinkCmd(), block)
    }

    /**
     * Grants a group access to a foreign bus from the local bus specified for the specified destination role.
     * @param block to configure
     */
    def addGroupToForeignBusRole(@DelegatesTo(AddGroupToForeignBusRoleCmd) Closure<?> block) {
        runDelegate(new AddGroupToForeignBusRoleCmd(), block)
    }

    /**
     * Change the password of a keystore. This will automatically save the new password to the configuration.
     * @param block to configure
     */
    def changeKeyStorePassword(@DelegatesTo(ChangeKeyStorePasswordCmd) Closure<?> block) {
        runDelegate(new ChangeKeyStorePasswordCmd(), block)
    }

    /**
     * Deletes an audit emitter implementation object by reference id.
     * @param block to configure
     */
    def deleteAuditEmitterByRef(@DelegatesTo(DeleteAuditEmitterByRefCmd) Closure<?> block) {
        runDelegate(new DeleteAuditEmitterByRefCmd(), block)
    }

    /**
     * Get information about a personal certificate.
     * @param block to configure
     */
    def getAuditCertificate(@DelegatesTo(GetAuditCertificateCmd) Closure<?> block) {
        runDelegate(new GetAuditCertificateCmd(), block)
    }

    /**
     * Import a server configuration from a configuration archive. This command creates a new server based on the server configuration defined in the archive.
     * @param block to configure
     */
    def importServer(@DelegatesTo(ImportServerCmd) Closure<?> block) {
        runDelegate(new ImportServerCmd(), block)
    }

    /**
     * Returns the audit record signing configuration.
     * @param block to configure
     */
    def getAuditSigningConfig(@DelegatesTo(GetAuditSigningConfigCmd) Closure<?> block) {
        runDelegate(new GetAuditSigningConfigCmd(), block)
    }

    /**
     * Disables Security Auditing and resets the auditEnabled field in audit.xml.
     * @param block to configure
     */
    def disableAudit(@DelegatesTo(DisableAuditCmd) Closure<?> block) {
        runDelegate(new DisableAuditCmd(), block)
    }

    /**
     * Add an outbound port to an outbound service.
     * @param block to configure
     */
    def addSIBWSOutboundPort(@DelegatesTo(AddSIBWSOutboundPortCmd) Closure<?> block) {
        runDelegate(new AddSIBWSOutboundPortCmd(), block)
    }

    /**
     * Auto-generates a server Id and updates the internalServerId field in the security.xml.
     * @param block to configure
     */
    def autogenServerId(@DelegatesTo(AutogenServerIdCmd) Closure<?> block) {
        runDelegate(new AutogenServerIdCmd(), block)
    }

    /**
     * Lists all the WSNService objects in the configuration that match the specified input parameters.
     * @param block to configure
     */
    def listWSNServices(@DelegatesTo(ListWSNServicesCmd) Closure<?> block) {
        runDelegate(new ListWSNServicesCmd(), block)
    }

    /**
     * Migrates WMM Database data to virtual member manager Database, includes wmmDB, wmmLookaside, and wmmFederation, if applicable.
     * @param block to configure
     */
    def migrateWMMDB(@DelegatesTo(MigrateWMMDBCmd) Closure<?> block) {
        runDelegate(new MigrateWMMDBCmd(), block)
    }

    /**
     * List all WebSphere MQ servers.
     * @param block to configure
     */
    def listSIBWMQServers(@DelegatesTo(ListSIBWMQServersCmd) Closure<?> block) {
        runDelegate(new ListSIBWMQServersCmd(), block)
    }

    /**
     * Determine whether a business-level application or composition unit is running or stopped.
     * @param block to configure
     */
    def getBLAStatus(@DelegatesTo(GetBLAStatusCmd) Closure<?> block) {
        runDelegate(new GetBLAStatusCmd(), block)
    }

    /**
     * Updates a member attribute configuration of an LDAP group configuration.
     * @param block to configure
     */
    def updateIdMgrLDAPGroupMemberAttr(@DelegatesTo(UpdateIdMgrLDAPGroupMemberAttrCmd) Closure<?> block) {
        runDelegate(new UpdateIdMgrLDAPGroupMemberAttrCmd(), block)
    }

    /**
     * Adds a configuration for an LDAP attribute used as an external ID.
     * @param block to configure
     */
    def addIdMgrLDAPExternalIdAttr(@DelegatesTo(AddIdMgrLDAPExternalIdAttrCmd) Closure<?> block) {
        runDelegate(new AddIdMgrLDAPExternalIdAttrCmd(), block)
    }

    /**
     * Extracts configuration of the object specified by ConfigId or ConfigData parameter to a specified properies file. Either ConfigId or ConfigData parameter should be specified, but not both. ConfigId parameter should be in the form that is returned by "AdminConfig list configType". Example of ConfigId is cellName(cells/cellName|cell.xml#Cell_1). ConfigData parameter should be in the form of configType=value[:configType=value]*. Examples of configData are Deployment=appName or Node=nodeName:Server=serverName.
     * @param block to configure
     */
    def extractConfigProperties(@DelegatesTo(ExtractConfigPropertiesCmd) Closure<?> block) {
        runDelegate(new ExtractConfigPropertiesCmd(), block)
    }

    /**
     * Lists names, types, and hostnames of all the configured repositories.
     * @param block to configure
     */
    def listIdMgrRepositories(@DelegatesTo(ListIdMgrRepositoriesCmd) Closure<?> block) {
        runDelegate(new ListIdMgrRepositoriesCmd(), block)
    }

    /**
     * Updates an LDAP repository configuration.
     * @param block to configure
     */
    def updateIdMgrLDAPRepository(@DelegatesTo(UpdateIdMgrLDAPRepositoryCmd) Closure<?> block) {
        runDelegate(new UpdateIdMgrLDAPRepositoryCmd(), block)
    }

    /**
     * List all SIB JMS connection factories of the specified type at the specified scope.
     * @param block to configure
     */
    def listSIBJMSConnectionFactories(@DelegatesTo(ListSIBJMSConnectionFactoriesCmd) Closure<?> block) {
        runDelegate(new ListSIBJMSConnectionFactoriesCmd(), block)
    }

    /**
     * Lists Audit keystores
     * @param block to configure
     */
    def listAuditKeyStores(@DelegatesTo(ListAuditKeyStoresCmd) Closure<?> block) {
        runDelegate(new ListAuditKeyStoresCmd(), block)
    }

    /**
     * Returns the current administrative security setting of true or false.
     * @param block to configure
     */
    def isGlobalSecurityEnabled(@DelegatesTo(IsGlobalSecurityEnabledCmd) Closure<?> block) {
        runDelegate(new IsGlobalSecurityEnabledCmd(), block)
    }

    /**
     * modify a node group configuration
     * @param block to configure
     */
    def modifyNodeGroup(@DelegatesTo(ModifyNodeGroupCmd) Closure<?> block) {
        runDelegate(new ModifyNodeGroupCmd(), block)
    }

    /**
     * List J2C connection factories that have a specified connection factory interface defined in the specified J2C resource adapter.
     * @param block to configure
     */
    def listJ2CConnectionFactories(@DelegatesTo(ListJ2CConnectionFactoriesCmd) Closure<?> block) {
        runDelegate(new ListJ2CConnectionFactoriesCmd(), block)
    }

    /**
     * Creates a IBM MQ Queue at the scope provided to the command.
     * @param block to configure
     */
    def createWMQQueue(@DelegatesTo(CreateWMQQueueCmd) Closure<?> block) {
        runDelegate(new CreateWMQQueueCmd(), block)
    }

    /**
     * null
     * @param block to configure
     */
    def listMWSLogRoots(@DelegatesTo(ListMWSLogRootsCmd) Closure<?> block) {
        runDelegate(new ListMWSLogRootsCmd(), block)
    }

    /**
     * Create a WS-Notification service
     * @param block to configure
     */
    def createWSNService(@DelegatesTo(CreateWSNServiceCmd) Closure<?> block) {
        runDelegate(new CreateWSNServiceCmd(), block)
    }

    /**
     * The getPolicyTypeAttribute command returns the value for the specified policy attribute.
     * @param block to configure
     */
    def getPolicyTypeAttribute(@DelegatesTo(GetPolicyTypeAttributeCmd) Closure<?> block) {
        runDelegate(new GetPolicyTypeAttributeCmd(), block)
    }

    /**
     * null
     * @param block to configure
     */
    def listMWSInstallFiles(@DelegatesTo(ListMWSInstallFilesCmd) Closure<?> block) {
        runDelegate(new ListMWSInstallFilesCmd(), block)
    }

    /**
     * The list of signer certificates in a keystore.
     * @param block to configure
     */
    def listSignerCertificates(@DelegatesTo(ListSignerCertificatesCmd) Closure<?> block) {
        runDelegate(new ListSignerCertificatesCmd(), block)
    }

    /**
     * List interceptors from the global security configuration or from a security domain.
     * @param block to configure
     */
    def listInterceptors(@DelegatesTo(ListInterceptorsCmd) Closure<?> block) {
        runDelegate(new ListInterceptorsCmd(), block)
    }

    /**
     * Updates the attributes of a user.
     * @param block to configure
     */
    def updateUser(@DelegatesTo(UpdateUserCmd) Closure<?> block) {
        runDelegate(new UpdateUserCmd(), block)
    }

    /**
     * The validatePolicySet command validates the policies in the policy set.
     * @param block to configure
     */
    def validatePolicySet(@DelegatesTo(ValidatePolicySetCmd) Closure<?> block) {
        runDelegate(new ValidatePolicySetCmd(), block)
    }

    /**
     * Checks if the current run time is JACC enabled in the global security domain.
     * @param block to configure
     */
    def isJACCEnabled(@DelegatesTo(IsJACCEnabledCmd) Closure<?> block) {
        runDelegate(new IsJACCEnabledCmd(), block)
    }

    /**
     * Create a mediation.
     * @param block to configure
     */
    def createSIBMediation(@DelegatesTo(CreateSIBMediationCmd) Closure<?> block) {
        runDelegate(new CreateSIBMediationCmd(), block)
    }

    /**
     * List the SIB foreign buses.
     * @param block to configure
     */
    def listSIBForeignBuses(@DelegatesTo(ListSIBForeignBusesCmd) Closure<?> block) {
        runDelegate(new ListSIBForeignBusesCmd(), block)
    }

    /**
     * Set the process definition of an application server.
     * @param block to configure
     */
    def setProcessDefinition(@DelegatesTo(SetProcessDefinitionCmd) Closure<?> block) {
        runDelegate(new SetProcessDefinitionCmd(), block)
    }

    /**
     * Modifies a security domain's description.
     * @param block to configure
     */
    def modifySecurityDomain(@DelegatesTo(ModifySecurityDomainCmd) Closure<?> block) {
        runDelegate(new ModifySecurityDomainCmd(), block)
    }

    /**
     * Adds a base entry to the specified repository. 
     * @param block to configure
     */
    def addIdMgrRepositoryBaseEntry(@DelegatesTo(AddIdMgrRepositoryBaseEntryCmd) Closure<?> block) {
        runDelegate(new AddIdMgrRepositoryBaseEntryCmd(), block)
    }

    /**
     * Map groups or special subjects or both to the naming roles
     * @param block to configure
     */
    def mapGroupsToNamingRole(@DelegatesTo(MapGroupsToNamingRoleCmd) Closure<?> block) {
        runDelegate(new MapGroupsToNamingRoleCmd(), block)
    }

    /**
     * Configure the Jaspi configuration.
     * @param block to configure
     */
    def configureJaspi(@DelegatesTo(ConfigureJaspiCmd) Closure<?> block) {
        runDelegate(new ConfigureJaspiCmd(), block)
    }

    /**
     * null
     * @param block to configure
     */
    def lookupResources(@DelegatesTo(LookupResourcesCmd) Closure<?> block) {
        runDelegate(new LookupResourcesCmd(), block)
    }

    /**
     * Remove a resource from a security domain.
     * @param block to configure
     */
    def removeResourceFromSecurityDomain(@DelegatesTo(RemoveResourceFromSecurityDomainCmd) Closure<?> block) {
        runDelegate(new RemoveResourceFromSecurityDomainCmd(), block)
    }

    /**
     * Create a J2C administrative object.
     * @param block to configure
     */
    def createJ2CAdminObject(@DelegatesTo(CreateJ2CAdminObjectCmd) Closure<?> block) {
        runDelegate(new CreateJ2CAdminObjectCmd(), block)
    }

    /**
     * Create a SSL Configuration Group.
     * @param block to configure
     */
    def createSSLConfigGroup(@DelegatesTo(CreateSSLConfigGroupCmd) Closure<?> block) {
        runDelegate(new CreateSSLConfigGroupCmd(), block)
    }

    /**
     * Returns a list of event and outcome types of the defined Audit Filters.
     * @param block to configure
     */
    def listAuditFiltersByEvent(@DelegatesTo(ListAuditFiltersByEventCmd) Closure<?> block) {
        runDelegate(new ListAuditFiltersByEventCmd(), block)
    }

    /**
     * Receive a certificate from a file.
     * @param block to configure
     */
    def receiveCertificate(@DelegatesTo(ReceiveCertificateCmd) Closure<?> block) {
        runDelegate(new ReceiveCertificateCmd(), block)
    }

    /**
     * The KRB5 authentication mechanism security object field in the security configuration file is created based on the user input. 
     * @param block to configure
     */
    def createKrbAuthMechanism(@DelegatesTo(CreateKrbAuthMechanismCmd) Closure<?> block) {
        runDelegate(new CreateKrbAuthMechanismCmd(), block)
    }

    /**
     * Sets or updates an entry mapping repository configuration.
     * @param block to configure
     */
    def setIdMgrEntryMappingRepository(@DelegatesTo(SetIdMgrEntryMappingRepositoryCmd) Closure<?> block) {
        runDelegate(new SetIdMgrEntryMappingRepositoryCmd(), block)
    }

    /**
     * Lists the sets of cookie configurations that will not be able to be programmatically modified
     * @param block to configure
     */
    def listDisabledSessionCookie(@DelegatesTo(ListDisabledSessionCookieCmd) Closure<?> block) {
        runDelegate(new ListDisabledSessionCookieCmd(), block)
    }

    /**
     * Get information about a descriptive property under an object.
     * @param block to configure
     */
    def getDescriptiveProp(@DelegatesTo(GetDescriptivePropCmd) Closure<?> block) {
        runDelegate(new GetDescriptivePropCmd(), block)
    }

    /**
     * Lists the external bundle repositories in the configuration.
     * @param block to configure
     */
    def listExternalBundleRepositories(@DelegatesTo(ListExternalBundleRepositoriesCmd) Closure<?> block) {
        runDelegate(new ListExternalBundleRepositoriesCmd(), block)
    }

    /**
     * Sets up the LDAP attribute cache configuration.
     * @param block to configure
     */
    def setIdMgrLDAPAttrCache(@DelegatesTo(SetIdMgrLDAPAttrCacheCmd) Closure<?> block) {
        runDelegate(new SetIdMgrLDAPAttrCacheCmd(), block)
    }

    /**
     * This command adds SPNEGO Web authentication filter in the security configuration.
     * @param block to configure
     */
    def addSpnegoFilter(@DelegatesTo(AddSpnegoFilterCmd) Closure<?> block) {
        runDelegate(new AddSpnegoFilterCmd(), block)
    }

    /**
     * Changes the active JPA specification level for a Server or ServerCluster.The operation requires either an ObjectName referencing the target object, or parameters identifying the target node and server.  The specLevel parameter must always be specified.
     * @param block to configure
     */
    def modifyJPASpecLevel(@DelegatesTo(ModifyJPASpecLevelCmd) Closure<?> block) {
        runDelegate(new ModifyJPASpecLevelCmd(), block)
    }

    /**
     * Get the available JMS connection factories
     * @param block to configure
     */
    def getJMSTopicConnectionFactories(@DelegatesTo(GetJMSTopicConnectionFactoriesCmd) Closure<?> block) {
        runDelegate(new GetJMSTopicConnectionFactoriesCmd(), block)
    }

    /**
     * Lists all security domains.
     * @param block to configure
     */
    def listSecurityDomains(@DelegatesTo(ListSecurityDomainsCmd) Closure<?> block) {
        runDelegate(new ListSecurityDomainsCmd(), block)
    }

    /**
     * List the supported keystore types.
     * @param block to configure
     */
    def listKeyStoreTypes(@DelegatesTo(ListKeyStoreTypesCmd) Closure<?> block) {
        runDelegate(new ListKeyStoreTypesCmd(), block)
    }

    /**
     * List the SC cache configuration
     * @param block to configure
     */
    def querySCClientCacheConfiguration(@DelegatesTo(QuerySCClientCacheConfigurationCmd) Closure<?> block) {
        runDelegate(new QuerySCClientCacheConfigurationCmd(), block)
    }

    /**
     * Returns a Boolean indicating if the version of the SAF product supports distributed identity mapping.
     * @param block to configure
     */
    def isSAFVersionValidForIdentityMapping(@DelegatesTo(IsSAFVersionValidForIdentityMappingCmd) Closure<?> block) {
        runDelegate(new IsSAFVersionValidForIdentityMappingCmd(), block)
    }

    /**
     * List all the objects that a given group has access to.
     * @param block to configure
     */
    def listResourcesForGroupID(@DelegatesTo(ListResourcesForGroupIDCmd) Closure<?> block) {
        runDelegate(new ListResourcesForGroupIDCmd(), block)
    }

    /**
     * Creates an entry in the audit.xml to reference the configuration of an SMF Emitter implementation of the Service Provider interface.
     * @param block to configure
     */
    def createSMFEmitter(@DelegatesTo(CreateSMFEmitterCmd) Closure<?> block) {
        runDelegate(new CreateSMFEmitterCmd(), block)
    }

    /**
     * Displays information about the keystore used during Audit Record encryption
     * @param block to configure
     */
    def showAuditLogEncryptionInfo(@DelegatesTo(ShowAuditLogEncryptionInfoCmd) Closure<?> block) {
        runDelegate(new ShowAuditLogEncryptionInfoCmd(), block)
    }

    /**
     * Validates the SPNEGO Web authentication configuration. 
     * @param block to configure
     */
    def validateSpnegoConfig(@DelegatesTo(ValidateSpnegoConfigCmd) Closure<?> block) {
        runDelegate(new ValidateSpnegoConfigCmd(), block)
    }

    /**
     * Export the deployment manifest from an EBA asset.
     * @param block to configure
     */
    def exportDeploymentManifest(@DelegatesTo(ExportDeploymentManifestCmd) Closure<?> block) {
        runDelegate(new ExportDeploymentManifestCmd(), block)
    }

    /**
     * Returns the class name for the supplied event factory.
     * @param block to configure
     */
    def getAuditEventFactoryClass(@DelegatesTo(GetAuditEventFactoryClassCmd) Closure<?> block) {
        runDelegate(new GetAuditEventFactoryClassCmd(), block)
    }

    /**
     * Lists the audit notifications.
     * @param block to configure
     */
    def listAuditNotifications(@DelegatesTo(ListAuditNotificationsCmd) Closure<?> block) {
        runDelegate(new ListAuditNotificationsCmd(), block)
    }

    /**
     * Returns a list of core group servers.
     * @param block to configure
     */
    def listCoreGroupServers(@DelegatesTo(ListCoreGroupServersCmd) Closure<?> block) {
        runDelegate(new ListCoreGroupServersCmd(), block)
    }

    /**
     * Modifies the JavaServer Faces implementation used by the WebSphere runtime for an application
     * @param block to configure
     */
    def modifyJSFImplementation(@DelegatesTo(ModifyJSFImplementationCmd) Closure<?> block) {
        runDelegate(new ModifyJSFImplementationCmd(), block)
    }

    /**
     * Configure an LDAP user registry in the administrative security configuration
     * @param block to configure
     */
    def configureAdminLDAPUserRegistry(@DelegatesTo(ConfigureAdminLDAPUserRegistryCmd) Closure<?> block) {
        runDelegate(new ConfigureAdminLDAPUserRegistryCmd(), block)
    }

    /**
     * Allows the override for receiver inheritance for an individual topic on a specified topic space.  Setting the "inherit" value to true will allow the topic to inherit from the default values.
     * @param block to configure
     */
    def setInheritReceiverForTopic(@DelegatesTo(SetInheritReceiverForTopicCmd) Closure<?> block) {
        runDelegate(new SetInheritReceiverForTopicCmd(), block)
    }

    /**
     * Prepare keys and keystores for Cell profile creation.
     * @param block to configure
     */
    def prepareKeysForCellProfile(@DelegatesTo(PrepareKeysForCellProfileCmd) Closure<?> block) {
        runDelegate(new PrepareKeysForCellProfileCmd(), block)
    }

    /**
     * list all the nodes in the cell or on a specified nodeGroup.
     * @param block to configure
     */
    def listNodes(@DelegatesTo(ListNodesCmd) Closure<?> block) {
        runDelegate(new ListNodesCmd(), block)
    }

    /**
     * Delete the personal certificate used for audit encryption from the keystore identified as the audit encryption keystore
     * @param block to configure
     */
    def deleteAuditCertificate(@DelegatesTo(DeleteAuditCertificateCmd) Closure<?> block) {
        runDelegate(new DeleteAuditCertificateCmd(), block)
    }

    /**
     * The copyPolicySet command creates a copy of an existing policy set. The default indicator is set to false for the new policy set. You may indicate whether to transfer attachments from the existing policy set to the new policy set.
     * @param block to configure
     */
    def copyPolicySet(@DelegatesTo(CopyPolicySetCmd) Closure<?> block) {
        runDelegate(new CopyPolicySetCmd(), block)
    }

    /**
     * Deletes the default parent of an entity type for a realm. If * is specified as entityTypeName, default parent mapping for all entity types is deleted. If the realm name is not specified, default realm is used. 
     * @param block to configure
     */
    def deleteIdMgrRealmDefaultParent(@DelegatesTo(DeleteIdMgrRealmDefaultParentCmd) Closure<?> block) {
        runDelegate(new DeleteIdMgrRealmDefaultParentCmd(), block)
    }

    /**
     * This command adds the SAML Single Sign-On (SSO) service provider (SP) to the security configuration SAML TAI.
     * @param block to configure
     */
    def addSAMLTAISSO(@DelegatesTo(AddSAMLTAISSOCmd) Closure<?> block) {
        runDelegate(new AddSAMLTAISSOCmd(), block)
    }

    /**
     * This command displays the SAML TAI IdP partner in the security configuration. If an idpId is not specified, all the SAML TAI IdP partners are displayed.
     * @param block to configure
     */
    def showSAMLIdpPartner(@DelegatesTo(ShowSAMLIdpPartnerCmd) Closure<?> block) {
        runDelegate(new ShowSAMLIdpPartnerCmd(), block)
    }

    /**
     * list all job scheduler attributes
     * @param block to configure
     */
    def showJobSchedulerAttributes(@DelegatesTo(ShowJobSchedulerAttributesCmd) Closure<?> block) {
        runDelegate(new ShowJobSchedulerAttributesCmd(), block)
    }

    /**
     * Returns a list of supported database types.
     * @param block to configure
     */
    def listIdMgrSupportedDBTypes(@DelegatesTo(ListIdMgrSupportedDBTypesCmd) Closure<?> block) {
        runDelegate(new ListIdMgrSupportedDBTypesCmd(), block)
    }

    /**
     * Configures audit record signing.
     * @param block to configure
     */
    def createAuditSigningConfig(@DelegatesTo(CreateAuditSigningConfigCmd) Closure<?> block) {
        runDelegate(new CreateAuditSigningConfigCmd(), block)
    }

    /**
     * Use the "enableLMServiceEventPoint" command to enable a local mapping service event point, in order to generate service mapping events.
     * @param block to configure
     */
    def enableLMServiceEventPoint(@DelegatesTo(EnableLMServiceEventPointCmd) Closure<?> block) {
        runDelegate(new EnableLMServiceEventPointCmd(), block)
    }

    /**
     * Connect an endpoint listener to a service integration bus.
     * @param block to configure
     */
    def connectSIBWSEndpointListener(@DelegatesTo(ConnectSIBWSEndpointListenerCmd) Closure<?> block) {
        runDelegate(new ConnectSIBWSEndpointListenerCmd(), block)
    }

    /**
     * Deletes a base entry from the specified repository. 
     * @param block to configure
     */
    def deleteIdMgrRepositoryBaseEntry(@DelegatesTo(DeleteIdMgrRepositoryBaseEntryCmd) Closure<?> block) {
        runDelegate(new DeleteIdMgrRepositoryBaseEntryCmd(), block)
    }

    /**
     * Shows the inherit sender defaults for a topic for a specified topic space.  Returns "true" if the topic inherits from sender default values.
     * @param block to configure
     */
    def isInheritSenderForTopic(@DelegatesTo(IsInheritSenderForTopicCmd) Closure<?> block) {
        runDelegate(new IsInheritSenderForTopicCmd(), block)
    }

    /**
     * Delete OAuth Provider
     * @param block to configure
     */
    def deleteOAuthProvider(@DelegatesTo(DeleteOAuthProviderCmd) Closure<?> block) {
        runDelegate(new DeleteOAuthProviderCmd(), block)
    }

    /**
     * Show the attributes of a bus.
     * @param block to configure
     */
    def showSIBus(@DelegatesTo(ShowSIBusCmd) Closure<?> block) {
        runDelegate(new ShowSIBusCmd(), block)
    }

    /**
     * Delete a WS-Notification service point
     * @param block to configure
     */
    def deleteWSNServicePoint(@DelegatesTo(DeleteWSNServicePointCmd) Closure<?> block) {
        runDelegate(new DeleteWSNServicePointCmd(), block)
    }

    /**
     * List authentication data entries in the administrative security configuration or a in a security domain. 
     * @param block to configure
     */
    def listAuthDataEntries(@DelegatesTo(ListAuthDataEntriesCmd) Closure<?> block) {
        runDelegate(new ListAuthDataEntriesCmd(), block)
    }

    /**
     * The getPolicyType command returns the attributes for a specified policy.
     * @param block to configure
     */
    def getPolicyType(@DelegatesTo(GetPolicyTypeCmd) Closure<?> block) {
        runDelegate(new GetPolicyTypeCmd(), block)
    }

    /**
     * Add feature pack or stack product information to product info.
     * @param block to configure
     */
    def addProductInfo(@DelegatesTo(AddProductInfoCmd) Closure<?> block) {
        runDelegate(new AddProductInfoCmd(), block)
    }

    /**
     * List the users in a default role.
     * @param block to configure
     */
    def listUsersInDefaultRole(@DelegatesTo(ListUsersInDefaultRoleCmd) Closure<?> block) {
        runDelegate(new ListUsersInDefaultRoleCmd(), block)
    }

    /**
     * Updates all cluster members about the application config changes.
     * @param block to configure
     */
    def updateAppOnCluster(@DelegatesTo(UpdateAppOnClusterCmd) Closure<?> block) {
        runDelegate(new UpdateAppOnClusterCmd(), block)
    }

    /**
     * Validates the Kerberos configuration data either in the global security configuration file security.xml or specified as an input parameters. 
     * @param block to configure
     */
    def validateKrbConfig(@DelegatesTo(ValidateKrbConfigCmd) Closure<?> block) {
        runDelegate(new ValidateKrbConfigCmd(), block)
    }

    /**
     * Configures an interceptor.
     * @param block to configure
     */
    def configureInterceptor(@DelegatesTo(ConfigureInterceptorCmd) Closure<?> block) {
        runDelegate(new ConfigureInterceptorCmd(), block)
    }

    /**
     * List all SIB JMS queues at the specified scope.
     * @param block to configure
     */
    def listSIBJMSQueues(@DelegatesTo(ListSIBJMSQueuesCmd) Closure<?> block) {
        runDelegate(new ListSIBJMSQueuesCmd(), block)
    }

    /**
     * Set the default outbound port for an outbound service.
     * @param block to configure
     */
    def setDefaultSIBWSOutboundPort(@DelegatesTo(SetDefaultSIBWSOutboundPortCmd) Closure<?> block) {
        runDelegate(new SetDefaultSIBWSOutboundPortCmd(), block)
    }

    /**
     * Return a collection of core groups that are related to the specified core group. 
     * @param block to configure
     */
    def listCoreGroups(@DelegatesTo(ListCoreGroupsCmd) Closure<?> block) {
        runDelegate(new ListCoreGroupsCmd(), block)
    }

    /**
     * Adds the specified chain to the list of permitted chains for the specified bus.
     * @param block to configure
     */
    def addSIBPermittedChain(@DelegatesTo(AddSIBPermittedChainCmd) Closure<?> block) {
        runDelegate(new AddSIBPermittedChainCmd(), block)
    }

    /**
     * This command is used to get the supported job types for a managed node.
     * @param block to configure
     */
    def getJobTypes(@DelegatesTo(GetJobTypesCmd) Closure<?> block) {
        runDelegate(new GetJobTypesCmd(), block)
    }

    /**
     * List all of the defined administrative object interfaces on the specified J2C resource adapter.
     * @param block to configure
     */
    def listAdminObjectInterfaces(@DelegatesTo(ListAdminObjectInterfacesCmd) Closure<?> block) {
        runDelegate(new ListAdminObjectInterfacesCmd(), block)
    }

    /**
     * Returns repository specific details for the repositories configuration for the specified realm.
     * @param block to configure
     */
    def getIdMgrRepositoriesForRealm(@DelegatesTo(GetIdMgrRepositoriesForRealmCmd) Closure<?> block) {
        runDelegate(new GetIdMgrRepositoriesForRealmCmd(), block)
    }

    /**
     * Update the assigned token type for an endpoint. If the local name parameter is omitted, the default token type is assumed.
     * @param block to configure
     */
    def updateSTSEndpointTokenType(@DelegatesTo(UpdateSTSEndpointTokenTypeCmd) Closure<?> block) {
        runDelegate(new UpdateSTSEndpointTokenTypeCmd(), block)
    }

    /**
     * Generate all the keys in a KeySet.
     * @param block to configure
     */
    def generateKeyForKeySet(@DelegatesTo(GenerateKeyForKeySetCmd) Closure<?> block) {
        runDelegate(new GenerateKeyForKeySetCmd(), block)
    }

    /**
     * Remove all default roles
     * @param block to configure
     */
    def removeDefaultRoles(@DelegatesTo(RemoveDefaultRolesCmd) Closure<?> block) {
        runDelegate(new RemoveDefaultRolesCmd(), block)
    }

    /**
     * Show the properties of a WSNTopicDocument in a human readable form.
     * @param block to configure
     */
    def showWSNTopicDocument(@DelegatesTo(ShowWSNTopicDocumentCmd) Closure<?> block) {
        runDelegate(new ShowWSNTopicDocumentCmd(), block)
    }

    /**
     * Add a composition unit, based on an asset or another business-level application, to a business-level application.
     * @param block to configure
     */
    def addCompUnit(@DelegatesTo(AddCompUnitCmd) Closure<?> block) {
        runDelegate(new AddCompUnitCmd(), block)
    }

    /**
     * Get the JNDI name that is bound to java:comp/DefaultManagedExecutorService.
     * @param block to configure
     */
    def getDefaultManagedExecutor(@DelegatesTo(GetDefaultManagedExecutorCmd) Closure<?> block) {
        runDelegate(new GetDefaultManagedExecutorCmd(), block)
    }

    /**
     * Shows information about a particular key store.
     * @param block to configure
     */
    def getAuditKeyStoreInfo(@DelegatesTo(GetAuditKeyStoreInfoCmd) Closure<?> block) {
        runDelegate(new GetAuditKeyStoreInfoCmd(), block)
    }

    /**
     * Task to convert server level security configuration to a security domain configuration.
     * @param block to configure
     */
    def convertServerSecurityToSecurityDomain(@DelegatesTo(ConvertServerSecurityToSecurityDomainCmd) Closure<?> block) {
        runDelegate(new ConvertServerSecurityToSecurityDomainCmd(), block)
    }

    /**
     * The getPolicySet command returns general attributes, such as description and default indicator, for the specified policy set.
     * @param block to configure
     */
    def getPolicySet(@DelegatesTo(GetPolicySetCmd) Closure<?> block) {
        runDelegate(new GetPolicySetCmd(), block)
    }

    /**
     * WASX7332I: Method: getCell

	Arguments: none

	Description: Returns the cell to which the scripting process is
	connected.
     * @param block to configure
     */
    def adminservice_getCellName(@DelegatesTo(Adminservice_getCellNameCmd) Closure<?> block) {
        runDelegate(new Adminservice_getCellNameCmd(), block)
    }

    /**
     * Modify a named WebSphere MQ server's attributes.
     * @param block to configure
     */
    def modifySIBWMQServer(@DelegatesTo(ModifySIBWMQServerCmd) Closure<?> block) {
        runDelegate(new ModifySIBWMQServerCmd(), block)
    }

    /**
     * WASX7044I: Method: getAttributes

	Arguments: object name, attributes
	Returns a string listing the values of the attributes named in 
	"attributes" for the object named by "object name". 
     * @param block to configure
     */
    def adminservice_getAttributes(@DelegatesTo(Adminservice_getAttributesCmd) Closure<?> block) {
        runDelegate(new Adminservice_getAttributesCmd(), block)
    }

    /**
     * Sets the global schema option for the data model in a multiple security domain environment, where global schema refers to the schema of the admin domain.
     * @param block to configure
     */
    def setIdMgrUseGlobalSchemaForModel(@DelegatesTo(SetIdMgrUseGlobalSchemaForModelCmd) Closure<?> block) {
        runDelegate(new SetIdMgrUseGlobalSchemaForModelCmd(), block)
    }

    /**
     * Removes a group from the specified destination role for the specified destination.
     * @param block to configure
     */
    def removeGroupFromDestinationRole(@DelegatesTo(RemoveGroupFromDestinationRoleCmd) Closure<?> block) {
        runDelegate(new RemoveGroupFromDestinationRoleCmd(), block)
    }

    /**
     * Creates a new keystore.
     * @param block to configure
     */
    def createKeyStore(@DelegatesTo(CreateKeyStoreCmd) Closure<?> block) {
        runDelegate(new CreateKeyStoreCmd(), block)
    }

    /**
     * Delete the named checkpoint specified by the "checkpointName"
     * @param block to configure
     */
    def deleteCheckpoint(@DelegatesTo(DeleteCheckpointCmd) Closure<?> block) {
        runDelegate(new DeleteCheckpointCmd(), block)
    }

    /**
     * Returns the class name associated with the supplied emitter reference.
     * @param block to configure
     */
    def getEmitterClass(@DelegatesTo(GetEmitterClassCmd) Closure<?> block) {
        runDelegate(new GetEmitterClassCmd(), block)
    }

    /**
     * modify the property of a node group
     * @param block to configure
     */
    def modifyNodeGroupProperty(@DelegatesTo(ModifyNodeGroupPropertyCmd) Closure<?> block) {
        runDelegate(new ModifyNodeGroupPropertyCmd(), block)
    }

    /**
     * Create a proxy configuration for a Web module
     * @param block to configure
     */
    def createWebModuleProxyConfig(@DelegatesTo(CreateWebModuleProxyConfigCmd) Closure<?> block) {
        runDelegate(new CreateWebModuleProxyConfigCmd(), block)
    }

    /**
     * Deletes the IBM MQ Connection Factory object provided to the command.
     * @param block to configure
     */
    def deleteWMQConnectionFactory(@DelegatesTo(DeleteWMQConnectionFactoryCmd) Closure<?> block) {
        runDelegate(new DeleteWMQConnectionFactoryCmd(), block)
    }

    /**
     * Delete bridge interfaces associated with a specified core group, node and server.
     * @param block to configure
     */
    def removeCoreGroupBridgeInterface(@DelegatesTo(RemoveCoreGroupBridgeInterfaceCmd) Closure<?> block) {
        runDelegate(new RemoveCoreGroupBridgeInterfaceCmd(), block)
    }

    /**
     * Deletes an audit emitter implementation object by unique name.
     * @param block to configure
     */
    def deleteAuditEmitterByName(@DelegatesTo(DeleteAuditEmitterByNameCmd) Closure<?> block) {
        runDelegate(new DeleteAuditEmitterByNameCmd(), block)
    }

    /**
     * Returns the LDAP entity type configuration data for the specified entity type in the LDAP repository.
     * @param block to configure
     */
    def getIdMgrLDAPEntityType(@DelegatesTo(GetIdMgrLDAPEntityTypeCmd) Closure<?> block) {
        runDelegate(new GetIdMgrLDAPEntityTypeCmd(), block)
    }

    /**
     * creates a server Template based on a server configuration
     * @param block to configure
     */
    def createGenericServerTemplate(@DelegatesTo(CreateGenericServerTemplateCmd) Closure<?> block) {
        runDelegate(new CreateGenericServerTemplateCmd(), block)
    }

    /**
     * List of ciphers.
     * @param block to configure
     */
    def listSSLCiphers(@DelegatesTo(ListSSLCiphersCmd) Closure<?> block) {
        runDelegate(new ListSSLCiphersCmd(), block)
    }

    /**
     * Disables audit encryption.
     * @param block to configure
     */
    def disableAuditEncryption(@DelegatesTo(DisableAuditEncryptionCmd) Closure<?> block) {
        runDelegate(new DisableAuditEncryptionCmd(), block)
    }

    /**
     * Modify an authentication data entry
     * @param block to configure
     */
    def modifyAuthDataEntry(@DelegatesTo(ModifyAuthDataEntryCmd) Closure<?> block) {
        runDelegate(new ModifyAuthDataEntryCmd(), block)
    }

    /**
     * Give a user permission to connect to the bus specified.
     * @param block to configure
     */
    def addUserToBusConnectorRole(@DelegatesTo(AddUserToBusConnectorRoleCmd) Closure<?> block) {
        runDelegate(new AddUserToBusConnectorRoleCmd(), block)
    }

    /**
     * Modify the a key set group.
     * @param block to configure
     */
    def modifyKeySetGroup(@DelegatesTo(ModifyKeySetGroupCmd) Closure<?> block) {
        runDelegate(new ModifyKeySetGroupCmd(), block)
    }

    /**
     * Deletes a LDAP attribute configuration data for a specified entity type for a specific LDAP repository. Use the name of either the LDAP attribute or virtual member manager property.
     * @param block to configure
     */
    def deleteIdMgrLDAPAttr(@DelegatesTo(DeleteIdMgrLDAPAttrCmd) Closure<?> block) {
        runDelegate(new DeleteIdMgrLDAPAttrCmd(), block)
    }

    /**
     * This command is used to get the latest job target status for a job.
     * @param block to configure
     */
    def getJobTargetStatus(@DelegatesTo(GetJobTargetStatusCmd) Closure<?> block) {
        runDelegate(new GetJobTargetStatusCmd(), block)
    }

    /**
     * List the J2C activation specifications that have a specified message listener type defined in the specified J2C resource adapter.
     * @param block to configure
     */
    def listJ2CActivationSpecs(@DelegatesTo(ListJ2CActivationSpecsCmd) Closure<?> block) {
        runDelegate(new ListJ2CActivationSpecsCmd(), block)
    }

    /**
     * This command configures embedded Tivoli Access Manager on the WebSphere Application Server node or nodes specified.
     * @param block to configure
     */
    def configureTAM(@DelegatesTo(ConfigureTAMCmd) Closure<?> block) {
        runDelegate(new ConfigureTAMCmd(), block)
    }

    /**
     * Map userids to one or more admin role in the authorization group.
     * @param block to configure
     */
    def mapUsersToAdminRole(@DelegatesTo(MapUsersToAdminRoleCmd) Closure<?> block) {
        runDelegate(new MapUsersToAdminRoleCmd(), block)
    }

    /**
     * Returns information about a user registry from the administrative security configuration or an application security domain.
     * @param block to configure
     */
    def getUserRegistryInfo(@DelegatesTo(GetUserRegistryInfoCmd) Closure<?> block) {
        runDelegate(new GetUserRegistryInfoCmd(), block)
    }

    /**
     * Stop a managed node's polling against a JobManager
     * @param block to configure
     */
    def stopPollingJobManager(@DelegatesTo(StopPollingJobManagerCmd) Closure<?> block) {
        runDelegate(new StopPollingJobManagerCmd(), block)
    }

    /**
     * Create an inbound service.
     * @param block to configure
     */
    def createSIBWSInboundService(@DelegatesTo(CreateSIBWSInboundServiceCmd) Closure<?> block) {
        runDelegate(new CreateSIBWSInboundServiceCmd(), block)
    }

    /**
     * null
     * @param block to configure
     */
    def putMWSConfigFile(@DelegatesTo(PutMWSConfigFileCmd) Closure<?> block) {
        runDelegate(new PutMWSConfigFileCmd(), block)
    }

    /**
     * Set the JNDI name that is bound to java:comp/DefaultJMSConnectionFactory.
     * @param block to configure
     */
    def setDefaultJMSConnectionFactory(@DelegatesTo(SetDefaultJMSConnectionFactoryCmd) Closure<?> block) {
        runDelegate(new SetDefaultJMSConnectionFactoryCmd(), block)
    }

    /**
     * Remove a token type configuration from the STS.
     * @param block to configure
     */
    def removeSTSTokenTypeConfiguration(@DelegatesTo(RemoveSTSTokenTypeConfigurationCmd) Closure<?> block) {
        runDelegate(new RemoveSTSTokenTypeConfigurationCmd(), block)
    }

    /**
     * The createPolicySetAttachment command creates a new policy set attachment.
     * @param block to configure
     */
    def createPolicySetAttachment(@DelegatesTo(CreatePolicySetAttachmentCmd) Closure<?> block) {
        runDelegate(new CreatePolicySetAttachmentCmd(), block)
    }

    /**
     * Gets the active security setting for global security or in a security domain.
     * @param block to configure
     */
    def getActiveSecuritySettings(@DelegatesTo(GetActiveSecuritySettingsCmd) Closure<?> block) {
        runDelegate(new GetActiveSecuritySettingsCmd(), block)
    }

    /**
     * The listPolicyTypes command returns a list of the names of the policies configured in the system, in a policy set, or in a binding.
     * @param block to configure
     */
    def listPolicyTypes(@DelegatesTo(ListPolicyTypesCmd) Closure<?> block) {
        runDelegate(new ListPolicyTypesCmd(), block)
    }

    /**
     * Shows all IBM MQ resource adapter and IBM MQ messaging provider settings which can be set by the manageWMQ command.
     * @param block to configure
     */
    def showWMQ(@DelegatesTo(ShowWMQCmd) Closure<?> block) {
        runDelegate(new ShowWMQCmd(), block)
    }

    /**
     * Retrieves the property schema of an entity type. If repository ID is not specified then it returns the default property schema supported by virtual member manager. If propertyNames is not specified it returns schema of all the properties. If entity type is not specified then it retrieves the property schema for all entity types. If propertyNames is specified then entityTypeName must be specified.
     * @param block to configure
     */
    def getIdMgrPropertySchema(@DelegatesTo(GetIdMgrPropertySchemaCmd) Closure<?> block) {
        runDelegate(new GetIdMgrPropertySchemaCmd(), block)
    }

    /**
     * Gets current security wizard settings from the workspace.
     * @param block to configure
     */
    def getCurrentWizardSettings(@DelegatesTo(GetCurrentWizardSettingsCmd) Closure<?> block) {
        runDelegate(new GetCurrentWizardSettingsCmd(), block)
    }

    /**
     * Removes a user from the specified foreign bus role for the bus specified
     * @param block to configure
     */
    def removeUserFromForeignBusRole(@DelegatesTo(RemoveUserFromForeignBusRoleCmd) Closure<?> block) {
        runDelegate(new RemoveUserFromForeignBusRoleCmd(), block)
    }

    /**
     * Creates a new Key Store.
     * @param block to configure
     */
    def createAuditKeyStore(@DelegatesTo(CreateAuditKeyStoreCmd) Closure<?> block) {
        runDelegate(new CreateAuditKeyStoreCmd(), block)
    }

    /**
     * listSupportedPolicySetsCmdDesc
     * @param block to configure
     */
    def listSupportedPolicySets(@DelegatesTo(ListSupportedPolicySetsCmd) Closure<?> block) {
        runDelegate(new ListSupportedPolicySetsCmd(), block)
    }

    /**
     * (Deprecated) list properties of the long-running scheduler. Use listJobSchedulerProperties.
     * @param block to configure
     */
    def listLongRunningSchedulerProperties(@DelegatesTo(ListLongRunningSchedulerPropertiesCmd) Closure<?> block) {
        runDelegate(new ListLongRunningSchedulerPropertiesCmd(), block)
    }

    /**
     * A command that can be used to change the server generic short name. 
     * @param block to configure
     */
    def changeServerGenericShortName(@DelegatesTo(ChangeServerGenericShortNameCmd) Closure<?> block) {
        runDelegate(new ChangeServerGenericShortNameCmd(), block)
    }

    /**
     * Modifies an entry in the audit.xml to reference the configuration of an audit event factory implementation of the Audit Event Factory interface.
     * @param block to configure
     */
    def modifyAuditEventFactory(@DelegatesTo(ModifyAuditEventFactoryCmd) Closure<?> block) {
        runDelegate(new ModifyAuditEventFactoryCmd(), block)
    }

    /**
     * WASX7043I: Method: getAttribute

	Arguments: object name, attribute

	Description: Returns value of "attribute" for the MBean described by 
	"object name."
     * @param block to configure
     */
    def adminservice_getAttribute(@DelegatesTo(Adminservice_getAttributeCmd) Closure<?> block) {
        runDelegate(new Adminservice_getAttributeCmd(), block)
    }

    /**
     * Use the "deleteLMServiceEventPoint" command to delete a local mapping service event point.
     * @param block to configure
     */
    def deleteLMServiceEventPoint(@DelegatesTo(DeleteLMServiceEventPointCmd) Closure<?> block) {
        runDelegate(new DeleteLMServiceEventPointCmd(), block)
    }

    /**
     * List all the resources within the given Authorization Group.
     * @param block to configure
     */
    def listResourcesOfAuthorizationGroup(@DelegatesTo(ListResourcesOfAuthorizationGroupCmd) Closure<?> block) {
        runDelegate(new ListResourcesOfAuthorizationGroupCmd(), block)
    }

    /**
     * This command displays the SPNEGO Web authentication Filter in the security configuration. If a host name is not specified, all the SPNEGO Web authentication Filters are displayed.
     * @param block to configure
     */
    def showSpnegoFilter(@DelegatesTo(ShowSpnegoFilterCmd) Closure<?> block) {
        runDelegate(new ShowSpnegoFilterCmd(), block)
    }

    /**
     * Delete all the core group access points associated with a specified core group.
     * @param block to configure
     */
    def deleteCoreGroupAccessPoints(@DelegatesTo(DeleteCoreGroupAccessPointsCmd) Closure<?> block) {
        runDelegate(new DeleteCoreGroupAccessPointsCmd(), block)
    }

    /**
     * Remove an inbound port.
     * @param block to configure
     */
    def removeSIBWSInboundPort(@DelegatesTo(RemoveSIBWSInboundPortCmd) Closure<?> block) {
        runDelegate(new RemoveSIBWSInboundPortCmd(), block)
    }

    /**
     * Lists the login module configuration aliases.
     * @param block to configure
     */
    def listLoginConfigs(@DelegatesTo(ListLoginConfigsCmd) Closure<?> block) {
        runDelegate(new ListLoginConfigsCmd(), block)
    }

    /**
     * The list of personal certificates in a given keystore.
     * @param block to configure
     */
    def listPersonalCertificates(@DelegatesTo(ListPersonalCertificatesCmd) Closure<?> block) {
        runDelegate(new ListPersonalCertificatesCmd(), block)
    }

    /**
     * Sets the auditor password in the audit.xml file.
     * @param block to configure
     */
    def setAuditorPwd(@DelegatesTo(SetAuditorPwdCmd) Closure<?> block) {
        runDelegate(new SetAuditorPwdCmd(), block)
    }

    /**
     * Delete the proxy server configuration for a Web module
     * @param block to configure
     */
    def deleteWebModuleProxyConfig(@DelegatesTo(DeleteWebModuleProxyConfigCmd) Closure<?> block) {
        runDelegate(new DeleteWebModuleProxyConfigCmd(), block)
    }

    /**
     * Converts to a sysplex node group
     * @param block to configure
     */
    def convertToSysplexNodeGroup(@DelegatesTo(ConvertToSysplexNodeGroupCmd) Closure<?> block) {
        runDelegate(new ConvertToSysplexNodeGroupCmd(), block)
    }

    /**
     * Retrieve signer information from a port.
     * @param block to configure
     */
    def retrieveSignerInfoFromPort(@DelegatesTo(RetrieveSignerInfoFromPortCmd) Closure<?> block) {
        runDelegate(new RetrieveSignerInfoFromPortCmd(), block)
    }

    /**
     * Backs up the job manager database to a specified location.
     * @param block to configure
     */
    def backupJobManager(@DelegatesTo(BackupJobManagerCmd) Closure<?> block) {
        runDelegate(new BackupJobManagerCmd(), block)
    }

    /**
     * Show the properties of a WSNService object in a human readable form.
     * @param block to configure
     */
    def showWSNService(@DelegatesTo(ShowWSNServiceCmd) Closure<?> block) {
        runDelegate(new ShowWSNServiceCmd(), block)
    }

    /**
     * Sets the default parent of an entity type in a specified realm. If mapping does not exist it is added, else the mapping is updated. If realm name is not specified, default realm is used. 
     * @param block to configure
     */
    def setIdMgrRealmDefaultParent(@DelegatesTo(SetIdMgrRealmDefaultParentCmd) Closure<?> block) {
        runDelegate(new SetIdMgrRealmDefaultParentCmd(), block)
    }

    /**
     * Lists the uniqueName of users for each role.
     * @param block to configure
     */
    def listIdMgrUsersForRoles(@DelegatesTo(ListIdMgrUsersForRolesCmd) Closure<?> block) {
        runDelegate(new ListIdMgrUsersForRolesCmd(), block)
    }

    /**
     * List the mediations on a bus.
     * @param block to configure
     */
    def listSIBMediations(@DelegatesTo(ListSIBMediationsCmd) Closure<?> block) {
        runDelegate(new ListSIBMediationsCmd(), block)
    }

    /**
     * Get information about a Key Reference in a particular keySet.
     * @param block to configure
     */
    def getKeyReference(@DelegatesTo(GetKeyReferenceCmd) Closure<?> block) {
        runDelegate(new GetKeyReferenceCmd(), block)
    }

    /**
     * List the groups and special subjects from all naming roles.
     * @param block to configure
     */
    def listGroupsForNamingRoles(@DelegatesTo(ListGroupsForNamingRolesCmd) Closure<?> block) {
        runDelegate(new ListGroupsForNamingRolesCmd(), block)
    }

    /**
     * Changes the password of this logged-in user.
     * @param block to configure
     */
    def changeMyPassword(@DelegatesTo(ChangeMyPasswordCmd) Closure<?> block) {
        runDelegate(new ChangeMyPasswordCmd(), block)
    }

    /**
     * View options for a specified business-level application.
     * @param block to configure
     */
    def viewBLA(@DelegatesTo(ViewBLACmd) Closure<?> block) {
        runDelegate(new ViewBLACmd(), block)
    }

    /**
     * null
     * @param block to configure
     */
    def getClusterLimit(@DelegatesTo(GetClusterLimitCmd) Closure<?> block) {
        runDelegate(new GetClusterLimitCmd(), block)
    }

    /**
     * Configure single signon.
     * @param block to configure
     */
    def configureSingleSignon(@DelegatesTo(ConfigureSingleSignonCmd) Closure<?> block) {
        runDelegate(new ConfigureSingleSignonCmd(), block)
    }

    /**
     * Deletes the audit event factory specified by the reference id.
     * @param block to configure
     */
    def deleteAuditEventFactoryByRef(@DelegatesTo(DeleteAuditEventFactoryByRefCmd) Closure<?> block) {
        runDelegate(new DeleteAuditEventFactoryByRefCmd(), block)
    }

    /**
     * Modify a policy that matches the provided policy name.
     * @param block to configure
     */
    def modifyPolicy(@DelegatesTo(ModifyPolicyCmd) Closure<?> block) {
        runDelegate(new ModifyPolicyCmd(), block)
    }

    /**
     * Create an outbound service.
     * @param block to configure
     */
    def createSIBWSOutboundService(@DelegatesTo(CreateSIBWSOutboundServiceCmd) Closure<?> block) {
        runDelegate(new CreateSIBWSOutboundServiceCmd(), block)
    }

    /**
     * Get the profile key
     * @param block to configure
     */
    def getProfileKey(@DelegatesTo(GetProfileKeyCmd) Closure<?> block) {
        runDelegate(new GetProfileKeyCmd(), block)
    }

    /**
     * Get properties associated with a specific managed resource.
     * @param block to configure
     */
    def getManagedResourceProperties(@DelegatesTo(GetManagedResourcePropertiesCmd) Closure<?> block) {
        runDelegate(new GetManagedResourcePropertiesCmd(), block)
    }

    /**
     * Lists all foreign buses which have roles defined on them for the specified bus.
     * @param block to configure
     */
    def listAllForeignBusesWithRoles(@DelegatesTo(ListAllForeignBusesWithRolesCmd) Closure<?> block) {
        runDelegate(new ListAllForeignBusesWithRolesCmd(), block)
    }

    /**
     * Query the STS for the values of the default properties for a given token type.
     * @param block to configure
     */
    def querySTSTokenTypeConfigurationDefaultProperties(@DelegatesTo(QuerySTSTokenTypeConfigurationDefaultPropertiesCmd) Closure<?> block) {
        runDelegate(new QuerySTSTokenTypeConfigurationDefaultPropertiesCmd(), block)
    }

    /**
     * Get the name of the core group the server is a member of.
     * @param block to configure
     */
    def getCoreGroupNameForServer(@DelegatesTo(GetCoreGroupNameForServerCmd) Closure<?> block) {
        runDelegate(new GetCoreGroupNameForServerCmd(), block)
    }

    /**
     * Delete an existing Dynamic SSL configuration Selection.
     * @param block to configure
     */
    def deleteDynamicSSLConfigSelection(@DelegatesTo(DeleteDynamicSSLConfigSelectionCmd) Closure<?> block) {
        runDelegate(new DeleteDynamicSSLConfigSelectionCmd(), block)
    }

    /**
     * (Deprecated) add a custom property for long-running scheduler. Use createJobSchedulerProperty.
     * @param block to configure
     */
    def createLongRunningSchedulerProperty(@DelegatesTo(CreateLongRunningSchedulerPropertyCmd) Closure<?> block) {
        runDelegate(new CreateLongRunningSchedulerPropertyCmd(), block)
    }

    /**
     * Delete a descriptive property under an object.
     * @param block to configure
     */
    def deleteDescriptiveProp(@DelegatesTo(DeleteDescriptivePropCmd) Closure<?> block) {
        runDelegate(new DeleteDescriptivePropCmd(), block)
    }

    /**
     * Create a new business-level application with no composition units.
     * @param block to configure
     */
    def createEmptyBLA(@DelegatesTo(CreateEmptyBLACmd) Closure<?> block) {
        runDelegate(new CreateEmptyBLACmd(), block)
    }

    /**
     * Returns the security domain that a particular scope belongs to.
     * @param block to configure
     */
    def getSecurityDomainForResource(@DelegatesTo(GetSecurityDomainForResourceCmd) Closure<?> block) {
        runDelegate(new GetSecurityDomainForResourceCmd(), block)
    }

    /**
     * Deletes the member attribute configuration from the LDAP group configuration.
     * @param block to configure
     */
    def deleteIdMgrLDAPGroupMemberAttr(@DelegatesTo(DeleteIdMgrLDAPGroupMemberAttrCmd) Closure<?> block) {
        runDelegate(new DeleteIdMgrLDAPGroupMemberAttrCmd(), block)
    }

    /**
     * Modify a SSL configuration.
     * @param block to configure
     */
    def modifySSLConfig(@DelegatesTo(ModifySSLConfigCmd) Closure<?> block) {
        runDelegate(new ModifySSLConfigCmd(), block)
    }

    /**
     * Generates a new AES password encryption key, sets it as the current key for the encryption, and then updates the passwords with the new key. This command is disabled when the custom KeyManager class is used.
     * @param block to configure
     */
    def regenPasswordEncryptionKey(@DelegatesTo(RegenPasswordEncryptionKeyCmd) Closure<?> block) {
        runDelegate(new RegenPasswordEncryptionKeyCmd(), block)
    }

    /**
     * Add a configuration group.
     * @param block to configure
     */
    def addSTSConfigurationGroup(@DelegatesTo(AddSTSConfigurationGroupCmd) Closure<?> block) {
        runDelegate(new AddSTSConfigurationGroupCmd(), block)
    }

    /**
     * Extract a signer certificate from a keystore.
     * @param block to configure
     */
    def extractSignerCertificate(@DelegatesTo(ExtractSignerCertificateCmd) Closure<?> block) {
        runDelegate(new ExtractSignerCertificateCmd(), block)
    }

    /**
     * Checks if the provided runas user is valid.  True is return if the runas user is valid and false if it is not. 
     * @param block to configure
     */
    def checkRegistryRunAsUser(@DelegatesTo(CheckRegistryRunAsUserCmd) Closure<?> block) {
        runDelegate(new CheckRegistryRunAsUserCmd(), block)
    }

    /**
     * Creates a PersonAccount in the default realm.
     * @param block to configure
     */
    def createUser(@DelegatesTo(CreateUserCmd) Closure<?> block) {
        runDelegate(new CreateUserCmd(), block)
    }

    /**
     * Get the names of all core groups
     * @param block to configure
     */
    def getAllCoreGroupNames(@DelegatesTo(GetAllCoreGroupNamesCmd) Closure<?> block) {
        runDelegate(new GetAllCoreGroupNamesCmd(), block)
    }

    /**
     * Delete an asset which was imported into the product configuration repository.
     * @param block to configure
     */
    def deleteAsset(@DelegatesTo(DeleteAssetCmd) Closure<?> block) {
        runDelegate(new DeleteAssetCmd(), block)
    }

    /**
     * Adds a bundle to the internal bundle repository.
     * @param block to configure
     */
    def addLocalRepositoryBundle(@DelegatesTo(AddLocalRepositoryBundleCmd) Closure<?> block) {
        runDelegate(new AddLocalRepositoryBundleCmd(), block)
    }

    /**
     * Adds multiple extensions to the composition unit.
     * @param block to configure
     */
    def addOSGiExtensions(@DelegatesTo(AddOSGiExtensionsCmd) Closure<?> block) {
        runDelegate(new AddOSGiExtensionsCmd(), block)
    }

    /**
     * Deletes the tables of the property extension database in virtual member manager.
     * @param block to configure
     */
    def deleteIdMgrPropertyExtensionRepositoryTables(@DelegatesTo(DeleteIdMgrPropertyExtensionRepositoryTablesCmd) Closure<?> block) {
        runDelegate(new DeleteIdMgrPropertyExtensionRepositoryTablesCmd(), block)
    }

    /**
     * List inherit defaults for destination (deprecated - use isInheritDefaultsForDestination instead)
     * @param block to configure
     */
    def listInheritDefaultsForDestination(@DelegatesTo(ListInheritDefaultsForDestinationCmd) Closure<?> block) {
        runDelegate(new ListInheritDefaultsForDestinationCmd(), block)
    }

    /**
     * Get the available JMS connection factories
     * @param block to configure
     */
    def getJMSQueues(@DelegatesTo(GetJMSQueuesCmd) Closure<?> block) {
        runDelegate(new GetJMSQueuesCmd(), block)
    }

    /**
     * This command unconfigures embedded Tivoli Access Manager on the WebSphere Application Server node or nodes specified.
     * @param block to configure
     */
    def unconfigureTAM(@DelegatesTo(UnconfigureTAMCmd) Closure<?> block) {
        runDelegate(new UnconfigureTAMCmd(), block)
    }

    /**
     * Returns the audit notification monitor specified by the reference id.
     * @param block to configure
     */
    def getAuditNotificationMonitor(@DelegatesTo(GetAuditNotificationMonitorCmd) Closure<?> block) {
        runDelegate(new GetAuditNotificationMonitorCmd(), block)
    }

    /**
     * Update Web Services Security distributed cache configuration custom properties
     * @param block to configure
     */
    def updateWSSDistributedCacheCustomConfig(@DelegatesTo(UpdateWSSDistributedCacheCustomConfigCmd) Closure<?> block) {
        runDelegate(new UpdateWSSDistributedCacheCustomConfigCmd(), block)
    }

    /**
     * Add a signer certificates from a certificate file to a keystore.
     * @param block to configure
     */
    def addSignerCertificate(@DelegatesTo(AddSignerCertificateCmd) Closure<?> block) {
        runDelegate(new AddSignerCertificateCmd(), block)
    }

    /**
     * The exportPolicySet command exports a policy set as an archive that can be copied onto a client environment or imported onto a server environment.
     * @param block to configure
     */
    def exportPolicySet(@DelegatesTo(ExportPolicySetCmd) Closure<?> block) {
        runDelegate(new ExportPolicySetCmd(), block)
    }

    /**
     * Shows the inherit receiver defaults for a topic in a given topic space.  Returns "true" if the topic inherits from receiver default values.
     * @param block to configure
     */
    def isInheritReceiverForTopic(@DelegatesTo(IsInheritReceiverForTopicCmd) Closure<?> block) {
        runDelegate(new IsInheritReceiverForTopicCmd(), block)
    }

    /**
     * Delete a server configuration
     * @param block to configure
     */
    def deleteWebServer(@DelegatesTo(DeleteWebServerCmd) Closure<?> block) {
        runDelegate(new DeleteWebServerCmd(), block)
    }

    /**
     * Modify a JAX-WS Handler List
     * @param block to configure
     */
    def modifyJAXWSHandlerList(@DelegatesTo(ModifyJAXWSHandlerListCmd) Closure<?> block) {
        runDelegate(new ModifyJAXWSHandlerListCmd(), block)
    }

    /**
     * Install a J2C resource adapter
     * @param block to configure
     */
    def installResourceAdapter(@DelegatesTo(InstallResourceAdapterCmd) Closure<?> block) {
        runDelegate(new InstallResourceAdapterCmd(), block)
    }

    /**
     * List the groups in the bus connector role
     * @param block to configure
     */
    def listGroupsInBusConnectorRole(@DelegatesTo(ListGroupsInBusConnectorRoleCmd) Closure<?> block) {
        runDelegate(new ListGroupsInBusConnectorRoleCmd(), block)
    }

    /**
     * Configures an audit notification.
     * @param block to configure
     */
    def createAuditNotification(@DelegatesTo(CreateAuditNotificationCmd) Closure<?> block) {
        runDelegate(new CreateAuditNotificationCmd(), block)
    }

    /**
     * Update an imported asset file.
     * @param block to configure
     */
    def updateAsset(@DelegatesTo(UpdateAssetCmd) Closure<?> block) {
        runDelegate(new UpdateAssetCmd(), block)
    }

    /**
     * Remove groups or special subjects or both from a naming role
     * @param block to configure
     */
    def removeGroupsFromNamingRole(@DelegatesTo(RemoveGroupsFromNamingRoleCmd) Closure<?> block) {
        runDelegate(new RemoveGroupsFromNamingRoleCmd(), block)
    }

    /**
     * Applies current Security Wizard settings from the workspace.
     * @param block to configure
     */
    def applyWizardSettings(@DelegatesTo(ApplyWizardSettingsCmd) Closure<?> block) {
        runDelegate(new ApplyWizardSettingsCmd(), block)
    }

    /**
     * Retrieves the schema of an entity type. If repository ID is not specified then it returns the default entity type schema supported by virtual member manager. If entity type names are not specified then it retrieves the entity type schema for all the entity types.
     * @param block to configure
     */
    def getIdMgrEntityTypeSchema(@DelegatesTo(GetIdMgrEntityTypeSchemaCmd) Closure<?> block) {
        runDelegate(new GetIdMgrEntityTypeSchemaCmd(), block)
    }

    /**
     * The deletePolicySetAttachment command removes a policy set attachment.
     * @param block to configure
     */
    def deletePolicySetAttachment(@DelegatesTo(DeletePolicySetAttachmentCmd) Closure<?> block) {
        runDelegate(new DeletePolicySetAttachmentCmd(), block)
    }

    /**
     * Purges a user from the auth cache for a security domain; if no security domain is specified, the user will be purged from the admin security domain
     * @param block to configure
     */
    def purgeUserFromAuthCache(@DelegatesTo(PurgeUserFromAuthCacheCmd) Closure<?> block) {
        runDelegate(new PurgeUserFromAuthCacheCmd(), block)
    }

    /**
     * (Deprecated) modify the property of the long-running scheduler. Use modifyJobSchedulerProperty.
     * @param block to configure
     */
    def modifyLongRunningSchedulerProperty(@DelegatesTo(ModifyLongRunningSchedulerPropertyCmd) Closure<?> block) {
        runDelegate(new ModifyLongRunningSchedulerPropertyCmd(), block)
    }

    /**
     * Sets a list of references to defined filters for the supplied audit service provider.
     * @param block to configure
     */
    def setAuditEmitterFilters(@DelegatesTo(SetAuditEmitterFiltersCmd) Closure<?> block) {
        runDelegate(new SetAuditEmitterFiltersCmd(), block)
    }

    /**
     * Displays the active JAXRS Provider for a Server or ServerCluster.The operation requires either an ObjectName referencing the target object, or parameters identifying the target node and server.
     * @param block to configure
     */
    def showJaxrsProvider(@DelegatesTo(ShowJaxrsProviderCmd) Closure<?> block) {
        runDelegate(new ShowJaxrsProviderCmd(), block)
    }

    /**
     * Binary Audit Log Reader Command
     * @param block to configure
     */
    def binaryAuditLogReader(@DelegatesTo(BinaryAuditLogReaderCmd) Closure<?> block) {
        runDelegate(new BinaryAuditLogReaderCmd(), block)
    }

    /**
     * Modifies the audit policy attributes.
     * @param block to configure
     */
    def modifyAuditPolicy(@DelegatesTo(ModifyAuditPolicyCmd) Closure<?> block) {
        runDelegate(new ModifyAuditPolicyCmd(), block)
    }

    /**
     * Clears the cache of the specified repository or of all repositories.
     * @param block to configure
     */
    def clearIdMgrRepositoryCache(@DelegatesTo(ClearIdMgrRepositoryCacheCmd) Closure<?> block) {
        runDelegate(new ClearIdMgrRepositoryCacheCmd(), block)
    }

    /**
     * Clears the auth cache for a security domain; if no security domain is specified, the auth cache for the admin security domain will be cleared
     * @param block to configure
     */
    def clearAuthCache(@DelegatesTo(ClearAuthCacheCmd) Closure<?> block) {
        runDelegate(new ClearAuthCacheCmd(), block)
    }

    /**
     * Remove an administered subscriber from a WS-Notification service point
     * @param block to configure
     */
    def deleteWSNAdministeredSubscriber(@DelegatesTo(DeleteWSNAdministeredSubscriberCmd) Closure<?> block) {
        runDelegate(new DeleteWSNAdministeredSubscriberCmd(), block)
    }

    /**
     * This command unconfigures the embedded Tivoli Access Manager Trust Association Interceptor with classname TAMTrustAsociationInterceptorPlus. This task does not include removing any custom properties from the security configuration
     * @param block to configure
     */
    def unconfigureTAMTAI(@DelegatesTo(UnconfigureTAMTAICmd) Closure<?> block) {
        runDelegate(new UnconfigureTAMTAICmd(), block)
    }

    /**
     * Delete a SSLConfig Property.
     * @param block to configure
     */
    def deleteSSLConfigProperty(@DelegatesTo(DeleteSSLConfigPropertyCmd) Closure<?> block) {
        runDelegate(new DeleteSSLConfigPropertyCmd(), block)
    }

    /**
     * Creates and populates tables for a property extension database in virtual member manager.
     * @param block to configure
     */
    def setupIdMgrPropertyExtensionRepositoryTables(@DelegatesTo(SetupIdMgrPropertyExtensionRepositoryTablesCmd) Closure<?> block) {
        runDelegate(new SetupIdMgrPropertyExtensionRepositoryTablesCmd(), block)
    }

    /**
     * List personal certificate aliases in a keystore file
     * @param block to configure
     */
    def listKeyFileAliases(@DelegatesTo(ListKeyFileAliasesCmd) Closure<?> block) {
        runDelegate(new ListKeyFileAliasesCmd(), block)
    }

    /**
     * Creates a group in the default realm.
     * @param block to configure
     */
    def createGroup(@DelegatesTo(CreateGroupCmd) Closure<?> block) {
        runDelegate(new CreateGroupCmd(), block)
    }

    /**
     * Create a WS-Notification topic namespace
     * @param block to configure
     */
    def createWSNTopicNamespace(@DelegatesTo(CreateWSNTopicNamespaceCmd) Closure<?> block) {
        runDelegate(new CreateWSNTopicNamespaceCmd(), block)
    }

    /**
     * Update the SC cache configuration
     * @param block to configure
     */
    def updateSCClientCacheConfiguration(@DelegatesTo(UpdateSCClientCacheConfigurationCmd) Closure<?> block) {
        runDelegate(new UpdateSCClientCacheConfigurationCmd(), block)
    }

    /**
     * Import an application file into the product configuration repository as an asset.
     * @param block to configure
     */
    def importAsset(@DelegatesTo(ImportAssetCmd) Closure<?> block) {
        runDelegate(new ImportAssetCmd(), block)
    }

    /**
     * Generates and replaces default certificates with one that is created with the new cell name.
     * @param block to configure
     */
    def genCertForNewCellName(@DelegatesTo(GenCertForNewCellNameCmd) Closure<?> block) {
        runDelegate(new GenCertForNewCellNameCmd(), block)
    }

    /**
     * Query the SDK version number in use
     * @param block to configure
     */
    def getSDKVersion(@DelegatesTo(GetSDKVersionCmd) Closure<?> block) {
        runDelegate(new GetSDKVersionCmd(), block)
    }

    /**
     * This command adds SPNEGO TAI properties in the security configuration.
     * @param block to configure
     */
    def addSpnegoTAIProperties(@DelegatesTo(AddSpnegoTAIPropertiesCmd) Closure<?> block) {
        runDelegate(new AddSpnegoTAIPropertiesCmd(), block)
    }

    /**
     * Set the directory path where the checkpoints are stored
     * @param block to configure
     */
    def setCheckpointLocation(@DelegatesTo(SetCheckpointLocationCmd) Closure<?> block) {
        runDelegate(new SetCheckpointLocationCmd(), block)
    }

    /**
     * Lists all the configured supported entity types.
     * @param block to configure
     */
    def listIdMgrSupportedEntityTypes(@DelegatesTo(ListIdMgrSupportedEntityTypesCmd) Closure<?> block) {
        runDelegate(new ListIdMgrSupportedEntityTypesCmd(), block)
    }

    /**
     * Use the "createLMServiceEventPoint" command to create a local mapping service event point, in order to generate service mapping events.
     * @param block to configure
     */
    def createLMServiceEventPoint(@DelegatesTo(CreateLMServiceEventPointCmd) Closure<?> block) {
        runDelegate(new CreateLMServiceEventPointCmd(), block)
    }

    /**
     * creates a server Template based on a server configuration
     * @param block to configure
     */
    def createApplicationServerTemplate(@DelegatesTo(CreateApplicationServerTemplateCmd) Closure<?> block) {
        runDelegate(new CreateApplicationServerTemplateCmd(), block)
    }

    /**
     * Unconfigures an inbound or outbound trusted realms by removing the realm object from the configuration.
     * @param block to configure
     */
    def unconfigureTrustedRealms(@DelegatesTo(UnconfigureTrustedRealmsCmd) Closure<?> block) {
        runDelegate(new UnconfigureTrustedRealmsCmd(), block)
    }

    /**
     * List all SSLConfig instances that can be associated with an SSLInboundChannel
     * @param block to configure
     */
    def listSSLRepertoires(@DelegatesTo(ListSSLRepertoiresCmd) Closure<?> block) {
        runDelegate(new ListSSLRepertoiresCmd(), block)
    }

    /**
     * Resumes a previously submitted job.
     * @param block to configure
     */
    def resumeJob(@DelegatesTo(ResumeJobCmd) Closure<?> block) {
        runDelegate(new ResumeJobCmd(), block)
    }

    /**
     * The deletePolicyType command deletes a policy type from a policy set.
     * @param block to configure
     */
    def deletePolicyType(@DelegatesTo(DeletePolicyTypeCmd) Closure<?> block) {
        runDelegate(new DeletePolicyTypeCmd(), block)
    }

    /**
     * Deletes the entire LDAP group configuration.
     * @param block to configure
     */
    def deleteIdMgrLDAPGroupConfig(@DelegatesTo(DeleteIdMgrLDAPGroupConfigCmd) Closure<?> block) {
        runDelegate(new DeleteIdMgrLDAPGroupConfigCmd(), block)
    }

    /**
     * Adds a configuration for a virtual member manager property not supported by a specific LDAP repository.
     * @param block to configure
     */
    def addIdMgrLDAPAttrNotSupported(@DelegatesTo(AddIdMgrLDAPAttrNotSupportedCmd) Closure<?> block) {
        runDelegate(new AddIdMgrLDAPAttrNotSupportedCmd(), block)
    }

    /**
     * Remove a configuration property under a configuration group.
     * @param block to configure
     */
    def removeSTSConfigurationProperty(@DelegatesTo(RemoveSTSConfigurationPropertyCmd) Closure<?> block) {
        runDelegate(new RemoveSTSConfigurationPropertyCmd(), block)
    }

    /**
     * null
     * @param block to configure
     */
    def listMWSConfigFiles(@DelegatesTo(ListMWSConfigFilesCmd) Closure<?> block) {
        runDelegate(new ListMWSConfigFilesCmd(), block)
    }

    /**
     * Generates new set of templates by combining WebSphere Application Server base product templates with feature pack and/or stack product templates
     * @param block to configure
     */
    def generateTemplates(@DelegatesTo(GenerateTemplatesCmd) Closure<?> block) {
        runDelegate(new GenerateTemplatesCmd(), block)
    }

    /**
     * Deletes the IBM MQ Topic object provided to the command.
     * @param block to configure
     */
    def deleteWMQTopic(@DelegatesTo(DeleteWMQTopicCmd) Closure<?> block) {
        runDelegate(new DeleteWMQTopicCmd(), block)
    }

    /**
     * add node to the node group
     * @param block to configure
     */
    def addNodeGroupMember(@DelegatesTo(AddNodeGroupMemberCmd) Closure<?> block) {
        runDelegate(new AddNodeGroupMemberCmd(), block)
    }

    /**
     * list servers of specified server type and node name. If node name is not specified, whole cell will be searched. If the server type is not specified servers of all types are returned.
     * @param block to configure
     */
    def listServers(@DelegatesTo(ListServersCmd) Closure<?> block) {
        runDelegate(new ListServersCmd(), block)
    }

    /**
     * Cleanup a Target that no longer exists
     * @param block to configure
     */
    def cleanupTarget(@DelegatesTo(CleanupTargetCmd) Closure<?> block) {
        runDelegate(new CleanupTargetCmd(), block)
    }

    /**
     * Returns the member attribute configuration from the LDAP group configuration.
     * @param block to configure
     */
    def getIdMgrLDAPGroupMemberAttrs(@DelegatesTo(GetIdMgrLDAPGroupMemberAttrsCmd) Closure<?> block) {
        runDelegate(new GetIdMgrLDAPGroupMemberAttrsCmd(), block)
    }

    /**
     * List Inherit Receiver For topic (deprecated - use isInheritReceiverForTopic instead)
     * @param block to configure
     */
    def listInheritReceiverForTopic(@DelegatesTo(ListInheritReceiverForTopicCmd) Closure<?> block) {
        runDelegate(new ListInheritReceiverForTopicCmd(), block)
    }

    /**
     * Removes the users from the specified virtual member manager role. If value for userId parameter is specified as "*" all users mapped for the role are removed.
     * @param block to configure
     */
    def removeIdMgrUsersFromRole(@DelegatesTo(RemoveIdMgrUsersFromRoleCmd) Closure<?> block) {
        runDelegate(new RemoveIdMgrUsersFromRoleCmd(), block)
    }

    /**
     * Delete an inbound service.
     * @param block to configure
     */
    def deleteSIBWSInboundService(@DelegatesTo(DeleteSIBWSInboundServiceCmd) Closure<?> block) {
        runDelegate(new DeleteSIBWSInboundServiceCmd(), block)
    }

    /**
     * Enable OAuth TAI
     * @param block to configure
     */
    def enableOAuthTAI(@DelegatesTo(EnableOAuthTAICmd) Closure<?> block) {
        runDelegate(new EnableOAuthTAICmd(), block)
    }

    /**
     * Modify a key manager.
     * @param block to configure
     */
    def modifyKeyManager(@DelegatesTo(ModifyKeyManagerCmd) Closure<?> block) {
        runDelegate(new ModifyKeyManagerCmd(), block)
    }

    /**
     * Create a new SIB link.
     * @param block to configure
     */
    def createSIBLink(@DelegatesTo(CreateSIBLinkCmd) Closure<?> block) {
        runDelegate(new CreateSIBLinkCmd(), block)
    }

    /**
     * Migrates a IBM MQ message listener port definition to an activation specification definition.
     * @param block to configure
     */
    def migrateWMQMLP(@DelegatesTo(MigrateWMQMLPCmd) Closure<?> block) {
        runDelegate(new MigrateWMQMLPCmd(), block)
    }

    /**
     * Move all servers in a cluster from one core group to another.
     * @param block to configure
     */
    def moveClusterToCoreGroup(@DelegatesTo(MoveClusterToCoreGroupCmd) Closure<?> block) {
        runDelegate(new MoveClusterToCoreGroupCmd(), block)
    }

    /**
     * Exports Lightweight Third Party Authentication keys to a file.
     * @param block to configure
     */
    def exportLTPAKeys(@DelegatesTo(ExportLTPAKeysCmd) Closure<?> block) {
        runDelegate(new ExportLTPAKeysCmd(), block)
    }

    /**
     * Modify properties associated with a specific Target.
     * @param block to configure
     */
    def modifyTargetProperties(@DelegatesTo(ModifyTargetPropertiesCmd) Closure<?> block) {
        runDelegate(new ModifyTargetPropertiesCmd(), block)
    }

    /**
     * Deletes a base entry from a specified realm configuration.
     * @param block to configure
     */
    def deleteIdMgrRealmBaseEntry(@DelegatesTo(DeleteIdMgrRealmBaseEntryCmd) Closure<?> block) {
        runDelegate(new DeleteIdMgrRealmBaseEntryCmd(), block)
    }

    /**
     * Retrieves the groups in which a group is a member.
     * @param block to configure
     */
    def getMembershipOfGroup(@DelegatesTo(GetMembershipOfGroupCmd) Closure<?> block) {
        runDelegate(new GetMembershipOfGroupCmd(), block)
    }

    /**
     * The setProviderPolicySharingInfo command sets the WSPolicy provider sharing information for a specified resource within an application.
     * @param block to configure
     */
    def setProviderPolicySharingInfo(@DelegatesTo(SetProviderPolicySharingInfoCmd) Closure<?> block) {
        runDelegate(new SetProviderPolicySharingInfoCmd(), block)
    }

    /**
     * Validates the existence of the administrator name in the input user registry.
     * @param block to configure
     */
    def validateAdminName(@DelegatesTo(ValidateAdminNameCmd) Closure<?> block) {
        runDelegate(new ValidateAdminNameCmd(), block)
    }

    /**
     * Creates a realm configuration.
     * @param block to configure
     */
    def createIdMgrRealm(@DelegatesTo(CreateIdMgrRealmCmd) Closure<?> block) {
        runDelegate(new CreateIdMgrRealmCmd(), block)
    }

    /**
     * Lists the Web service operations defined in a logical endpoint.
     * @param block to configure
     */
    def listWebServiceOperations(@DelegatesTo(ListWebServiceOperationsCmd) Closure<?> block) {
        runDelegate(new ListWebServiceOperationsCmd(), block)
    }

    /**
     * Lists the SSL protocols valid for the current FIPS configuration. If FIPS is not enabled, then the full list of valid SSL protocols are returned. 
     * @param block to configure
     */
    def listSSLProtocolTypes(@DelegatesTo(ListSSLProtocolTypesCmd) Closure<?> block) {
        runDelegate(new ListSSLProtocolTypesCmd(), block)
    }

    /**
     * Removes a user from all roles defined.
     * @param block to configure
     */
    def removeUserFromAllRoles(@DelegatesTo(RemoveUserFromAllRolesCmd) Closure<?> block) {
        runDelegate(new RemoveUserFromAllRolesCmd(), block)
    }

    /**
     * List all of the defined message listener types on the specified J2C resource adapter.
     * @param block to configure
     */
    def listMessageListenerTypes(@DelegatesTo(ListMessageListenerTypesCmd) Closure<?> block) {
        runDelegate(new ListMessageListenerTypesCmd(), block)
    }

    /**
     * Adds an LDAP entity type definition to the LDAP repository configuration.
     * @param block to configure
     */
    def addIdMgrLDAPEntityType(@DelegatesTo(AddIdMgrLDAPEntityTypeCmd) Closure<?> block) {
        runDelegate(new AddIdMgrLDAPEntityTypeCmd(), block)
    }

    /**
     * Delete an outbound service.
     * @param block to configure
     */
    def deleteSIBWSOutboundService(@DelegatesTo(DeleteSIBWSOutboundServiceCmd) Closure<?> block) {
        runDelegate(new DeleteSIBWSOutboundServiceCmd(), block)
    }

    /**
     * export the configuration of a server to a config archive.
     * @param block to configure
     */
    def exportServer(@DelegatesTo(ExportServerCmd) Closure<?> block) {
        runDelegate(new ExportServerCmd(), block)
    }

    /**
     * Returns the file location of the Binary audit log.
     * @param block to configure
     */
    def getBinaryFileLocation(@DelegatesTo(GetBinaryFileLocationCmd) Closure<?> block) {
        runDelegate(new GetBinaryFileLocationCmd(), block)
    }

    /**
     * Adds a cookie configuration that applications will not be able to programmatically modify
     * @param block to configure
     */
    def addDisabledSessionCookie(@DelegatesTo(AddDisabledSessionCookieCmd) Closure<?> block) {
        runDelegate(new AddDisabledSessionCookieCmd(), block)
    }

    /**
     * Change all the passwords for the keystores that use the password provided, which automatically saves the new passwords to the configuration.
     * @param block to configure
     */
    def changeMultipleKeyStorePasswords(@DelegatesTo(ChangeMultipleKeyStorePasswordsCmd) Closure<?> block) {
        runDelegate(new ChangeMultipleKeyStorePasswordsCmd(), block)
    }

    /**
     * List assigned token types for an endpoint.
     * @param block to configure
     */
    def listSTSEndpointTokenTypes(@DelegatesTo(ListSTSEndpointTokenTypesCmd) Closure<?> block) {
        runDelegate(new ListSTSEndpointTokenTypesCmd(), block)
    }

    /**
     * Compare a list of multiple resource adapters to see if they are all able to be updated with the same RAR file.
     * @param block to configure
     */
    def compareMultipleResourceAdapters(@DelegatesTo(CompareMultipleResourceAdaptersCmd) Closure<?> block) {
        runDelegate(new CompareMultipleResourceAdaptersCmd(), block)
    }

    /**
     * This command creates a Kerberos configuration file (krb5.ini or krb5.conf).
     * @param block to configure
     */
    def createKrbConfigFile(@DelegatesTo(CreateKrbConfigFileCmd) Closure<?> block) {
        runDelegate(new CreateKrbConfigFileCmd(), block)
    }

    /**
     * Import a Secure Proxy Server into a given Secure Proxy node.
     * @param block to configure
     */
    def importProxyServer(@DelegatesTo(ImportProxyServerCmd) Closure<?> block) {
        runDelegate(new ImportProxyServerCmd(), block)
    }

    /**
     * Delete a JDBC provider that is used to connect to a relational database for data access.
     * @param block to configure
     */
    def deleteJDBCProvider(@DelegatesTo(DeleteJDBCProviderCmd) Closure<?> block) {
        runDelegate(new DeleteJDBCProviderCmd(), block)
    }

    /**
     * Delete an existing authorization group
     * @param block to configure
     */
    def deleteAuthorizationGroup(@DelegatesTo(DeleteAuthorizationGroupCmd) Closure<?> block) {
        runDelegate(new DeleteAuthorizationGroupCmd(), block)
    }

    /**
     * List the JAX-WS Handlers at a given cell scope
     * @param block to configure
     */
    def listJAXWSHandlers(@DelegatesTo(ListJAXWSHandlersCmd) Closure<?> block) {
        runDelegate(new ListJAXWSHandlersCmd(), block)
    }

    /**
     * list all the group IDs in an AuthorizationGroup
     * @param block to configure
     */
    def listGroupIDsOfAuthorizationGroup(@DelegatesTo(ListGroupIDsOfAuthorizationGroupCmd) Closure<?> block) {
        runDelegate(new ListGroupIDsOfAuthorizationGroupCmd(), block)
    }

    /**
     * Show the attributes of target SIB JMS activation specification.
     * @param block to configure
     */
    def showSIBJMSActivationSpec(@DelegatesTo(ShowSIBJMSActivationSpecCmd) Closure<?> block) {
        runDelegate(new ShowSIBJMSActivationSpecCmd(), block)
    }

    /**
     * Delete a JAX-WS Handler List
     * @param block to configure
     */
    def deleteJAXWSHandlerList(@DelegatesTo(DeleteJAXWSHandlerListCmd) Closure<?> block) {
        runDelegate(new DeleteJAXWSHandlerListCmd(), block)
    }

    /**
     * null
     * @param block to configure
     */
    def adminservice_getLocalServer(@DelegatesTo(Adminservice_getLocalServerCmd) Closure<?> block) {
        runDelegate(new Adminservice_getLocalServerCmd(), block)
    }

    /**
     * Add an instance document to a WS-Notification topic namespace
     * @param block to configure
     */
    def createWSNTopicDocument(@DelegatesTo(CreateWSNTopicDocumentCmd) Closure<?> block) {
        runDelegate(new CreateWSNTopicDocumentCmd(), block)
    }

    /**
     * getContextDesc
     * @param block to configure
     */
    def getContexts(@DelegatesTo(GetContextsCmd) Closure<?> block) {
        runDelegate(new GetContextsCmd(), block)
    }

    /**
     * Edit a configuration property under a configuration group.
     * @param block to configure
     */
    def editSTSConfigurationProperty(@DelegatesTo(EditSTSConfigurationPropertyCmd) Closure<?> block) {
        runDelegate(new EditSTSConfigurationPropertyCmd(), block)
    }

    /**
     * List the datasources that are contained in the specified scope.
     * @param block to configure
     */
    def listDatasources(@DelegatesTo(ListDatasourcesCmd) Closure<?> block) {
        runDelegate(new ListDatasourcesCmd(), block)
    }

    /**
     * Lists the Web service endpoints that are port names defined in a Web service in an enterprise application.
     * @param block to configure
     */
    def listWebServiceEndpoints(@DelegatesTo(ListWebServiceEndpointsCmd) Closure<?> block) {
        runDelegate(new ListWebServiceEndpointsCmd(), block)
    }

    /**
     * Edit options specified when a specified asset was imported.
     * @param block to configure
     */
    def editAsset(@DelegatesTo(EditAssetCmd) Closure<?> block) {
        runDelegate(new EditAssetCmd(), block)
    }

    /**
     * Returns an audit specification entry in the audit.xml that matches the reference Id.
     * @param block to configure
     */
    def getAuditFilter(@DelegatesTo(GetAuditFilterCmd) Closure<?> block) {
        runDelegate(new GetAuditFilterCmd(), block)
    }

    /**
     * Returns the enabled state of sending audit notification emails.
     * @param block to configure
     */
    def isSendEmailEnabled(@DelegatesTo(IsSendEmailEnabledCmd) Closure<?> block) {
        runDelegate(new IsSendEmailEnabledCmd(), block)
    }

    /**
     * Remove an instance document from a WS-Notification topic namespace
     * @param block to configure
     */
    def deleteWSNTopicDocument(@DelegatesTo(DeleteWSNTopicDocumentCmd) Closure<?> block) {
        runDelegate(new DeleteWSNTopicDocumentCmd(), block)
    }

    /**
     * Create OAuth Provider
     * @param block to configure
     */
    def createOAuthProvider(@DelegatesTo(CreateOAuthProviderCmd) Closure<?> block) {
        runDelegate(new CreateOAuthProviderCmd(), block)
    }

    /**
     * List the existing checkpoints 
     * @param block to configure
     */
    def listCheckpoints(@DelegatesTo(ListCheckpointsCmd) Closure<?> block) {
        runDelegate(new ListCheckpointsCmd(), block)
    }

    /**
     * Use the "startLMService" command to start a stopped local mapping service.
     * @param block to configure
     */
    def startLMService(@DelegatesTo(StartLMServiceCmd) Closure<?> block) {
        runDelegate(new StartLMServiceCmd(), block)
    }

    /**
     * List all the objects that a given user has access to.
     * @param block to configure
     */
    def listAuditResourcesForUserID(@DelegatesTo(ListAuditResourcesForUserIDCmd) Closure<?> block) {
        runDelegate(new ListAuditResourcesForUserIDCmd(), block)
    }

    /**
     * List all security realms in the configuration from global security and the security domains.
     * @param block to configure
     */
    def listSecurityRealms(@DelegatesTo(ListSecurityRealmsCmd) Closure<?> block) {
        runDelegate(new ListSecurityRealmsCmd(), block)
    }

    /**
     * Create a JAX-WS Handler List
     * @param block to configure
     */
    def createJAXWSHandlerList(@DelegatesTo(CreateJAXWSHandlerListCmd) Closure<?> block) {
        runDelegate(new CreateJAXWSHandlerListCmd(), block)
    }

    /**
     * The list of certificate request in a keystore.
     * @param block to configure
     */
    def listCertificateRequests(@DelegatesTo(ListCertificateRequestsCmd) Closure<?> block) {
        runDelegate(new ListCertificateRequestsCmd(), block)
    }

    /**
     * Validates the user/pasword in the Federated repositories user registry
     * @param block to configure
     */
    def WIMCheckPassword(@DelegatesTo(WIMCheckPasswordCmd) Closure<?> block) {
        runDelegate(new WIMCheckPasswordCmd(), block)
    }

    /**
     * Modify a schedule.
     * @param block to configure
     */
    def modifyWSSchedule(@DelegatesTo(ModifyWSScheduleCmd) Closure<?> block) {
        runDelegate(new ModifyWSScheduleCmd(), block)
    }

    /**
     * Renew a Certificate with a newly generated certificate.
     * @param block to configure
     */
    def renewCertificate(@DelegatesTo(RenewCertificateCmd) Closure<?> block) {
        runDelegate(new RenewCertificateCmd(), block)
    }

    /**
     * Creates a database repository configuration.
     * @param block to configure
     */
    def createIdMgrDBRepository(@DelegatesTo(CreateIdMgrDBRepositoryCmd) Closure<?> block) {
        runDelegate(new CreateIdMgrDBRepositoryCmd(), block)
    }

    /**
     * Creates an entry in the audit.xml to reference the configuration of an audit event factory implementation of the Audit Event Factory interface.
     * @param block to configure
     */
    def createAuditEventFactory(@DelegatesTo(CreateAuditEventFactoryCmd) Closure<?> block) {
        runDelegate(new CreateAuditEventFactoryCmd(), block)
    }

    /**
     * Delete the supplied SIB JMS topic.
     * @param block to configure
     */
    def deleteSIBJMSTopic(@DelegatesTo(DeleteSIBJMSTopicCmd) Closure<?> block) {
        runDelegate(new DeleteSIBJMSTopicCmd(), block)
    }

    /**
     * Adds a dynamic member attribute configuration to an LDAP group configuration.
     * @param block to configure
     */
    def addIdMgrLDAPGroupDynamicMemberAttr(@DelegatesTo(AddIdMgrLDAPGroupDynamicMemberAttrCmd) Closure<?> block) {
        runDelegate(new AddIdMgrLDAPGroupDynamicMemberAttrCmd(), block)
    }

    /**
     * Set a property in server template's metadata. Use this command with caution. Changing a template metadata property incorrectly will result in new server creation failure.
     * @param block to configure
     */
    def setTemplateProperty(@DelegatesTo(SetTemplatePropertyCmd) Closure<?> block) {
        runDelegate(new SetTemplatePropertyCmd(), block)
    }

    /**
     * Query the STS for a list of assigned endpoints.
     * @param block to configure
     */
    def listSTSAssignedEndpoints(@DelegatesTo(ListSTSAssignedEndpointsCmd) Closure<?> block) {
        runDelegate(new ListSTSAssignedEndpointsCmd(), block)
    }

    /**
     * Lists the details of all virtual member manager properties not supported by the specified LDAP repository.
     * @param block to configure
     */
    def listIdMgrLDAPAttrsNotSupported(@DelegatesTo(ListIdMgrLDAPAttrsNotSupportedCmd) Closure<?> block) {
        runDelegate(new ListIdMgrLDAPAttrsNotSupportedCmd(), block)
    }

    /**
     * Deletes an audit specification entry in the audit.xml that matches the reference Id.
     * @param block to configure
     */
    def deleteAuditFilterByRef(@DelegatesTo(DeleteAuditFilterByRefCmd) Closure<?> block) {
        runDelegate(new DeleteAuditFilterByRefCmd(), block)
    }

    /**
     * Retrieves the members of a group.
     * @param block to configure
     */
    def getMembersOfGroup(@DelegatesTo(GetMembersOfGroupCmd) Closure<?> block) {
        runDelegate(new GetMembersOfGroupCmd(), block)
    }

    /**
     * Remove userids from one or more admin role in the AuthorizationGroup.
     * @param block to configure
     */
    def removeUsersFromAdminRole(@DelegatesTo(RemoveUsersFromAdminRoleCmd) Closure<?> block) {
        runDelegate(new RemoveUsersFromAdminRoleCmd(), block)
    }

    /**
     * Publish an inbound service to a UDDI registry.
     * @param block to configure
     */
    def publishSIBWSInboundService(@DelegatesTo(PublishSIBWSInboundServiceCmd) Closure<?> block) {
        runDelegate(new PublishSIBWSInboundServiceCmd(), block)
    }

    /**
     * Create a new core group
     * @param block to configure
     */
    def createCoreGroup(@DelegatesTo(CreateCoreGroupCmd) Closure<?> block) {
        runDelegate(new CreateCoreGroupCmd(), block)
    }

    /**
     * Create a full named checkpoint specified by the "checkpointName"
     * @param block to configure
     */
    def createFullCheckpoint(@DelegatesTo(CreateFullCheckpointCmd) Closure<?> block) {
        runDelegate(new CreateFullCheckpointCmd(), block)
    }

    /**
     * Set the JNDI name that is bound to java:comp/DefaultManagedScheduledExecutorService.
     * @param block to configure
     */
    def setDefaultManagedScheduledExecutor(@DelegatesTo(SetDefaultManagedScheduledExecutorCmd) Closure<?> block) {
        runDelegate(new SetDefaultManagedScheduledExecutorCmd(), block)
    }

    /**
     * Maps the user to the specified role of virtual member manager.
     * @param block to configure
     */
    def mapIdMgrUserToRole(@DelegatesTo(MapIdMgrUserToRoleCmd) Closure<?> block) {
        runDelegate(new MapIdMgrUserToRoleCmd(), block)
    }

    /**
     * Delete a SIB foreign bus.
     * @param block to configure
     */
    def deleteSIBForeignBus(@DelegatesTo(DeleteSIBForeignBusCmd) Closure<?> block) {
        runDelegate(new DeleteSIBForeignBusCmd(), block)
    }

    /**
     * This command is used to query groups of targets.
     * @param block to configure
     */
    def queryTargetGroups(@DelegatesTo(QueryTargetGroupsCmd) Closure<?> block) {
        runDelegate(new QueryTargetGroupsCmd(), block)
    }

    /**
     * Find other Resource Adapters that are copies of the entered Resource Adapter.  Since an update will replace binary files, these copies of the Resource Adapter should be updated after the current Resource Adapter is updated.
     * @param block to configure
     */
    def findOtherRAsToUpdate(@DelegatesTo(FindOtherRAsToUpdateCmd) Closure<?> block) {
        runDelegate(new FindOtherRAsToUpdateCmd(), block)
    }

    /**
     * List the Web Services Security distributed cache configuration properties
     * @param block to configure
     */
    def queryWSSDistributedCacheConfig(@DelegatesTo(QueryWSSDistributedCacheConfigCmd) Closure<?> block) {
        runDelegate(new QueryWSSDistributedCacheConfigCmd(), block)
    }

    /**
     * list all the AuthorizationGroups that a given user has access to.
     * @param block to configure
     */
    def listAuditAuthorizationGroupsForUserID(@DelegatesTo(ListAuditAuthorizationGroupsForUserIDCmd) Closure<?> block) {
        runDelegate(new ListAuditAuthorizationGroupsForUserIDCmd(), block)
    }

    /**
     * Export WSDL and XSD documents for a specific Composition Unit
     * @param block to configure
     */
    def exportWSDLArtifacts(@DelegatesTo(ExportWSDLArtifactsCmd) Closure<?> block) {
        runDelegate(new ExportWSDLArtifactsCmd(), block)
    }

    /**
     * remove a property from a node group
     * @param block to configure
     */
    def removeNodeGroupProperty(@DelegatesTo(RemoveNodeGroupPropertyCmd) Closure<?> block) {
        runDelegate(new RemoveNodeGroupPropertyCmd(), block)
    }

    /**
     * Unconfigures a login module from a login entry in the administrative security configuration or in an application security domain.
     * @param block to configure
     */
    def unconfigureLoginModule(@DelegatesTo(UnconfigureLoginModuleCmd) Closure<?> block) {
        runDelegate(new UnconfigureLoginModuleCmd(), block)
    }

    /**
     * Cleanup a managed node that no longer exists
     * @param block to configure
     */
    def cleanupManagedNode(@DelegatesTo(CleanupManagedNodeCmd) Closure<?> block) {
        runDelegate(new CleanupManagedNodeCmd(), block)
    }

    /**
     * Deletes a LDAP entity type configuration data for a specified entity type for a specific LDAP repository.
     * @param block to configure
     */
    def deleteIdMgrLDAPEntityType(@DelegatesTo(DeleteIdMgrLDAPEntityTypeCmd) Closure<?> block) {
        runDelegate(new DeleteIdMgrLDAPEntityTypeCmd(), block)
    }

    /**
     * Create a policy that automatically activates all group members.
     * @param block to configure
     */
    def createAllActivePolicy(@DelegatesTo(CreateAllActivePolicyCmd) Closure<?> block) {
        runDelegate(new CreateAllActivePolicyCmd(), block)
    }

    /**
     * Allows the override for inheritance for an individual destination.  Setting the "inherit" value to true will allow the destination to inherit from the default values.
     * @param block to configure
     */
    def setInheritDefaultsForDestination(@DelegatesTo(SetInheritDefaultsForDestinationCmd) Closure<?> block) {
        runDelegate(new SetInheritDefaultsForDestinationCmd(), block)
    }

    /**
     * Import the applications from a configuration archive file to a sepcified application server target.
     * @param block to configure
     */
    def importApplicationsFromWasprofile(@DelegatesTo(ImportApplicationsFromWasprofileCmd) Closure<?> block) {
        runDelegate(new ImportApplicationsFromWasprofileCmd(), block)
    }

    /**
     * Create a certificate expiration monitor.
     * @param block to configure
     */
    def createWSCertExpMonitor(@DelegatesTo(CreateWSCertExpMonitorCmd) Closure<?> block) {
        runDelegate(new CreateWSCertExpMonitorCmd(), block)
    }

    /**
     * This command performs the tasks necessary to unconfigure the Tivoli Access Manager Runtime for Java. The specific tasks run are PDJrteCfg and SvrSslCfg.
     * @param block to configure
     */
    def unconfigureTAMTAIPdjrte(@DelegatesTo(UnconfigureTAMTAIPdjrteCmd) Closure<?> block) {
        runDelegate(new UnconfigureTAMTAIPdjrteCmd(), block)
    }

    /**
     * Modifies the properties of the IBM MQ Connection Factory provided to the command.
     * @param block to configure
     */
    def modifyWMQConnectionFactory(@DelegatesTo(ModifyWMQConnectionFactoryCmd) Closure<?> block) {
        runDelegate(new ModifyWMQConnectionFactoryCmd(), block)
    }

    /**
     * Delete bus destinations.
     * @param block to configure
     */
    def deleteSIBDestinations(@DelegatesTo(DeleteSIBDestinationsCmd) Closure<?> block) {
        runDelegate(new DeleteSIBDestinationsCmd(), block)
    }

    /**
     * Modify a SIB foreign bus.
     * @param block to configure
     */
    def modifySIBForeignBus(@DelegatesTo(ModifySIBForeignBusCmd) Closure<?> block) {
        runDelegate(new ModifySIBForeignBusCmd(), block)
    }

    /**
     * Export a personal certificate to a managed keystore in the configuration.
     * @param block to configure
     */
    def exportCertToManagedKS(@DelegatesTo(ExportCertToManagedKSCmd) Closure<?> block) {
        runDelegate(new ExportCertToManagedKSCmd(), block)
    }

    /**
     * Lists the IBM MQ Queues defined at the scope provided to the command.
     * @param block to configure
     */
    def listWMQQueues(@DelegatesTo(ListWMQQueuesCmd) Closure<?> block) {
        runDelegate(new ListWMQQueuesCmd(), block)
    }

    /**
     * This command is used to get targets for a job.  The targets for the job may have been unregistered, or deleted.
     * @param block to configure
     */
    def getJobTargets(@DelegatesTo(GetJobTargetsCmd) Closure<?> block) {
        runDelegate(new GetJobTargetsCmd(), block)
    }

    /**
     * Returns the state of audit signing.
     * @param block to configure
     */
    def isAuditSigningEnabled(@DelegatesTo(IsAuditSigningEnabledCmd) Closure<?> block) {
        runDelegate(new IsAuditSigningEnabledCmd(), block)
    }

    /**
     * Lists the details of all LDAP attributes used as an external ID.
     * @param block to configure
     */
    def listIdMgrLDAPExternalIdAttrs(@DelegatesTo(ListIdMgrLDAPExternalIdAttrsCmd) Closure<?> block) {
        runDelegate(new ListIdMgrLDAPExternalIdAttrsCmd(), block)
    }

    /**
     * Export a certificate to another KeyStore.
     * @param block to configure
     */
    def exportCertificate(@DelegatesTo(ExportCertificateCmd) Closure<?> block) {
        runDelegate(new ExportCertificateCmd(), block)
    }

    /**
     * Returns all managed object metadata properties for a given node.
     * @param block to configure
     */
    def getMetadataProperties(@DelegatesTo(GetMetadataPropertiesCmd) Closure<?> block) {
        runDelegate(new GetMetadataPropertiesCmd(), block)
    }

    /**
     * Configures audit record encryption.
     * @param block to configure
     */
    def createAuditEncryptionConfig(@DelegatesTo(CreateAuditEncryptionConfigCmd) Closure<?> block) {
        runDelegate(new CreateAuditEncryptionConfigCmd(), block)
    }

    /**
     * Sets up the LDAP context pool configuration.
     * @param block to configure
     */
    def setIdMgrLDAPContextPool(@DelegatesTo(SetIdMgrLDAPContextPoolCmd) Closure<?> block) {
        runDelegate(new SetIdMgrLDAPContextPoolCmd(), block)
    }

    /**
     * WASX7047I: Method: invoke

	Arguments: object name, operation

	Description: Invoke the operation named by "operation" on the MBean
	described by "object name."  No arguments are passed for the operation.

	Method: invoke

	Arguments: object name, operation, arguments

	Description: Invoke the operation named by "operation" on the MBean
	described by "object name" using the parameters described by 
	"arguments."  If no arguments are required for this operation, the
	"arguments" parameter may be omitted.

	Method: invoke

	Arguments: object name, operation, arguments, signature

	Description: Invoke the operation named by "operation" on the MBean
	described by "object name" using the parameters described by "arguments"
	and the signatures described by "signature."
     * @param block to configure
     */
    def adminservice_invoke(@DelegatesTo(Adminservice_invokeCmd) Closure<?> block) {
        runDelegate(new Adminservice_invokeCmd(), block)
    }

    /**
     * Return the LTPA authentication mechanism timeout from global security or a security domain.
     * @param block to configure
     */
    def getLTPATimeout(@DelegatesTo(GetLTPATimeoutCmd) Closure<?> block) {
        runDelegate(new GetLTPATimeoutCmd(), block)
    }

    /**
     * View options for specified a composition unit of a business-level application.
     * @param block to configure
     */
    def viewCompUnit(@DelegatesTo(ViewCompUnitCmd) Closure<?> block) {
        runDelegate(new ViewCompUnitCmd(), block)
    }

    /**
     * A command that can be used to change the server specific short name. 
     * @param block to configure
     */
    def changeServerSpecificShortName(@DelegatesTo(ChangeServerSpecificShortNameCmd) Closure<?> block) {
        runDelegate(new ChangeServerSpecificShortNameCmd(), block)
    }

    /**
     * Disconnect an endpoint listener from a service integration bus.
     * @param block to configure
     */
    def disconnectSIBWSEndpointListener(@DelegatesTo(DisconnectSIBWSEndpointListenerCmd) Closure<?> block) {
        runDelegate(new DisconnectSIBWSEndpointListenerCmd(), block)
    }

    /**
     * Sets up the LDAP group configuration.
     * @param block to configure
     */
    def setIdMgrLDAPGroupConfig(@DelegatesTo(SetIdMgrLDAPGroupConfigCmd) Closure<?> block) {
        runDelegate(new SetIdMgrLDAPGroupConfigCmd(), block)
    }

    /**
     * Create a policy that activates the specified number of group members.
     * @param block to configure
     */
    def createMOfNPolicy(@DelegatesTo(CreateMOfNPolicyCmd) Closure<?> block) {
        runDelegate(new CreateMOfNPolicyCmd(), block)
    }

    /**
     * Modifies a Keystore object.
     * @param block to configure
     */
    def modifyKeyStore(@DelegatesTo(ModifyKeyStoreCmd) Closure<?> block) {
        runDelegate(new ModifyKeyStoreCmd(), block)
    }

    /**
     * Add resources to an existing authorization group.
     * @param block to configure
     */
    def addResourceToAuthorizationGroup(@DelegatesTo(AddResourceToAuthorizationGroupCmd) Closure<?> block) {
        runDelegate(new AddResourceToAuthorizationGroupCmd(), block)
    }

    /**
     * Get information about a certificate expiration monitor.
     * @param block to configure
     */
    def getWSCertExpMonitor(@DelegatesTo(GetWSCertExpMonitorCmd) Closure<?> block) {
        runDelegate(new GetWSCertExpMonitorCmd(), block)
    }

    /**
     * Gives a group permission to access the topic for the specified role.
     * @param block to configure
     */
    def addGroupToTopicRole(@DelegatesTo(AddGroupToTopicRoleCmd) Closure<?> block) {
        runDelegate(new AddGroupToTopicRoleCmd(), block)
    }

    /**
     * Lists the deployed Web services in enterprise applications. If there is no application name supplied, then all the Web services in the enterprise applications will are be listed. 
     * @param block to configure
     */
    def listWebServices(@DelegatesTo(ListWebServicesCmd) Closure<?> block) {
        runDelegate(new ListWebServicesCmd(), block)
    }

    /**
     * list all the users IDs in an AuthorizationGroups
     * @param block to configure
     */
    def listAuditUserIDsOfAuthorizationGroup(@DelegatesTo(ListAuditUserIDsOfAuthorizationGroupCmd) Closure<?> block) {
        runDelegate(new ListAuditUserIDsOfAuthorizationGroupCmd(), block)
    }

    /**
     * List all notifiers.
     * @param block to configure
     */
    def listWSNotifiers(@DelegatesTo(ListWSNotifiersCmd) Closure<?> block) {
        runDelegate(new ListWSNotifiersCmd(), block)
    }

    /**
     * Configure a custom user registry in an application security domain
     * @param block to configure
     */
    def configureAppCustomUserRegistry(@DelegatesTo(ConfigureAppCustomUserRegistryCmd) Closure<?> block) {
        runDelegate(new ConfigureAppCustomUserRegistryCmd(), block)
    }

    /**
     * Extract a certificate request to a file.
     * @param block to configure
     */
    def extractCertificateRequest(@DelegatesTo(ExtractCertificateRequestCmd) Closure<?> block) {
        runDelegate(new ExtractCertificateRequestCmd(), block)
    }

    /**
     * Returns the properties of the deployment manager
     * @param block to configure
     */
    def getDmgrProperties(@DelegatesTo(GetDmgrPropertiesCmd) Closure<?> block) {
        runDelegate(new GetDmgrPropertiesCmd(), block)
    }

    /**
     * Configure the security level for a secure proxy or management server.
     * @param block to configure
     */
    def setServerSecurityLevel(@DelegatesTo(SetServerSecurityLevelCmd) Closure<?> block) {
        runDelegate(new SetServerSecurityLevelCmd(), block)
    }

    /**
     * Create a SSLConfig Property.
     * @param block to configure
     */
    def createSSLConfigProperty(@DelegatesTo(CreateSSLConfigPropertyCmd) Closure<?> block) {
        runDelegate(new CreateSSLConfigPropertyCmd(), block)
    }

    /**
     * Get information about a particular SSL configuration.
     * @param block to configure
     */
    def getSSLConfig(@DelegatesTo(GetSSLConfigCmd) Closure<?> block) {
        runDelegate(new GetSSLConfigCmd(), block)
    }

    /**
     * Returns the keystore containing the certificate used to encrypt the audit records.
     * @param block to configure
     */
    def getEncryptionKeyStore(@DelegatesTo(GetEncryptionKeyStoreCmd) Closure<?> block) {
        runDelegate(new GetEncryptionKeyStoreCmd(), block)
    }

    /**
     * Enable or disable "autostart"
     * @param block to configure
     */
    def setCompUnitTargetAutoStart(@DelegatesTo(SetCompUnitTargetAutoStartCmd) Closure<?> block) {
        runDelegate(new SetCompUnitTargetAutoStartCmd(), block)
    }

    /**
     * The upgradeBindings command upgrades bindings of an older version to the current version.
     * @param block to configure
     */
    def upgradeBindings(@DelegatesTo(UpgradeBindingsCmd) Closure<?> block) {
        runDelegate(new UpgradeBindingsCmd(), block)
    }

    /**
     * Add a member to a bus.
     * @param block to configure
     */
    def addSIBusMember(@DelegatesTo(AddSIBusMemberCmd) Closure<?> block) {
        runDelegate(new AddSIBusMemberCmd(), block)
    }

    /**
     * Get the directory path where the checkpoints are stored
     * @param block to configure
     */
    def getCheckpointLocation(@DelegatesTo(GetCheckpointLocationCmd) Closure<?> block) {
        runDelegate(new GetCheckpointLocationCmd(), block)
    }

    /**
     * This command configures SPNEGO Web Authentication in the security configuration.
     * @param block to configure
     */
    def configureSpnego(@DelegatesTo(ConfigureSpnegoCmd) Closure<?> block) {
        runDelegate(new ConfigureSpnegoCmd(), block)
    }

    /**
     * Deletes an audit notification.
     * @param block to configure
     */
    def deleteAuditNotification(@DelegatesTo(DeleteAuditNotificationCmd) Closure<?> block) {
        runDelegate(new DeleteAuditNotificationCmd(), block)
    }

    /**
     * Get the JNDI name that is bound to java:comp/DefaultContextService.
     * @param block to configure
     */
    def getDefaultContextService(@DelegatesTo(GetDefaultContextServiceCmd) Closure<?> block) {
        runDelegate(new GetDefaultContextServiceCmd(), block)
    }

    /**
     * Shows the attributes of the IBM MQ Queue provided to the command.
     * @param block to configure
     */
    def showWMQQueue(@DelegatesTo(ShowWMQQueueCmd) Closure<?> block) {
        runDelegate(new ShowWMQQueueCmd(), block)
    }

    /**
     * list all the AuthorizationGroups that a given group has access to
     * @param block to configure
     */
    def listAuthorizationGroupsForGroupID(@DelegatesTo(ListAuthorizationGroupsForGroupIDCmd) Closure<?> block) {
        runDelegate(new ListAuthorizationGroupsForGroupIDCmd(), block)
    }

    /**
     * Create a new self-signed certificate and store it in a keystore.
     * @param block to configure
     */
    def createSelfSignedCertificate(@DelegatesTo(CreateSelfSignedCertificateCmd) Closure<?> block) {
        runDelegate(new CreateSelfSignedCertificateCmd(), block)
    }

    /**
     * Configures a local OS user registry in the administrative security configuration.
     * @param block to configure
     */
    def configureAdminLocalOSUserRegistry(@DelegatesTo(ConfigureAdminLocalOSUserRegistryCmd) Closure<?> block) {
        runDelegate(new ConfigureAdminLocalOSUserRegistryCmd(), block)
    }

    /**
     * Lists the audit record encryption keystores.
     * @param block to configure
     */
    def listAuditEncryptionKeyStores(@DelegatesTo(ListAuditEncryptionKeyStoresCmd) Closure<?> block) {
        runDelegate(new ListAuditEncryptionKeyStoresCmd(), block)
    }

    /**
     * Show a messaging engine's attributes.
     * @param block to configure
     */
    def showSIBEngine(@DelegatesTo(ShowSIBEngineCmd) Closure<?> block) {
        runDelegate(new ShowSIBEngineCmd(), block)
    }

    /**
     * Remove userids from one or more audit role in the AuthorizationGroup.
     * @param block to configure
     */
    def removeUsersFromAuditRole(@DelegatesTo(RemoveUsersFromAuditRoleCmd) Closure<?> block) {
        runDelegate(new RemoveUsersFromAuditRoleCmd(), block)
    }

    /**
     * Delete a JAX-WS Handler
     * @param block to configure
     */
    def deleteJAXWSHandler(@DelegatesTo(DeleteJAXWSHandlerCmd) Closure<?> block) {
        runDelegate(new DeleteJAXWSHandlerCmd(), block)
    }

    /**
     * Remove feature pack or stack product information from product info.
     * @param block to configure
     */
    def removeProductInfo(@DelegatesTo(RemoveProductInfoCmd) Closure<?> block) {
        runDelegate(new RemoveProductInfoCmd(), block)
    }

    /**
     * Returns the CSI inbound information for global security or in a security domain.
     * @param block to configure
     */
    def getCSIInboundInfo(@DelegatesTo(GetCSIInboundInfoCmd) Closure<?> block) {
        runDelegate(new GetCSIInboundInfoCmd(), block)
    }

    /**
     * List all schedules.
     * @param block to configure
     */
    def listWSSchedules(@DelegatesTo(ListWSSchedulesCmd) Closure<?> block) {
        runDelegate(new ListWSSchedulesCmd(), block)
    }

    /**
     * Converts an audit specification event and outcome to a reference representation.
     * @param block to configure
     */
    def convertFilterStringToRef(@DelegatesTo(ConvertFilterStringToRefCmd) Closure<?> block) {
        runDelegate(new ConvertFilterStringToRefCmd(), block)
    }

    /**
     * Maps the special subjects to actual users in the registry.
     * @param block to configure
     */
    def mapAuditGroupIDsOfAuthorizationGroup(@DelegatesTo(MapAuditGroupIDsOfAuthorizationGroupCmd) Closure<?> block) {
        runDelegate(new MapAuditGroupIDsOfAuthorizationGroupCmd(), block)
    }

    /**
     * Get the NamedEndPoint associated with either a TCPInboundChannel, or a chain that contains a TCPInboundChannel
     * @param block to configure
     */
    def getTCPEndPoint(@DelegatesTo(GetTCPEndPointCmd) Closure<?> block) {
        runDelegate(new GetTCPEndPointCmd(), block)
    }

    /**
     * Updates the LDAP attribute cache configuration.
     * @param block to configure
     */
    def updateIdMgrLDAPAttrCache(@DelegatesTo(UpdateIdMgrLDAPAttrCacheCmd) Closure<?> block) {
        runDelegate(new UpdateIdMgrLDAPAttrCacheCmd(), block)
    }

    /**
     * Prepare keys and keystores for a profile creation.
     * @param block to configure
     */
    def prepareKeysForSingleProfile(@DelegatesTo(PrepareKeysForSingleProfileCmd) Closure<?> block) {
        runDelegate(new PrepareKeysForSingleProfileCmd(), block)
    }

    /**
     * This command configures embedded Tivoli Access Manager on the WebSphere Application Server node or nodes specified.
     * @param block to configure
     */
    def reconfigureTAM(@DelegatesTo(ReconfigureTAMCmd) Closure<?> block) {
        runDelegate(new ReconfigureTAMCmd(), block)
    }

    /**
     * This command imports SAML IdP metadata to the security configuration SAML TAI.
     * @param block to configure
     */
    def importSAMLIdpMetadata(@DelegatesTo(ImportSAMLIdpMetadataCmd) Closure<?> block) {
        runDelegate(new ImportSAMLIdpMetadataCmd(), block)
    }

    /**
     * Adds an LDAP attribute configuration to the LDAP repository configuration.
     * @param block to configure
     */
    def addIdMgrLDAPAttr(@DelegatesTo(AddIdMgrLDAPAttrCmd) Closure<?> block) {
        runDelegate(new AddIdMgrLDAPAttrCmd(), block)
    }

    /**
     * Lists the groups in the specified topic role for the specified topic space.
     * @param block to configure
     */
    def listGroupsInTopicRole(@DelegatesTo(ListGroupsInTopicRoleCmd) Closure<?> block) {
        runDelegate(new ListGroupsInTopicRoleCmd(), block)
    }

    /**
     * Create a new authorization group.
     * @param block to configure
     */
    def createAuthorizationGroup(@DelegatesTo(CreateAuthorizationGroupCmd) Closure<?> block) {
        runDelegate(new CreateAuthorizationGroupCmd(), block)
    }

    /**
     * Returns a string containing the alias of the SSL Configuration and the certificate alias for the specified scope.
     * @param block to configure
     */
    def getInheritedSSLConfig(@DelegatesTo(GetInheritedSSLConfigCmd) Closure<?> block) {
        runDelegate(new GetInheritedSSLConfigCmd(), block)
    }

    /**
     * Return a list containing the SIB JMS topic's attribute names and values.
     * @param block to configure
     */
    def showSIBJMSTopic(@DelegatesTo(ShowSIBJMSTopicCmd) Closure<?> block) {
        runDelegate(new ShowSIBJMSTopicCmd(), block)
    }

    /**
     * WASX7304I: Method: getNode

	Arguments: none

	Description: Returns the node to which the scripting process is
	connected.
     * @param block to configure
     */
    def adminservice_getNodeName(@DelegatesTo(Adminservice_getNodeNameCmd) Closure<?> block) {
        runDelegate(new Adminservice_getNodeNameCmd(), block)
    }

    /**
     * Create a SSL Configuration.
     * @param block to configure
     */
    def createSSLConfig(@DelegatesTo(CreateSSLConfigCmd) Closure<?> block) {
        runDelegate(new CreateSSLConfigCmd(), block)
    }

    /**
     * Show the properties of a WSNTopicNamespace object in a human readable form.
     * @param block to configure
     */
    def showWSNTopicNamespace(@DelegatesTo(ShowWSNTopicNamespaceCmd) Closure<?> block) {
        runDelegate(new ShowWSNTopicNamespaceCmd(), block)
    }

    /**
     * Creates a new application server cluster.
     * @param block to configure
     */
    def createCluster(@DelegatesTo(CreateClusterCmd) Closure<?> block) {
        runDelegate(new CreateClusterCmd(), block)
    }

    /**
     * Create a new Server Type e.g. (APPLICATION_SERVER)
     * @param block to configure
     */
    def createServerType(@DelegatesTo(CreateServerTypeCmd) Closure<?> block) {
        runDelegate(new CreateServerTypeCmd(), block)
    }

    /**
     * Exports a personal certificate from a managed key to another managed key store.
     * @param block to configure
     */
    def exportAuditCertToManagedKS(@DelegatesTo(ExportAuditCertToManagedKSCmd) Closure<?> block) {
        runDelegate(new ExportAuditCertToManagedKSCmd(), block)
    }

    /**
     * Modifies the host or port of the named endpoint that is used by the specified server.
     * @param block to configure
     */
    def modifyServerPort(@DelegatesTo(ModifyServerPortCmd) Closure<?> block) {
        runDelegate(new ModifyServerPortCmd(), block)
    }

    /**
     * Updates WMM database references from other repositories.
     * @param block to configure
     */
    def updateWMMReference(@DelegatesTo(UpdateWMMReferenceCmd) Closure<?> block) {
        runDelegate(new UpdateWMMReferenceCmd(), block)
    }

    /**
     * Creates an endpoint listener configuration.This command is supported only in the connected mode.
     * @param block to configure
     */
    def createSIBWSEndpointListener(@DelegatesTo(CreateSIBWSEndpointListenerCmd) Closure<?> block) {
        runDelegate(new CreateSIBWSEndpointListenerCmd(), block)
    }

    /**
     * list all the users IDs in an AuthorizationGroup
     * @param block to configure
     */
    def listUserIDsOfAuthorizationGroup(@DelegatesTo(ListUserIDsOfAuthorizationGroupCmd) Closure<?> block) {
        runDelegate(new ListUserIDsOfAuthorizationGroupCmd(), block)
    }

    /**
     * Get the available JMS connection factories
     * @param block to configure
     */
    def getJMSTopics(@DelegatesTo(GetJMSTopicsCmd) Closure<?> block) {
        runDelegate(new GetJMSTopicsCmd(), block)
    }

    /**
     * Get information about a signer Certificate.
     * @param block to configure
     */
    def getSignerCertificate(@DelegatesTo(GetSignerCertificateCmd) Closure<?> block) {
        runDelegate(new GetSignerCertificateCmd(), block)
    }

    /**
     * Apply configuration as specified in properties file
     * @param block to configure
     */
    def applyConfigProperties(@DelegatesTo(ApplyConfigPropertiesCmd) Closure<?> block) {
        runDelegate(new ApplyConfigPropertiesCmd(), block)
    }

    /**
     * Deletes a certificate authority (CA) client configurator object.
     * @param block to configure
     */
    def deleteCAClient(@DelegatesTo(DeleteCAClientCmd) Closure<?> block) {
        runDelegate(new DeleteCAClientCmd(), block)
    }

    /**
     * Returns the audit record encryption configuration.
     * @param block to configure
     */
    def getAuditEncryptionConfig(@DelegatesTo(GetAuditEncryptionConfigCmd) Closure<?> block) {
        runDelegate(new GetAuditEncryptionConfigCmd(), block)
    }

    /**
     * Adds a realm or list of realms to the list of trusted realms in a security domain or in global security.
     * @param block to configure
     */
    def addTrustedRealms(@DelegatesTo(AddTrustedRealmsCmd) Closure<?> block) {
        runDelegate(new AddTrustedRealmsCmd(), block)
    }

    /**
     * Specifies the certificate expiration monitor name.
     * @param block to configure
     */
    def deleteWSCertExpMonitor(@DelegatesTo(DeleteWSCertExpMonitorCmd) Closure<?> block) {
        runDelegate(new DeleteWSCertExpMonitorCmd(), block)
    }

    /**
     * Returns the unique ID associated with the supplied emitter reference.
     * @param block to configure
     */
    def getEmitterUniqueId(@DelegatesTo(GetEmitterUniqueIdCmd) Closure<?> block) {
        runDelegate(new GetEmitterUniqueIdCmd(), block)
    }

    /**
     * Registers a host with the job manager.
     * @param block to configure
     */
    def registerHost(@DelegatesTo(RegisterHostCmd) Closure<?> block) {
        runDelegate(new RegisterHostCmd(), block)
    }

    /**
     * Updates the LDAP context pool configuration.
     * @param block to configure
     */
    def updateIdMgrLDAPContextPool(@DelegatesTo(UpdateIdMgrLDAPContextPoolCmd) Closure<?> block) {
        runDelegate(new UpdateIdMgrLDAPContextPoolCmd(), block)
    }

    /**
     * (Deprecated) modify a long-running scheduler attribute. Use modifyJobSchedulerAttribute.
     * @param block to configure
     */
    def modifyLongRunningSchedulerAttribute(@DelegatesTo(ModifyLongRunningSchedulerAttributeCmd) Closure<?> block) {
        runDelegate(new ModifyLongRunningSchedulerAttributeCmd(), block)
    }

    /**
     * Get information about a JAAS login entry.
     * @param block to configure
     */
    def getJAASLoginEntryInfo(@DelegatesTo(GetJAASLoginEntryInfoCmd) Closure<?> block) {
        runDelegate(new GetJAASLoginEntryInfoCmd(), block)
    }

    /**
     * Removes a user from the specified role in the default security space role.
     * @param block to configure
     */
    def removeUserFromDefaultRole(@DelegatesTo(RemoveUserFromDefaultRoleCmd) Closure<?> block) {
        runDelegate(new RemoveUserFromDefaultRoleCmd(), block)
    }

    /**
     * Modifies the properties of the IBM MQ Queue provided to the command.
     * @param block to configure
     */
    def modifyWMQQueue(@DelegatesTo(ModifyWMQQueueCmd) Closure<?> block) {
        runDelegate(new ModifyWMQQueueCmd(), block)
    }

    /**
     * Disables audit signing.
     * @param block to configure
     */
    def disableAuditSigning(@DelegatesTo(DisableAuditSigningCmd) Closure<?> block) {
        runDelegate(new DisableAuditSigningCmd(), block)
    }

    /**
     * Lists all ThreadPools that can be associated with a TCPInboundChannel or TCPOutboundChannel
     * @param block to configure
     */
    def listTCPThreadPools(@DelegatesTo(ListTCPThreadPoolsCmd) Closure<?> block) {
        runDelegate(new ListTCPThreadPoolsCmd(), block)
    }

    /**
     * Retrieves the supported data types. If repository ID is not specified then it returns the default data types supported by virtual member manager.
     * @param block to configure
     */
    def getIdMgrSupportedDataTypes(@DelegatesTo(GetIdMgrSupportedDataTypesCmd) Closure<?> block) {
        runDelegate(new GetIdMgrSupportedDataTypesCmd(), block)
    }

    /**
     * Set the value for a variable. A variable is a configuration property that can be used to provide a parameter for some values in the system.
     * @param block to configure
     */
    def setVariable(@DelegatesTo(SetVariableCmd) Closure<?> block) {
        runDelegate(new SetVariableCmd(), block)
    }

    /**
     * Query the server's SDK name and location
     * @param block to configure
     */
    def getServerSDK(@DelegatesTo(GetServerSDKCmd) Closure<?> block) {
        runDelegate(new GetServerSDKCmd(), block)
    }

    /**
     * Adds an external bundle repository to the configuration.  Requires a repository name and a URL.
     * @param block to configure
     */
    def addExternalBundleRepository(@DelegatesTo(AddExternalBundleRepositoryCmd) Closure<?> block) {
        runDelegate(new AddExternalBundleRepositoryCmd(), block)
    }

    /**
     * Returns a list of defined filters for the supplied event factory in shortened format.
     * @param block to configure
     */
    def getAuditEventFactoryFilters(@DelegatesTo(GetAuditEventFactoryFiltersCmd) Closure<?> block) {
        runDelegate(new GetAuditEventFactoryFiltersCmd(), block)
    }

    /**
     * Create a schedule.
     * @param block to configure
     */
    def createWSSchedule(@DelegatesTo(CreateWSScheduleCmd) Closure<?> block) {
        runDelegate(new CreateWSScheduleCmd(), block)
    }

    /**
     * Use this command to remove an unmanaged node from a cell.
     * @param block to configure
     */
    def removeUnmanagedNode(@DelegatesTo(RemoveUnmanagedNodeCmd) Closure<?> block) {
        runDelegate(new RemoveUnmanagedNodeCmd(), block)
    }

    /**
     * Removes set of templates that are not required anymore when a feature pack or stack product is removed.
     * @param block to configure
     */
    def removeTemplates(@DelegatesTo(RemoveTemplatesCmd) Closure<?> block) {
        runDelegate(new RemoveTemplatesCmd(), block)
    }

    /**
     * Configures an audit notification monitor.
     * @param block to configure
     */
    def createAuditNotificationMonitor(@DelegatesTo(CreateAuditNotificationMonitorCmd) Closure<?> block) {
        runDelegate(new CreateAuditNotificationMonitorCmd(), block)
    }

    /**
     * Import a tunnel template and its children into the cell-scoped config.
     * @param block to configure
     */
    def importTunnelTemplate(@DelegatesTo(ImportTunnelTemplateCmd) Closure<?> block) {
        runDelegate(new ImportTunnelTemplateCmd(), block)
    }

    /**
     * The listAttachmentsForPolicySet command lists the applications to which a specific policy set is attached.
     * @param block to configure
     */
    def listAttachmentsForPolicySet(@DelegatesTo(ListAttachmentsForPolicySetCmd) Closure<?> block) {
        runDelegate(new ListAttachmentsForPolicySetCmd(), block)
    }

    /**
     * Mediate a destination.
     * @param block to configure
     */
    def mediateSIBDestination(@DelegatesTo(MediateSIBDestinationCmd) Closure<?> block) {
        runDelegate(new MediateSIBDestinationCmd(), block)
    }

    /**
     * Create a SIB JMS topic at the scope identified by the target object.
     * @param block to configure
     */
    def createSIBJMSTopic(@DelegatesTo(CreateSIBJMSTopicCmd) Closure<?> block) {
        runDelegate(new CreateSIBJMSTopicCmd(), block)
    }

    /**
     * Add a configuration property under a configuration group.
     * @param block to configure
     */
    def addSTSConfigurationProperty(@DelegatesTo(AddSTSConfigurationPropertyCmd) Closure<?> block) {
        runDelegate(new AddSTSConfigurationPropertyCmd(), block)
    }

    /**
     * Deletes the configuration for a virtual member manager property not supported by a specific LDAP repository.
     * @param block to configure
     */
    def deleteIdMgrLDAPAttrNotSupported(@DelegatesTo(DeleteIdMgrLDAPAttrNotSupportedCmd) Closure<?> block) {
        runDelegate(new DeleteIdMgrLDAPAttrNotSupportedCmd(), block)
    }

    /**
     * Get the available JMS connection factories
     * @param block to configure
     */
    def getJMSConnectionFactories(@DelegatesTo(GetJMSConnectionFactoriesCmd) Closure<?> block) {
        runDelegate(new GetJMSConnectionFactoriesCmd(), block)
    }

    /**
     * Export the SCA SCDL
     * @param block to configure
     */
    def exportSCDL(@DelegatesTo(ExportSCDLCmd) Closure<?> block) {
        runDelegate(new ExportSCDLCmd(), block)
    }

    /**
     * Modifies an audit specification entry in the audit.xml that matches the reference Id.
     * @param block to configure
     */
    def modifyAuditFilter(@DelegatesTo(ModifyAuditFilterCmd) Closure<?> block) {
        runDelegate(new ModifyAuditFilterCmd(), block)
    }

    /**
     * Get properties associated with a specific Target.
     * @param block to configure
     */
    def getTargetProperties(@DelegatesTo(GetTargetPropertiesCmd) Closure<?> block) {
        runDelegate(new GetTargetPropertiesCmd(), block)
    }

    /**
     * Remove a member from a bus.
     * @param block to configure
     */
    def removeSIBusMember(@DelegatesTo(RemoveSIBusMemberCmd) Closure<?> block) {
        runDelegate(new RemoveSIBusMemberCmd(), block)
    }

    /**
     * Returns the state of Security Auditing.
     * @param block to configure
     */
    def setAuditSystemFailureAction(@DelegatesTo(SetAuditSystemFailureActionCmd) Closure<?> block) {
        runDelegate(new SetAuditSystemFailureActionCmd(), block)
    }

    /**
     * Returns the audit policy attributes.
     * @param block to configure
     */
    def getAuditPolicy(@DelegatesTo(GetAuditPolicyCmd) Closure<?> block) {
        runDelegate(new GetAuditPolicyCmd(), block)
    }

    /**
     * Creates a IBM MQ Connection Factory at the scope provided to the command.
     * @param block to configure
     */
    def createWMQConnectionFactory(@DelegatesTo(CreateWMQConnectionFactoryCmd) Closure<?> block) {
        runDelegate(new CreateWMQConnectionFactoryCmd(), block)
    }

    /**
     * Gives a user permission to access the topic for the specified role.
     * @param block to configure
     */
    def addUserToTopicRole(@DelegatesTo(AddUserToTopicRoleCmd) Closure<?> block) {
        runDelegate(new AddUserToTopicRoleCmd(), block)
    }

    /**
     * Lists all the topics with roles defined for the specified topic space.
     * @param block to configure
     */
    def listAllTopicsWithRoles(@DelegatesTo(ListAllTopicsWithRolesCmd) Closure<?> block) {
        runDelegate(new ListAllTopicsWithRolesCmd(), block)
    }

    /**
     * Create an STS token type configuration. Token type local names and URIs must be unique.
     * @param block to configure
     */
    def createSTSTokenTypeConfiguration(@DelegatesTo(CreateSTSTokenTypeConfigurationCmd) Closure<?> block) {
        runDelegate(new CreateSTSTokenTypeConfigurationCmd(), block)
    }

    /**
     * Returns the operating system platform for a given node.
     * @param block to configure
     */
    def getNodePlatformOS(@DelegatesTo(GetNodePlatformOSCmd) Closure<?> block) {
        runDelegate(new GetNodePlatformOSCmd(), block)
    }

    /**
     * Lists the mapping of default parent uniqueName for all entity types in a specified realm. If realm name is not specified, default realm is used.
     * @param block to configure
     */
    def listIdMgrRealmDefaultParents(@DelegatesTo(ListIdMgrRealmDefaultParentsCmd) Closure<?> block) {
        runDelegate(new ListIdMgrRealmDefaultParentsCmd(), block)
    }

    /**
     * Removes the trust association object from a security domain.
     * @param block to configure
     */
    def unconfigureTrustAssociation(@DelegatesTo(UnconfigureTrustAssociationCmd) Closure<?> block) {
        runDelegate(new UnconfigureTrustAssociationCmd(), block)
    }

    /**
     * Updates the configuration of the specified repository. To add multiple values to a multivalued parameter, call this command repeatedly.
     * @param block to configure
     */
    def updateIdMgrRepository(@DelegatesTo(UpdateIdMgrRepositoryCmd) Closure<?> block) {
        runDelegate(new UpdateIdMgrRepositoryCmd(), block)
    }

    /**
     * The setBinding command updates the binding configuration for a specified policy type and scope. Use this command to add a server-specific binding, update an attachment to use a custom binding, edit binding attributes, or remove a binding.
     * @param block to configure
     */
    def setBinding(@DelegatesTo(SetBindingCmd) Closure<?> block) {
        runDelegate(new SetBindingCmd(), block)
    }

    /**
     * Unconfigures a JAAS login in an application security domain.  This removes the JAAS login object and all it's entries.
     * @param block to configure
     */
    def unconfigureJAASLogin(@DelegatesTo(UnconfigureJAASLoginCmd) Closure<?> block) {
        runDelegate(new UnconfigureJAASLoginCmd(), block)
    }

    /**
     * Returns the current Application Security setting of true or false.
     * @param block to configure
     */
    def isAppSecurityEnabled(@DelegatesTo(IsAppSecurityEnabledCmd) Closure<?> block) {
        runDelegate(new IsAppSecurityEnabledCmd(), block)
    }

    /**
     * Delete a server configuration
     * @param block to configure
     */
    def deleteServer(@DelegatesTo(DeleteServerCmd) Closure<?> block) {
        runDelegate(new DeleteServerCmd(), block)
    }

    /**
     * Security registration for base and admin agent.
     * @param block to configure
     */
    def baseToAgentRegistrationAfterStart(@DelegatesTo(BaseToAgentRegistrationAfterStartCmd) Closure<?> block) {
        runDelegate(new BaseToAgentRegistrationAfterStartCmd(), block)
    }

    /**
     * Add an administered subscriber to a WS-Notification service point
     * @param block to configure
     */
    def createWSNAdministeredSubscriber(@DelegatesTo(CreateWSNAdministeredSubscriberCmd) Closure<?> block) {
        runDelegate(new CreateWSNAdministeredSubscriberCmd(), block)
    }

    /**
     * null
     * @param block to configure
     */
    def setClusterMemberLimit(@DelegatesTo(SetClusterMemberLimitCmd) Closure<?> block) {
        runDelegate(new SetClusterMemberLimitCmd(), block)
    }

    /**
     * Returns a boolean to indicate whether the global schema option is enabled for the data model in a multiple security domain environment.
     * @param block to configure
     */
    def isIdMgrUseGlobalSchemaForModel(@DelegatesTo(IsIdMgrUseGlobalSchemaForModelCmd) Closure<?> block) {
        runDelegate(new IsIdMgrUseGlobalSchemaForModelCmd(), block)
    }

    /**
     * Removes an interceptor from global security configuration or from a security domain.
     * @param block to configure
     */
    def unconfigureInterceptor(@DelegatesTo(UnconfigureInterceptorCmd) Closure<?> block) {
        runDelegate(new UnconfigureInterceptorCmd(), block)
    }

    /**
     * Export a tunnel template and its children into a simple properties file.
     * @param block to configure
     */
    def exportTunnelTemplate(@DelegatesTo(ExportTunnelTemplateCmd) Closure<?> block) {
        runDelegate(new ExportTunnelTemplateCmd(), block)
    }

    /**
     * Display configuration data for the given authentication provider(s).
     * @param block to configure
     */
    def displayJaspiProvider(@DelegatesTo(DisplayJaspiProviderCmd) Closure<?> block) {
        runDelegate(new DisplayJaspiProviderCmd(), block)
    }

    /**
     * This command will migrate a server messaging engine to a cluster messaging engine. It will not modify the messaging engine message store. Please ensure that the message store is suitable for the new clustered environment. If it is not, the migrated engine must be re-configured with a suitable message store before it is started, or the engine may fail to start.
     * @param block to configure
     */
    def migrateServerMEtoCluster(@DelegatesTo(MigrateServerMEtoClusterCmd) Closure<?> block) {
        runDelegate(new MigrateServerMEtoClusterCmd(), block)
    }

    /**
     * The getBinding command returns the binding configuration for a specified policy type and scope.
     * @param block to configure
     */
    def getBinding(@DelegatesTo(GetBindingCmd) Closure<?> block) {
        runDelegate(new GetBindingCmd(), block)
    }

    /**
     * Returns an audit emitter implementation object.
     * @param block to configure
     */
    def getAuditEmitter(@DelegatesTo(GetAuditEmitterCmd) Closure<?> block) {
        runDelegate(new GetAuditEmitterCmd(), block)
    }

    /**
     * Delete a named bus, including everything on it.
     * @param block to configure
     */
    def deleteSIBus(@DelegatesTo(DeleteSIBusCmd) Closure<?> block) {
        runDelegate(new DeleteSIBusCmd(), block)
    }

    /**
     * Delete a named WebSphere MQ server. Also, delete its membership of any buses, and cleanup all associated configuration.
     * @param block to configure
     */
    def deleteSIBWMQServer(@DelegatesTo(DeleteSIBWMQServerCmd) Closure<?> block) {
        runDelegate(new DeleteSIBWMQServerCmd(), block)
    }

    /**
     * Set the JNDI name that is bound to java:comp/DefaultManagedThreadFactory.
     * @param block to configure
     */
    def setDefaultManagedThreadFactory(@DelegatesTo(SetDefaultManagedThreadFactoryCmd) Closure<?> block) {
        runDelegate(new SetDefaultManagedThreadFactoryCmd(), block)
    }

    /**
     * Use the "installServiceMap" command to install a service map in a service map library.
     * @param block to configure
     */
    def installServiceMap(@DelegatesTo(InstallServiceMapCmd) Closure<?> block) {
        runDelegate(new InstallServiceMapCmd(), block)
    }

    /**
     * Show a member from a bus.
     * @param block to configure
     */
    def showSIBusMember(@DelegatesTo(ShowSIBusMemberCmd) Closure<?> block) {
        runDelegate(new ShowSIBusMemberCmd(), block)
    }

    /**
     * List the users in the specified role in the foreign bus security space role for the given bus.
     * @param block to configure
     */
    def listUsersInForeignBusRole(@DelegatesTo(ListUsersInForeignBusRoleCmd) Closure<?> block) {
        runDelegate(new ListUsersInForeignBusRoleCmd(), block)
    }

    /**
     * Modify a notifier.
     * @param block to configure
     */
    def modifyWSNotifier(@DelegatesTo(ModifyWSNotifierCmd) Closure<?> block) {
        runDelegate(new ModifyWSNotifierCmd(), block)
    }

    /**
     * Delete a key manager.
     * @param block to configure
     */
    def deleteKeyManager(@DelegatesTo(DeleteKeyManagerCmd) Closure<?> block) {
        runDelegate(new DeleteKeyManagerCmd(), block)
    }

    /**
     * Modify a descriptive property under an object.
     * @param block to configure
     */
    def modifyDescriptiveProp(@DelegatesTo(ModifyDescriptivePropCmd) Closure<?> block) {
        runDelegate(new ModifyDescriptivePropCmd(), block)
    }

    /**
     * Create a new Datasource to access the backend data store.  Application components use the Datasource to access connection instances to your database. A connection pool is associated with each Datasource.
     * @param block to configure
     */
    def createDatasource(@DelegatesTo(CreateDatasourceCmd) Closure<?> block) {
        runDelegate(new CreateDatasourceCmd(), block)
    }

    /**
     * Set Java virtual machine (JVM) Debug Mode
     * @param block to configure
     */
    def setJVMDebugMode(@DelegatesTo(SetJVMDebugModeCmd) Closure<?> block) {
        runDelegate(new SetJVMDebugModeCmd(), block)
    }

    /**
     * Returns a list of supported message digest algorithms.
     * @param block to configure
     */
    def listIdMgrSupportedMessageDigestAlgorithms(@DelegatesTo(ListIdMgrSupportedMessageDigestAlgorithmsCmd) Closure<?> block) {
        runDelegate(new ListIdMgrSupportedMessageDigestAlgorithmsCmd(), block)
    }

    /**
     * List Web Services Security distributed cache configuration custom properties
     * @param block to configure
     */
    def queryWSSDistributedCacheCustomConfig(@DelegatesTo(QueryWSSDistributedCacheCustomConfigCmd) Closure<?> block) {
        runDelegate(new QueryWSSDistributedCacheCustomConfigCmd(), block)
    }

    /**
     * Sets a list of references to defined filters for the supplied event factory.
     * @param block to configure
     */
    def setAuditEventFactoryFilters(@DelegatesTo(SetAuditEventFactoryFiltersCmd) Closure<?> block) {
        runDelegate(new SetAuditEventFactoryFiltersCmd(), block)
    }

    /**
     * Delete a SIB link.
     * @param block to configure
     */
    def deleteSIBLink(@DelegatesTo(DeleteSIBLinkCmd) Closure<?> block) {
        runDelegate(new DeleteSIBLinkCmd(), block)
    }

    /**
     * List key sets within a scope.
     * @param block to configure
     */
    def listKeySets(@DelegatesTo(ListKeySetsCmd) Closure<?> block) {
        runDelegate(new ListKeySetsCmd(), block)
    }

    /**
     * Configures a trust association.
     * @param block to configure
     */
    def configureTrustAssociation(@DelegatesTo(ConfigureTrustAssociationCmd) Closure<?> block) {
        runDelegate(new ConfigureTrustAssociationCmd(), block)
    }

    /**
     * Change the host name of a node
     * @param block to configure
     */
    def changeHostName(@DelegatesTo(ChangeHostNameCmd) Closure<?> block) {
        runDelegate(new ChangeHostNameCmd(), block)
    }

    /**
     * Auto-generates an LTPA password and updates the LTPA object in the security.xml.
     * @param block to configure
     */
    def autogenLTPA(@DelegatesTo(AutogenLTPACmd) Closure<?> block) {
        runDelegate(new AutogenLTPACmd(), block)
    }

    /**
     * Delete a specified business-level application.
     * @param block to configure
     */
    def deleteBLA(@DelegatesTo(DeleteBLACmd) Closure<?> block) {
        runDelegate(new DeleteBLACmd(), block)
    }

    /**
     * Information regarding a group of Targets.
     * @param block to configure
     */
    def getTargetGroupInfo(@DelegatesTo(GetTargetGroupInfoCmd) Closure<?> block) {
        runDelegate(new GetTargetGroupInfoCmd(), block)
    }

    /**
     * The getProviderPolicySharingInfo command returns the WSPolicy provider sharing information for a specified application or resource.
     * @param block to configure
     */
    def getProviderPolicySharingInfo(@DelegatesTo(GetProviderPolicySharingInfoCmd) Closure<?> block) {
        runDelegate(new GetProviderPolicySharingInfoCmd(), block)
    }

    /**
     * remove a node group from the configuration.
     * @param block to configure
     */
    def removeNodeGroup(@DelegatesTo(RemoveNodeGroupCmd) Closure<?> block) {
        runDelegate(new RemoveNodeGroupCmd(), block)
    }

    /**
     * Removes CSI inbound information from an application security domain.
     * @param block to configure
     */
    def unconfigureCSIInbound(@DelegatesTo(UnconfigureCSIInboundCmd) Closure<?> block) {
        runDelegate(new UnconfigureCSIInboundCmd(), block)
    }

    /**
     * Get property keys associated with an specific managed resource.
     * @param block to configure
     */
    def getManagedResourcePropertyKeys(@DelegatesTo(GetManagedResourcePropertyKeysCmd) Closure<?> block) {
        runDelegate(new GetManagedResourcePropertyKeysCmd(), block)
    }

    /**
     * Adds a member attribute configuration to the LDAP group configuration.
     * @param block to configure
     */
    def addIdMgrLDAPGroupMemberAttr(@DelegatesTo(AddIdMgrLDAPGroupMemberAttrCmd) Closure<?> block) {
        runDelegate(new AddIdMgrLDAPGroupMemberAttrCmd(), block)
    }

    /**
     * Sets the auditor identity in the audit.xml file.
     * @param block to configure
     */
    def setAuditorId(@DelegatesTo(SetAuditorIdCmd) Closure<?> block) {
        runDelegate(new SetAuditorIdCmd(), block)
    }

    /**
     * The copyBinding command creates a copy of an existing binding.
     * @param block to configure
     */
    def copyBinding(@DelegatesTo(CopyBindingCmd) Closure<?> block) {
        runDelegate(new CopyBindingCmd(), block)
    }

    /**
     * The getClientDynamicPolicyControl command returns the WSPolicy client acquisition information for a specified application or resource.
     * @param block to configure
     */
    def getClientDynamicPolicyControl(@DelegatesTo(GetClientDynamicPolicyControlCmd) Closure<?> block) {
        runDelegate(new GetClientDynamicPolicyControlCmd(), block)
    }

    /**
     * Remove a group's permission to connect to the specified bus.
     * @param block to configure
     */
    def removeGroupFromBusConnectorRole(@DelegatesTo(RemoveGroupFromBusConnectorRoleCmd) Closure<?> block) {
        runDelegate(new RemoveGroupFromBusConnectorRoleCmd(), block)
    }

    /**
     * Deletes the tables of the database in virtual member manager.
     * @param block to configure
     */
    def deleteIdMgrDBTables(@DelegatesTo(DeleteIdMgrDBTablesCmd) Closure<?> block) {
        runDelegate(new DeleteIdMgrDBTablesCmd(), block)
    }

    /**
     * List the SC custom properties
     * @param block to configure
     */
    def querySCClientCacheCustomConfiguration(@DelegatesTo(QuerySCClientCacheCustomConfigurationCmd) Closure<?> block) {
        runDelegate(new QuerySCClientCacheCustomConfigurationCmd(), block)
    }

    /**
     * Queries for all the Targets registered with the job manager.
     * @param block to configure
     */
    def queryTargets(@DelegatesTo(QueryTargetsCmd) Closure<?> block) {
        runDelegate(new QueryTargetsCmd(), block)
    }

    /**
     * Deletes the configuration for an LDAP attribute used as an external ID.
     * @param block to configure
     */
    def deleteIdMgrLDAPExternalIdAttr(@DelegatesTo(DeleteIdMgrLDAPExternalIdAttrCmd) Closure<?> block) {
        runDelegate(new DeleteIdMgrLDAPExternalIdAttrCmd(), block)
    }

    /**
     * Show the attributes of a JAX-WS Handler
     * @param block to configure
     */
    def showJAXWSHandler(@DelegatesTo(ShowJAXWSHandlerCmd) Closure<?> block) {
        runDelegate(new ShowJAXWSHandlerCmd(), block)
    }

    /**
     * The deletePolicySet command deletes the specified policy set. If attachments exist for the policy set, the command returns a failure message.
     * @param block to configure
     */
    def deletePolicySet(@DelegatesTo(DeletePolicySetCmd) Closure<?> block) {
        runDelegate(new DeletePolicySetCmd(), block)
    }

    /**
     * Updates a dynamic member attribute configuration of an LDAP group configuration.
     * @param block to configure
     */
    def updateIdMgrLDAPGroupDynamicMemberAttr(@DelegatesTo(UpdateIdMgrLDAPGroupDynamicMemberAttrCmd) Closure<?> block) {
        runDelegate(new UpdateIdMgrLDAPGroupDynamicMemberAttrCmd(), block)
    }

    /**
     * Use the "showLMService" command to show the attributes of a local mapping service.
     * @param block to configure
     */
    def showLMService(@DelegatesTo(ShowLMServiceCmd) Closure<?> block) {
        runDelegate(new ShowLMServiceCmd(), block)
    }

    /**
     * Returns a list of names for the SDKs on a given node.
     * @param block to configure
     */
    def getAvailableSDKsOnNode(@DelegatesTo(GetAvailableSDKsOnNodeCmd) Closure<?> block) {
        runDelegate(new GetAvailableSDKsOnNodeCmd(), block)
    }

    /**
     * The removeFromPolicySetAttachment command removes resources that apply to a policy set attachment.
     * @param block to configure
     */
    def removeFromPolicySetAttachment(@DelegatesTo(RemoveFromPolicySetAttachmentCmd) Closure<?> block) {
        runDelegate(new RemoveFromPolicySetAttachmentCmd(), block)
    }

    /**
     * Register a managed node with a JobManager
     * @param block to configure
     */
    def registerWithJobManager(@DelegatesTo(RegisterWithJobManagerCmd) Closure<?> block) {
        runDelegate(new RegisterWithJobManagerCmd(), block)
    }

    /**
     * updateSeveralWSSDistributedCacheConfigCmdDesc
     * @param block to configure
     */
    def updateDistributedCacheProperty(@DelegatesTo(UpdateDistributedCachePropertyCmd) Closure<?> block) {
        runDelegate(new UpdateDistributedCachePropertyCmd(), block)
    }

    /**
     * WASX7045I: Method: setAttribute

	Arguments: object name, attribute name, attribute value

	Description: Sets the attribute with name "attribute name" to the
	value given by "attribute value" for the MBean described by
	"object name."
     * @param block to configure
     */
    def adminservice_setAttribute(@DelegatesTo(Adminservice_setAttributeCmd) Closure<?> block) {
        runDelegate(new Adminservice_setAttributeCmd(), block)
    }

    /**
     * Remove feature pack or stack product features from existing server
     * @param block to configure
     */
    def removeFeaturesFromServer(@DelegatesTo(RemoveFeaturesFromServerCmd) Closure<?> block) {
        runDelegate(new RemoveFeaturesFromServerCmd(), block)
    }

    /**
     * Remove a variable definition from the system. A variable is a configuration property that can be used to provide a parameter for some values in the system.
     * @param block to configure
     */
    def removeVariable(@DelegatesTo(RemoveVariableCmd) Closure<?> block) {
        runDelegate(new RemoveVariableCmd(), block)
    }

    /**
     * This command removes the SAML TAI IdP partner from the security configuration. 
     * @param block to configure
     */
    def deleteSAMLIdpPartner(@DelegatesTo(DeleteSAMLIdpPartnerCmd) Closure<?> block) {
        runDelegate(new DeleteSAMLIdpPartnerCmd(), block)
    }

    /**
     * Configures a Federated repositories user registry in an application security domain.
     * @param block to configure
     */
    def configureAppWIMUserRegistry(@DelegatesTo(ConfigureAppWIMUserRegistryCmd) Closure<?> block) {
        runDelegate(new ConfigureAppWIMUserRegistryCmd(), block)
    }

    /**
     * Unpublish an inbound service from a UDDI registry.
     * @param block to configure
     */
    def unpublishSIBWSInboundService(@DelegatesTo(UnpublishSIBWSInboundServiceCmd) Closure<?> block) {
        runDelegate(new UnpublishSIBWSInboundServiceCmd(), block)
    }

    /**
     * Removes CSI outbound information from an application security domain.
     * @param block to configure
     */
    def unconfigureCSIOutbound(@DelegatesTo(UnconfigureCSIOutboundCmd) Closure<?> block) {
        runDelegate(new UnconfigureCSIOutboundCmd(), block)
    }

    /**
     * Adds RDN attribute configuration to an LDAP entity type configuration.
     * @param block to configure
     */
    def addIdMgrLDAPEntityTypeRDNAttr(@DelegatesTo(AddIdMgrLDAPEntityTypeRDNAttrCmd) Closure<?> block) {
        runDelegate(new AddIdMgrLDAPEntityTypeRDNAttrCmd(), block)
    }

    /**
     * Delete an existing Key Reference from a keySet.
     * @param block to configure
     */
    def deleteKeyReference(@DelegatesTo(DeleteKeyReferenceCmd) Closure<?> block) {
        runDelegate(new DeleteKeyReferenceCmd(), block)
    }

    /**
     * Retrieves a list of all the audit specifications defined in the audit.xml.
     * @param block to configure
     */
    def listAuditFilters(@DelegatesTo(ListAuditFiltersCmd) Closure<?> block) {
        runDelegate(new ListAuditFiltersCmd(), block)
    }

    /**
     * Get the automatic checkpoints enabled attribute value
     * @param block to configure
     */
    def getAutoCheckpointEnabled(@DelegatesTo(GetAutoCheckpointEnabledCmd) Closure<?> block) {
        runDelegate(new GetAutoCheckpointEnabledCmd(), block)
    }

    /**
     * Create a policy in which no group members are automatically activated.
     * @param block to configure
     */
    def createNoOpPolicy(@DelegatesTo(CreateNoOpPolicyCmd) Closure<?> block) {
        runDelegate(new CreateNoOpPolicyCmd(), block)
    }

    /**
     * Lists all the WSNTopicDocument objects in the configuration of the target WSNTopicNamespace that match the specified input parameters.
     * @param block to configure
     */
    def listWSNTopicDocuments(@DelegatesTo(ListWSNTopicDocumentsCmd) Closure<?> block) {
        runDelegate(new ListWSNTopicDocumentsCmd(), block)
    }

    /**
     * Use this command if there is no configuration data of crashed ME and user needs to recover persistent SBus ME data from message store.
     * @param block to configure
     */
    def recoverMEConfig(@DelegatesTo(RecoverMEConfigCmd) Closure<?> block) {
        runDelegate(new RecoverMEConfigCmd(), block)
    }

    /**
     * Converts an audit specification reference to a string representation.
     * @param block to configure
     */
    def convertFilterRefToString(@DelegatesTo(ConvertFilterRefToStringCmd) Closure<?> block) {
        runDelegate(new ConvertFilterRefToStringCmd(), block)
    }

    /**
     * Deletes an audit specification entry in the audit.xml that matches the event and outcome.
     * @param block to configure
     */
    def deleteAuditFilter(@DelegatesTo(DeleteAuditFilterCmd) Closure<?> block) {
        runDelegate(new DeleteAuditFilterCmd(), block)
    }

    /**
     * Use the "showServiceMap" command to show the attributes of a service map.
     * @param block to configure
     */
    def showServiceMap(@DelegatesTo(ShowServiceMapCmd) Closure<?> block) {
        runDelegate(new ShowServiceMapCmd(), block)
    }

    /**
     * The getPolicySetAttachments command lists the properties for all attachments configured for a specified application or for the trust service.
     * @param block to configure
     */
    def getPolicySetAttachments(@DelegatesTo(GetPolicySetAttachmentsCmd) Closure<?> block) {
        runDelegate(new GetPolicySetAttachmentsCmd(), block)
    }

    /**
     * The setDefaultBindings command updates the default binding names for a specified domain or server.
     * @param block to configure
     */
    def setDefaultBindings(@DelegatesTo(SetDefaultBindingsCmd) Closure<?> block) {
        runDelegate(new SetDefaultBindingsCmd(), block)
    }

    /**
     * List all management scopes.
     * @param block to configure
     */
    def listManagementScopes(@DelegatesTo(ListManagementScopesCmd) Closure<?> block) {
        runDelegate(new ListManagementScopesCmd(), block)
    }

    /**
     * This command removes automatically created persistent EJBTimers for a specific application or module on a specific server.  Refer to the product InfoCenter for scenarios where this command might be used.
     * @param block to configure
     */
    def removeAutomaticEJBTimers(@DelegatesTo(RemoveAutomaticEJBTimersCmd) Closure<?> block) {
        runDelegate(new RemoveAutomaticEJBTimersCmd(), block)
    }

    /**
     * Get the current security level of the secure proxy server.
     * @param block to configure
     */
    def getServerSecurityLevel(@DelegatesTo(GetServerSecurityLevelCmd) Closure<?> block) {
        runDelegate(new GetServerSecurityLevelCmd(), block)
    }

    /**
     * Generate profile key
     * @param block to configure
     */
    def generateProfileKey(@DelegatesTo(GenerateProfileKeyCmd) Closure<?> block) {
        runDelegate(new GenerateProfileKeyCmd(), block)
    }

    /**
     * Returns all the certificate used by SSL configuraiton and plugins. States if they comply with the requested security level. 
     * @param block to configure
     */
    def listCertStatusForSecurityStandard(@DelegatesTo(ListCertStatusForSecurityStandardCmd) Closure<?> block) {
        runDelegate(new ListCertStatusForSecurityStandardCmd(), block)
    }

    /**
     * This command creates a default core group access point for the specified core group and adds it to the default access point group.
     * @param block to configure
     */
    def createCoreGroupAccessPoint(@DelegatesTo(CreateCoreGroupAccessPointCmd) Closure<?> block) {
        runDelegate(new CreateCoreGroupAccessPointCmd(), block)
    }

    /**
     * list node groups containing given node, or list all node groups if no target node is given
     * @param block to configure
     */
    def listNodeGroups(@DelegatesTo(ListNodeGroupsCmd) Closure<?> block) {
        runDelegate(new ListNodeGroupsCmd(), block)
    }

    /**
     * remove a property from the job scheduler
     * @param block to configure
     */
    def removeJobSchedulerProperty(@DelegatesTo(RemoveJobSchedulerPropertyCmd) Closure<?> block) {
        runDelegate(new RemoveJobSchedulerPropertyCmd(), block)
    }

    /**
     * Update Web Services Security Distrubuted Cache configuration properties
     * @param block to configure
     */
    def updateWSSDistributedCacheConfig(@DelegatesTo(UpdateWSSDistributedCacheConfigCmd) Closure<?> block) {
        runDelegate(new UpdateWSSDistributedCacheConfigCmd(), block)
    }

    /**
     * Display the names of all authentication providers in the security configuration.
     * @param block to configure
     */
    def displayJaspiProviderNames(@DelegatesTo(DisplayJaspiProviderNamesCmd) Closure<?> block) {
        runDelegate(new DisplayJaspiProviderNamesCmd(), block)
    }

    /**
     * Gets information about each certificate in a certificate chain.
     * @param block to configure
     */
    def getCertificateChain(@DelegatesTo(GetCertificateChainCmd) Closure<?> block) {
        runDelegate(new GetCertificateChainCmd(), block)
    }

    /**
     * Process the pureQuery bind files that are in an installed application.  Bind static SQL packages in a database.  Refer to the information center documentation for the pureQuery bind utility.
     * @param block to configure
     */
    def processPureQueryBindFiles(@DelegatesTo(ProcessPureQueryBindFilesCmd) Closure<?> block) {
        runDelegate(new ProcessPureQueryBindFilesCmd(), block)
    }

    /**
     * Enables the verbose gathering of audit data.
     * @param block to configure
     */
    def enableVerboseAudit(@DelegatesTo(EnableVerboseAuditCmd) Closure<?> block) {
        runDelegate(new EnableVerboseAuditCmd(), block)
    }

    /**
     * Create a JAX-WS Handler
     * @param block to configure
     */
    def createJAXWSHandler(@DelegatesTo(CreateJAXWSHandlerCmd) Closure<?> block) {
        runDelegate(new CreateJAXWSHandlerCmd(), block)
    }

    /**
     * Lists the name of configured realms.
     * @param block to configure
     */
    def listIdMgrRealms(@DelegatesTo(ListIdMgrRealmsCmd) Closure<?> block) {
        runDelegate(new ListIdMgrRealmsCmd(), block)
    }

    /**
     * Modify a trust manager.
     * @param block to configure
     */
    def modifyTrustManager(@DelegatesTo(ModifyTrustManagerCmd) Closure<?> block) {
        runDelegate(new ModifyTrustManagerCmd(), block)
    }

    /**
     * Modify a SSL configuration group.
     * @param block to configure
     */
    def modifySSLConfigGroup(@DelegatesTo(ModifySSLConfigGroupCmd) Closure<?> block) {
        runDelegate(new ModifySSLConfigGroupCmd(), block)
    }

    /**
     * Sets up the LDAP search result cache configuration.
     * @param block to configure
     */
    def setIdMgrLDAPSearchResultCache(@DelegatesTo(SetIdMgrLDAPSearchResultCacheCmd) Closure<?> block) {
        runDelegate(new SetIdMgrLDAPSearchResultCacheCmd(), block)
    }

    /**
     * Creates an empty security domain object.
     * @param block to configure
     */
    def createSecurityDomain(@DelegatesTo(CreateSecurityDomainCmd) Closure<?> block) {
        runDelegate(new CreateSecurityDomainCmd(), block)
    }

    /**
     * List all WebSphere MQ servers.
     * @param block to configure
     */
    def listSIBWMQServerBusMembers(@DelegatesTo(ListSIBWMQServerBusMembersCmd) Closure<?> block) {
        runDelegate(new ListSIBWMQServerBusMembersCmd(), block)
    }

    /**
     * Creates a security domain by coping from another security domain.
     * @param block to configure
     */
    def copySecurityDomain(@DelegatesTo(CopySecurityDomainCmd) Closure<?> block) {
        runDelegate(new CopySecurityDomainCmd(), block)
    }

    /**
     * Lists the backup LDAP servers.
     * @param block to configure
     */
    def listIdMgrLDAPBackupServers(@DelegatesTo(ListIdMgrLDAPBackupServersCmd) Closure<?> block) {
        runDelegate(new ListIdMgrLDAPBackupServersCmd(), block)
    }

    /**
     * Shows the attributes of the IBM MQ Connection Factory provided to the command.
     * @param block to configure
     */
    def showWMQConnectionFactory(@DelegatesTo(ShowWMQConnectionFactoryCmd) Closure<?> block) {
        runDelegate(new ShowWMQConnectionFactoryCmd(), block)
    }

    /**
     * Configures a local OS user registry in an application security domain.
     * @param block to configure
     */
    def configureAppLocalOSUserRegistry(@DelegatesTo(ConfigureAppLocalOSUserRegistryCmd) Closure<?> block) {
        runDelegate(new ConfigureAppLocalOSUserRegistryCmd(), block)
    }

    /**
     * Returns a list of all cell, node, server, cluster, and nodegroups management scopes in the configuration.
     * @param block to configure
     */
    def listManagementScopeOptions(@DelegatesTo(ListManagementScopeOptionsCmd) Closure<?> block) {
        runDelegate(new ListManagementScopeOptionsCmd(), block)
    }

    /**
     * Lists all the roles defined for a specified group.
     * @param block to configure
     */
    def listAllRolesForGroup(@DelegatesTo(ListAllRolesForGroupCmd) Closure<?> block) {
        runDelegate(new ListAllRolesForGroupCmd(), block)
    }

    /**
     * creates a server Template based on a server configuration
     * @param block to configure
     */
    def createWebServerTemplate(@DelegatesTo(CreateWebServerTemplateCmd) Closure<?> block) {
        runDelegate(new CreateWebServerTemplateCmd(), block)
    }

    /**
     * Gets the attributes for a Web service in an enterprise application.
     * @param block to configure
     */
    def getWebService(@DelegatesTo(GetWebServiceCmd) Closure<?> block) {
        runDelegate(new GetWebServiceCmd(), block)
    }

    /**
     * Modify the attributes of the supplied SIB JMS topic using the supplied attribute values.
     * @param block to configure
     */
    def modifySIBJMSTopic(@DelegatesTo(ModifySIBJMSTopicCmd) Closure<?> block) {
        runDelegate(new ModifySIBJMSTopicCmd(), block)
    }

    /**
     * Makes a group a member of the same groups as another group.
     * @param block to configure
     */
    def duplicateMembershipOfGroup(@DelegatesTo(DuplicateMembershipOfGroupCmd) Closure<?> block) {
        runDelegate(new DuplicateMembershipOfGroupCmd(), block)
    }

    /**
     * Set certain runtime properties for devices and job managers. Caution: a null ID implies each and everyone
     * @param block to configure
     */
    def setRuntimeRegistrationProperties(@DelegatesTo(SetRuntimeRegistrationPropertiesCmd) Closure<?> block) {
        runDelegate(new SetRuntimeRegistrationPropertiesCmd(), block)
    }

    /**
     * Modifies the properties of the IBM MQ Activation Specification provided to the command.
     * @param block to configure
     */
    def modifyWMQActivationSpec(@DelegatesTo(ModifyWMQActivationSpecCmd) Closure<?> block) {
        runDelegate(new ModifyWMQActivationSpecCmd(), block)
    }

    /**
     * Returns the state of the sendEmail audit notification.
     * @param block to configure
     */
    def getSendEmail(@DelegatesTo(GetSendEmailCmd) Closure<?> block) {
        runDelegate(new GetSendEmailCmd(), block)
    }

    /**
     * This command unconfigures SPNEGO Web authentication in the security configuration.
     * @param block to configure
     */
    def unconfigureSpnego(@DelegatesTo(UnconfigureSpnegoCmd) Closure<?> block) {
        runDelegate(new UnconfigureSpnegoCmd(), block)
    }

    /**
     * Remove users from a naming role.
     * @param block to configure
     */
    def removeUsersFromNamingRole(@DelegatesTo(RemoveUsersFromNamingRoleCmd) Closure<?> block) {
        runDelegate(new RemoveUsersFromNamingRoleCmd(), block)
    }

    /**
     * The KRB5 authentication mechanism security object field in the security configuration file is deleted. 
     * @param block to configure
     */
    def deleteKrbAuthMechanism(@DelegatesTo(DeleteKrbAuthMechanismCmd) Closure<?> block) {
        runDelegate(new DeleteKrbAuthMechanismCmd(), block)
    }

    /**
     * Deletes the IBM MQ Activation Specification object provided to the command.
     * @param block to configure
     */
    def deleteWMQActivationSpec(@DelegatesTo(DeleteWMQActivationSpecCmd) Closure<?> block) {
        runDelegate(new DeleteWMQActivationSpecCmd(), block)
    }

    /**
     * Delete an authentication data entry from the administrative security configuration or a in a security domain.
     * @param block to configure
     */
    def deleteAuthDataEntry(@DelegatesTo(DeleteAuthDataEntryCmd) Closure<?> block) {
        runDelegate(new DeleteAuthDataEntryCmd(), block)
    }

    /**
     * Copies the files related to virtual member manager from the specified source domain to the specified destination domain.
     * @param block to configure
     */
    def copyIdMgrFilesForDomain(@DelegatesTo(CopyIdMgrFilesForDomainCmd) Closure<?> block) {
        runDelegate(new CopyIdMgrFilesForDomainCmd(), block)
    }

    /**
     * Removes a group from all roles defined.
     * @param block to configure
     */
    def removeGroupFromAllRoles(@DelegatesTo(RemoveGroupFromAllRolesCmd) Closure<?> block) {
        runDelegate(new RemoveGroupFromAllRolesCmd(), block)
    }

    /**
     * Delete an endpoint listener.
     * @param block to configure
     */
    def deleteSIBWSEndpointListener(@DelegatesTo(DeleteSIBWSEndpointListenerCmd) Closure<?> block) {
        runDelegate(new DeleteSIBWSEndpointListenerCmd(), block)
    }

    /**
     * Creates an entry in the audit.xml to reference an Audit Specification. Enables the specification by default.
     * @param block to configure
     */
    def createAuditFilter(@DelegatesTo(CreateAuditFilterCmd) Closure<?> block) {
        runDelegate(new CreateAuditFilterCmd(), block)
    }

    /**
     * Removes a backup LDAP server.
     * @param block to configure
     */
    def removeIdMgrLDAPBackupServer(@DelegatesTo(RemoveIdMgrLDAPBackupServerCmd) Closure<?> block) {
        runDelegate(new RemoveIdMgrLDAPBackupServerCmd(), block)
    }

    /**
     * Lists the name of all configured attributes for the specified LDAP repository.
     * @param block to configure
     */
    def listIdMgrLDAPAttrs(@DelegatesTo(ListIdMgrLDAPAttrsCmd) Closure<?> block) {
        runDelegate(new ListIdMgrLDAPAttrsCmd(), block)
    }

    /**
     * Remove the given authentication provider(s) from the security configuration.
     * @param block to configure
     */
    def removeJaspiProvider(@DelegatesTo(RemoveJaspiProviderCmd) Closure<?> block) {
        runDelegate(new RemoveJaspiProviderCmd(), block)
    }

    /**
     * Remove groupids from one or more audit role in the AuthorizationGroup.
     * @param block to configure
     */
    def removeGroupsFromAuditRole(@DelegatesTo(RemoveGroupsFromAuditRoleCmd) Closure<?> block) {
        runDelegate(new RemoveGroupsFromAuditRoleCmd(), block)
    }

    /**
     * Gets information about a certificate authority (CA) client configurator object.
     * @param block to configure
     */
    def getCAClient(@DelegatesTo(GetCAClientCmd) Closure<?> block) {
        runDelegate(new GetCAClientCmd(), block)
    }

    /**
     * List the groups in the specified role in the foreign bus security space role for the given bus.
     * @param block to configure
     */
    def listGroupsInForeignBusRole(@DelegatesTo(ListGroupsInForeignBusRoleCmd) Closure<?> block) {
        runDelegate(new ListGroupsInForeignBusRoleCmd(), block)
    }

    /**
     * Lists the available Server Templates
     * @param block to configure
     */
    def listServerTemplates(@DelegatesTo(ListServerTemplatesCmd) Closure<?> block) {
        runDelegate(new ListServerTemplatesCmd(), block)
    }

    /**
     * The administrative security field in the security.xml file is updated based on the user input of true or false.
     * @param block to configure
     */
    def setGlobalSecurity(@DelegatesTo(SetGlobalSecurityCmd) Closure<?> block) {
        runDelegate(new SetGlobalSecurityCmd(), block)
    }

    /**
     * Lists all base entries of the specified realm.
     * @param block to configure
     */
    def listIdMgrRealmBaseEntries(@DelegatesTo(ListIdMgrRealmBaseEntriesCmd) Closure<?> block) {
        runDelegate(new ListIdMgrRealmBaseEntriesCmd(), block)
    }

    /**
     * Removes multiple extensions from the composition unit.
     * @param block to configure
     */
    def removeOSGiExtensions(@DelegatesTo(RemoveOSGiExtensionsCmd) Closure<?> block) {
        runDelegate(new RemoveOSGiExtensionsCmd(), block)
    }

    /**
     * Creates a new member of an application server cluster.
     * @param block to configure
     */
    def createClusterMember(@DelegatesTo(CreateClusterMemberCmd) Closure<?> block) {
        runDelegate(new CreateClusterMemberCmd(), block)
    }

    /**
     * create sysplex node group
     * @param block to configure
     */
    def createSysplexNodeGroup(@DelegatesTo(CreateSysplexNodeGroupCmd) Closure<?> block) {
        runDelegate(new CreateSysplexNodeGroupCmd(), block)
    }

    /**
     * The command will return "true" if the destination specified inherits the default security permissions.
     * @param block to configure
     */
    def isInheritDefaultsForDestination(@DelegatesTo(IsInheritDefaultsForDestinationCmd) Closure<?> block) {
        runDelegate(new IsInheritDefaultsForDestinationCmd(), block)
    }

    /**
     * Lists the services based on a generic query properties. It provides more generic query functions than listWebServices, listWebServiceEndpoints, listWebServiceOperations, and getWebService commands.
     * @param block to configure
     */
    def listServices(@DelegatesTo(ListServicesCmd) Closure<?> block) {
        runDelegate(new ListServicesCmd(), block)
    }

    /**
     * This command is used to add members to a target group.
     * @param block to configure
     */
    def addMemberToTargetGroup(@DelegatesTo(AddMemberToTargetGroupCmd) Closure<?> block) {
        runDelegate(new AddMemberToTargetGroupCmd(), block)
    }

    /**
     * Query the STS for a list of configured token types.
     * @param block to configure
     */
    def listSTSConfiguredTokenTypes(@DelegatesTo(ListSTSConfiguredTokenTypesCmd) Closure<?> block) {
        runDelegate(new ListSTSConfiguredTokenTypesCmd(), block)
    }

    /**
     * Create a new JDBC provider that is used to connect with a relational database for data access.
     * @param block to configure
     */
    def createJDBCProvider(@DelegatesTo(CreateJDBCProviderCmd) Closure<?> block) {
        runDelegate(new CreateJDBCProviderCmd(), block)
    }

    /**
     * Grants a group default access to all local destinations on the bus for the specified role.
     * @param block to configure
     */
    def addGroupToDefaultRole(@DelegatesTo(AddGroupToDefaultRoleCmd) Closure<?> block) {
        runDelegate(new AddGroupToDefaultRoleCmd(), block)
    }

    /**
     * remove a given node from node groups
     * @param block to configure
     */
    def removeNodeFromNodeGroups(@DelegatesTo(RemoveNodeFromNodeGroupsCmd) Closure<?> block) {
        runDelegate(new RemoveNodeFromNodeGroupsCmd(), block)
    }

    /**
     * Grants a user access to a foreign bus from the local bus specified for the specified destination role.
     * @param block to configure
     */
    def addUserToForeignBusRole(@DelegatesTo(AddUserToForeignBusRoleCmd) Closure<?> block) {
        runDelegate(new AddUserToForeignBusRoleCmd(), block)
    }

    /**
     * Lists the JavaServer Faces implementation used by the WebSphere runtime for an application
     * @param block to configure
     */
    def listJSFImplementation(@DelegatesTo(ListJSFImplementationCmd) Closure<?> block) {
        runDelegate(new ListJSFImplementationCmd(), block)
    }

    /**
     * Modify a JAX-WS Handler
     * @param block to configure
     */
    def modifyJAXWSHandler(@DelegatesTo(ModifyJAXWSHandlerCmd) Closure<?> block) {
        runDelegate(new ModifyJAXWSHandlerCmd(), block)
    }

    /**
     * Use this command to list all unmanaged nodes in the cell.
     * @param block to configure
     */
    def listUnmanagedNodes(@DelegatesTo(ListUnmanagedNodesCmd) Closure<?> block) {
        runDelegate(new ListUnmanagedNodesCmd(), block)
    }

    /**
     * Create a new NamedEndPoint endpoint to associate with a UDPInboundChannel
     * @param block to configure
     */
    def createUDPEndPoint(@DelegatesTo(CreateUDPEndPointCmd) Closure<?> block) {
        runDelegate(new CreateUDPEndPointCmd(), block)
    }

    /**
     * This command displays the SAML TAI SSO in the security configuration. If an ssoId is not specified, all the SAML TAI SSO service providers are displayed.
     * @param block to configure
     */
    def showSAMLTAISSO(@DelegatesTo(ShowSAMLTAISSOCmd) Closure<?> block) {
        runDelegate(new ShowSAMLTAISSOCmd(), block)
    }

    /**
     * List all of the defined connection factory interfaces on the specified J2C resource adapter.
     * @param block to configure
     */
    def listConnectionFactoryInterfaces(@DelegatesTo(ListConnectionFactoryInterfacesCmd) Closure<?> block) {
        runDelegate(new ListConnectionFactoryInterfacesCmd(), block)
    }

    /**
     * export the configuration of a wsprofile to a config archive.
     * @param block to configure
     */
    def exportWasprofile(@DelegatesTo(ExportWasprofileCmd) Closure<?> block) {
        runDelegate(new ExportWasprofileCmd(), block)
    }

    /**
     * Create a notifier.
     * @param block to configure
     */
    def createWSNotifier(@DelegatesTo(CreateWSNotifierCmd) Closure<?> block) {
        runDelegate(new CreateWSNotifierCmd(), block)
    }

    /**
     * This command lists the current embedded Tivoli Access Manager configuration settings.
     * @param block to configure
     */
    def listTAMSettings(@DelegatesTo(ListTAMSettingsCmd) Closure<?> block) {
        runDelegate(new ListTAMSettingsCmd(), block)
    }

    /**
     * Use the "uninstallServiceMap" command to uninstall a service map.
     * @param block to configure
     */
    def uninstallServiceMap(@DelegatesTo(UninstallServiceMapCmd) Closure<?> block) {
        runDelegate(new UninstallServiceMapCmd(), block)
    }

    /**
     * Deletes a supported entity type configuration.
     * @param block to configure
     */
    def deleteIdMgrSupportedEntityType(@DelegatesTo(DeleteIdMgrSupportedEntityTypeCmd) Closure<?> block) {
        runDelegate(new DeleteIdMgrSupportedEntityTypeCmd(), block)
    }

    /**
     * Command that creates a server
     * @param block to configure
     */
    def createProxyServer(@DelegatesTo(CreateProxyServerCmd) Closure<?> block) {
        runDelegate(new CreateProxyServerCmd(), block)
    }

    /**
     * Adds a property to one or more entity types either into repositories or into the property extension repository.
     * @param block to configure
     */
    def addIdMgrPropertyToEntityTypes(@DelegatesTo(AddIdMgrPropertyToEntityTypesCmd) Closure<?> block) {
        runDelegate(new AddIdMgrPropertyToEntityTypesCmd(), block)
    }

    /**
     * Command that creates a server
     * @param block to configure
     */
    def createServer(@DelegatesTo(CreateServerCmd) Closure<?> block) {
        runDelegate(new CreateServerCmd(), block)
    }

    /**
     * Get the current JVM mode. The command will return either 31-bit or 64-bit.
     * @param block to configure
     */
    def getJVMMode(@DelegatesTo(GetJVMModeCmd) Closure<?> block) {
        runDelegate(new GetJVMModeCmd(), block)
    }

    /**
     * Renames the specified realm configuration.
     * @param block to configure
     */
    def renameIdMgrRealm(@DelegatesTo(RenameIdMgrRealmCmd) Closure<?> block) {
        runDelegate(new RenameIdMgrRealmCmd(), block)
    }

    /**
     * Start the Certificate Expiration Monitor.
     * @param block to configure
     */
    def startCertificateExpMonitor(@DelegatesTo(StartCertificateExpMonitorCmd) Closure<?> block) {
        runDelegate(new StartCertificateExpMonitorCmd(), block)
    }

    /**
     * Deletes RDN attribute configuration from an LDAP entity type configuration.
     * @param block to configure
     */
    def deleteIdMgrLDAPEntityTypeRDNAttr(@DelegatesTo(DeleteIdMgrLDAPEntityTypeRDNAttrCmd) Closure<?> block) {
        runDelegate(new DeleteIdMgrLDAPEntityTypeRDNAttrCmd(), block)
    }

    /**
     * import the configuration of a node from a config archive. This is a private command that is only invoked by addNode command.
     * @param block to configure
     */
    def importNode(@DelegatesTo(ImportNodeCmd) Closure<?> block) {
        runDelegate(new ImportNodeCmd(), block)
    }

    /**
     * set Java virtual machine (JVM) system property for the application server's process.
     * @param block to configure
     */
    def setJVMSystemProperties(@DelegatesTo(SetJVMSystemPropertiesCmd) Closure<?> block) {
        runDelegate(new SetJVMSystemPropertiesCmd(), block)
    }

    /**
     * Create a Key Reference for a keySet.
     * @param block to configure
     */
    def createKeyReference(@DelegatesTo(CreateKeyReferenceCmd) Closure<?> block) {
        runDelegate(new CreateKeyReferenceCmd(), block)
    }

    /**
     * Returns a list of resources and their associated domain for each resource provided.
     * @param block to configure
     */
    def listSecurityDomainsForResources(@DelegatesTo(ListSecurityDomainsForResourcesCmd) Closure<?> block) {
        runDelegate(new ListSecurityDomainsForResourcesCmd(), block)
    }

    /**
     * Delete an WebSphere MQ link.
     * @param block to configure
     */
    def deleteSIBMQLink(@DelegatesTo(DeleteSIBMQLinkCmd) Closure<?> block) {
        runDelegate(new DeleteSIBMQLinkCmd(), block)
    }

    /**
     * Updates a base entry for the specified repository. 
     * @param block to configure
     */
    def updateIdMgrRepositoryBaseEntry(@DelegatesTo(UpdateIdMgrRepositoryBaseEntryCmd) Closure<?> block) {
        runDelegate(new UpdateIdMgrRepositoryBaseEntryCmd(), block)
    }

    /**
     * Show a bus destination's attributes.
     * @param block to configure
     */
    def showSIBDestination(@DelegatesTo(ShowSIBDestinationCmd) Closure<?> block) {
        runDelegate(new ShowSIBDestinationCmd(), block)
    }

    /**
     * Restore the named checkpoint specified by the "checkpointName"
     * @param block to configure
     */
    def restoreCheckpoint(@DelegatesTo(RestoreCheckpointCmd) Closure<?> block) {
        runDelegate(new RestoreCheckpointCmd(), block)
    }

    /**
     * Returns the LDAP attribute cache configuration.
     * @param block to configure
     */
    def getIdMgrLDAPAttrCache(@DelegatesTo(GetIdMgrLDAPAttrCacheCmd) Closure<?> block) {
        runDelegate(new GetIdMgrLDAPAttrCacheCmd(), block)
    }

    /**
     * Get information about a Dynamic SSL configuration selection.
     * @param block to configure
     */
    def getDynamicSSLConfigSelection(@DelegatesTo(GetDynamicSSLConfigSelectionCmd) Closure<?> block) {
        runDelegate(new GetDynamicSSLConfigSelectionCmd(), block)
    }

    /**
     * This command is used to delete a group of managed nodes. (deprecated)
     * @param block to configure
     */
    def deleteManagedNodeGroup(@DelegatesTo(DeleteManagedNodeGroupCmd) Closure<?> block) {
        runDelegate(new DeleteManagedNodeGroupCmd(), block)
    }

    /**
     * Returns the dynamic member attribute configuration from the LDAP group configuration.
     * @param block to configure
     */
    def getIdMgrLDAPGroupDynamicMemberAttrs(@DelegatesTo(GetIdMgrLDAPGroupDynamicMemberAttrsCmd) Closure<?> block) {
        runDelegate(new GetIdMgrLDAPGroupDynamicMemberAttrsCmd(), block)
    }

    /**
     * Shows the attributes of the IBM MQ Activation Specification provided to the command.
     * @param block to configure
     */
    def showWMQActivationSpec(@DelegatesTo(ShowWMQActivationSpecCmd) Closure<?> block) {
        runDelegate(new ShowWMQActivationSpecCmd(), block)
    }

    /**
     * This command is used to list members of a group of managed nodes. (deprecated)
     * @param block to configure
     */
    def getManagedNodeGroupMembers(@DelegatesTo(GetManagedNodeGroupMembersCmd) Closure<?> block) {
        runDelegate(new GetManagedNodeGroupMembersCmd(), block)
    }

    /**
     * Modify the attributes of the given SIB JMS activation specification.
     * @param block to configure
     */
    def modifySIBJMSActivationSpec(@DelegatesTo(ModifySIBJMSActivationSpecCmd) Closure<?> block) {
        runDelegate(new ModifySIBJMSActivationSpecCmd(), block)
    }

    /**
     * Lists the name of all configured entity types for the specified LDAP repository.
     * @param block to configure
     */
    def listIdMgrLDAPEntityTypes(@DelegatesTo(ListIdMgrLDAPEntityTypesCmd) Closure<?> block) {
        runDelegate(new ListIdMgrLDAPEntityTypesCmd(), block)
    }

    /**
     * Removes one or more bundles from the internal bundle repository in a single operation.
     * @param block to configure
     */
    def removeLocalRepositoryBundles(@DelegatesTo(RemoveLocalRepositoryBundlesCmd) Closure<?> block) {
        runDelegate(new RemoveLocalRepositoryBundlesCmd(), block)
    }

    /**
     * Update SAML Issuer Configuration data
     * @param block to configure
     */
    def updateSAMLIssuerConfig(@DelegatesTo(UpdateSAMLIssuerConfigCmd) Closure<?> block) {
        runDelegate(new UpdateSAMLIssuerConfigCmd(), block)
    }

    /**
     * List the users in the Bus Connector Role
     * @param block to configure
     */
    def listUsersInBusConnectorRole(@DelegatesTo(ListUsersInBusConnectorRoleCmd) Closure<?> block) {
        runDelegate(new ListUsersInBusConnectorRoleCmd(), block)
    }

    /**
     * Modify the attributes of the supplied SIB JMS connection factory using the supplied attribute values.
     * @param block to configure
     */
    def modifySIBJMSConnectionFactory(@DelegatesTo(ModifySIBJMSConnectionFactoryCmd) Closure<?> block) {
        runDelegate(new ModifySIBJMSConnectionFactoryCmd(), block)
    }

    /**
     * Show the process definition of the server
     * @param block to configure
     */
    def showProcessDefinition(@DelegatesTo(ShowProcessDefinitionCmd) Closure<?> block) {
        runDelegate(new ShowProcessDefinitionCmd(), block)
    }

    /**
     * Unconfigures a JAAS login entry in the administrative security configuration or in an application security domain.  Note: note all JAAS login entries can be removed.
     * @param block to configure
     */
    def unconfigureJAASLoginEntry(@DelegatesTo(UnconfigureJAASLoginEntryCmd) Closure<?> block) {
        runDelegate(new UnconfigureJAASLoginEntryCmd(), block)
    }

    /**
     * Searches PersonAccounts.
     * @param block to configure
     */
    def searchUsers(@DelegatesTo(SearchUsersCmd) Closure<?> block) {
        runDelegate(new SearchUsersCmd(), block)
    }

    /**
     * Returns the name of the default realm.
     * @param block to configure
     */
    def getIdMgrDefaultRealm(@DelegatesTo(GetIdMgrDefaultRealmCmd) Closure<?> block) {
        runDelegate(new GetIdMgrDefaultRealmCmd(), block)
    }

    /**
     * Remove resources from an existing authorization group.
     * @param block to configure
     */
    def removeResourceFromAuthorizationGroup(@DelegatesTo(RemoveResourceFromAuthorizationGroupCmd) Closure<?> block) {
        runDelegate(new RemoveResourceFromAuthorizationGroupCmd(), block)
    }

    /**
     * (Deprecated) list all long-running scheduler attributes. Use showJobSchedulerAttributes.
     * @param block to configure
     */
    def showLongRunningSchedulerAttributes(@DelegatesTo(ShowLongRunningSchedulerAttributesCmd) Closure<?> block) {
        runDelegate(new ShowLongRunningSchedulerAttributesCmd(), block)
    }

    /**
     * Returns the audit system failure policy.
     * @param block to configure
     */
    def getAuditSystemFailureAction(@DelegatesTo(GetAuditSystemFailureActionCmd) Closure<?> block) {
        runDelegate(new GetAuditSystemFailureActionCmd(), block)
    }

    /**
     * Refresh the WSDL definition for an inbound service.
     * @param block to configure
     */
    def refreshSIBWSInboundServiceWSDL(@DelegatesTo(RefreshSIBWSInboundServiceWSDLCmd) Closure<?> block) {
        runDelegate(new RefreshSIBWSInboundServiceWSDLCmd(), block)
    }

    /**
     * List a configuration group and its subgroups by name.
     * @param block to configure
     */
    def listSTSConfigurationGroups(@DelegatesTo(ListSTSConfigurationGroupsCmd) Closure<?> block) {
        runDelegate(new ListSTSConfigurationGroupsCmd(), block)
    }

    /**
     * null
     * @param block to configure
     */
    def getMWSConfigFile(@DelegatesTo(GetMWSConfigFileCmd) Closure<?> block) {
        runDelegate(new GetMWSConfigFileCmd(), block)
    }

    /**
     * Import a Secure Proxy Profile into this cell.
     * @param block to configure
     */
    def importProxyProfile(@DelegatesTo(ImportProxyProfileCmd) Closure<?> block) {
        runDelegate(new ImportProxyProfileCmd(), block)
    }

    /**
     * Returns a list of valid keystore usage types.  A usage is a way to identify how the keystore is intended to be used.
     * @param block to configure
     */
    def listKeyStoreUsages(@DelegatesTo(ListKeyStoreUsagesCmd) Closure<?> block) {
        runDelegate(new ListKeyStoreUsagesCmd(), block)
    }

    /**
     * List the configuration properties under a configuration group.
     * @param block to configure
     */
    def listSTSProperties(@DelegatesTo(ListSTSPropertiesCmd) Closure<?> block) {
        runDelegate(new ListSTSPropertiesCmd(), block)
    }

    /**
     * Sets an Admin Protocol enabled for a server or cell
     * @param block to configure
     */
    def setAdminProtocolEnabled(@DelegatesTo(SetAdminProtocolEnabledCmd) Closure<?> block) {
        runDelegate(new SetAdminProtocolEnabledCmd(), block)
    }

    /**
     * Updates the configuration of an application server cluster.
     * @param block to configure
     */
    def updateCluster(@DelegatesTo(UpdateClusterCmd) Closure<?> block) {
        runDelegate(new UpdateClusterCmd(), block)
    }

    /**
     * This command deletes the Sender Channel associated with the SIB MQ Link passed in as a target object.
     * @param block to configure
     */
    def deleteSIBMQLinkSenderChannel(@DelegatesTo(DeleteSIBMQLinkSenderChannelCmd) Closure<?> block) {
        runDelegate(new DeleteSIBMQLinkSenderChannelCmd(), block)
    }

    /**
     * Add feature pack or stack product features to existing server 
     * @param block to configure
     */
    def addFeaturesToServer(@DelegatesTo(AddFeaturesToServerCmd) Closure<?> block) {
        runDelegate(new AddFeaturesToServerCmd(), block)
    }

    /**
     * port a Certificate from another keystore to this keystore.
     * @param block to configure
     */
    def importCertificate(@DelegatesTo(ImportCertificateCmd) Closure<?> block) {
        runDelegate(new ImportCertificateCmd(), block)
    }

    /**
     * Updates a database repository configuration.
     * @param block to configure
     */
    def updateIdMgrDBRepository(@DelegatesTo(UpdateIdMgrDBRepositoryCmd) Closure<?> block) {
        runDelegate(new UpdateIdMgrDBRepositoryCmd(), block)
    }

    /**
     * This is a test function used exclusively by the development
     * @param block to configure
     */
    def testConnection(@DelegatesTo(TestConnectionCmd) Closure<?> block) {
        runDelegate(new TestConnectionCmd(), block)
    }

    /**
     * Get information about a key manager.
     * @param block to configure
     */
    def getKeyManager(@DelegatesTo(GetKeyManagerCmd) Closure<?> block) {
        runDelegate(new GetKeyManagerCmd(), block)
    }

    /**
     * Map groupids to one or more admin role in the authorization group.
     * @param block to configure
     */
    def mapGroupsToAdminRole(@DelegatesTo(MapGroupsToAdminRoleCmd) Closure<?> block) {
        runDelegate(new MapGroupsToAdminRoleCmd(), block)
    }

    /**
     * Lists all the servers or clusters that can be used for bootstrap into the specified bus.
     * @param block to configure
     */
    def listAllSIBBootstrapMembers(@DelegatesTo(ListAllSIBBootstrapMembersCmd) Closure<?> block) {
        runDelegate(new ListAllSIBBootstrapMembersCmd(), block)
    }

    /**
     * Returns properties for the SDKs. If the SDK name is not given, all properties for all avaiable SDKs are returned.  If the SDK attributes are specified, only properties for given SDK attributes are returned.
     * @param block to configure
     */
    def getSDKPropertiesOnNode(@DelegatesTo(GetSDKPropertiesOnNodeCmd) Closure<?> block) {
        runDelegate(new GetSDKPropertiesOnNodeCmd(), block)
    }

    /**
     * Maps the group to the specified role of virtual member manager.
     * @param block to configure
     */
    def mapIdMgrGroupToRole(@DelegatesTo(MapIdMgrGroupToRoleCmd) Closure<?> block) {
        runDelegate(new MapIdMgrGroupToRoleCmd(), block)
    }

    /**
     * Create Web server definition using hostname.
     * @param block to configure
     */
    def createWebServerByHostName(@DelegatesTo(CreateWebServerByHostNameCmd) Closure<?> block) {
        runDelegate(new CreateWebServerByHostNameCmd(), block)
    }

    /**
     * Unconfigures audit record signing.
     * @param block to configure
     */
    def deleteAuditSigningConfig(@DelegatesTo(DeleteAuditSigningConfigCmd) Closure<?> block) {
        runDelegate(new DeleteAuditSigningConfigCmd(), block)
    }

    /**
     * This command modifies the configuration for embedded Tivoli Access Manager on the WebSphere Application Server node or nodes specified.
     * @param block to configure
     */
    def modifyTAM(@DelegatesTo(ModifyTAMCmd) Closure<?> block) {
        runDelegate(new ModifyTAMCmd(), block)
    }

    /**
     * Use the "listLMServices" command to list the created local mapping services.
     * @param block to configure
     */
    def listLMServices(@DelegatesTo(ListLMServicesCmd) Closure<?> block) {
        runDelegate(new ListLMServicesCmd(), block)
    }

    /**
     * Grants a group access to a destination for the specified destination role.
     * @param block to configure
     */
    def addGroupToDestinationRole(@DelegatesTo(AddGroupToDestinationRoleCmd) Closure<?> block) {
        runDelegate(new AddGroupToDestinationRoleCmd(), block)
    }

    /**
     * Get information about a certificate request
     * @param block to configure
     */
    def getCertificateRequest(@DelegatesTo(GetCertificateRequestCmd) Closure<?> block) {
        runDelegate(new GetCertificateRequestCmd(), block)
    }

    /**
     * Show detail for a SIB foreign bus.
     * @param block to configure
     */
    def showSIBForeignBus(@DelegatesTo(ShowSIBForeignBusCmd) Closure<?> block) {
        runDelegate(new ShowSIBForeignBusCmd(), block)
    }

    /**
     * Queries for all the managed nodes registered with the job manager. (deprecated)
     * @param block to configure
     */
    def queryManagedNodes(@DelegatesTo(QueryManagedNodesCmd) Closure<?> block) {
        runDelegate(new QueryManagedNodesCmd(), block)
    }

    /**
     * Sets the notification email list for the configured audit notification.
     * @param block to configure
     */
    def setEmailList(@DelegatesTo(SetEmailListCmd) Closure<?> block) {
        runDelegate(new SetEmailListCmd(), block)
    }

    /**
     * A command that Deletes a Server Template
     * @param block to configure
     */
    def deleteServerTemplate(@DelegatesTo(DeleteServerTemplateCmd) Closure<?> block) {
        runDelegate(new DeleteServerTemplateCmd(), block)
    }

    /**
     * The getDefaultBindings command returns the default binding names for a specified domain or server.
     * @param block to configure
     */
    def getDefaultBindings(@DelegatesTo(GetDefaultBindingsCmd) Closure<?> block) {
        runDelegate(new GetDefaultBindingsCmd(), block)
    }

    /**
     * Edit a configuration property under a configuration group.
     * @param block to configure
     */
    def editSTSProperty(@DelegatesTo(EditSTSPropertyCmd) Closure<?> block) {
        runDelegate(new EditSTSPropertyCmd(), block)
    }

    /**
     * Update the configuration for an existing token type. Token type URIs must be unique.
     * @param block to configure
     */
    def updateSTSTokenTypeConfiguration(@DelegatesTo(UpdateSTSTokenTypeConfigurationCmd) Closure<?> block) {
        runDelegate(new UpdateSTSTokenTypeConfigurationCmd(), block)
    }

    /**
     * Returns an audit notification.
     * @param block to configure
     */
    def getAuditNotification(@DelegatesTo(GetAuditNotificationCmd) Closure<?> block) {
        runDelegate(new GetAuditNotificationCmd(), block)
    }

    /**
     * Get the NamedEndPoint endpoint that is associated with either a UDPInboundChannel, or a chain that contains a UDPInboundChannel
     * @param block to configure
     */
    def getUDPEndPoint(@DelegatesTo(GetUDPEndPointCmd) Closure<?> block) {
        runDelegate(new GetUDPEndPointCmd(), block)
    }

    /**
     * Returns the port associated with the specified bridge interface.  This is the port specified on the TCP inbound channel of transport channel chain for the specified bridge interface.
     * @param block to configure
     */
    def getNamedTCPEndPoint(@DelegatesTo(GetNamedTCPEndPointCmd) Closure<?> block) {
        runDelegate(new GetNamedTCPEndPointCmd(), block)
    }

    /**
     * Creates a IBM MQ Topic at the scope provided to the command.
     * @param block to configure
     */
    def createWMQTopic(@DelegatesTo(CreateWMQTopicCmd) Closure<?> block) {
        runDelegate(new CreateWMQTopicCmd(), block)
    }

    /**
     * Start a managed node's polling against a JobManager, possibly after a certain delay
     * @param block to configure
     */
    def startPollingJobManager(@DelegatesTo(StartPollingJobManagerCmd) Closure<?> block) {
        runDelegate(new StartPollingJobManagerCmd(), block)
    }

    /**
     * Returns a list of groups in a security realm, security domain, or resource.
     * @param block to configure
     */
    def listRegistryGroups(@DelegatesTo(ListRegistryGroupsCmd) Closure<?> block) {
        runDelegate(new ListRegistryGroupsCmd(), block)
    }

    /**
     * Updates the installation/deployment of the Asynchronous Response Servlet which is used when JAX-WS client applications use the JAX-WS asynchronous API
     * @param block to configure
     */
    def updateARSConfig(@DelegatesTo(UpdateARSConfigCmd) Closure<?> block) {
        runDelegate(new UpdateARSConfigCmd(), block)
    }

    /**
     * Import the configuration of a wasprofile profile from a configuration archive. This command overwrites the configuration of the current wasprofile configuration.
     * @param block to configure
     */
    def importWasprofile(@DelegatesTo(ImportWasprofileCmd) Closure<?> block) {
        runDelegate(new ImportWasprofileCmd(), block)
    }

    /**
     * Retrieve one of the service integration bus inbound services from a WS-Notification service
     * @param block to configure
     */
    def getWSN_SIBWSInboundService(@DelegatesTo(GetWSN_SIBWSInboundServiceCmd) Closure<?> block) {
        runDelegate(new GetWSN_SIBWSInboundServiceCmd(), block)
    }

    /**
     * Import OAuth Configuration After Export
     * @param block to configure
     */
    def importOAuthProps(@DelegatesTo(ImportOAuthPropsCmd) Closure<?> block) {
        runDelegate(new ImportOAuthPropsCmd(), block)
    }

    /**
     * Creates an entry in the audit.xml to reference the configuration of the Binary File Emitter implementation of the Service Provider interface.
     * @param block to configure
     */
    def createBinaryEmitter(@DelegatesTo(CreateBinaryEmitterCmd) Closure<?> block) {
        runDelegate(new CreateBinaryEmitterCmd(), block)
    }

    /**
     * Deletes the dynamic member attribute configuration from the LDAP group configuration.
     * @param block to configure
     */
    def deleteIdMgrLDAPGroupDynamicMemberAttr(@DelegatesTo(DeleteIdMgrLDAPGroupDynamicMemberAttrCmd) Closure<?> block) {
        runDelegate(new DeleteIdMgrLDAPGroupDynamicMemberAttrCmd(), block)
    }

    /**
     * List the existing checkpoint documents specified by the "checkpointName"
     * @param block to configure
     */
    def listCheckpointDocuments(@DelegatesTo(ListCheckpointDocumentsCmd) Closure<?> block) {
        runDelegate(new ListCheckpointDocumentsCmd(), block)
    }

    /**
     * This command removes the SAML TAI SSO from the security configuration.
     * @param block to configure
     */
    def deleteSAMLTAISSO(@DelegatesTo(DeleteSAMLTAISSOCmd) Closure<?> block) {
        runDelegate(new DeleteSAMLTAISSOCmd(), block)
    }

    /**
     * Get information about a personal certificate.
     * @param block to configure
     */
    def getCertificate(@DelegatesTo(GetCertificateCmd) Closure<?> block) {
        runDelegate(new GetCertificateCmd(), block)
    }

    /**
     * Returns the access ID for the registry server ID.
     * @param block to configure
     */
    def getAccessIdFromServerId(@DelegatesTo(GetAccessIdFromServerIdCmd) Closure<?> block) {
        runDelegate(new GetAccessIdFromServerIdCmd(), block)
    }

    /**
     * Show the properties of a WSNAdministeredSubscriber object in a human readable form.
     * @param block to configure
     */
    def showWSNAdministeredSubscriber(@DelegatesTo(ShowWSNAdministeredSubscriberCmd) Closure<?> block) {
        runDelegate(new ShowWSNAdministeredSubscriberCmd(), block)
    }

    /**
     * List the JAX-WS Handler Lists at a given cell scope
     * @param block to configure
     */
    def listJAXWSHandlerLists(@DelegatesTo(ListJAXWSHandlerListsCmd) Closure<?> block) {
        runDelegate(new ListJAXWSHandlerListsCmd(), block)
    }

    /**
     * Deletes an existing keystore.
     * @param block to configure
     */
    def deleteKeyStore(@DelegatesTo(DeleteKeyStoreCmd) Closure<?> block) {
        runDelegate(new DeleteKeyStoreCmd(), block)
    }

    /**
     * Returns the audit outcomes defined for an event.
     * @param block to configure
     */
    def getAuditOutcomes(@DelegatesTo(GetAuditOutcomesCmd) Closure<?> block) {
        runDelegate(new GetAuditOutcomesCmd(), block)
    }

    /**
     * Stop all composition units of a specified business-level application.
     * @param block to configure
     */
    def stopBLA(@DelegatesTo(StopBLACmd) Closure<?> block) {
        runDelegate(new StopBLACmd(), block)
    }

    /**
     * Command that creates a server
     * @param block to configure
     */
    def createGenericServer(@DelegatesTo(CreateGenericServerCmd) Closure<?> block) {
        runDelegate(new CreateGenericServerCmd(), block)
    }

    /**
     * Lists the JavaServer Faces implementations allowed by the WebSphere runtime for an application
     * @param block to configure
     */
    def listJSFImplementations(@DelegatesTo(ListJSFImplementationsCmd) Closure<?> block) {
        runDelegate(new ListJSFImplementationsCmd(), block)
    }

    /**
     * Returns base entries for a specified repository.
     * @param block to configure
     */
    def listIdMgrRepositoryBaseEntries(@DelegatesTo(ListIdMgrRepositoryBaseEntriesCmd) Closure<?> block) {
        runDelegate(new ListIdMgrRepositoryBaseEntriesCmd(), block)
    }

    /**
     * Disassociate an endpoint from its token type.
     * @param block to configure
     */
    def unassignSTSEndpointTokenType(@DelegatesTo(UnassignSTSEndpointTokenTypeCmd) Closure<?> block) {
        runDelegate(new UnassignSTSEndpointTokenTypeCmd(), block)
    }

    /**
     * (Deprecated) remove a property from the long-running scheduler. Use removeJobSchedulerProperty.
     * @param block to configure
     */
    def removeLongRunningSchedulerProperty(@DelegatesTo(RemoveLongRunningSchedulerPropertyCmd) Closure<?> block) {
        runDelegate(new RemoveLongRunningSchedulerPropertyCmd(), block)
    }

    /**
     * list all the AuthorizationGroups that a given group has access to
     * @param block to configure
     */
    def listAuditAuthorizationGroupsForGroupID(@DelegatesTo(ListAuditAuthorizationGroupsForGroupIDCmd) Closure<?> block) {
        runDelegate(new ListAuditAuthorizationGroupsForGroupIDCmd(), block)
    }

    /**
     * Returns the notification email list for the configured audit notification.
     * @param block to configure
     */
    def getEmailList(@DelegatesTo(GetEmailListCmd) Closure<?> block) {
        runDelegate(new GetEmailListCmd(), block)
    }

    /**
     * Configures the CSI outbound information in the administrative security configuration or in an application security domain.
     * @param block to configure
     */
    def configureCSIOutbound(@DelegatesTo(ConfigureCSIOutboundCmd) Closure<?> block) {
        runDelegate(new ConfigureCSIOutboundCmd(), block)
    }

    /**
     * Modify keystore for writable SAF support.  This task is used during the migration process and will create additional writable keystore objects for the control region and servant region keyrings for SSL keystores.
     * @param block to configure
     */
    def enableWritableKeyrings(@DelegatesTo(EnableWritableKeyringsCmd) Closure<?> block) {
        runDelegate(new EnableWritableKeyringsCmd(), block)
    }

    /**
     * List all buses in the cell.
     * @param block to configure
     */
    def listSIBuses(@DelegatesTo(ListSIBusesCmd) Closure<?> block) {
        runDelegate(new ListSIBusesCmd(), block)
    }

    /**
     * Lists all the servers or clusters that have been nominated for bootstrap into the specified bus.
     * @param block to configure
     */
    def listSIBNominatedBootstrapMembers(@DelegatesTo(ListSIBNominatedBootstrapMembersCmd) Closure<?> block) {
        runDelegate(new ListSIBNominatedBootstrapMembersCmd(), block)
    }

    /**
     * Nominates a server or cluster for use as a bootstrap server.
     * @param block to configure
     */
    def addSIBBootstrapMember(@DelegatesTo(AddSIBBootstrapMemberCmd) Closure<?> block) {
        runDelegate(new AddSIBBootstrapMemberCmd(), block)
    }

    /**
     * List key set groups within a scope.
     * @param block to configure
     */
    def listKeySetGroups(@DelegatesTo(ListKeySetGroupsCmd) Closure<?> block) {
        runDelegate(new ListKeySetGroupsCmd(), block)
    }

    /**
     * This command exports the security configuration SAML TAI SP metadata to a file.
     * @param block to configure
     */
    def exportSAMLSpMetadata(@DelegatesTo(ExportSAMLSpMetadataCmd) Closure<?> block) {
        runDelegate(new ExportSAMLSpMetadataCmd(), block)
    }

    /**
     * Migrates WMM general configuration, supported member types, out-of-the-box member repositories, and LDAP attributes information to virtual member manager configuration.
     * @param block to configure
     */
    def migrateWMMConfig(@DelegatesTo(MigrateWMMConfigCmd) Closure<?> block) {
        runDelegate(new MigrateWMMConfigCmd(), block)
    }

    /**
     * Modify bus destination.
     * @param block to configure
     */
    def modifySIBDestination(@DelegatesTo(ModifySIBDestinationCmd) Closure<?> block) {
        runDelegate(new ModifySIBDestinationCmd(), block)
    }

    /**
     * Information regarding a group of managed nodes. (deprecated)
     * @param block to configure
     */
    def getManagedNodeGroupInfo(@DelegatesTo(GetManagedNodeGroupInfoCmd) Closure<?> block) {
        runDelegate(new GetManagedNodeGroupInfoCmd(), block)
    }

    /**
     * List the users in the specified role in the destination security space role for the given destination.
     * @param block to configure
     */
    def listUsersInDestinationRole(@DelegatesTo(ListUsersInDestinationRoleCmd) Closure<?> block) {
        runDelegate(new ListUsersInDestinationRoleCmd(), block)
    }

    /**
     * Create a WS-Notification service point
     * @param block to configure
     */
    def createWSNServicePoint(@DelegatesTo(CreateWSNServicePointCmd) Closure<?> block) {
        runDelegate(new CreateWSNServicePointCmd(), block)
    }

    /**
     * List trust managers.
     * @param block to configure
     */
    def listTrustManagers(@DelegatesTo(ListTrustManagersCmd) Closure<?> block) {
        runDelegate(new ListTrustManagersCmd(), block)
    }

    /**
     * Displays the active JPA specification level for a Server or ServerCluster.The operation requires either an ObjectName referencing the target object, or parameters identifying the target node and server.
     * @param block to configure
     */
    def showJPASpecLevel(@DelegatesTo(ShowJPASpecLevelCmd) Closure<?> block) {
        runDelegate(new ShowJPASpecLevelCmd(), block)
    }

    /**
     * Get the available JMS providers
     * @param block to configure
     */
    def getJMSProviders(@DelegatesTo(GetJMSProvidersCmd) Closure<?> block) {
        runDelegate(new GetJMSProvidersCmd(), block)
    }

    /**
     * WASX7046I: Method: setAttributes

	Arguments: object name, attributes

	Description: Sets attributes given in "attributes" for the MBean
	described by "object name."
     * @param block to configure
     */
    def adminservice_setAttributes(@DelegatesTo(Adminservice_setAttributesCmd) Closure<?> block) {
        runDelegate(new Adminservice_setAttributesCmd(), block)
    }

    /**
     * Create an activation specification in the SIB JMS resource adapter.
     * @param block to configure
     */
    def createSIBJMSActivationSpec(@DelegatesTo(CreateSIBJMSActivationSpecCmd) Closure<?> block) {
        runDelegate(new CreateSIBJMSActivationSpecCmd(), block)
    }

    /**
     * Lists the IBM MQ Activation Specification defined at the scope provided to the command.
     * @param block to configure
     */
    def listWMQActivationSpecs(@DelegatesTo(ListWMQActivationSpecsCmd) Closure<?> block) {
        runDelegate(new ListWMQActivationSpecsCmd(), block)
    }

    /**
     * List destinations belonging to a bus.
     * @param block to configure
     */
    def listSIBDestinations(@DelegatesTo(ListSIBDestinationsCmd) Closure<?> block) {
        runDelegate(new ListSIBDestinationsCmd(), block)
    }

    /**
     * Generates a report of the ports configured in the cell
     * @param block to configure
     */
    def reportConfiguredPorts(@DelegatesTo(ReportConfiguredPortsCmd) Closure<?> block) {
        runDelegate(new ReportConfiguredPortsCmd(), block)
    }

    /**
     * Changes the active JAXRS Provider for a Server or ServerCluster.The operation requires either an ObjectName referencing the target object, or parameters identifying the target node and server.  The Provider parameter must always be specified.
     * @param block to configure
     */
    def modifyJaxrsProvider(@DelegatesTo(ModifyJaxrsProviderCmd) Closure<?> block) {
        runDelegate(new ModifyJaxrsProviderCmd(), block)
    }

    /**
     * Removes a nominated bootstrap server or cluster from the list of nominated bootstrap members for the bus.
     * @param block to configure
     */
    def removeSIBBootstrapMember(@DelegatesTo(RemoveSIBBootstrapMemberCmd) Closure<?> block) {
        runDelegate(new RemoveSIBBootstrapMemberCmd(), block)
    }

    /**
     * Determines whether or not a given node is a z/OS node. Returns "true" if node operating system is Z/OS, "false" otherwise. 
     * @param block to configure
     */
    def isNodeZOS(@DelegatesTo(IsNodeZOSCmd) Closure<?> block) {
        runDelegate(new IsNodeZOSCmd(), block)
    }

    /**
     * Delete a WS-Notification topic namespace
     * @param block to configure
     */
    def deleteWSNTopicNamespace(@DelegatesTo(DeleteWSNTopicNamespaceCmd) Closure<?> block) {
        runDelegate(new DeleteWSNTopicNamespaceCmd(), block)
    }

    /**
     * Delete an existing schedule.
     * @param block to configure
     */
    def deleteWSSchedule(@DelegatesTo(DeleteWSScheduleCmd) Closure<?> block) {
        runDelegate(new DeleteWSScheduleCmd(), block)
    }

    /**
     * Map userids to one or more audit role in the authorization group.
     * @param block to configure
     */
    def mapUsersToAuditRole(@DelegatesTo(MapUsersToAuditRoleCmd) Closure<?> block) {
        runDelegate(new MapUsersToAuditRoleCmd(), block)
    }

    /**
     * Remove groupids from one or more admin role in the AuthorizationGroup.
     * @param block to configure
     */
    def removeGroupsFromAdminRole(@DelegatesTo(RemoveGroupsFromAdminRoleCmd) Closure<?> block) {
        runDelegate(new RemoveGroupsFromAdminRoleCmd(), block)
    }

    /**
     * This command modifies SPNEGO TAI properties in the security configuration.
     * @param block to configure
     */
    def modifySpnegoTAIProperties(@DelegatesTo(ModifySpnegoTAIPropertiesCmd) Closure<?> block) {
        runDelegate(new ModifySpnegoTAIPropertiesCmd(), block)
    }

    /**
     * Create a key manager.
     * @param block to configure
     */
    def createKeyManager(@DelegatesTo(CreateKeyManagerCmd) Closure<?> block) {
        runDelegate(new CreateKeyManagerCmd(), block)
    }

    /**
     * Return a list containing the SIB JMS connection factory's attribute names and values.
     * @param block to configure
     */
    def showSIBJMSConnectionFactory(@DelegatesTo(ShowSIBJMSConnectionFactoryCmd) Closure<?> block) {
        runDelegate(new ShowSIBJMSConnectionFactoryCmd(), block)
    }

    /**
     * Removes a groups permission to access the topic space for the specified role.
     * @param block to configure
     */
    def removeGroupFromTopicSpaceRootRole(@DelegatesTo(RemoveGroupFromTopicSpaceRootRoleCmd) Closure<?> block) {
        runDelegate(new RemoveGroupFromTopicSpaceRootRoleCmd(), block)
    }

    /**
     * Configures an LDAP user registry in an application security domain
     * @param block to configure
     */
    def configureAppLDAPUserRegistry(@DelegatesTo(ConfigureAppLDAPUserRegistryCmd) Closure<?> block) {
        runDelegate(new ConfigureAppLDAPUserRegistryCmd(), block)
    }

    /**
     * Queries for all managed resources.
     * @param block to configure
     */
    def queryManagedResources(@DelegatesTo(QueryManagedResourcesCmd) Closure<?> block) {
        runDelegate(new QueryManagedResourcesCmd(), block)
    }

    /**
     * Modifies the audit notification monitor specified by the reference id.
     * @param block to configure
     */
    def modifyAuditNotificationMonitor(@DelegatesTo(ModifyAuditNotificationMonitorCmd) Closure<?> block) {
        runDelegate(new ModifyAuditNotificationMonitorCmd(), block)
    }

    /**
     * Propagate the security policies of the applications to the JACC provider.
     * @param block to configure
     */
    def propagatePolicyToJACCProvider(@DelegatesTo(PropagatePolicyToJACCProviderCmd) Closure<?> block) {
        runDelegate(new PropagatePolicyToJACCProviderCmd(), block)
    }

    /**
     * List all Dynamic SSL configuration selections.
     * @param block to configure
     */
    def listDynamicSSLConfigSelections(@DelegatesTo(ListDynamicSSLConfigSelectionsCmd) Closure<?> block) {
        runDelegate(new ListDynamicSSLConfigSelectionsCmd(), block)
    }

    /**
     * Map a resource to a security domain.
     * @param block to configure
     */
    def mapResourceToSecurityDomain(@DelegatesTo(MapResourceToSecurityDomainCmd) Closure<?> block) {
        runDelegate(new MapResourceToSecurityDomainCmd(), block)
    }

    /**
     * queryDistrbitedConfigCmdDesc
     * @param block to configure
     */
    def getDistributedCacheProperty(@DelegatesTo(GetDistributedCachePropertyCmd) Closure<?> block) {
        runDelegate(new GetDistributedCachePropertyCmd(), block)
    }

    /**
     * The useRegistryServerId security field in userRegistry object in the security.xml file is updated based on the user input of true or false.
     * @param block to configure
     */
    def setUseRegistryServerId(@DelegatesTo(SetUseRegistryServerIdCmd) Closure<?> block) {
        runDelegate(new SetUseRegistryServerIdCmd(), block)
    }

    /**
     * extract a signer certificate to a file.
     * @param block to configure
     */
    def extractCertificate(@DelegatesTo(ExtractCertificateCmd) Closure<?> block) {
        runDelegate(new ExtractCertificateCmd(), block)
    }

    /**
     * Create a descriptive property under an object.
     * @param block to configure
     */
    def createDescriptiveProp(@DelegatesTo(CreateDescriptivePropCmd) Closure<?> block) {
        runDelegate(new CreateDescriptivePropCmd(), block)
    }

    /**
     * Retrieve a signer certificate from a port and add it to the KeyStore.
     * @param block to configure
     */
    def retrieveSignerFromPort(@DelegatesTo(RetrieveSignerFromPortCmd) Closure<?> block) {
        runDelegate(new RetrieveSignerFromPortCmd(), block)
    }

    /**
     * Returns the state of Security Auditing.
     * @param block to configure
     */
    def isAuditEnabled(@DelegatesTo(IsAuditEnabledCmd) Closure<?> block) {
        runDelegate(new IsAuditEnabledCmd(), block)
    }

    /**
     * This command is used to list members of a target group.
     * @param block to configure
     */
    def getTargetGroupMembers(@DelegatesTo(GetTargetGroupMembersCmd) Closure<?> block) {
        runDelegate(new GetTargetGroupMembersCmd(), block)
    }

    /**
     * Returns the unique name for the supplied event factory.
     * @param block to configure
     */
    def getAuditEventFactoryName(@DelegatesTo(GetAuditEventFactoryNameCmd) Closure<?> block) {
        runDelegate(new GetAuditEventFactoryNameCmd(), block)
    }

    /**
     * Lists the IBM MQ Connection Factories defined at the scope provided to the command.
     * @param block to configure
     */
    def listWMQConnectionFactories(@DelegatesTo(ListWMQConnectionFactoriesCmd) Closure<?> block) {
        runDelegate(new ListWMQConnectionFactoriesCmd(), block)
    }

    /**
     * Unregister a managed node from a JobManager
     * @param block to configure
     */
    def unregisterWithJobManager(@DelegatesTo(UnregisterWithJobManagerCmd) Closure<?> block) {
        runDelegate(new UnregisterWithJobManagerCmd(), block)
    }

    /**
     * Use this command to list all registered managed nodes in the admin agent, or to list all federated nodes in the deployment manager.
     * @param block to configure
     */
    def listManagedNodes(@DelegatesTo(ListManagedNodesCmd) Closure<?> block) {
        runDelegate(new ListManagedNodesCmd(), block)
    }

    /**
     * Get the Java Home path.
     * @param block to configure
     */
    def getJavaHome(@DelegatesTo(GetJavaHomeCmd) Closure<?> block) {
        runDelegate(new GetJavaHomeCmd(), block)
    }

    /**
     * Deletes an AES encryption key from the keystore file. This command is disabled when the custom KeyManager class is used.
     * @param block to configure
     */
    def deletePasswordEncryptionKey(@DelegatesTo(DeletePasswordEncryptionKeyCmd) Closure<?> block) {
        runDelegate(new DeletePasswordEncryptionKeyCmd(), block)
    }

    /**
     * Enable or disable the automatic checkpoints  
     * @param block to configure
     */
    def setAutoCheckpointEnabled(@DelegatesTo(SetAutoCheckpointEnabledCmd) Closure<?> block) {
        runDelegate(new SetAutoCheckpointEnabledCmd(), block)
    }

    /**
     * Lists the audit notification monitors.
     * @param block to configure
     */
    def listAuditNotificationMonitors(@DelegatesTo(ListAuditNotificationMonitorsCmd) Closure<?> block) {
        runDelegate(new ListAuditNotificationMonitorsCmd(), block)
    }

    /**
     * Modifies the named external bundle repository with the given parameters. Unspecified parameters keep their existing values. To remove an existing value, specify an empty string for the parameter.
     * @param block to configure
     */
    def modifyExternalBundleRepository(@DelegatesTo(ModifyExternalBundleRepositoryCmd) Closure<?> block) {
        runDelegate(new ModifyExternalBundleRepositoryCmd(), block)
    }

    /**
     * Create a new WebSphere MQ server.
     * @param block to configure
     */
    def createSIBWMQServer(@DelegatesTo(CreateSIBWMQServerCmd) Closure<?> block) {
        runDelegate(new CreateSIBWMQServerCmd(), block)
    }

    /**
     * Delete custom properties from the configuration of a token type.
     * @param block to configure
     */
    def deleteSTSTokenTypeConfigurationCustomProperties(@DelegatesTo(DeleteSTSTokenTypeConfigurationCustomPropertiesCmd) Closure<?> block) {
        runDelegate(new DeleteSTSTokenTypeConfigurationCustomPropertiesCmd(), block)
    }

    /**
     * Allows the user to set Administrative Protocol for a server or cell
     * @param block to configure
     */
    def setAdminProtocol(@DelegatesTo(SetAdminProtocolCmd) Closure<?> block) {
        runDelegate(new SetAdminProtocolCmd(), block)
    }

    /**
     * Deletes an audit notification monitor specified by the reference id.
     * @param block to configure
     */
    def deleteAuditNotificationMonitorByRef(@DelegatesTo(DeleteAuditNotificationMonitorByRefCmd) Closure<?> block) {
        runDelegate(new DeleteAuditNotificationMonitorByRefCmd(), block)
    }

    /**
     * Get the JNDI name that is bound to java:comp/DefaultJMSConnectionFactory.
     * @param block to configure
     */
    def getDefaultJMSConnectionFactory(@DelegatesTo(GetDefaultJMSConnectionFactoryCmd) Closure<?> block) {
        runDelegate(new GetDefaultJMSConnectionFactoryCmd(), block)
    }

    /**
     * Sends a request to a certificate authority (CA) to revoke the certificate.
     * @param block to configure
     */
    def revokeCACertificate(@DelegatesTo(RevokeCACertificateCmd) Closure<?> block) {
        runDelegate(new RevokeCACertificateCmd(), block)
    }

    /**
     * Sets/adds/deletes custom property to a repository configuration. If value is not specified or an empty string then the property will be deleted from the repository configuration. If name does not exist then it will be added, if a value is specified. If name is "*" then all the custom properties will be deleted.
     * @param block to configure
     */
    def setIdMgrCustomProperty(@DelegatesTo(SetIdMgrCustomPropertyCmd) Closure<?> block) {
        runDelegate(new SetIdMgrCustomPropertyCmd(), block)
    }

    /**
     * Adds a group to the file registry.
     * @param block to configure
     */
    def addFileRegistryGroup(@DelegatesTo(AddFileRegistryGroupCmd) Closure<?> block) {
        runDelegate(new AddFileRegistryGroupCmd(), block)
    }

    /**
     * Gives a user permission to access the topic space for the specified role.
     * @param block to configure
     */
    def addUserToTopicSpaceRootRole(@DelegatesTo(AddUserToTopicSpaceRootRoleCmd) Closure<?> block) {
        runDelegate(new AddUserToTopicSpaceRootRoleCmd(), block)
    }

    /**
     * Returns all supported audit outcomes.
     * @param block to configure
     */
    def getSupportedAuditOutcomes(@DelegatesTo(GetSupportedAuditOutcomesCmd) Closure<?> block) {
        runDelegate(new GetSupportedAuditOutcomesCmd(), block)
    }

    /**
     * Generates and configures the key file and passwordUtil.properties file, both of which are required for AES password encryption.
     * @param block to configure
     */
    def enablePasswordEncryption(@DelegatesTo(EnablePasswordEncryptionCmd) Closure<?> block) {
        runDelegate(new EnablePasswordEncryptionCmd(), block)
    }

    /**
     * Lists all the roles defined for a specified user.
     * @param block to configure
     */
    def listAllRolesForUser(@DelegatesTo(ListAllRolesForUserCmd) Closure<?> block) {
        runDelegate(new ListAllRolesForUserCmd(), block)
    }

    /**
     * Remove Web Services Security distributed cache custom properties
     * @param block to configure
     */
    def deleteWSSDistributedCacheConfigCustomProperties(@DelegatesTo(DeleteWSSDistributedCacheConfigCustomPropertiesCmd) Closure<?> block) {
        runDelegate(new DeleteWSSDistributedCacheConfigCustomPropertiesCmd(), block)
    }

    /**
     * List the properties for a given SSL configuration.
     * @param block to configure
     */
    def listSSLConfigProperties(@DelegatesTo(ListSSLConfigPropertiesCmd) Closure<?> block) {
        runDelegate(new ListSSLConfigPropertiesCmd(), block)
    }

    /**
     * Returns information about the FIPS settings in the current WebSphere configuration.  It will print out whether the FIPS is enabled or not and if it is, then what level FIPS setting is enabled. If suite B is enabled, the level of suite B is also returned. 
     * @param block to configure
     */
    def getFipsInfo(@DelegatesTo(GetFipsInfoCmd) Closure<?> block) {
        runDelegate(new GetFipsInfoCmd(), block)
    }

    /**
     * List the J2C administrative objects that have a specified administrative object interface defined in the specified J2C resource adapter.
     * @param block to configure
     */
    def listJ2CAdminObjects(@DelegatesTo(ListJ2CAdminObjectsCmd) Closure<?> block) {
        runDelegate(new ListJ2CAdminObjectsCmd(), block)
    }

    /**
     * Show Java virtual machine (JVM) system properties for the application server.'s process.
     * @param block to configure
     */
    def showJVMSystemProperties(@DelegatesTo(ShowJVMSystemPropertiesCmd) Closure<?> block) {
        runDelegate(new ShowJVMSystemPropertiesCmd(), block)
    }

    /**
     * Sets the security attributes on the global administrative security configuration.
     * @param block to configure
     */
    def setAdminActiveSecuritySettings(@DelegatesTo(SetAdminActiveSecuritySettingsCmd) Closure<?> block) {
        runDelegate(new SetAdminActiveSecuritySettingsCmd(), block)
    }

    /**
     * Enables audit signing.
     * @param block to configure
     */
    def enableAuditSigning(@DelegatesTo(EnableAuditSigningCmd) Closure<?> block) {
        runDelegate(new EnableAuditSigningCmd(), block)
    }

    /**
     * Export an asset which has been imported into the product configuration repository.  Only the asset file itself is exported.  No import options for the asset are exported.
     * @param block to configure
     */
    def exportAsset(@DelegatesTo(ExportAssetCmd) Closure<?> block) {
        runDelegate(new ExportAssetCmd(), block)
    }

    /**
     * Modifies an audit notification.
     * @param block to configure
     */
    def modifyAuditNotification(@DelegatesTo(ModifyAuditNotificationCmd) Closure<?> block) {
        runDelegate(new ModifyAuditNotificationCmd(), block)
    }

    /**
     * Create a new NamedEndPoint that can be associated with a TCPInboundChannel
     * @param block to configure
     */
    def createTCPEndPoint(@DelegatesTo(CreateTCPEndPointCmd) Closure<?> block) {
        runDelegate(new CreateTCPEndPointCmd(), block)
    }

    /**
     * Returns the base version for a node, for example, "6.0.0.0".
     * @param block to configure
     */
    def getNodeBaseProductVersion(@DelegatesTo(GetNodeBaseProductVersionCmd) Closure<?> block) {
        runDelegate(new GetNodeBaseProductVersionCmd(), block)
    }

    /**
     * Validates the connection to the specified LDAP server.
     * @param block to configure
     */
    def validateLDAPConnection(@DelegatesTo(ValidateLDAPConnectionCmd) Closure<?> block) {
        runDelegate(new ValidateLDAPConnectionCmd(), block)
    }

    /**
     * Get certain runtime properties pertaining to a device and its registered job manager
     * @param block to configure
     */
    def getRuntimeRegistrationProperties(@DelegatesTo(GetRuntimeRegistrationPropertiesCmd) Closure<?> block) {
        runDelegate(new GetRuntimeRegistrationPropertiesCmd(), block)
    }

    /**
     * This command is used to delete members from a group of managed nodes. (deprecated)
     * @param block to configure
     */
    def deleteMemberFromManagedNodeGroup(@DelegatesTo(DeleteMemberFromManagedNodeGroupCmd) Closure<?> block) {
        runDelegate(new DeleteMemberFromManagedNodeGroupCmd(), block)
    }

    /**
     * Set Java virtual machine (JVM) Initial Heap Size
     * @param block to configure
     */
    def setJVMInitialHeapSize(@DelegatesTo(SetJVMInitialHeapSizeCmd) Closure<?> block) {
        runDelegate(new SetJVMInitialHeapSizeCmd(), block)
    }

    /**
     * The setPolicyType command updates the attributes of a specified policy.
     * @param block to configure
     */
    def setPolicyType(@DelegatesTo(SetPolicyTypeCmd) Closure<?> block) {
        runDelegate(new SetPolicyTypeCmd(), block)
    }

    /**
     * Process the serialized SQLJ profiles that are in an installed application.  Customize the profiles with information for run time and bind static SQL packages in a database.  Refer to the DB2 information center documentation for the commands db2sqljcustomize and db2sqljbind.
     * @param block to configure
     */
    def processSqljProfiles(@DelegatesTo(ProcessSqljProfilesCmd) Closure<?> block) {
        runDelegate(new ProcessSqljProfilesCmd(), block)
    }

    /**
     * Displays the list of key alias names and the current encryption key in the specified keystore file. The first item in the list is the current encryption key.
     * @param block to configure
     */
    def listPasswordEncryptionKeys(@DelegatesTo(ListPasswordEncryptionKeysCmd) Closure<?> block) {
        runDelegate(new ListPasswordEncryptionKeysCmd(), block)
    }

    /**
     * Create a new self-signed certificate and store it in a key store.
     * @param block to configure
     */
    def createAuditSelfSignedCertificate(@DelegatesTo(CreateAuditSelfSignedCertificateCmd) Closure<?> block) {
        runDelegate(new CreateAuditSelfSignedCertificateCmd(), block)
    }

    /**
     * Resets the audit system failure policy to the default, NOWARN.
     * @param block to configure
     */
    def resetAuditSystemFailureAction(@DelegatesTo(ResetAuditSystemFailureActionCmd) Closure<?> block) {
        runDelegate(new ResetAuditSystemFailureActionCmd(), block)
    }

    /**
     * Delete a signer certificate from a keystore.
     * @param block to configure
     */
    def deleteSignerCertificate(@DelegatesTo(DeleteSignerCertificateCmd) Closure<?> block) {
        runDelegate(new DeleteSignerCertificateCmd(), block)
    }

    /**
     * Create bus destination.
     * @param block to configure
     */
    def createSIBDestination(@DelegatesTo(CreateSIBDestinationCmd) Closure<?> block) {
        runDelegate(new CreateSIBDestinationCmd(), block)
    }

    /**
     * Import a personal certificate from managed keystore in the configuration.
     * @param block to configure
     */
    def importCertFromManagedKS(@DelegatesTo(ImportCertFromManagedKSCmd) Closure<?> block) {
        runDelegate(new ImportCertFromManagedKSCmd(), block)
    }

    /**
     * Lists all the WSNAdministeredSubscriber objects in the configuration of the target WSNServicePoint that match the specified input parameters.
     * @param block to configure
     */
    def listWSNAdministeredSubscribers(@DelegatesTo(ListWSNAdministeredSubscribersCmd) Closure<?> block) {
        runDelegate(new ListWSNAdministeredSubscribersCmd(), block)
    }

    /**
     * Enables and disables a specified FIPS security level. 
     * @param block to configure
     */
    def enableFips(@DelegatesTo(EnableFipsCmd) Closure<?> block) {
        runDelegate(new EnableFipsCmd(), block)
    }

    /**
     * Edit options for a specified composition unit.
     * @param block to configure
     */
    def editCompUnit(@DelegatesTo(EditCompUnitCmd) Closure<?> block) {
        runDelegate(new EditCompUnitCmd(), block)
    }

    /**
     * Allows the override for sender inheritance for an individual topic on a specified topic space.  Setting the "inherit" value to true will allow the topic to inherit from the default values.
     * @param block to configure
     */
    def setInheritSenderForTopic(@DelegatesTo(SetInheritSenderForTopicCmd) Closure<?> block) {
        runDelegate(new SetInheritSenderForTopicCmd(), block)
    }

    /**
     * Updates an LDAP server configuration of the LDAP repository configuration.
     * @param block to configure
     */
    def updateIdMgrLDAPServer(@DelegatesTo(UpdateIdMgrLDAPServerCmd) Closure<?> block) {
        runDelegate(new UpdateIdMgrLDAPServerCmd(), block)
    }

    /**
     * List signature algorithms available for the current FIPS configuration. If FIPS is not enabled, then the full list of valid Signature Algorithms are returned. 
     * @param block to configure
     */
    def listSignatureAlgorithms(@DelegatesTo(ListSignatureAlgorithmsCmd) Closure<?> block) {
        runDelegate(new ListSignatureAlgorithmsCmd(), block)
    }

    /**
     * Removes the Jaspi configuration from a security domain.
     * @param block to configure
     */
    def unconfigureJaspi(@DelegatesTo(UnconfigureJaspiCmd) Closure<?> block) {
        runDelegate(new UnconfigureJaspiCmd(), block)
    }

    /**
     * renameNode
     * @param block to configure
     */
    def renameNode(@DelegatesTo(RenameNodeCmd) Closure<?> block) {
        runDelegate(new RenameNodeCmd(), block)
    }

    /**
     * List descriptive properties under an object.
     * @param block to configure
     */
    def listDescriptiveProps(@DelegatesTo(ListDescriptivePropsCmd) Closure<?> block) {
        runDelegate(new ListDescriptivePropsCmd(), block)
    }

    /**
     * This command is used to get the job target history for a job.
     * @param block to configure
     */
    def getJobTargetHistory(@DelegatesTo(GetJobTargetHistoryCmd) Closure<?> block) {
        runDelegate(new GetJobTargetHistoryCmd(), block)
    }

    /**
     * Searches groups.
     * @param block to configure
     */
    def searchGroups(@DelegatesTo(SearchGroupsCmd) Closure<?> block) {
        runDelegate(new SearchGroupsCmd(), block)
    }

    /**
     * Returns the specified managed object metadata property for agiven node.
     * @param block to configure
     */
    def getMetadataProperty(@DelegatesTo(GetMetadataPropertyCmd) Closure<?> block) {
        runDelegate(new GetMetadataPropertyCmd(), block)
    }

    /**
     * List the groups in the default role.
     * @param block to configure
     */
    def listGroupsInDefaultRole(@DelegatesTo(ListGroupsInDefaultRoleCmd) Closure<?> block) {
        runDelegate(new ListGroupsInDefaultRoleCmd(), block)
    }

    /**
     * The createPolicySet command creates a new policy set. Policy types are not created with the policy set. The default indicator is set to false.
     * @param block to configure
     */
    def createPolicySet(@DelegatesTo(CreatePolicySetCmd) Closure<?> block) {
        runDelegate(new CreatePolicySetCmd(), block)
    }

    /**
     * remove a member from the node group.
     * @param block to configure
     */
    def removeNodeGroupMember(@DelegatesTo(RemoveNodeGroupMemberCmd) Closure<?> block) {
        runDelegate(new RemoveNodeGroupMemberCmd(), block)
    }

    /**
     * List key managers within a give scope.
     * @param block to configure
     */
    def listKeyManagers(@DelegatesTo(ListKeyManagersCmd) Closure<?> block) {
        runDelegate(new ListKeyManagersCmd(), block)
    }

    /**
     * Updates the LDAP search result cache configuration.
     * @param block to configure
     */
    def updateIdMgrLDAPSearchResultCache(@DelegatesTo(UpdateIdMgrLDAPSearchResultCacheCmd) Closure<?> block) {
        runDelegate(new UpdateIdMgrLDAPSearchResultCacheCmd(), block)
    }

    /**
     * Get information about a trust association.
     * @param block to configure
     */
    def getTrustAssociationInfo(@DelegatesTo(GetTrustAssociationInfoCmd) Closure<?> block) {
        runDelegate(new GetTrustAssociationInfoCmd(), block)
    }

    /**
     * The setClientDynamicPolicyControl command sets the WSPolicy client acquisition information for a specified resource within an application.
     * @param block to configure
     */
    def setClientDynamicPolicyControl(@DelegatesTo(SetClientDynamicPolicyControlCmd) Closure<?> block) {
        runDelegate(new SetClientDynamicPolicyControlCmd(), block)
    }

    /**
     * Lists JAXRS Providers supported by this version of WebSphere.
     * @param block to configure
     */
    def listSupportedJaxrsProviders(@DelegatesTo(ListSupportedJaxrsProvidersCmd) Closure<?> block) {
        runDelegate(new ListSupportedJaxrsProvidersCmd(), block)
    }

    /**
     * The updatePolicySetAttachment command updates the resources that apply to a policy set attachment.
     * @param block to configure
     */
    def updatePolicySetAttachment(@DelegatesTo(UpdatePolicySetAttachmentCmd) Closure<?> block) {
        runDelegate(new UpdatePolicySetAttachmentCmd(), block)
    }

    /**
     * List composition units belonging to a specified business-level application.
     * @param block to configure
     */
    def listCompUnits(@DelegatesTo(ListCompUnitsCmd) Closure<?> block) {
        runDelegate(new ListCompUnitsCmd(), block)
    }

    /**
     * Set the JNDI name that is bound to java:comp/DefaultContextService.
     * @param block to configure
     */
    def setDefaultContextService(@DelegatesTo(SetDefaultContextServiceCmd) Closure<?> block) {
        runDelegate(new SetDefaultContextServiceCmd(), block)
    }

    /**
     * Display a named WebSphere MQ server's attributes.
     * @param block to configure
     */
    def showSIBWMQServer(@DelegatesTo(ShowSIBWMQServerCmd) Closure<?> block) {
        runDelegate(new ShowSIBWMQServerCmd(), block)
    }

    /**
     * Displays a list of templates that can be used to create chains in this configuration. All templates have a certain type of transport channel as the last transport channel in the chain.
     * @param block to configure
     */
    def listChainTemplates(@DelegatesTo(ListChainTemplatesCmd) Closure<?> block) {
        runDelegate(new ListChainTemplatesCmd(), block)
    }

    /**
     * Converts SSL personal certificates to a certificate that is created with the desired signature algorithm or lists SSL personal certificates that are not created with the desired signature algorithm.
     * @param block to configure
     */
    def convertSSLCertificates(@DelegatesTo(ConvertSSLCertificatesCmd) Closure<?> block) {
        runDelegate(new ConvertSSLCertificatesCmd(), block)
    }

    /**
     * Use the "deleteLMService" command to delete an existing local mapping service.
     * @param block to configure
     */
    def deleteLMService(@DelegatesTo(DeleteLMServiceCmd) Closure<?> block) {
        runDelegate(new DeleteLMServiceCmd(), block)
    }

    /**
     * create a node group
     * @param block to configure
     */
    def createNodeGroup(@DelegatesTo(CreateNodeGroupCmd) Closure<?> block) {
        runDelegate(new CreateNodeGroupCmd(), block)
    }

    /**
     * The addPolicyType command creates a policy type with default values for the specified policy set. You may indicate whether to enable or disable the added policy type.
     * @param block to configure
     */
    def addPolicyType(@DelegatesTo(AddPolicyTypeCmd) Closure<?> block) {
        runDelegate(new AddPolicyTypeCmd(), block)
    }

    /**
     * Enables the Audit Specification.
     * @param block to configure
     */
    def enableAuditFilter(@DelegatesTo(EnableAuditFilterCmd) Closure<?> block) {
        runDelegate(new EnableAuditFilterCmd(), block)
    }

    /**
     * This command is used to get overall status of a job.
     * @param block to configure
     */
    def getOverallJobStatus(@DelegatesTo(GetOverallJobStatusCmd) Closure<?> block) {
        runDelegate(new GetOverallJobStatusCmd(), block)
    }

    /**
     * Returns the configuration of the specified repository.
     * @param block to configure
     */
    def getIdMgrRepository(@DelegatesTo(GetIdMgrRepositoryCmd) Closure<?> block) {
        runDelegate(new GetIdMgrRepositoryCmd(), block)
    }

    /**
     * This command is used to add members to a group of managed nodes. (deprecated)
     * @param block to configure
     */
    def addMemberToManagedNodeGroup(@DelegatesTo(AddMemberToManagedNodeGroupCmd) Closure<?> block) {
        runDelegate(new AddMemberToManagedNodeGroupCmd(), block)
    }

    /**
     * Delete the default engine or named engine from the target bus.
     * @param block to configure
     */
    def deleteSIBEngine(@DelegatesTo(DeleteSIBEngineCmd) Closure<?> block) {
        runDelegate(new DeleteSIBEngineCmd(), block)
    }

    /**
     * Create a SIB JMS connection factory at the scope identified by the target object.
     * @param block to configure
     */
    def createSIBJMSConnectionFactory(@DelegatesTo(CreateSIBJMSConnectionFactoryCmd) Closure<?> block) {
        runDelegate(new CreateSIBJMSConnectionFactoryCmd(), block)
    }

    /**
     * Create Certificate Request
     * @param block to configure
     */
    def createCertificateRequest(@DelegatesTo(CreateCertificateRequestCmd) Closure<?> block) {
        runDelegate(new CreateCertificateRequestCmd(), block)
    }

    /**
     * Lists certificate authority (CA) client configurator objects.
     * @param block to configure
     */
    def listCAClients(@DelegatesTo(ListCAClientsCmd) Closure<?> block) {
        runDelegate(new ListCAClientsCmd(), block)
    }

    /**
     * Deletes the IBM MQ Queue object provided to the command.
     * @param block to configure
     */
    def deleteWMQQueue(@DelegatesTo(DeleteWMQQueueCmd) Closure<?> block) {
        runDelegate(new DeleteWMQQueueCmd(), block)
    }

    /**
     * listECKeySizeDesc
     * @param block to configure
     */
    def listECKeySizes(@DelegatesTo(ListECKeySizesCmd) Closure<?> block) {
        runDelegate(new ListECKeySizesCmd(), block)
    }

    /**
     * Use the command to republish messages from the exception destination to the original destination. The messages are picked based on the criteria provided in the command execution.
     * @param block to configure
     */
    def republishEDMessages(@DelegatesTo(RepublishEDMessagesCmd) Closure<?> block) {
        runDelegate(new RepublishEDMessagesCmd(), block)
    }

    /**
     * Modify a certificate expiration monitor.
     * @param block to configure
     */
    def modifyWSCertExpMonitor(@DelegatesTo(ModifyWSCertExpMonitorCmd) Closure<?> block) {
        runDelegate(new ModifyWSCertExpMonitorCmd(), block)
    }

    /**
     * Lists key references for the keys in a keySet.
     * @param block to configure
     */
    def listKeyReferences(@DelegatesTo(ListKeyReferencesCmd) Closure<?> block) {
        runDelegate(new ListKeyReferencesCmd(), block)
    }

    /**
     * Delete a key set.
     * @param block to configure
     */
    def deleteKeySet(@DelegatesTo(DeleteKeySetCmd) Closure<?> block) {
        runDelegate(new DeleteKeySetCmd(), block)
    }

    /**
     * Change the password of an account in the file registry.
     * @param block to configure
     */
    def changeFileRegistryAccountPassword(@DelegatesTo(ChangeFileRegistryAccountPasswordCmd) Closure<?> block) {
        runDelegate(new ChangeFileRegistryAccountPasswordCmd(), block)
    }

    /**
     * Returns the configured maximum number of Binary audit logs.
     * @param block to configure
     */
    def getMaxNumBinaryLogs(@DelegatesTo(GetMaxNumBinaryLogsCmd) Closure<?> block) {
        runDelegate(new GetMaxNumBinaryLogsCmd(), block)
    }

    /**
     * Returns all supported audit events.
     * @param block to configure
     */
    def getSupportedAuditEvents(@DelegatesTo(GetSupportedAuditEventsCmd) Closure<?> block) {
        runDelegate(new GetSupportedAuditEventsCmd(), block)
    }

    /**
     * List JAAS login entries from the administrative security configuration or from an application security domain.
     * @param block to configure
     */
    def listJAASLoginEntries(@DelegatesTo(ListJAASLoginEntriesCmd) Closure<?> block) {
        runDelegate(new ListJAASLoginEntriesCmd(), block)
    }

    /**
     * Deletes the tables of the entry mapping database in virtual member manager.
     * @param block to configure
     */
    def deleteIdMgrEntryMappingRepositoryTables(@DelegatesTo(DeleteIdMgrEntryMappingRepositoryTablesCmd) Closure<?> block) {
        runDelegate(new DeleteIdMgrEntryMappingRepositoryTablesCmd(), block)
    }

    /**
     * Creates a certificate authority (CA) client configurator object.
     * @param block to configure
     */
    def createCAClient(@DelegatesTo(CreateCAClientCmd) Closure<?> block) {
        runDelegate(new CreateCAClientCmd(), block)
    }

    /**
     * List assets which have been imported into the product configuration repository.
     * @param block to configure
     */
    def listAssets(@DelegatesTo(ListAssetsCmd) Closure<?> block) {
        runDelegate(new ListAssetsCmd(), block)
    }

    /**
     * Give a group permission to connect to the bus specified.
     * @param block to configure
     */
    def addGroupToBusConnectorRole(@DelegatesTo(AddGroupToBusConnectorRoleCmd) Closure<?> block) {
        runDelegate(new AddGroupToBusConnectorRoleCmd(), block)
    }

    /**
     * Extract the repository checkpoint specified by the "checkpointName" to the file specified by the "extractToFile".
     * @param block to configure
     */
    def extractRepositoryCheckpoint(@DelegatesTo(ExtractRepositoryCheckpointCmd) Closure<?> block) {
        runDelegate(new ExtractRepositoryCheckpointCmd(), block)
    }

    /**
     * Set the LTPA authentication mechanism timeout from global security or an application security domain.
     * @param block to configure
     */
    def setLTPATimeout(@DelegatesTo(SetLTPATimeoutCmd) Closure<?> block) {
        runDelegate(new SetLTPATimeoutCmd(), block)
    }

    /**
     * Exchange Signer Certificates
     * @param block to configure
     */
    def exchangeSigners(@DelegatesTo(ExchangeSignersCmd) Closure<?> block) {
        runDelegate(new ExchangeSignersCmd(), block)
    }

    /**
     * Returns information in the admin RSA token authorization mechanism object.
     * @param block to configure
     */
    def getRSATokenAuthorization(@DelegatesTo(GetRSATokenAuthorizationCmd) Closure<?> block) {
        runDelegate(new GetRSATokenAuthorizationCmd(), block)
    }

    /**
     * This command is used to create a group of managed nodes. (deprecated)
     * @param block to configure
     */
    def createManagedNodeGroup(@DelegatesTo(CreateManagedNodeGroupCmd) Closure<?> block) {
        runDelegate(new CreateManagedNodeGroupCmd(), block)
    }

    /**
     * Lists all bundles in the internal bundle repository.
     * @param block to configure
     */
    def listLocalRepositoryBundles(@DelegatesTo(ListLocalRepositoryBundlesCmd) Closure<?> block) {
        runDelegate(new ListLocalRepositoryBundlesCmd(), block)
    }

    /**
     * Show the properties of a WSNServicePoint object in a human readable form.
     * @param block to configure
     */
    def showWSNServicePoint(@DelegatesTo(ShowWSNServicePointCmd) Closure<?> block) {
        runDelegate(new ShowWSNServicePointCmd(), block)
    }

    /**
     * List the users from all naming roles.
     * @param block to configure
     */
    def listUsersForNamingRoles(@DelegatesTo(ListUsersForNamingRolesCmd) Closure<?> block) {
        runDelegate(new ListUsersForNamingRolesCmd(), block)
    }

    /**
     * show detailed information of a specified server.
     * @param block to configure
     */
    def showServerInfo(@DelegatesTo(ShowServerInfoCmd) Closure<?> block) {
        runDelegate(new ShowServerInfoCmd(), block)
    }

    /**
     * Reloads the virtual member manager configuration from the virtual member manager configuration file.
     * @param block to configure
     */
    def resetIdMgrConfig(@DelegatesTo(ResetIdMgrConfigCmd) Closure<?> block) {
        runDelegate(new ResetIdMgrConfigCmd(), block)
    }

    /**
     * Updates the attributes of a group.
     * @param block to configure
     */
    def updateGroup(@DelegatesTo(UpdateGroupCmd) Closure<?> block) {
        runDelegate(new UpdateGroupCmd(), block)
    }

    /**
     * Query the node's default SDK name and location
     * @param block to configure
     */
    def getNodeDefaultSDK(@DelegatesTo(GetNodeDefaultSDKCmd) Closure<?> block) {
        runDelegate(new GetNodeDefaultSDKCmd(), block)
    }

    /**
     * Get properties associated with a specific managed node. (deprecated)
     * @param block to configure
     */
    def getManagedNodeProperties(@DelegatesTo(GetManagedNodePropertiesCmd) Closure<?> block) {
        runDelegate(new GetManagedNodePropertiesCmd(), block)
    }

    /**
     * Exports composites under specified domain
     * @param block to configure
     */
    def exportCompositeToDomain(@DelegatesTo(ExportCompositeToDomainCmd) Closure<?> block) {
        runDelegate(new ExportCompositeToDomainCmd(), block)
    }

    /**
     * The transferAttachmentsForPolicySet command transfers all attachments from one policy set to another policy set.
     * @param block to configure
     */
    def transferAttachmentsForPolicySet(@DelegatesTo(TransferAttachmentsForPolicySetCmd) Closure<?> block) {
        runDelegate(new TransferAttachmentsForPolicySetCmd(), block)
    }

    /**
     * Lists the permitted chains for the specified bus.
     * @param block to configure
     */
    def listSIBPermittedChains(@DelegatesTo(ListSIBPermittedChainsCmd) Closure<?> block) {
        runDelegate(new ListSIBPermittedChainsCmd(), block)
    }

    /**
     * List existing Authorization Groups.
     * @param block to configure
     */
    def listAuthorizationGroups(@DelegatesTo(ListAuthorizationGroupsCmd) Closure<?> block) {
        runDelegate(new ListAuthorizationGroupsCmd(), block)
    }

    /**
     * Set the default SDK by name or by location for the node
     * @param block to configure
     */
    def setNodeDefaultSDK(@DelegatesTo(SetNodeDefaultSDKCmd) Closure<?> block) {
        runDelegate(new SetNodeDefaultSDKCmd(), block)
    }

    /**
     * Lists the certificate aliases.
     * @param block to configure
     */
    def listCertAliases(@DelegatesTo(ListCertAliasesCmd) Closure<?> block) {
        runDelegate(new ListCertAliasesCmd(), block)
    }

    /**
     * Returns the LDAP search result cache configuration.
     * @param block to configure
     */
    def getIdMgrLDAPSearchResultCache(@DelegatesTo(GetIdMgrLDAPSearchResultCacheCmd) Closure<?> block) {
        runDelegate(new GetIdMgrLDAPSearchResultCacheCmd(), block)
    }

    /**
     * Converts old style SSL configuration to new style SSL configurations.  The CONVERT_SSLCONFIGS option will look for old style SSL configuration objects and change them to look like new style SSL configuration objects.  The CONVERT_TO_DEFAULT will go through make convert the whole SSL configuration to the new centralized SSL configuration style, removing the SSL configuraiton direct referencing from the servers.
     * @param block to configure
     */
    def convertSSLConfig(@DelegatesTo(ConvertSSLConfigCmd) Closure<?> block) {
        runDelegate(new ConvertSSLConfigCmd(), block)
    }

    /**
     * This command is used to create a group of targets.
     * @param block to configure
     */
    def createTargetGroup(@DelegatesTo(CreateTargetGroupCmd) Closure<?> block) {
        runDelegate(new CreateTargetGroupCmd(), block)
    }

    /**
     * Adds a member (user or group) to a group.
     * @param block to configure
     */
    def addMemberToGroup(@DelegatesTo(AddMemberToGroupCmd) Closure<?> block) {
        runDelegate(new AddMemberToGroupCmd(), block)
    }

    /**
     * Dynamically updates the LDAP server bind information. If bindDN is specified bindPassword must be specified. If only id is specified then LDAP server information is refreshed.
     * @param block to configure
     */
    def updateIdMgrLDAPBindInfo(@DelegatesTo(UpdateIdMgrLDAPBindInfoCmd) Closure<?> block) {
        runDelegate(new UpdateIdMgrLDAPBindInfoCmd(), block)
    }

    /**
     * Generate new keys for all the keys within a keySet Group.
     * @param block to configure
     */
    def generateKeyForKeySetGroup(@DelegatesTo(GenerateKeyForKeySetGroupCmd) Closure<?> block) {
        runDelegate(new GenerateKeyForKeySetGroupCmd(), block)
    }

    /**
     * Delete an existing SSL configuration.
     * @param block to configure
     */
    def deleteSSLConfig(@DelegatesTo(DeleteSSLConfigCmd) Closure<?> block) {
        runDelegate(new DeleteSSLConfigCmd(), block)
    }

    /**
     * List all the objects that a given user has access to.
     * @param block to configure
     */
    def listResourcesForUserID(@DelegatesTo(ListResourcesForUserIDCmd) Closure<?> block) {
        runDelegate(new ListResourcesForUserIDCmd(), block)
    }

    /**
     * Delete configuration specified in properties file
     * @param block to configure
     */
    def deleteConfigProperties(@DelegatesTo(DeleteConfigPropertiesCmd) Closure<?> block) {
        runDelegate(new DeleteConfigPropertiesCmd(), block)
    }

    /**
     * This command is used to query groups of Managed Nodes. (deprecated)
     * @param block to configure
     */
    def queryManagedNodeGroups(@DelegatesTo(QueryManagedNodeGroupsCmd) Closure<?> block) {
        runDelegate(new QueryManagedNodeGroupsCmd(), block)
    }

    /**
     * Remove an outbound port.
     * @param block to configure
     */
    def removeSIBWSOutboundPort(@DelegatesTo(RemoveSIBWSOutboundPortCmd) Closure<?> block) {
        runDelegate(new RemoveSIBWSOutboundPortCmd(), block)
    }

    /**
     * Delete an existing management scope.
     * @param block to configure
     */
    def deleteManagementScope(@DelegatesTo(DeleteManagementScopeCmd) Closure<?> block) {
        runDelegate(new DeleteManagementScopeCmd(), block)
    }

    /**
     * Modifies an audit service provider implementation in the audit.xml file
     * @param block to configure
     */
    def modifyAuditEmitter(@DelegatesTo(ModifyAuditEmitterCmd) Closure<?> block) {
        runDelegate(new ModifyAuditEmitterCmd(), block)
    }

    /**
     * Applies the security settings selected during install or profile creation time.
     * @param block to configure
     */
    def applyProfileSecuritySettings(@DelegatesTo(ApplyProfileSecuritySettingsCmd) Closure<?> block) {
        runDelegate(new ApplyProfileSecuritySettingsCmd(), block)
    }

    /**
     * Returns all the configured LDAP servers and their configurations.
     * @param block to configure
     */
    def getIdMgrLDAPServer(@DelegatesTo(GetIdMgrLDAPServerCmd) Closure<?> block) {
        runDelegate(new GetIdMgrLDAPServerCmd(), block)
    }

    /**
     * List the members on a bus.
     * @param block to configure
     */
    def listSIBusMembers(@DelegatesTo(ListSIBusMembersCmd) Closure<?> block) {
        runDelegate(new ListSIBusMembersCmd(), block)
    }

    /**
     * Removes a specified user from the cache.
     * @param block to configure
     */
    def clearIdMgrUserFromCache(@DelegatesTo(ClearIdMgrUserFromCacheCmd) Closure<?> block) {
        runDelegate(new ClearIdMgrUserFromCacheCmd(), block)
    }

    /**
     * List Java virtual machine (JVM) configuration for the application server's process.
     * @param block to configure
     */
    def showJVMProperties(@DelegatesTo(ShowJVMPropertiesCmd) Closure<?> block) {
        runDelegate(new ShowJVMPropertiesCmd(), block)
    }

    /**
     * Provides the ability to manage the settings associated with the IBM MQ resource adapter installed at a particular scope.
     * @param block to configure
     */
    def manageWMQ(@DelegatesTo(ManageWMQCmd) Closure<?> block) {
        runDelegate(new ManageWMQCmd(), block)
    }

    /**
     * null
     * @param block to configure
     */
    def listMWSInstallRoots(@DelegatesTo(ListMWSInstallRootsCmd) Closure<?> block) {
        runDelegate(new ListMWSInstallRootsCmd(), block)
    }

    /**
     * Attempt to populate any missing unique name entries in the authorization model for the specified bus using its user repository.
     * @param block to configure
     */
    def populateUniqueNames(@DelegatesTo(PopulateUniqueNamesCmd) Closure<?> block) {
        runDelegate(new PopulateUniqueNamesCmd(), block)
    }

    /**
     * List SSL configurations for a specific management scope.
     * @param block to configure
     */
    def listSSLConfigs(@DelegatesTo(ListSSLConfigsCmd) Closure<?> block) {
        runDelegate(new ListSSLConfigsCmd(), block)
    }

    /**
     * List all certificate expiration monitors.
     * @param block to configure
     */
    def listWSCertExpMonitor(@DelegatesTo(ListWSCertExpMonitorCmd) Closure<?> block) {
        runDelegate(new ListWSCertExpMonitorCmd(), block)
    }

    /**
     * Configures the CSI inbound information in the administrative security configuration or in an application security domain.
     * @param block to configure
     */
    def configureCSIInbound(@DelegatesTo(ConfigureCSIInboundCmd) Closure<?> block) {
        runDelegate(new ConfigureCSIInboundCmd(), block)
    }

    /**
     * Refresh the WSDL definition for an outbound service.
     * @param block to configure
     */
    def refreshSIBWSOutboundServiceWSDL(@DelegatesTo(RefreshSIBWSOutboundServiceWSDLCmd) Closure<?> block) {
        runDelegate(new RefreshSIBWSOutboundServiceWSDLCmd(), block)
    }

    /**
     * Modify a cluster bus members messaging engine policy assistance settings.
     * @param block to configure
     */
    def modifySIBusMemberPolicy(@DelegatesTo(ModifySIBusMemberPolicyCmd) Closure<?> block) {
        runDelegate(new ModifySIBusMemberPolicyCmd(), block)
    }

    /**
     * Shows the configured parameters of the named external bundle repository.
     * @param block to configure
     */
    def showExternalBundleRepository(@DelegatesTo(ShowExternalBundleRepositoryCmd) Closure<?> block) {
        runDelegate(new ShowExternalBundleRepositoryCmd(), block)
    }

    /**
     * Get information about a management scope.
     * @param block to configure
     */
    def getManagementScope(@DelegatesTo(GetManagementScopeCmd) Closure<?> block) {
        runDelegate(new GetManagementScopeCmd(), block)
    }

    /**
     * Removes a member (user or group) from a group.
     * @param block to configure
     */
    def removeMemberFromGroup(@DelegatesTo(RemoveMemberFromGroupCmd) Closure<?> block) {
        runDelegate(new RemoveMemberFromGroupCmd(), block)
    }

    /**
     * Returns a list of the defined audit event factory implementations.
     * @param block to configure
     */
    def listAuditEventFactories(@DelegatesTo(ListAuditEventFactoriesCmd) Closure<?> block) {
        runDelegate(new ListAuditEventFactoriesCmd(), block)
    }

    /**
     * Configures a login module in the administrative security configuration or in an application security domain.
     * @param block to configure
     */
    def configureLoginModule(@DelegatesTo(ConfigureLoginModuleCmd) Closure<?> block) {
        runDelegate(new ConfigureLoginModuleCmd(), block)
    }

    /**
     * List business-level applications in the cell.
     * @param block to configure
     */
    def listBLAs(@DelegatesTo(ListBLAsCmd) Closure<?> block) {
        runDelegate(new ListBLAsCmd(), block)
    }

    /**
     * Update information for a group of Targets.
     * @param block to configure
     */
    def modifyTargetGroupInfo(@DelegatesTo(ModifyTargetGroupInfoCmd) Closure<?> block) {
        runDelegate(new ModifyTargetGroupInfoCmd(), block)
    }

    /**
     * Lists the users in the specified topic role for the specified topic space.
     * @param block to configure
     */
    def listUsersInTopicRole(@DelegatesTo(ListUsersInTopicRoleCmd) Closure<?> block) {
        runDelegate(new ListUsersInTopicRoleCmd(), block)
    }

    /**
     * Delete a Datasource used to access a relational database.
     * @param block to configure
     */
    def deleteDatasource(@DelegatesTo(DeleteDatasourceCmd) Closure<?> block) {
        runDelegate(new DeleteDatasourceCmd(), block)
    }

    /**
     * Ensures that a messaging engines core group policy conforms to its associated bus members messaging engine assistance policy.
     * @param block to configure
     */
    def correctSIBEnginePolicy(@DelegatesTo(CorrectSIBEnginePolicyCmd) Closure<?> block) {
        runDelegate(new CorrectSIBEnginePolicyCmd(), block)
    }

    /**
     * Deletes the audit record encryption configuration.
     * @param block to configure
     */
    def deleteAuditEncryptionConfig(@DelegatesTo(DeleteAuditEncryptionConfigCmd) Closure<?> block) {
        runDelegate(new DeleteAuditEncryptionConfigCmd(), block)
    }

    /**
     * Deletes the primary LDAP server and configured backup servers.
     * @param block to configure
     */
    def deleteIdMgrLDAPServer(@DelegatesTo(DeleteIdMgrLDAPServerCmd) Closure<?> block) {
        runDelegate(new DeleteIdMgrLDAPServerCmd(), block)
    }

    /**
     * Edit issuer, tokenTypeURI, jaasConfigName or callbackHandler attributes of the specified trust authentication rule.
     * @param block to configure
     */
    def editSTSEndpointTrustAuthenticationRule(@DelegatesTo(EditSTSEndpointTrustAuthenticationRuleCmd) Closure<?> block) {
        runDelegate(new EditSTSEndpointTrustAuthenticationRuleCmd(), block)
    }

    /**
     * Returns the configured audit service provider for the supplied event factory.
     * @param block to configure
     */
    def getAuditEventFactoryProvider(@DelegatesTo(GetAuditEventFactoryProviderCmd) Closure<?> block) {
        runDelegate(new GetAuditEventFactoryProviderCmd(), block)
    }

    /**
     * Check if the provided user and password authenticate in the registry.
     * @param block to configure
     */
    def checkRegistryUserPassword(@DelegatesTo(CheckRegistryUserPasswordCmd) Closure<?> block) {
        runDelegate(new CheckRegistryUserPasswordCmd(), block)
    }

    /**
     * Assign a token type to be issued for the client to access a given endpoint. Endpoints must be unique. If the local name parameter is omitted, the default token type is assumed.
     * @param block to configure
     */
    def assignSTSEndpointTokenType(@DelegatesTo(AssignSTSEndpointTokenTypeCmd) Closure<?> block) {
        runDelegate(new AssignSTSEndpointTokenTypeCmd(), block)
    }

    /**
     * Converts self-signed certificates to chained certificate in a keystore, all keystore, or the default keystores.  The new chained certificate will be signed with root certificate specified or the default root if one is not specified.  All keystores in the configuration will be searched for the self-signed certificate's signer certificate and it will be replaced with the signer of the default root certificate.
     * @param block to configure
     */
    def convertSelfSignedCertificatesToChained(@DelegatesTo(ConvertSelfSignedCertificatesToChainedCmd) Closure<?> block) {
        runDelegate(new ConvertSelfSignedCertificatesToChainedCmd(), block)
    }

    /**
     * The deleteAttachmentsForPolicySet command removes all attachments for a specific policy set.
     * @param block to configure
     */
    def deleteAttachmentsForPolicySet(@DelegatesTo(DeleteAttachmentsForPolicySetCmd) Closure<?> block) {
        runDelegate(new DeleteAttachmentsForPolicySetCmd(), block)
    }

    /**
     * Lists all the configured primary LDAP servers.
     * @param block to configure
     */
    def listIdMgrLDAPServers(@DelegatesTo(ListIdMgrLDAPServersCmd) Closure<?> block) {
        runDelegate(new ListIdMgrLDAPServersCmd(), block)
    }

    /**
     * This command is used to get the metadata associated with a jobType.
     * @param block to configure
     */
    def getJobTypeMetadata(@DelegatesTo(GetJobTypeMetadataCmd) Closure<?> block) {
        runDelegate(new GetJobTypeMetadataCmd(), block)
    }

    /**
     * The getRequiredBindingVersion command returns the binding version that is required for a specified asset.
     * @param block to configure
     */
    def getRequiredBindingVersion(@DelegatesTo(GetRequiredBindingVersionCmd) Closure<?> block) {
        runDelegate(new GetRequiredBindingVersionCmd(), block)
    }

    /**
     * Grants a user default access to all local destinations on the bus for the specified role.
     * @param block to configure
     */
    def addUserToDefaultRole(@DelegatesTo(AddUserToDefaultRoleCmd) Closure<?> block) {
        runDelegate(new AddUserToDefaultRoleCmd(), block)
    }

    /**
     * List the pureQuery bind files in an installed application.
     * @param block to configure
     */
    def listPureQueryBindFiles(@DelegatesTo(ListPureQueryBindFilesCmd) Closure<?> block) {
        runDelegate(new ListPureQueryBindFilesCmd(), block)
    }

    /**
     * null
     * @param block to configure
     */
    def adminservice_getProcessName(@DelegatesTo(Adminservice_getProcessNameCmd) Closure<?> block) {
        runDelegate(new Adminservice_getProcessNameCmd(), block)
    }

    /**
     * null
     * @param block to configure
     */
    def putMWSInstallFile(@DelegatesTo(PutMWSInstallFileCmd) Closure<?> block) {
        runDelegate(new PutMWSInstallFileCmd(), block)
    }

    /**
     * Removes the named external bundle repository from the configuration.
     * @param block to configure
     */
    def removeExternalBundleRepository(@DelegatesTo(RemoveExternalBundleRepositoryCmd) Closure<?> block) {
        runDelegate(new RemoveExternalBundleRepositoryCmd(), block)
    }

    /**
     * Disables the verbose gathering of audit data.
     * @param block to configure
     */
    def disableVerboseAudit(@DelegatesTo(DisableVerboseAuditCmd) Closure<?> block) {
        runDelegate(new DisableVerboseAuditCmd(), block)
    }

    /**
     * Compares the version of a given node with the specified version.  Only the number of levels in the specified version number are compared.  For example, if "6.0" compared to a node version of "6.0.1.0", they will compare as equal.  The possible return values are -1, 0, and 1. They are defined as follows:
	-1: node version is less than the specified version
	 0: node version is equal to the specified version
	 1: node version is greater than the specified version
     * @param block to configure
     */
    def compareNodeVersion(@DelegatesTo(CompareNodeVersionCmd) Closure<?> block) {
        runDelegate(new CompareNodeVersionCmd(), block)
    }

    /**
     * Use the "updateLMService" command to update details about an existing local mapping service.
     * @param block to configure
     */
    def updateLMService(@DelegatesTo(UpdateLMServiceCmd) Closure<?> block) {
        runDelegate(new UpdateLMServiceCmd(), block)
    }

    /**
     * Remove an identity rule, trust authentication rules applied to a specified token type or rules applied to a specified issuer.
     * @param block to configure
     */
    def removeSTSEndpointTrustAuthenticationRule(@DelegatesTo(RemoveSTSEndpointTrustAuthenticationRuleCmd) Closure<?> block) {
        runDelegate(new RemoveSTSEndpointTrustAuthenticationRuleCmd(), block)
    }

    /**
     * Generates the Security Configuration report.
     * @param block to configure
     */
    def generateSecConfigReport(@DelegatesTo(GenerateSecConfigReportCmd) Closure<?> block) {
        runDelegate(new GenerateSecConfigReportCmd(), block)
    }

    /**
     * Retrieves managed resource types.
     * @param block to configure
     */
    def getManagedResourceTypes(@DelegatesTo(GetManagedResourceTypesCmd) Closure<?> block) {
        runDelegate(new GetManagedResourceTypesCmd(), block)
    }

    /**
     * Configures an inbound or outbound trusted realms.
     * @param block to configure
     */
    def configureTrustedRealms(@DelegatesTo(ConfigureTrustedRealmsCmd) Closure<?> block) {
        runDelegate(new ConfigureTrustedRealmsCmd(), block)
    }

    /**
     * The task will renew a certificate as a self-signed based off the previous certificates attributes such as the common name, key size and validity.
     * @param block to configure
     */
    def renewAuditCertificate(@DelegatesTo(RenewAuditCertificateCmd) Closure<?> block) {
        runDelegate(new RenewAuditCertificateCmd(), block)
    }

    /**
     * listAuthorizationRolesDesc
     * @param block to configure
     */
    def listAuthorizationRoles(@DelegatesTo(ListAuthorizationRolesCmd) Closure<?> block) {
        runDelegate(new ListAuthorizationRolesCmd(), block)
    }

    /**
     * Displays a list of ports that is used to access the specified application, including the node name, server name, named endpoint, and host and port values.
     * @param block to configure
     */
    def listApplicationPorts(@DelegatesTo(ListApplicationPortsCmd) Closure<?> block) {
        runDelegate(new ListApplicationPortsCmd(), block)
    }

    /**
     * Returns the references to the defined Audit Filters.
     * @param block to configure
     */
    def listAuditFiltersByRef(@DelegatesTo(ListAuditFiltersByRefCmd) Closure<?> block) {
        runDelegate(new ListAuditFiltersByRefCmd(), block)
    }

    /**
     * Delete bus destination.
     * @param block to configure
     */
    def deleteSIBDestination(@DelegatesTo(DeleteSIBDestinationCmd) Closure<?> block) {
        runDelegate(new DeleteSIBDestinationCmd(), block)
    }

    /**
     * Retrieves the attributes of a PersonAccount.
     * @param block to configure
     */
    def getUser(@DelegatesTo(GetUserCmd) Closure<?> block) {
        runDelegate(new GetUserCmd(), block)
    }

    /**
     * List the configuration properties under a configuration group.
     * @param block to configure
     */
    def listSTSConfigurationProperties(@DelegatesTo(ListSTSConfigurationPropertiesCmd) Closure<?> block) {
        runDelegate(new ListSTSConfigurationPropertiesCmd(), block)
    }

    /**
     * Returns the deployedObject that represents the configuration of the OSGi application given the name of its composition unit.
     * @param block to configure
     */
    def getOSGiApplicationDeployedObject(@DelegatesTo(GetOSGiApplicationDeployedObjectCmd) Closure<?> block) {
        runDelegate(new GetOSGiApplicationDeployedObjectCmd(), block)
    }

    /**
     * List search object that participates in a specific data replication domain.  An object participates in a data replication domain if the object references the provided data replication domain name.  The command returns the objects that reference the data replication domain name regardless of whether replication is enabled or disabled for that object.
     * @param block to configure
     */
    def listReplicationDomainReferences(@DelegatesTo(ListReplicationDomainReferencesCmd) Closure<?> block) {
        runDelegate(new ListReplicationDomainReferencesCmd(), block)
    }

    /**
     * Show detail for a SIB link.
     * @param block to configure
     */
    def showSIBLink(@DelegatesTo(ShowSIBLinkCmd) Closure<?> block) {
        runDelegate(new ShowSIBLinkCmd(), block)
    }

    /**
     * add a custom property for a node group
     * @param block to configure
     */
    def createNodeGroupProperty(@DelegatesTo(CreateNodeGroupPropertyCmd) Closure<?> block) {
        runDelegate(new CreateNodeGroupPropertyCmd(), block)
    }

    /**
     * Add an inbound port to an inbound service.
     * @param block to configure
     */
    def addSIBWSInboundPort(@DelegatesTo(AddSIBWSInboundPortCmd) Closure<?> block) {
        runDelegate(new AddSIBWSInboundPortCmd(), block)
    }

    /**
     * Creates an LDAP repository configuration object.
     * @param block to configure
     */
    def createIdMgrLDAPRepository(@DelegatesTo(CreateIdMgrLDAPRepositoryCmd) Closure<?> block) {
        runDelegate(new CreateIdMgrLDAPRepositoryCmd(), block)
    }

    /**
     * Removes a groups permission to access the topic for the specified role.
     * @param block to configure
     */
    def removeGroupFromTopicRole(@DelegatesTo(RemoveGroupFromTopicRoleCmd) Closure<?> block) {
        runDelegate(new RemoveGroupFromTopicRoleCmd(), block)
    }

    /**
     * Configures an external authorization provider in global security or in an application security domain.
     * @param block to configure
     */
    def configureAuthzConfig(@DelegatesTo(ConfigureAuthzConfigCmd) Closure<?> block) {
        runDelegate(new ConfigureAuthzConfigCmd(), block)
    }

    /**
     * Adds an extension to the composition unit.
     * @param block to configure
     */
    def addOSGiExtension(@DelegatesTo(AddOSGiExtensionCmd) Closure<?> block) {
        runDelegate(new AddOSGiExtensionCmd(), block)
    }

    /**
     * View options for a specified asset.
     * @param block to configure
     */
    def viewAsset(@DelegatesTo(ViewAssetCmd) Closure<?> block) {
        runDelegate(new ViewAssetCmd(), block)
    }

    /**
     * Command that modifies the role propagation authorization mechanism
     * @param block to configure
     */
    def configureRSATokenAuthorization(@DelegatesTo(ConfigureRSATokenAuthorizationCmd) Closure<?> block) {
        runDelegate(new ConfigureRSATokenAuthorizationCmd(), block)
    }

    /**
     * Remove all foreign bus roles defined for the specified bus
     * @param block to configure
     */
    def removeForeignBusRoles(@DelegatesTo(RemoveForeignBusRolesCmd) Closure<?> block) {
        runDelegate(new RemoveForeignBusRolesCmd(), block)
    }

    /**
     * List keystore objects in a particular scope.
     * @param block to configure
     */
    def listKeyStores(@DelegatesTo(ListKeyStoresCmd) Closure<?> block) {
        runDelegate(new ListKeyStoresCmd(), block)
    }

    /**
     * Create a new chained certificate and store it in a key store.
     * @param block to configure
     */
    def createChainedCertificate(@DelegatesTo(CreateChainedCertificateCmd) Closure<?> block) {
        runDelegate(new CreateChainedCertificateCmd(), block)
    }

    /**
     * This command deletes the Receiver Channel associated with the SIB MQ Link passed in as a target object.
     * @param block to configure
     */
    def deleteSIBMQLinkReceiverChannel(@DelegatesTo(DeleteSIBMQLinkReceiverChannelCmd) Closure<?> block) {
        runDelegate(new DeleteSIBMQLinkReceiverChannelCmd(), block)
    }

    /**
     * Start all composition units of a specified business-level application.
     * @param block to configure
     */
    def startBLA(@DelegatesTo(StartBLACmd) Closure<?> block) {
        runDelegate(new StartBLACmd(), block)
    }

    /**
     * Deletes an existing Key Store.
     * @param block to configure
     */
    def deleteAuditKeyStore(@DelegatesTo(DeleteAuditKeyStoreCmd) Closure<?> block) {
        runDelegate(new DeleteAuditKeyStoreCmd(), block)
    }

    /**
     * Returns the major version for a node, for example, "6" for v6.0.0.0.
     * @param block to configure
     */
    def getNodeMajorVersion(@DelegatesTo(GetNodeMajorVersionCmd) Closure<?> block) {
        runDelegate(new GetNodeMajorVersionCmd(), block)
    }

    /**
     * Deletes the audit event factory specified by the unique name.
     * @param block to configure
     */
    def deleteAuditEventFactoryByName(@DelegatesTo(DeleteAuditEventFactoryByNameCmd) Closure<?> block) {
        runDelegate(new DeleteAuditEventFactoryByNameCmd(), block)
    }

    /**
     * export the configuration of a wsprofile to a config archive.
     * @param block to configure
     */
    def exportProxyProfile(@DelegatesTo(ExportProxyProfileCmd) Closure<?> block) {
        runDelegate(new ExportProxyProfileCmd(), block)
    }

    /**
     * Create properties file template for create/delete objects
     * @param block to configure
     */
    def createPropertiesFileTemplates(@DelegatesTo(CreatePropertiesFileTemplatesCmd) Closure<?> block) {
        runDelegate(new CreatePropertiesFileTemplatesCmd(), block)
    }

    /**
     * Lists all NamedEndPoints that can be associated with a TCPInboundChannel
     * @param block to configure
     */
    def listTCPEndPoints(@DelegatesTo(ListTCPEndPointsCmd) Closure<?> block) {
        runDelegate(new ListTCPEndPointsCmd(), block)
    }

    /**
     * Retrieve one of the service integration bus inbound ports from a WS-Notification service point.
     * @param block to configure
     */
    def getWSN_SIBWSInboundPort(@DelegatesTo(GetWSN_SIBWSInboundPortCmd) Closure<?> block) {
        runDelegate(new GetWSN_SIBWSInboundPortCmd(), block)
    }

    /**
     * Show the attributes of a JAX-WS Handler List
     * @param block to configure
     */
    def showJAXWSHandlerList(@DelegatesTo(ShowJAXWSHandlerListCmd) Closure<?> block) {
        runDelegate(new ShowJAXWSHandlerListCmd(), block)
    }

    /**
     * List one registered managed node's data if a name is given, otherwise list all managed nodes registered with the job manager data
     * @param block to configure
     */
    def listManagedNodesRegisteredWithJobManager(@DelegatesTo(ListManagedNodesRegisteredWithJobManagerCmd) Closure<?> block) {
        runDelegate(new ListManagedNodesRegisteredWithJobManagerCmd(), block)
    }

    /**
     * This command removes the custom properties from the security configuration for the embedded Tivoli Access Manager Trust Association Interceptor with classname TAMTrustAsociationInterceptorPlus.
     * @param block to configure
     */
    def unconfigureTAMTAIProperties(@DelegatesTo(UnconfigureTAMTAIPropertiesCmd) Closure<?> block) {
        runDelegate(new UnconfigureTAMTAIPropertiesCmd(), block)
    }

    /**
     * Returns a collection of node, server and transport channel chain combinations that are eligible to become bridge interfaces for the specified core group access point.
     * @param block to configure
     */
    def listEligibleBridgeInterfaces(@DelegatesTo(ListEligibleBridgeInterfacesCmd) Closure<?> block) {
        runDelegate(new ListEligibleBridgeInterfacesCmd(), block)
    }

    /**
     * Remove a configuration group.
     * @param block to configure
     */
    def removeSTSConfigurationGroup(@DelegatesTo(RemoveSTSConfigurationGroupCmd) Closure<?> block) {
        runDelegate(new RemoveSTSConfigurationGroupCmd(), block)
    }

    /**
     * List SAML Issuer Configuration data
     * @param block to configure
     */
    def listSAMLIssuerConfig(@DelegatesTo(ListSAMLIssuerConfigCmd) Closure<?> block) {
        runDelegate(new ListSAMLIssuerConfigCmd(), block)
    }

    /**
     * Delete a policy that matches the provided policy name.
     * @param block to configure
     */
    def deletePolicy(@DelegatesTo(DeletePolicyCmd) Closure<?> block) {
        runDelegate(new DeletePolicyCmd(), block)
    }

    /**
     * Delete a mediation.
     * @param block to configure
     */
    def deleteSIBMediation(@DelegatesTo(DeleteSIBMediationCmd) Closure<?> block) {
        runDelegate(new DeleteSIBMediationCmd(), block)
    }

    /**
     * Removes a bundle from the internal bundle repository.
     * @param block to configure
     */
    def removeLocalRepositoryBundle(@DelegatesTo(RemoveLocalRepositoryBundleCmd) Closure<?> block) {
        runDelegate(new RemoveLocalRepositoryBundleCmd(), block)
    }

    /**
     * Modify properties associated with a specific managed node. (deprecated)
     * @param block to configure
     */
    def modifyManagedNodeProperties(@DelegatesTo(ModifyManagedNodePropertiesCmd) Closure<?> block) {
        runDelegate(new ModifyManagedNodePropertiesCmd(), block)
    }

    /**
     * Move a server from one core group to another.
     * @param block to configure
     */
    def moveServerToCoreGroup(@DelegatesTo(MoveServerToCoreGroupCmd) Closure<?> block) {
        runDelegate(new MoveServerToCoreGroupCmd(), block)
    }

    /**
     * List all the objects that a given group has access to.
     * @param block to configure
     */
    def listAuditResourcesForGroupID(@DelegatesTo(ListAuditResourcesForGroupIDCmd) Closure<?> block) {
        runDelegate(new ListAuditResourcesForGroupIDCmd(), block)
    }

    /**
     * List messaging engines.
     * @param block to configure
     */
    def listSIBEngines(@DelegatesTo(ListSIBEnginesCmd) Closure<?> block) {
        runDelegate(new ListSIBEnginesCmd(), block)
    }

    /**
     * export the configuration of a server to a config archive.
     * @param block to configure
     */
    def exportProxyServer(@DelegatesTo(ExportProxyServerCmd) Closure<?> block) {
        runDelegate(new ExportProxyServerCmd(), block)
    }

    /**
     * This command list all the property values defined on a resource provider such as JDBCProvider or a connection factory such as DataSource or JMSConnectionFactory.
     * @param block to configure
     */
    def showResourceProperties(@DelegatesTo(ShowResourcePropertiesCmd) Closure<?> block) {
        runDelegate(new ShowResourcePropertiesCmd(), block)
    }

    /**
     * Set Java virtual machine (JVM) configuration for the application server.
     * @param block to configure
     */
    def setJVMProperties(@DelegatesTo(SetJVMPropertiesCmd) Closure<?> block) {
        runDelegate(new SetJVMPropertiesCmd(), block)
    }

}