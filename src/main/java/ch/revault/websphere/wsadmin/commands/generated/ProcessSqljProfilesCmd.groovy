/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Process the serialized SQLJ profiles that are in an installed application.  Customize the profiles with information for run time and bind static SQL packages in a database.  Refer to the DB2 information center documentation for the commands db2sqljcustomize and db2sqljbind.
*/
@Generated("with GenerateAdminCommands")
class ProcessSqljProfilesCmd extends AdminCmd<Void> {
    ProcessSqljProfilesCmd() {
        super("processSqljProfiles")
    }

    /**
     * When set to true, only the bind process will be executed.  The SQLJ profiles must be customized before binding can be done.  Default is false.
     */
    def 'bindOnly'(Boolean value) {
        parameter("bindOnly", value)
    }

    /**
     * The name of an installed application that contains the SQLJ profiles to be processed.
     */
    def 'appName'(String value) {
        parameter("appName", value)
    }

    /**
     * A list of the paths to the .jar files that contain the SQLJ customize and bind tools: db2jcc4.jar or db2jcc.jar.  Use / or \\ as a file separator.  If you specify multiple paths for the .jar files, use a blank space to separate them.
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
     * Any additional options that are needed by the SQLJ customize and bind tools.  Provide bind options as: -bindoptions "options-string".  Refer to the DB2 information center documentation for the commands db2sqljcustomize and db2sqljbind.
     */
    def 'options'(String value) {
        parameter("options", value)
    }

    /**
     * A list of the names of the SQLJ profiles to be customized and bound, or the name of a .grp file that contains a list of profile names.  The profile path names must be relative to the application .ear file that contains them.  Use / or \\ as a file separator.  If you specify multiple profile paths, use a blank space to separate them.
     */
    def 'profiles'(java.lang.String[] value) {
        parameter("profiles", value)
    }

}
