/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/cookie/public/nsICookieManager2.idl
 */

package org.mozilla.interfaces;

/** 
 * Additions to the frozen nsICookieManager
 */
public interface nsICookieManager2 extends nsICookieManager {

  String NS_ICOOKIEMANAGER2_IID =
    "{d1e9e50f-b78b-4e3b-a474-f3cbca59b013}";

  /**
   * Add a cookie. nsICookieService is the normal way to do this. This
   * method is something of a backdoor.
   *
   * @param aDomain
   *        the host or domain for which the cookie is set. presence of a
   *        leading dot indicates a domain cookie; otherwise, the cookie
   *        is treated as a non-domain cookie. see RFC2109.
   * @param aPath
   *        path within the domain for which the cookie is valid
   * @param aName
   *        cookie name
   * @param aValue
   *        cookie data
   * @param aIsSecure
   *        true if the cookie should only be sent over a secure connection.
   * @param aIsHttpOnly
   *        true if the cookie should only be sent to, and can only be
   *        modified by, an http connection.
   * @param aIsSession
   *        true if the cookie should exist for the current session only.
   *        see aExpiry.
   * @param aExpiry
   *        expiration date, in seconds since midnight (00:00:00), January 1,
   *        1970 UTC. note that expiry time will also be honored for session cookies;
   *        in this way, the more restrictive of the two will take effect.
   */
  void add(String aDomain, String aPath, String aName, String aValue, boolean aIsSecure, boolean aIsHttpOnly, boolean aIsSession, long aExpiry);

  /**
   * Find whether a given cookie already exists.
   *
   * @param aCookie
   *        the cookie to look for
   *
   * @return true if a cookie was found which matches the host, path, and name
   *         fields of aCookie
   */
  boolean cookieExists(nsICookie2 aCookie);

  /**
   * Count how many cookies would be returned to a given host, ignoring the
   * cookie flags isDomain, isSecure, and isHttpOnly. Thus, for a host
   * "weather.yahoo.com", host or domain cookies for "weather.yahoo.com" and
   * "yahoo.com" would be counted, while a cookie for "my.weather.yahoo.com"
   * would not.
   *
   * @param aHost
   *        the host string to look for, e.g. "google.com". this should consist
   *        of only the host portion of a URI, and should not contain a leading
   *        dot, a port, etc.
   *
   * @return the number of cookies found.
   */
  long countCookiesFromHost(String aHost);

  /**
   * Returns an enumerator of cookies that would be returned to a given host,
   * ignoring the cookie flags isDomain, isSecure, and isHttpOnly. Thus, for a
   * host "weather.yahoo.com", host or domain cookies for "weather.yahoo.com"
   * and "yahoo.com" would be returned, while a cookie for "my.weather.yahoo.com"
   * would not.
   *
   * @param aHost
   *        the host string to look for, e.g. "google.com". this should consist
   *        of only the host portion of a URI, and should not contain a leading
   *        dot, a port, etc.
   *
   * @return an nsISimpleEnumerator of nsICookie2 objects.
   *
   * @see countCookiesFromHost
   */
  nsISimpleEnumerator getCookiesFromHost(String aHost);

  /**
   * Import an old-style cookie file. Imported cookies will be added to the
   * existing database. If the database contains any cookies the same as those
   * being imported (i.e. domain, name, and path match), they will be replaced.
   *
   * @param aCookieFile the file to import, usually cookies.txt
   */
  void importCookies(nsIFile aCookieFile);

}