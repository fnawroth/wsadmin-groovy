/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands

import ch.revault.websphere.wsadmin.Client
import com.ibm.websphere.management.AdminClient
import org.slf4j.LoggerFactory

import static com.ibm.websphere.management.AdminClient.*

class CommandConnect extends BaseCommand<Void> {
    final def logger = LoggerFactory.getLogger(getClass())
    final Properties properties

    CommandConnect() {
        this.properties=new Properties()
        this.properties[CONNECTOR_HOST]='localhost'
        this.properties[CONNECTOR_TYPE]= AdminClient.CONNECTOR_TYPE_SOAP
        this.properties[CONNECTOR_PORT]= "8880"
        //this.properties[USERNAME]="wsadmin"
        //this.properties[PASSWORD]="wsadmin"
        this.properties[CONNECTOR_SECURITY_ENABLED]= "false"
    }
    def invokeMethod(String name, args) {
        properties[name] = args[0]
    }
    def host(host) {
        properties[CONNECTOR_HOST] = host
    }
    def type(type) {
        properties[CONNECTOR_TYPE] = type
    }
    def port(port) {
        properties[CONNECTOR_PORT] = port
    }
    def username(username) {
        if(username)
            properties[USERNAME] = username
    }
    def password(password) {
        if(password)
            properties[PASSWORD] = password
    }
    def securityEnabled(securityEnabled) {
        properties[CONNECTOR_SECURITY_ENABLED] = securityEnabled
    }

    @Override
    Tuple2<Client,Void> execute(Client client) {
        return [client.connect(this), null]
    }
}