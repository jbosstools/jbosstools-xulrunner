/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/cookie/public/nsICookiePermission.idl
 */

package org.mozilla.interfaces;

/**
 * An interface to test for cookie permissions
 */
public interface nsICookiePermission extends nsISupports {

  String NS_ICOOKIEPERMISSION_IID =
    "{4b1a775d-f6d3-4389-be2e-9dfbaf2ab47b}";

  /**
   * nsCookieAccess values
   */
  int ACCESS_DEFAULT = 0;

  int ACCESS_ALLOW = 1;

  int ACCESS_DENY = 2;

  /**
   * additional values for nsCookieAccess, which are not directly used by
   * any methods on this interface, but are nevertheless convenient to define
   * here. these may be relocated somewhere else if we ever consider freezing
   * this interface.
   */
  int ACCESS_SESSION = 8;

  /**
   * setAccess
   *
   * this method is called to block cookie access for the given URI.  this
   * may result in other URIs being blocked as well (e.g., URIs which share
   * the same host name).
   *
   * @param aURI
   *        the URI to block
   * @param aAccess
   *        the new cookie access for the URI.
   */
  void setAccess(nsIURI aURI, int aAccess);

  /**
   * canAccess
   *
   * this method is called to test whether or not the given URI/channel may
   * access the cookie database, either to set or get cookies.
   *
   * @param aURI
   *        the URI trying to access cookies
   * @param aChannel
   *        the channel corresponding to aURI
   *
   * @return one of the following nsCookieAccess values:
   *         ACCESS_DEFAULT, ACCESS_ALLOW, or ACCESS_DENY
   */
  int canAccess(nsIURI aURI, nsIChannel aChannel);

  /**
   * canSetCookie
   *
   * this method is called to test whether or not the given URI/channel may
   * set a specific cookie.  this method is always preceded by a call to
   * canAccess. it may modify the isSession and expiry attributes of the
   * cookie via the aIsSession and aExpiry parameters, in order to limit
   * or extend the lifetime of the cookie. this is useful, for instance, to
   * downgrade a cookie to session-only if it fails to meet certain criteria.
   *
   * @param aURI
   *        the URI trying to set the cookie
   * @param aChannel
   *        the channel corresponding to aURI
   * @param aCookie
   *        the cookie being added to the cookie database
   * @param aIsSession
   *        when canSetCookie is invoked, this is the current isSession attribute
   *        of the cookie. canSetCookie may leave this value unchanged to
   *        preserve this attribute of the cookie.
   * @param aExpiry
   *        when canSetCookie is invoked, this is the current expiry time of
   *        the cookie. canSetCookie may leave this value unchanged to
   *        preserve this attribute of the cookie.
   *
   * @return true if the cookie can be set.
   */
  boolean canSetCookie(nsIURI aURI, nsIChannel aChannel, nsICookie2 aCookie, boolean[] aIsSession, long[] aExpiry);

  /**
   * getOriginatingURI
   *
   * determines the originating URI for a load given a channel, for third-party
   * cookie blocking. this is done by leveraging the loadgroup of the channel to
   * find the root content docshell, and the URI associated with its principal.
   * if the root content docshell or its principal's URI cannot be obtained,
   * this method will throw.
   *
   * @param aChannel
   *        the channel for the load trying to get or set cookies
   *
   * @return the originating URI.
   */
  nsIURI getOriginatingURI(nsIChannel aChannel);

}