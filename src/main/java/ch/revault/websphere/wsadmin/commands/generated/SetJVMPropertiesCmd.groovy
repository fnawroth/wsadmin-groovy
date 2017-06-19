/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Set Java virtual machine (JVM) configuration for the application server.
*/
@Generated("with GenerateAdminCommands")
class SetJVMPropertiesCmd extends AdminCmd<Void> {
    SetJVMPropertiesCmd() {
        super("setJVMProperties")
    }

    /**
     * The name of the Server whose process definition is modified. If there is only one server in the entire configuration, then this parameter is optional.
     */
    def 'serverName'(String value) {
        parameter("serverName", value)
    }

    /**
     * The name of the node. This is only needed for the server scopes that do not have a unique name across nodes.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * The process type of the server.  This is for zOS only.
     */
    def 'processType'(String value) {
        parameter("processType", value)
    }

    /**
     * The standard class path in which the Java virtual machine code looks for classes.
     */
    def 'classpath'(java.lang.String[] value) {
        parameter("classpath", value)
    }

    /**
     * Bootstrap classes and resources for JVM code. This option is only available for JVM instructions that support bootstrap classes and resources. You can separate multiple paths by a colon (:) or semi-colon (;), depending on operating system of the node.
     */
    def 'bootClasspath'(java.lang.String[] value) {
        parameter("bootClasspath", value)
    }

    /**
     * Specifies whether to use verbose debug output for class loading. The default is not to enable verbose class loading.
     */
    def 'verboseModeClass'(Boolean value) {
        parameter("verboseModeClass", value)
    }

    /**
     * Specifies whether to use verbose debug output for garbage collection. The default is to enable verbose garbage collection
     */
    def 'verboseModeGarbageCollection'(Boolean value) {
        parameter("verboseModeGarbageCollection", value)
    }

    /**
     * Specifies whether to use verbose debug output for native method invocation. The default is not to enable verbose Java Native Interface (JNI) activity.
     */
    def 'verboseModeJNI'(Boolean value) {
        parameter("verboseModeJNI", value)
    }

    /**
     * Specifies the initial heap size available to the JVM code, in megabytes.
     */
    def 'initialHeapSize'(Integer value) {
        parameter("initialHeapSize", value)
    }

    /**
     * Specifies the maximum heap size available to the JVM code, in megabytes.
     */
    def 'maximumHeapSize'(Integer value) {
        parameter("maximumHeapSize", value)
    }

    /**
     * This setting applies to base WebSphere Application Server only. It specifies whether to use HProf profiler support. To use another profiler, specify the custom profiler settings using the HProf Arguments setting. The default is not to enable HProf profiler support.
     */
    def 'runHProf'(Boolean value) {
        parameter("runHProf", value)
    }

    /**
     * This setting applies to base WebSphere Application Server only. It specifies command-line profiler arguments to pass to the JVM code that starts the application server process. You can specify arguments when HProf profiler support is enabled.
     */
    def 'hprofArguments'(String value) {
        parameter("hprofArguments", value)
    }

    /**
     * Specifies whether to run the JVM in debug mode. The default is not to enable debug mode support.
     */
    def 'debugMode'(Boolean value) {
        parameter("debugMode", value)
    }

    /**
     * Specifies command-line debug arguments to pass to the JVM code that starts the application server process. You can specify arguments when Debug Mode is enabled.
     */
    def 'debugArgs'(String value) {
        parameter("debugArgs", value)
    }

    /**
     * Specifies command line arguments to pass to the Java virtual machine code that starts the application server process.
     */
    def 'genericJvmArguments'(String value) {
        parameter("genericJvmArguments", value)
    }

    /**
     * Specifies the internal Class Access Mode for the JVM.  <ALLOW | RESTRICT>
     */
    def 'internalClassAccessMode'(String value) {
        parameter("internalClassAccessMode", value)
    }

    /**
     * Specifies a full path name for an executable JAR file that the JVM code uses.
     */
    def 'executableJarFileName'(String value) {
        parameter("executableJarFileName", value)
    }

    /**
     * Specifies whether to disable the just in time (JIT) compiler option of the JVM code.
     */
    def 'disableJIT'(Boolean value) {
        parameter("disableJIT", value)
    }

    /**
     * Specifies JVM settings for a given operating system. When started, the process uses the JVM settings for the operating system of the node.
     */
    def 'osName'(String value) {
        parameter("osName", value)
    }

}
