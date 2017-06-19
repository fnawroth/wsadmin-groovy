/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Prepare keys and keystores for Cell profile creation.
*/
@Generated("with GenerateAdminCommands")
class PrepareKeysForCellProfileCmd extends AdminCmd<Void> {
    PrepareKeysForCellProfileCmd() {
        super("prepareKeysForCellProfile")
    }

    /**
     * Specifies the fully qualified profile path for the DeploymentManager, e.g., c:/WebSphere/AppServer/profiles/Dmgr01.
     */
    def 'dmgrProfileRoot'(String value) {
        parameter("dmgrProfileRoot", value)
    }

    /**
     * Specifies the fully qualified profile path for the Node, e.g., c:/WebSphere/AppServer/profiles/AppSrv01.
     */
    def 'nodeProfileRoot'(String value) {
        parameter("nodeProfileRoot", value)
    }

    /**
     * Specifies the name of the cell as it appears in the repository root, e.g., /config/cells/<cellname>.
     */
    def 'cellName'(String value) {
        parameter("cellName", value)
    }

    /**
     * Specifies the node name as it appears in the repository, e.g., /config/cells/<cellname>/nodes/<nodename>.
     */
    def 'nodeName'(String value) {
        parameter("nodeName", value)
    }

    /**
     * Distinguished  name (DN) to be given to the servers default certificate.
     */
    def 'defaultCertDN'(String value) {
        parameter("defaultCertDN", value)
    }

    /**
     * he number of years default the certificate will be valid.
     */
    def 'defaultCertValidityPeriod'(String value) {
        parameter("defaultCertValidityPeriod", value)
    }

    /**
     * The path to the key store where the servers default certificate will be imported from.
     */
    def 'importDefaultCertKS'(String value) {
        parameter("importDefaultCertKS", value)
    }

    /**
     * The type of the key store containing the default certificate.
     */
    def 'importDefaultCertKSType'(String value) {
        parameter("importDefaultCertKSType", value)
    }

    /**
     * The password of the key store containing the default certificate.
     */
    def 'importDefaultCertKSPassword'(String value) {
        parameter("importDefaultCertKSPassword", value)
    }

    /**
     * Alias of certificate to use as the default certificate
     */
    def 'importDefaultCertAlias'(String value) {
        parameter("importDefaultCertAlias", value)
    }

    /**
     * Distinguished name (DN) to be given to the server root certificate.
     */
    def 'rootCertDN'(String value) {
        parameter("rootCertDN", value)
    }

    /**
     * The number of years root the certificate will be valid.
     */
    def 'rootCertValidityPeriod'(String value) {
        parameter("rootCertValidityPeriod", value)
    }

    /**
     * Specifies the path to the key store file where the root certificate will be imported from.
     */
    def 'importRootCertKS'(String value) {
        parameter("importRootCertKS", value)
    }

    /**
     * Specifies the type of the key store file containing the root certificate.
     */
    def 'importRootCertKSType'(String value) {
        parameter("importRootCertKSType", value)
    }

    /**
     * Specifies the password of the key store file containing the root certificate.
     */
    def 'importRootCertKSPassword'(String value) {
        parameter("importRootCertKSPassword", value)
    }

    /**
     * Specifies the alias of the certificate to import and use as the default certificate.
     */
    def 'importRootCertAlias'(String value) {
        parameter("importRootCertAlias", value)
    }

    /**
     * Specifies the password to use as the default password for each key store created during profile creation.
     */
    def 'keyStorePassword'(String value) {
        parameter("keyStorePassword", value)
    }

    /**
     * skipLTPADesc
     */
    def 'skipLTPAKeys'(Boolean value) {
        parameter("skipLTPAKeys", value)
    }

    /**
     * Specify true to regenerate certificates for the profile.
     */
    def 'regenCerts'(Boolean value) {
        parameter("regenCerts", value)
    }

}
