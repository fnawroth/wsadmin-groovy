/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands

import com.ibm.ejs.models.base.resources.J2EEResourcePropertySet
import com.ibm.ejs.models.base.resources.J2EEResourceProvider
import com.ibm.websphere.management.Session
import com.ibm.websphere.management.configservice.ConfigService

import javax.management.Attribute
import javax.management.AttributeList
import javax.management.ObjectName
import javax.naming.Referenceable

import static com.ibm.websphere.management.configservice.ConfigServiceHelper.createObjectName

/**
 * Created by urs on 6/18/2017.
 */
//FIXME gnereate from AdminConfig.attributes("WorkManagerInfo")
class CreateWorkManagerInfoCmd extends BaseConfigServiceCommand<Void>{

    AttributeList attributeList = new AttributeList()

    def category(String category) {
        attributeList.add(new Attribute("category", category))
    }
    def description(String description) {
        attributeList.add(new Attribute("description", description))
    }
    def isGrowable(boolean isGrowable) {
        attributeList.add(new Attribute("isGrowable", isGrowable))
    }
    def jndiName(String jndiName) {
        attributeList.add(new Attribute("jndiName", jndiName))
    }
    def maxThreads(int maxThreads) {
        attributeList.add(new Attribute("maxThreads", maxThreads))
    }
    def minThreads(int minThreads) {
        attributeList.add(new Attribute("minThreads", minThreads))
    }
    def numAlarmThreads(int numAlarmThreads) {
        attributeList.add(new Attribute("numAlarmThreads", numAlarmThreads))
    }
    def threadPriority(int threadPriority) {
        attributeList.add(new Attribute("threadPriority", threadPriority))
    }
    def name(String name) {
        attributeList.add(new Attribute("name", name))
    }
    def serviceNames(String... serviceNames) {
        attributeList.add(new Attribute("serviceNames", serviceNames))
    }
    def daemonTranClass (String value) {
        attributeList.add(new Attribute("daemonTranClass", value))
    }
    def defTranClass (String value) {
        attributeList.add(new Attribute("defTranClass", value))
    }
    def isDistributable ( boolean value) {
        attributeList.add(new Attribute("isDistributable", value))
    }
    def propertySet (J2EEResourcePropertySet value) {
        attributeList.add(new Attribute("propertySet", value))
    }
    def provider (J2EEResourceProvider value) {
        attributeList.add(new Attribute("provider", value))
    }
    def providerType ( String value) {
        attributeList.add(new Attribute("providerType", value))
    }
    def referenceable (Referenceable value) {
        attributeList.add(new Attribute("referenceable", value))
    }
    def workReqQFullAction (int value) {
        attributeList.add(new Attribute("workReqQFullAction", value))
    }
    def workReqQSize (int value) {
        attributeList.add(new Attribute("workReqQSize", value))
    }
    def workTimeout (int value) {
        attributeList.add(new Attribute("workTimeout", value))
    }


    @Override
    Void execute(ConfigService configService, Session session, ObjectName scope) {
        configService.getAttributesMetaInfo("WorkManagerProvider")
        def type = createObjectName (null, "WorkManagerProvider")
        def targetObjects=configService.queryConfigObjects(session, scope, type,null)
        def targetObject = targetObjects.first()
        if (targetObject) {

            configService.createConfigData(session, targetObject, "WorkManagerInfo", "WorkManagerInfo", attributeList)
        }
        return null
    }
}
