/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a mediation.
*/
@Generated("with GenerateAdminCommands")
class CreateSIBMediationCmd extends AdminCmd<Void> {
    CreateSIBMediationCmd() {
        super("createSIBMediation")
    }

    /**
     * The name of the bus where the mediation is to be created.
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * The name to be given to the mediation.
     */
    def 'mediationName'(String value) {
        parameter("mediationName", value)
    }

    /**
     * Description of the mediation.
     */
    def 'description'(String value) {
        parameter("description", value)
    }

    /**
     * The name of the handler list that was defined when the mediation was deployed.
     */
    def 'handlerListName'(String value) {
        parameter("handlerListName", value)
    }

    /**
     * Whether or not a global transaction is started for each message processed.
     */
    def 'globalTransaction'(Boolean value) {
        parameter("globalTransaction", value)
    }

    /**
     * Whether or not to apply the mediation to multiple messages concurrently, and preserve message ordering.
     */
    def 'allowConcurrentMediation'(Boolean value) {
        parameter("allowConcurrentMediation", value)
    }

    /**
     * The text string that must be present in a message for the mediation to process the message.
     */
    def 'selector'(String value) {
        parameter("selector", value)
    }

    /**
     * The text string that must not be present in a message for the mediation to process the message.
     */
    def 'discriminator'(String value) {
        parameter("discriminator", value)
    }

}
