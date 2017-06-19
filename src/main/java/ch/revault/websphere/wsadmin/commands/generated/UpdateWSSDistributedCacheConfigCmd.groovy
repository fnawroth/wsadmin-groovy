/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Update Web Services Security Distrubuted Cache configuration properties
*/
@Generated("with GenerateAdminCommands")
class UpdateWSSDistributedCacheConfigCmd extends AdminCmd<Void> {
    UpdateWSSDistributedCacheConfigCmd() {
        super("updateWSSDistributedCacheConfig")
    }

    /**
     * Renewal cushion period before the token expires
     */
    def 'renewIntervalBeforeTimeoutMinutes'(Integer value) {
        parameter("renewIntervalBeforeTimeoutMinutes", value)
    }

    /**
     * Time to stay in cache after token expires
     */
    def 'minutesInCacheAfterTimeout'(Integer value) {
        parameter("minutesInCacheAfterTimeout", value)
    }

    /**
     * Indicate whether the cache for the token type is distributed.
     */
    def 'distributedCache'(Boolean value) {
        parameter("distributedCache", value)
    }

    /**
     * Synchronous update of token state changes on cluster members 
     */
    def 'synchronousClusterUpdate'(Boolean value) {
        parameter("synchronousClusterUpdate", value)
    }

    /**
     * Token recovery support
     */
    def 'tokenRecovery'(Boolean value) {
        parameter("tokenRecovery", value)
    }

    /**
     * Datasource JNDI name
     */
    def 'Datasource'(String value) {
        parameter("Datasource", value)
    }

}
