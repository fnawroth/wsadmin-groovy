/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Compare an existing Resource Adapter to a RAR file and determine whether the RAR is compatible for updating the Resource Adapter.
*/
@Generated("with GenerateAdminCommands")
class CompareResourceAdapterToRARCmd extends AdminCmd<Void> {
    CompareResourceAdapterToRARCmd() {
        super("compareResourceAdapterToRAR")
    }

    /**
     * The absolute path to the new RAR file.
     */
    def 'rarPath'(String value) {
        parameter("rarPath", value)
    }

}
