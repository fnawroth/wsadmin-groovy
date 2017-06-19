/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a bus.
*/
@Generated("with GenerateAdminCommands")
class CreateSIBusCmd extends AdminCmd<Void> {
    CreateSIBusCmd() {
        super("createSIBus")
    }

    /**
     * Name of bus to create, which must be unique in the cell.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * Descriptive information about the bus.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * Enable or disable bus security.  Deprecated.  Use busSecurity parameter instead.
     */
    def 'secure'(Boolean value) {
        parameter("secure", value)
    }

    /**
     * Name of the authentication alias used to authorize communication between messaging engines on the bus.
     */
    def 'interEngineAuthAlias'(String value) {
        parameter("interEngineAuthAlias", value)
    }

    /**
     * Name of the authentication alias used to authorize mediations to access the bus.
     */
    def 'mediationsAuthAlias'(String value) {
        parameter("mediationsAuthAlias", value)
    }

    /**
     * The length of time, in minutes, that a security group will be cached for.
     */
    def 'securityGroupCacheTimeout'(Long value) {
        parameter("securityGroupCacheTimeout", value)
    }

    /**
     * The protocol used to send and receive messages between messaging engines, and between API clients and messaging engines.
     */
    def 'protocol'(String value) {
        parameter("protocol", value)
    }

    /**
     * Indicate whether or not any messages left in a queue's data store should be discarded when the queue is deleted.
     */
    def 'discardOnDelete'(Boolean value) {
        parameter("discardOnDelete", value)
    }

    /**
     * The maximum number of messages that any queue on the bus can hold.
     */
    def 'highMessageThreshold'(Long value) {
        parameter("highMessageThreshold", value)
    }

    /**
     * Indicate whether configuration files should be dynamically reloaded for this bus.
     */
    def 'configurationReloadEnabled'(Boolean value) {
        parameter("configurationReloadEnabled", value)
    }

    /**
     * Enables or disables bus security.
     */
    def 'busSecurity'(Boolean value) {
        parameter("busSecurity", value)
    }

    /**
     * Set script compatibility to 6 to maintain version 6 command behavior.  Default value is 6.1.
     */
    def 'scriptCompatibility'(String value) {
        parameter("scriptCompatibility", value)
    }

    /**
     * The bootstrap policy value can be set to one of the following SIBSERVICE_ENABLED, MEMBERS_AND_NOMINATED or MEMBERS_ONLY.
     */
    def 'bootstrapPolicy'(String value) {
        parameter("bootstrapPolicy", value)
    }

    /**
     * Configure the bus to use the server identity for calling mediations rather than the mediationsAuthAlias.
     */
    def 'useServerIdForMediations'(Boolean value) {
        parameter("useServerIdForMediations", value)
    }

    /**
     * Used to allow or prevent the bus from auditing when the application server auditing support is enabled.
     */
    def 'auditAllowed'(Boolean value) {
        parameter("auditAllowed", value)
    }

}
