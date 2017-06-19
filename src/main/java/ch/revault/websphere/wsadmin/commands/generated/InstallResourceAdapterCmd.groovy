/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Install a J2C resource adapter
*/
@Generated("with GenerateAdminCommands")
class InstallResourceAdapterCmd extends AdminCmd<Void> {
    InstallResourceAdapterCmd() {
        super("installResourceAdapter")
    }

    /**
     * The name of the node in which to install the resource adapter to.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * The fully qualified RAR file name resided in the specified node.
     */
    def 'rarPath'(String value) {
        parameter("rarPath", value)
    }

    /**
     * The name for the J2CResourceAdapter. If not specified, then the display name in the rar's deployment descriptor or the rar filename is used.
     */
    def 'rar_name'(String value) {
        parameter("rar.name", value)
    }

    /**
     * The description of the J2CResourceAdapter.
     */
    def 'rar_desc'(String value) {
        parameter("rar.desc", value)
    }

    /**
     * The name of the path where the file is to be extracted.  If this is not specified, then the archive will be extracted to $CONNECTOR_INSTALL_ROOT directory.
     */
    def 'rar_archivePath'(String value) {
        parameter("rar.archivePath", value)
    }

    /**
     * The additional classpath.
     */
    def 'rar_classpath'(String value) {
        parameter("rar.classpath", value)
    }

    /**
     * The native path.
     */
    def 'rar_nativePath'(String value) {
        parameter("rar.nativePath", value)
    }

    /**
     * The alias of the thread pool.
     */
    def 'rar_threadPoolAlias'(String value) {
        parameter("rar.threadPoolAlias", value)
    }

    /**
     * The property set of the J2CResourceAdapter.
     */
    def 'rar_propertiesSet'(java.util.Properties value) {
        parameter("rar.propertiesSet", value)
    }

    /**
     * null
     */
    def 'rar_DeleteSourceRar'(Boolean value) {
        parameter("rar.DeleteSourceRar", value)
    }

    /**
     * The boolean value of IsolatedClassLoader
     */
    def 'rar_isolatedClassLoader'(Boolean value) {
        parameter("rar.isolatedClassLoader", value)
    }

    /**
     * The boolean value of enabled HA 
     */
    def 'rar_enableHASupport'(Boolean value) {
        parameter("rar.enableHASupport", value)
    }

    /**
     * The kind of HACapability
     */
    def 'rar_HACapability'(String value) {
        parameter("rar.HACapability", value)
    }

}
