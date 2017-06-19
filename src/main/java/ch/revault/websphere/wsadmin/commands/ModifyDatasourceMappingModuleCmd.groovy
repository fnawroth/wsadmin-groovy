/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands

import com.ibm.websphere.management.Session
import com.ibm.websphere.management.configservice.ConfigService

import javax.management.Attribute
import javax.management.AttributeList
import javax.management.ObjectName

import static com.ibm.websphere.management.configservice.ConfigServiceHelper.createObjectName

/**
 * Created by urs on 6/18/2017.
 */
class ModifyDatasourceMappingModuleCmd extends BaseConfigServiceCommand<Void>{

    String datasourceName
    String authDataAlias
    String mappingConfigAlias


    def datasourceName(String datasourceName) {
        this.datasourceName = datasourceName
    }
    def authDataAlias(String authDataAlias) {
        this.authDataAlias = authDataAlias
    }
    def mappingConfigAlias(String mappingConfigAlias) {
        this.mappingConfigAlias = mappingConfigAlias
    }

    @Override
    Void execute(ConfigService configService, Session session, ObjectName scope) {
        def type = createObjectName (null, "DataSource")
        def targetObjects=configService.queryConfigObjects(session, scope, type,null)

        def targetObject = targetObjects.find {
            it?.canonicalName?.contains("=${datasourceName},")
        }
        if (targetObject) {
            AttributeList previous=tryGetAttribute(configService,session,targetObject, "mapping")
            logger.debug("previous mapping ${previous}")
            def attributes = new AttributeList([new Attribute("mappingConfigAlias", mappingConfigAlias),
                                                new Attribute("authDataAlias", authDataAlias)])
            configService.createConfigData(session, targetObject, "mapping", "MappingModule", attributes)
        }
        return null
    }
}
