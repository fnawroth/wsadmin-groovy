/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Updates the LDAP context pool configuration.
*/
@Generated("with GenerateAdminCommands")
class UpdateIdMgrLDAPContextPoolCmd extends AdminCmd<Void> {
    UpdateIdMgrLDAPContextPoolCmd() {
        super("updateIdMgrLDAPContextPool")
    }

    /**
     * The unique identifier of the repository.
     */
    def 'id'(String value) {
        parameter("id", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * By default, the context pool is enabled. If "enabled" is set to "false", the context pool is disabled. This setting indicates to create a new context instance for each request.
     */
    def 'enabled'(Boolean value) {
        parameter("enabled", value)
    }

    /**
     * The number of context instances that the virtual member manager LDAP adapter creates when first creating the pool. The range of the initPoolSize option is from 1 to 50.
     */
    def 'initPoolSize'(Integer value) {
        parameter("initPoolSize", value)
    }

    /**
     * The maximum number of context instances that can be maintained concurrently by the context pool. Both in-use and idle context instances contribute to this number. When the pool size reaches this number, no new context instances are created for a new request. The new request is blocked until a context instance is released by another request or is removed. The request checks for available context instances in the pool every time period, as defined by the poolWaitTime option. The minimum maxPoolSize value is 0; no maximum value exists. A maximum pool size of 0 means that no maximum size is defined: A request for a pooled context instance uses an existing pooled idle context instance or a newly created pooled context instance.
     */
    def 'maxPoolSize'(Integer value) {
        parameter("maxPoolSize", value)
    }

    /**
     * The preferred number of context instances for the context pool to maintain. Both in-use and idle context instances contribute to this number. When a request for the use of a pooled context instance and the pool size is less than the preferred size, the context pool creates and uses a new pooled context instance regardless of whether an idle connection is available. When a request is finished with a pooled context instance and the pool size is greater than the preferred size, the context pool closes and removes the pooled context instance from the pool. The range of prefPoolSize values is from 0 to 100. A preferred pool size of 0 means that no preferred size exists: A request for a pooled context instance results in a newly created context instance only if no idle ones are available.
     */
    def 'prefPoolSize'(Integer value) {
        parameter("prefPoolSize", value)
    }

    /**
     * An integer that represents the number of seconds that an idle context instance can remain in the pool without being closed and removed from the pool. When a context instance is requested from the pool, if this context already exists in the pool for more than the time defined by the poolTimeout option, this connection is closed regardless of whether this context instance is stale or active. A new context instance is created and put back to the pool after it is released from the request. The minimum value of poolTimeout is 0. No maximum value is defined. A poolTimeout value of 0 means that the context instances in the pool remain in the pool until they are staled. In this case, the context pool catches the communication exception and recreates a new context instance. 
     */
    def 'poolTimeOut'(Integer value) {
        parameter("poolTimeOut", value)
    }

    /**
     * The time interval, in milliseconds, that the request waits until the context pool checks again if an idle context instance is available in the pool when the number of context instances reaches the maximum pool size. If no idle context instance exists, the request continues to wait for the same period of time before checking. The minimum poolWaitout value is 0; no maximum value is defined. A poolWaitTime value of 0 means that the Context Pool does not check for idle context instances. Instead, the request will be notified when a context instance is released from other requests.
     */
    def 'poolWaitTime'(Integer value) {
        parameter("poolWaitTime", value)
    }

}
