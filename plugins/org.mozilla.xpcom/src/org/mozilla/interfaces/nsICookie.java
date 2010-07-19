/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/cookie/public/nsICookie.idl
 */

package org.mozilla.interfaces;

public interface nsICookie extends nsISupports {

  String NS_ICOOKIE_IID =
    "{e9fcb9a4-d376-458f-b720-e65e7df593bc}";

  /**
     * the name of the cookie
     */
  String getName();

  /**
     * the cookie value
     */
  String getValue();

  /**
     * true if the cookie is a domain cookie, false otherwise
     */
  boolean getIsDomain();

  /**
     * the host (possibly fully qualified) of the cookie
     */
  String getHost();

  /**
     * the path pertaining to the cookie
     */
  String getPath();

  /**
     * true if the cookie was transmitted over ssl, false otherwise
     */
  boolean getIsSecure();

  /**
     * @DEPRECATED use nsICookie2.expiry and nsICookie2.isSession instead.
     *
     * expiration time in seconds since midnight (00:00:00), January 1, 1970 UTC.
     * expires = 0 represents a session cookie.
     * expires = 1 represents an expiration time earlier than Jan 1, 1970.
     */
  double getExpires();

  /**
     * @DEPRECATED status implementation will return STATUS_UNKNOWN in all cases.
     */
  int STATUS_UNKNOWN = 0;

  int STATUS_ACCEPTED = 1;

  int STATUS_DOWNGRADED = 2;

  int STATUS_FLAGGED = 3;

  int STATUS_REJECTED = 4;

  int getStatus();

  /**
     * @DEPRECATED policy implementation will return POLICY_UNKNOWN in all cases.
     */
  int POLICY_UNKNOWN = 0;

  int POLICY_NONE = 1;

  int POLICY_NO_CONSENT = 2;

  int POLICY_IMPLICIT_CONSENT = 3;

  int POLICY_EXPLICIT_CONSENT = 4;

  int POLICY_NO_II = 5;

  int getPolicy();

}