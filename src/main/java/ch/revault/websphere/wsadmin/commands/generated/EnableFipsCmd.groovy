/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Enables and disables a specified FIPS security level. 
*/
@Generated("with GenerateAdminCommands")
class EnableFipsCmd extends AdminCmd<Void> {
    EnableFipsCmd() {
        super("enableFips")
    }

    /**
     * Enables and disables a specified FIPS security level. Valid values include: true or false.  
     */
    def 'enableFips'(Boolean value) {
        parameter("enableFips", value)
    }

    /**
     * Determines the level of the FIPS security standard to use. Valid values include: (FIPS140-2, transition, SP800-131). 
     */
    def 'fipsLevel'(String value) {
        parameter("fipsLevel", value)
    }

    /**
     * Sets the level of the suiteB level. This flag is only used if fipsLevel flag is set to SP800-131. Valid values include (128, 192). 
     */
    def 'suiteBLevel'(String value) {
        parameter("suiteBLevel", value)
    }

    /**
     * Sets the level of SSL protocol type. This flag is only used if fipsLevel flag is set to "Transition". Valid values include: (TLS, TLSv1, TLSv1.1, TLSv1.2). Default value is "TLS"  
     */
    def 'protocol'(String value) {
        parameter("protocol", value)
    }

}
