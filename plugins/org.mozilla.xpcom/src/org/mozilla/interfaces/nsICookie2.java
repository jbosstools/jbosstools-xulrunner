/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/cookie/public/nsICookie2.idl
 */

package org.mozilla.interfaces;

/** 
 * Main cookie object interface for use by consumers:
 * extends nsICookie, a frozen interface for external
 * access of cookie objects
 */
public interface nsICookie2 extends nsICookie {

  String NS_ICOOKIE2_IID =
    "{05c420e5-03d0-4c7b-a605-df7ebe5ca326}";

  /**
     * the host (possibly fully qualified) of the cookie,
     * without a leading dot to represent if it is a
     * domain cookie.
     */
  String getRawHost();

  /**
     * true if the cookie is a session cookie.
     * note that expiry time will also be honored
     * for session cookies (see below); thus, whichever is
     * the more restrictive of the two will take effect.
     */
  boolean getIsSession();

  /**
     * the actual expiry time of the cookie, in seconds
     * since midnight (00:00:00), January 1, 1970 UTC.
     *
     * this is distinct from nsICookie::expires, which
     * has different and obsolete semantics.
     */
  long getExpiry();

  /**
     * true if the cookie is an http only cookie
     */
  boolean getIsHttpOnly();

  /**
     * the creation time of the cookie, in microseconds
     * since midnight (00:00:00), January 1, 1970 UTC.
     */
  long getCreationTime();

  /**
     * the last time the cookie was accessed (i.e. created,
     * modified, or read by the server), in microseconds
     * since midnight (00:00:00), January 1, 1970 UTC.
     *
     * note that this time may be approximate.
     */
  long getLastAccessed();

}