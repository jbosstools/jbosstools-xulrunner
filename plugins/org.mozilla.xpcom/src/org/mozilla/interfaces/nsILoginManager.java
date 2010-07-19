/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/passwordmgr/public/nsILoginManager.idl
 */

package org.mozilla.interfaces;

public interface nsILoginManager extends nsISupports {

  String NS_ILOGINMANAGER_IID =
    "{30534ff7-fb95-45c5-8336-5448638f2aa1}";

  /**
     * Store a new login in the login manager.
     *
     * @param aLogin
     *        The login to be added.
     *
     * Default values for the login's nsILoginMetaInfo properties will be
     * created. However, if the caller specifies non-default values, they will
     * be used instead.
     */
  void addLogin(nsILoginInfo aLogin);

  /**
     * Remove a login from the login manager.
     *
     * @param aLogin
     *        The login to be removed.
     *
     * The specified login must exactly match a stored login. However, the
     * values of any nsILoginMetaInfo properties are ignored.
     */
  void removeLogin(nsILoginInfo aLogin);

  /**
     * Modify an existing login in the login manager.
     *
     * @param oldLogin
     *        The login to be modified.
     * @param newLoginData
     *        The new login values (either a nsILoginInfo or nsIProperyBag)
     *
     * If newLoginData is a nsILoginInfo, all of the old login's nsILoginInfo
     * properties are changed to the values from newLoginData (but the old
     * login's nsILoginMetaInfo properties are unmodified).
     *
     * If newLoginData is a nsIPropertyBag, only the specified properties
     * will be changed. The nsILoginMetaInfo properties of oldLogin can be
     * changed in this manner.
     */
  void modifyLogin(nsILoginInfo oldLogin, nsISupports newLoginData);

  /**
     * Remove all logins known to login manager.
     *
     * The browser sanitization feature allows the user to clear any stored
     * passwords. This interface allows that to be done without getting each
     * login first (which might require knowing the master password).
     *
     */
  void removeAllLogins();

  /**
     * Fetch all logins in the login manager. An array is always returned;
     * if there are no logins the array is empty.
     *
     * @param count
     *        The number of elements in the array. JS callers can simply use
     *        the array's .length property, and supply an dummy object for
     *        this out param. For example: |getAllLogins({})|
     * @param logins
     *        An array of nsILoginInfo objects. 
     *
     * NOTE: This can be called from JS as:
     *       var logins = pwmgr.getAllLogins({});
     *       (|logins| is an array).
     */
  nsILoginInfo[] getAllLogins(long[] count);

  /**
     * Obtain a list of all hosts for which password saving is disabled.
     *
     * @param count
     *        The number of elements in the array. JS callers can simply use
     *        the array's .length property, and supply an dummy object for
     *        this out param. For example: |getAllDisabledHosts({})|
     * @param hostnames
     *        An array of hostname strings, in origin URL format without a
     *        pathname. For example: "https://www.site.com".
     *
     * NOTE: This can be called from JS as:
     *       var logins = pwmgr.getDisabledAllLogins({});
     */
  String[] getAllDisabledHosts(long[] count);

  /**
     * Check to see if saving logins has been disabled for a host.
     *
     * @param aHost
     *        The hostname to check. This argument should be in the origin
     *        URL format, without a pathname. For example: "http://foo.com".
     */
  boolean getLoginSavingEnabled(String aHost);

  /**
     * Disable (or enable) storing logins for the specified host. When
     * disabled, the login manager will not prompt to store logins for
     * that host. Existing logins are not affected.
     *
     * @param aHost
     *        The hostname to set. This argument should be in the origin
     *        URL format, without a pathname. For example: "http://foo.com".
     * @param isEnabled
     *        Specify if saving logins should be enabled (true) or
     *        disabled (false)
     */
  void setLoginSavingEnabled(String aHost, boolean isEnabled);

  /**
     * Search for logins matching the specified criteria. Called when looking
     * for logins that might be applicable to a form or authentication request.
     *
     * @param count
     *        The number of elements in the array. JS callers can simply use
     *        the array's .length property, and supply an dummy object for
     *        this out param. For example: |findLogins({}, hostname, ...)|
     * @param aHostname
     *        The hostname to restrict searches to, in URL format. For
     *        example: "http://www.site.com".
     * @param aActionURL
     *        For form logins, this argument should be the URL to which the
     *        form will be submitted. For protocol logins, specify null.
     * @param aHttpRealm
     *        For protocol logins, this argument should be the HTTP Realm
     *        for which the login applies. This is obtained from the
     *        WWW-Authenticate header. See RFC2617. For form logins,
     *        specify null.
     * @param logins
     *        An array of nsILoginInfo objects. 
     *
     * NOTE: This can be called from JS as:
     *       var logins = pwmgr.findLogins({}, hostname, ...);
     *
     */
  nsILoginInfo[] findLogins(long[] count, String aHostname, String aActionURL, String aHttpRealm);

  /**
    * Search for logins matching the specified criteria, as with
    * findLogins(). This interface only returns the number of matching
    * logins (and not the logins themselves), which allows a caller to
    * check for logins without causing the user to be prompted for a master
    * password to decrypt the logins.
    *
    * @param aHostname
    *        The hostname to restrict searches to. Specify an empty string
    *        to match all hosts. A null value will not match any logins, and
    *        will thus always return a count of 0.
    * @param aActionURL
    *        The URL to which a form login will be submitted. To match any
    *        form login, specify an empty string. To not match any form
    *        login, specify null.
    * @param aHttpRealm
    *        The HTTP Realm for which the login applies. To match logins for
    *        any realm, specify an empty string. To not match logins for any
    *        realm, specify null.
    */
  long countLogins(String aHostname, String aActionURL, String aHttpRealm);

  /**
     * Generate results for a userfield autocomplete menu.
     *
     * NOTE: This interface is provided for use only by the FormFillController,
     *       which calls it directly. This isn't really ideal, it should
     *       probably be callback registered through the FFC.
     */
  nsIAutoCompleteResult autoCompleteSearch(String aSearchString, nsIAutoCompleteResult aPreviousResult, nsIDOMHTMLInputElement aElement);

  /**
     * Fill a form with login information if we have it. This method will fill
     * aForm regardless of the signon.autofillForms preference.
     *
     * @param aForm
     *        The form to fill
     * @return Success of attempt fill form
     */
  boolean fillForm(nsIDOMHTMLFormElement aForm);

  /**
     * Search for logins in the login manager. An array is always returned;
     * if there are no logins the array is empty.
     *
     * @param count
     *        The number of elements in the array. JS callers can simply use
     *        the array's .length property, and supply an dummy object for
     *        this out param. For example: |searchLogins({}, matchData)|
     * @param matchData
     *        The data used to search. This does not follow the same
     *        requirements as findLogins for those fields. Wildcard matches are
     *        simply not specified.
     * @param logins
     *        An array of nsILoginInfo objects.
     *
     * NOTE: This can be called from JS as:
     *       var logins = pwmgr.searchLogins({}, matchData);
     *       (|logins| is an array).
     */
  nsILoginInfo[] searchLogins(long[] count, nsIPropertyBag matchData);

}