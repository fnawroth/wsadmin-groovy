/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin

import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ImportCustomizer

/**
 * Created by urs on 6/19/2017.
 */
class Main {

    static void help() {
        println("wsadmin-groovy <groovyscript>")
        System.exit(-1)
    }
    static void helpClassPath(File jarfile) {
        println("""
Couldn't find ${jarfile}, please use the following properties or env variables to configure the location:
            
       Property                Environment
       --------------------    --------------------
       was.home                WAS_HOME
       was.version.major       WAS_VERSION_MAJOR
       was.version.minor       WAS_VERSION_MINOR
       was.admin.client.jar    WAS_ADMIN_CLIENT.JAR
 
""")
        System.exit(-1)
    }
    static void main(String[] args) {
        if (args.length != 1) {
            help()
        }
        configureClasspathAndLoader()
        new GroovyShell(
                new CompilerConfiguration()
                        .addCompilationCustomizers(
                        new ImportCustomizer()
                                .addStarImports('ch.revault.websphere.wsadmin.Script')
                                .addStaticStars()
                                .addImport('commands', 'ch.revault.websphere.wsadmin.commands.AdminCommandNames'))
        ).evaluate new File(args[0])
    }
    private static def configureClasspathAndLoader() {
        def rootClassLoader = Main.class.classLoader?.rootLoader ?: Main.class.classLoader
        if (checkAdminClientInClasspath(rootClassLoader)) {
            return
        }
        def was_home = System.getProperty("was.home") ?: System.getenv("WAS_HOME")
        def was_version_major = System.getProperty("was.version.major") ?: System.getenv("WAS_VERSION_MAJOR") ?: "9"
        def was_version_minor = System.getProperty("was.version.minor") ?: System.getenv("WAS_VERSION_MINOR") ?: "0"
        def jar = "${was_home}/runtimes/com.ibm.ws.admin.client_${was_version_major}.${was_version_minor}.jar"
        jar = System.getProperty("was.admin.client.jar") ?: System.getenv("WAS_ADMIN_CLIENT.JAR") ?: jar
        def jarfile = new File(jar)
        if (jarfile.exists() && rootClassLoader instanceof  URLClassLoader) {
            rootClassLoader.addURL( jarfile.toURI().toURL())
        }
        if (!checkAdminClientInClasspath(rootClassLoader)) {
            helpClassPath(jarfile)
        }
    }

    private static boolean checkAdminClientInClasspath(URLClassLoader classLoader) {
        try {
            classLoader.loadClass("com.ibm.websphere.management.AdminClient")
            return true
        } catch (ClassNotFoundException e) {
            return false
        }
    }
}
