/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Process the pureQuery bind files that are in an installed application.  Bind static SQL packages in a database.  Refer to the information center documentation for the pureQuery bind utility.
*/
@Generated("with GenerateAdminCommands")
class ProcessPureQueryBindFilesCmd extends AdminCmd<Void> {
    ProcessPureQueryBindFilesCmd() {
        super("processPureQueryBindFiles")
    }

    /**
     * The name of an installed application that contains the pureQuery bind files to be processed.
     */
    def 'appName'(String value) {
        parameter("appName", value)
    }

    /**
     * A list of the paths to the .jar files that contain the pureQuery bind utility and its dependencies: pdq.jar, pdqmgmt.jar, and db2jcc4.jar or db2jcc.jar.  Use / or \\ as a file separator.  Use a blank space to separate the paths for the .jar files.
     */
    def 'classpath'(java.lang.String[] value) {
        parameter("classpath", value)
    }

    /**
     * The URL for connecting to the database.  The format is jdbc:db2://server_name:port/database_name.
     */
    def 'url'(String value) {
        parameter("url", value)
    }

    /**
     * The user name for connecting to the database.
     */
    def 'user'(String value) {
        parameter("user", value)
    }

    /**
     * The password for connecting to the database.
     */
    def 'password'(String value) {
        parameter("password", value)
    }

    /**
     * Any additional options that are needed by the pureQuery bind utility.  Provide bind options as: -bindoptions "options-string".  Refer to the information center documentation for the pureQuery bind utility.
     */
    def 'options'(String value) {
        parameter("options", value)
    }

    /**
     * A list of the names of the pureQuery bind files to be processed.  The bind file path names must be relative to the application .ear file that contains them.  Use / or \\ as a file separator.  If you specify multiple file paths, use a blank space to separate them.
     */
    def 'files'(java.lang.String[] value) {
        parameter("files", value)
    }

}
