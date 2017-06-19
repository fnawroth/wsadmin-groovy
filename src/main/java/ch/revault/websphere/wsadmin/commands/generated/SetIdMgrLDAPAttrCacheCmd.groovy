/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Sets up the LDAP attribute cache configuration.
*/
@Generated("with GenerateAdminCommands")
class SetIdMgrLDAPAttrCacheCmd extends AdminCmd<Void> {
    SetIdMgrLDAPAttrCacheCmd() {
        super("setIdMgrLDAPAttrCache")
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
     * Whether or not to enable attribute cache.
     */
    def 'enabled'(Boolean value) {
        parameter("enabled", value)
    }

    /**
     * Whether or not to off-load the cache to a hard disk. This parameter affects both the attributes cache and the search results cache. By default, when the number of cache entries reaches the maximum size of the cache, eviction of cache entries occurs, allowing new entries to enter the caches. If the cachesDiskOffLoad option is enabled, the evicted cache entries are copied to disk for future access.
     */
    def 'cachesDiskOffLoad'(Boolean value) {
        parameter("cachesDiskOffLoad", value)
    }

    /**
     * The maximum size of the attribute cache (the number of Attributes objects that can be put into the attributes Cache). The minimum cacheSize value is 100. 
     */
    def 'cacheSize'(Integer value) {
        parameter("cacheSize", value)
    }

    /**
     * The number of seconds before the cached entries in the attributes cache can be invalidated. The minimum cacheTimeout value is 0. The cached Attributes objects stays in the attributes cache until the Attributes objects are changed by virtual member manager through operations, like updating, removing, or renaming.
     */
    def 'cacheTimeOut'(Integer value) {
        parameter("cacheTimeOut", value)
    }

    /**
     * An integer that represents the maximum number of values of an Attributes object that can be cached in the attributes Cache. If not present, the default value is 2000. Some attributes like member, usually contain a large number of values. This parameter is used to prevent the attributes cache from caching large attributes.
     */
    def 'attributeSizeLimit'(Integer value) {
        parameter("attributeSizeLimit", value)
    }

    /**
     * The name of the ttl attribute that is supported by the LDAP server. The attributes cache can use the value of this attribute to determine when the cached entries in the attributes cache time out. The ttl attribute contains the time, in seconds, that any information from the entry is kept by a client before it is considered stale and a new copy is retrieved. A value of 0 implies that the object must not be cached. For more information about this attribute, visit http://www.ietf.org/proceedings/98aug/I-D/draft-ietf-asid-ldap-cache-01.txt. The ttl attribute is not supported by all LDAP servers. If this attribute is supported by an LDAP server, the value of the serverTTLAttribute parameter can be set to the name of the ttl attribute (usually it is called 'ttl') to let the value of this attribute determine the timeout of the cached entry. In this way, the timeout value for different entries in the attributes cache might be different. For example, if this parameter is set to 'ttl', when Attributes cache retrieves attributes of a user from LDAP server, it also retrieves the value of the ttl attribute of this user. If the value is 200, then virtual member manager uses this value to set the timeout for the attributes of this user in the attributes cache instead of using the cacheTimeout value. The administrator of the LDAP server can set the ttl attribute differently for different users. For a regular employee, the value of the ttl attribute can be set to a longer value, while for a guest, it can be set to a shorter value.
     */
    def 'serverTTLAttribute'(String value) {
        parameter("serverTTLAttribute", value)
    }

    /**
     * Distribution policy for the cache in cluster environment. Valid values are: none (for NOT_SHARED), push (for SHARED_PUSH), and push_pull (for SHARED_PUSH_PULL).
     */
    def 'cacheDistPolicy'(String value) {
        parameter("cacheDistPolicy", value)
    }

}
