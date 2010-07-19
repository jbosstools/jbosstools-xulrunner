/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/caps/idl/nsIScriptSecurityManager.idl
 */

package org.mozilla.interfaces;

public interface nsIScriptSecurityManager extends nsIXPCSecurityManager {

  String NS_ISCRIPTSECURITYMANAGER_IID =
    "{f8e350b9-9f31-451a-8c8f-d10fea26b780}";

  /**
     * Default CheckLoadURI permissions
     */
  long STANDARD = 0L;

  long LOAD_IS_AUTOMATIC_DOCUMENT_REPLACEMENT = 1L;

  long ALLOW_CHROME = 2L;

  long DISALLOW_INHERIT_PRINCIPAL = 4L;

  long DISALLOW_SCRIPT_OR_DATA = 4L;

  long DISALLOW_SCRIPT = 8L;

  /**
     * Check that content with principal aPrincipal can load "uri".
     *
     * Will return error code NS_ERROR_DOM_BAD_URI if the load request 
     * should be denied.
     *
     * @param aPrincipal the principal identifying the actor causing the load
     * @param uri the URI that is being loaded
     * @param flags the permission set, see above
     */
  void checkLoadURIWithPrincipal(nsIPrincipal aPrincipal, nsIURI uri, long flags);

  /**
     * Check that content from "from" can load "uri".
     *
     * Will return error code NS_ERROR_DOM_BAD_URI if the load request 
     * should be denied.
     *
     * @param from the URI causing the load
     * @param uri the URI that is being loaded
     * @param flags the permission set, see above
     *
     * @deprecated Use checkLoadURIWithPrincipal instead of this function.
     */
  void checkLoadURI(nsIURI from, nsIURI uri, long flags);

  /**
     * Similar to checkLoadURIWithPrincipal but there are two differences:
     *
     * 1) The URI is a string, not a URI object.
     * 2) This function assumes that the URI may still be subject to fixup (and
     * hence will check whether fixed-up versions of the URI are allowed to
     * load as well); if any of the versions of this URI is not allowed, this
     * function will return error code NS_ERROR_DOM_BAD_URI.
     */
  void checkLoadURIStrWithPrincipal(nsIPrincipal aPrincipal, String uri, long flags);

  /**
     * Same as CheckLoadURI but takes string arguments for ease of use
     * by scripts
     *
     * @deprecated Use checkLoadURIStrWithPrincipal instead of this function.
     */
  void checkLoadURIStr(String from, String uri, long flags);

  /**
     * Return a principal that has the same origin as aURI.
     */
  nsIPrincipal getCodebasePrincipal(nsIURI aURI);

  /**
     * Return true if the currently executing script has 'capability' enabled.
     */
  boolean isCapabilityEnabled(String capability);

  /**
     * Enable 'capability' in the innermost frame of the currently executing
     * script.
     */
  void enableCapability(String capability);

  /**
     * Remove 'capability' from the innermost frame of the currently
     * executing script. Any setting of 'capability' from enclosing
     * frames thus comes into effect.
     */
  void revertCapability(String capability);

  /**
     * Disable 'capability' in the innermost frame of the currently executing
     * script.
     */
  void disableCapability(String capability);

  /**
     * Allow 'certificateID' to enable 'capability.' Can only be performed
     * by code signed by the system certificate.
     */
  void setCanEnableCapability(String certificateFingerprint, String capability, short canEnable);

  /**
     * Returns OK if aSourceURI and target have the same "origin"
     * (scheme, host, and port).
     * ReportError flag suppresses error reports for functions that
     * don't need reporting.
     */
  void checkSameOriginURI(nsIURI aSourceURI, nsIURI aTargetURI, boolean reportError);

  /**
     * Get the principal for the given channel.  This will typically be the
     * channel owner if there is one, and the codebase principal for the
     * channel's URI otherwise.  aChannel must not be null.
     */
  nsIPrincipal getChannelPrincipal(nsIChannel aChannel);

  /**
     * Check whether a given principal is a system principal.  This allows us
     * to avoid handing back the system principal to script while allowing
     * script to check whether a given principal is system.
     */
  boolean isSystemPrincipal(nsIPrincipal aPrincipal);

}