/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create an STS token type configuration. Token type local names and URIs must be unique.
*/
@Generated("with GenerateAdminCommands")
class CreateSTSTokenTypeConfigurationCmd extends AdminCmd<Void> {
    CreateSTSTokenTypeConfigurationCmd() {
        super("createSTSTokenTypeConfiguration")
    }

    /**
     * The URI of the token type.
     */
    def 'URI'(String value) {
        parameter("URI", value)
    }

    /**
     * The fully qualified class name that will handle messages of this token type.
     */
    def 'HandlerFactory'(String value) {
        parameter("HandlerFactory", value)
    }

    /**
     * The maximum lifetime (specified in minutes) of the token type.
     */
    def 'lifetimeMinutes'(Integer value) {
        parameter("lifetimeMinutes", value)
    }

    /**
     * Indicate whether the cache for the token type is distributed.
     */
    def 'distributedCache'(Boolean value) {
        parameter("distributedCache", value)
    }

    /**
     * The fully qualified class name of an implementation of com.ibm.ws.wssecurity.sts.ext.cache.TokenCacheFactory to use for this token type.
     */
    def 'tokenCacheFactory'(String value) {
        parameter("tokenCacheFactory", value)
    }

    /**
     * Indicate whether postdating of tokens is allowed.
     */
    def 'postdatable'(Boolean value) {
        parameter("postdatable", value)
    }

    /**
     * Indicate whether renewal of expired tokens is allowed.
     */
    def 'renewableAfterExpiration'(Boolean value) {
        parameter("renewableAfterExpiration", value)
    }

    /**
     * The amount of time tokens are kept in the cache after expiration (specified in minutes).
     */
    def 'renewalWindowMinutes'(Integer value) {
        parameter("renewalWindowMinutes", value)
    }

    /**
     * Token type custom properties.
     */
    def 'customProperties'(java.util.Properties value) {
        parameter("customProperties", value)
    }

}
