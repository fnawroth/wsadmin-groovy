/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* updateSeveralWSSDistributedCacheConfigCmdDesc
*/
@Generated("with GenerateAdminCommands")
class UpdateDistributedCachePropertyCmd extends AdminCmd<Void> {
    UpdateDistributedCachePropertyCmd() {
        super("updateDistributedCacheProperty")
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
     * notUpdateDesc
     */
    def 'notUpdate'(String value) {
        parameter("notUpdate", value)
    }

    /**
     * Indicate whether the cache for the token type is distributed.
     */
    def 'distributedCache'(Boolean value) {
        parameter("distributedCache", value)
    }

    /**
     * clockSkewToleranceCustomProperty
     */
    def 'clockSkewToleranceInMinutes'(Integer value) {
        parameter("clockSkewToleranceInMinutes", value)
    }

}
