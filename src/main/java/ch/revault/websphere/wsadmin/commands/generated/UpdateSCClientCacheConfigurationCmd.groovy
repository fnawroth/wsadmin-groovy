/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Update the SC cache configuration
*/
@Generated("with GenerateAdminCommands")
class UpdateSCClientCacheConfigurationCmd extends AdminCmd<Void> {
    UpdateSCClientCacheConfigurationCmd() {
        super("updateSCClientCacheConfiguration")
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

}
