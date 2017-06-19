/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands

import com.ibm.websphere.management.Session
import com.ibm.websphere.management.configservice.ConfigService

import javax.management.ObjectName

import static com.ibm.websphere.management.configservice.ConfigServiceHelper.createObjectName

/**
 * Created by urs on 6/18/2017.
 */
class DeleteWorkManagerInfoCmd extends BaseConfigServiceCommand<Void>{

    def name

    def name(name) {
        this.name = name
    }

    @Override
    Void execute(ConfigService configService, Session session, ObjectName scope) {
        def type = createObjectName (null, "WorkManagerInfo")
        def targetObjects=configService.queryConfigObjects(session, scope, type,null)
        def targetObject = targetObjects.find {it.canonicalName.contains("=${name},")}
        if (targetObject) {
            configService.deleteConfigData(session, targetObject)
        }
        return null
    }
}
