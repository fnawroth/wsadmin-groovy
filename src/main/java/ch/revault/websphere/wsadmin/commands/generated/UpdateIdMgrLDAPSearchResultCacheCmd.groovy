/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Updates the LDAP search result cache configuration.
*/
@Generated("with GenerateAdminCommands")
class UpdateIdMgrLDAPSearchResultCacheCmd extends AdminCmd<Void> {
    UpdateIdMgrLDAPSearchResultCacheCmd() {
        super("updateIdMgrLDAPSearchResultCache")
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
     * Whether or not to enable the search results cache.
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
     * cacheSizeDesc
     */
    def 'cacheSize'(Integer value) {
        parameter("cacheSize", value)
    }

    /**
     * The number of seconds before the cached entries in the search results cache can be invalidated. The minimum cacheTimeout value is 0. The cached NamingEnumeration objects stay in the search results cache until updating operations occur, like updating, removing, or renaming.     
     */
    def 'cacheTimeOut'(Integer value) {
        parameter("cacheTimeOut", value)
    }

    /**
     * An integer that represents the maximum number of entries contained in the NamingEnumeration object that can be cached in the search results cache. If not present, the default value is 1000. For example, if the result from a search contains 2000 users, these search results are not cached in the search results cache if the value of this property is set to 1000.
     */
    def 'searchResultSizeLimit'(Integer value) {
        parameter("searchResultSizeLimit", value)
    }

    /**
     * Distribution policy for the cache in cluster environment. Valid values are: none (for NOT_SHARED), push (for SHARED_PUSH), and push_pull (for SHARED_PUSH_PULL).
     */
    def 'cacheDistPolicy'(String value) {
        parameter("cacheDistPolicy", value)
    }

}
