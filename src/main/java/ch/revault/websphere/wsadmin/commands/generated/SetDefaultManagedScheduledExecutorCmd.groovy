/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Set the JNDI name that is bound to java:comp/DefaultManagedScheduledExecutorService.
*/
@Generated("with GenerateAdminCommands")
class SetDefaultManagedScheduledExecutorCmd extends AdminCmd<Void> {
    SetDefaultManagedScheduledExecutorCmd() {
        super("setDefaultManagedScheduledExecutor")
    }

    /**
     * The JNDI name to which the Java EE default resource JNDI name will be bound.
     */
    def 'targetJndiName'(String value) {
        parameter("targetJndiName", value)
    }

}
