/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin

import ch.revault.websphere.wsadmin.commands.CommandConnect
import com.ibm.websphere.management.AdminClient
import com.ibm.websphere.management.AdminClientFactory
import com.ibm.websphere.management.Session
import com.ibm.websphere.management.configservice.ConfigService
import com.ibm.websphere.management.configservice.ConfigServiceProxy
import org.slf4j.LoggerFactory

import javax.management.ObjectName

/**
 * Created by urs on 6/14/2017.
 */
class Client {
    final def logger = LoggerFactory.getLogger(getClass())
    private final AdminClient client
    private String scope
    private ObjectName resolvedScope
    private final Session session
    private final ConfigService configService

    Client() {
        this.client = null
        this.scope = null
        this.session = null
        this.configService = null
    }

    Client(Properties properties, id = null, type = "server", displayName="server1") {
        logger.info("Connecting to ${properties}")
        this.client = AdminClientFactory.createAdminClient(properties)
        this.configService = new ConfigServiceProxy(client)
        this.session = new Session("wasmaster", false)
        setScope("Server=server1")
    }

    final def setScope(scope) {
        this.scope = scope
        this.resolvedScope = this.configService.resolve(getSession(), scope)[0]
    }

    Client connect(CommandConnect connection) {
        return new Client(connection.properties)
    }

    AdminClient getClient() { checkNull(client) }
    ObjectName getResolvedScope() { checkNull(resolvedScope) }
    String getScope() { checkNull(scope) }
    Session getSession() { checkNull( session) }
    ConfigService getConfigService() { checkNull( configService) }

    def checkNull(value) {
        if (value==null)
            throw new IllegalStateException("no connection")
        value
    }

    void save(boolean overwriteOnConflict) {
        configService.save(getSession(), overwriteOnConflict)
    }
}
