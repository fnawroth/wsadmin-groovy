/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands

import ch.revault.websphere.wsadmin.Client
import com.ibm.websphere.management.Session
import com.ibm.websphere.management.configservice.ConfigService
import com.ibm.websphere.management.exception.InvalidAttributeNameException

import javax.management.ObjectName

/**
 * Created by urs on 6/18/2017.
 */
 abstract class BaseConfigServiceCommand<T> extends  BaseCommand<T> {
     def scope

     @Override
     final Tuple2<Client, T> execute(Client client) {
         def configService = client.configService
         def session = client.session
         if (scope && scope instanceof String) {
             scope = configService.resolve(session, scope)[0]
         }
         if (!scope) {
             scope = client.resolvedScope
         }
         return [client, execute(configService, session, scope)]
     }


     abstract T execute(ConfigService configService, Session session, ObjectName scope)
     protected  <T> T tryGetAttribute(ConfigService configService, Session session, ObjectName object, String name) {
         try {
             return (T)configService.getAttribute(session, object, name)
         } catch (InvalidAttributeNameException e) {
             return null
         }
     }
     def scope(String scope) {
         this.scope = scope
     }
     def scope(ObjectName scope) {
         this.scope = scope
     }
 }