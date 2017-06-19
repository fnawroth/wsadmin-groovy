/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Converts old style SSL configuration to new style SSL configurations.  The CONVERT_SSLCONFIGS option will look for old style SSL configuration objects and change them to look like new style SSL configuration objects.  The CONVERT_TO_DEFAULT will go through make convert the whole SSL configuration to the new centralized SSL configuration style, removing the SSL configuraiton direct referencing from the servers.
*/
@Generated("with GenerateAdminCommands")
class ConvertSSLConfigCmd extends AdminCmd<Void> {
    ConvertSSLConfigCmd() {
        super("convertSSLConfig")
    }

    /**
     * Specify CONVERT_SSLCONFIGS to convert the SSL configuration objects from the old style SSL configuration object to a new style SSL configuration objects or specify CONVERT_TO_DEFAULT to convert the whole configuration to the new style centralized SSL configuration.
     */
    def 'sslConversionOption'(String value) {
        parameter("sslConversionOption", value)
    }

}
