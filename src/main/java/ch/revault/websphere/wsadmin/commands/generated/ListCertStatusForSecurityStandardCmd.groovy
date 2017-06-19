/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns all the certificate used by SSL configuraiton and plugins. States if they comply with the requested security level. 
*/
@Generated("with GenerateAdminCommands")
class ListCertStatusForSecurityStandardCmd extends AdminCmd<Void> {
    ListCertStatusForSecurityStandardCmd() {
        super("listCertStatusForSecurityStandard")
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

}
