/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/passwordmgr/public/nsILoginInfo.idl
 */

package org.mozilla.interfaces;

/**
 * An object containing information for a login stored by the
 * password manager.
 */
public interface nsILoginInfo extends nsISupports {

  String NS_ILOGININFO_IID =
    "{c41b7dff-6b9b-42fe-b78d-113051facb05}";

  /**
     * The hostname the login applies to.
     *
     * The hostname should be formatted as an URL. For example,
     * "https://site.com", "http://site.com:1234", "ftp://ftp.site.com".
     */
  String getHostname();

  /**
     * The hostname the login applies to.
     *
     * The hostname should be formatted as an URL. For example,
     * "https://site.com", "http://site.com:1234", "ftp://ftp.site.com".
     */
  void setHostname(String aHostname);

  /**
     * The URL a form-based login was submitted to.
     *
     * For logins obtained from HTML forms, this field is the |action|
     * attribute from the |form| element, with the path removed. For
     * example "http://www.site.com". [Forms with no |action| attribute
     * default to submitting to their origin URL, so we store that.]
     *
     * For logins obtained from a HTTP or FTP protocol authentication,
     * this field is NULL.
     */
  String getFormSubmitURL();

  /**
     * The URL a form-based login was submitted to.
     *
     * For logins obtained from HTML forms, this field is the |action|
     * attribute from the |form| element, with the path removed. For
     * example "http://www.site.com". [Forms with no |action| attribute
     * default to submitting to their origin URL, so we store that.]
     *
     * For logins obtained from a HTTP or FTP protocol authentication,
     * this field is NULL.
     */
  void setFormSubmitURL(String aFormSubmitURL);

  /**
     * The HTTP Realm a login was requested for.
     *
     * When an HTTP server sends a 401 result, the WWW-Authenticate
     * header includes a realm to identify the "protection space." See
     * RFC2617. If the response sent has a missing or blank realm, the
     * hostname is used instead.
     *
     * For logins obtained from HTML forms, this field is NULL.
     */
  String getHttpRealm();

  /**
     * The HTTP Realm a login was requested for.
     *
     * When an HTTP server sends a 401 result, the WWW-Authenticate
     * header includes a realm to identify the "protection space." See
     * RFC2617. If the response sent has a missing or blank realm, the
     * hostname is used instead.
     *
     * For logins obtained from HTML forms, this field is NULL.
     */
  void setHttpRealm(String aHttpRealm);

  /**
     * The username for the login.
     */
  String getUsername();

  /**
     * The username for the login.
     */
  void setUsername(String aUsername);

  /**
     * The |name| attribute for the username input field.
     *
     * For logins obtained from a HTTP or FTP protocol authentication,
     * this field is an empty string.
     */
  String getUsernameField();

  /**
     * The |name| attribute for the username input field.
     *
     * For logins obtained from a HTTP or FTP protocol authentication,
     * this field is an empty string.
     */
  void setUsernameField(String aUsernameField);

  /**
     * The password for the login.
     */
  String getPassword();

  /**
     * The password for the login.
     */
  void setPassword(String aPassword);

  /**
     * The |name| attribute for the password input field.
     *
     * For logins obtained from a HTTP or FTP protocol authentication,
     * this field is an empty string.
     */
  String getPasswordField();

  /**
     * The |name| attribute for the password input field.
     *
     * For logins obtained from a HTTP or FTP protocol authentication,
     * this field is an empty string.
     */
  void setPasswordField(String aPasswordField);

  /**
     * Initialize a newly created nsLoginInfo object.
     *
     * The arguments are the fields for the new object.
     */
  void init(String aHostname, String aFormSubmitURL, String aHttpRealm, String aUsername, String aPassword, String aUsernameField, String aPasswordField);

  /**
     * Test for strict equality with another nsILoginInfo object.
     *
     * @param aLoginInfo
     *        The other object to test.
     */
  boolean _equals(nsILoginInfo aLoginInfo);

  /**
     * Test for loose equivalency with another nsILoginInfo object. The
     * passwordField and usernameField values are ignored, and the password
     * values may be optionally ignored. If one login's formSubmitURL is an
     * empty string (but not null), it will be treated as a wildcard. [The
     * blank value indicates the login was stored before bug 360493 was fixed.]
     *
     * @param aLoginInfo
     *        The other object to test.
     * @param ignorePassword
     *        If true, ignore the password when checking for match.
     */
  boolean matches(nsILoginInfo aLoginInfo, boolean ignorePassword);

  /**
     * Create an identical copy of the login, duplicating all of the login's
     * nsILoginInfo and nsILoginMetaInfo properties.
     *
     * This allows code to be forwards-compatible, when additional properties
     * are added to nsILoginMetaInfo (or nsILoginInfo) in the future.
     */
  nsILoginInfo _clone();

}