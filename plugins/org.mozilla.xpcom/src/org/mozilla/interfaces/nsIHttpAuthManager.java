/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/protocol/http/public/nsIHttpAuthManager.idl
 */

package org.mozilla.interfaces;

/**
 * nsIHttpAuthManager
 *
 * This service provides access to cached HTTP authentication 
 * user credentials (domain, username, password) for sites
 * visited during the current browser session.
 *
 * This interface exists to provide other HTTP stacks with the
 * ability to share HTTP authentication credentials with Necko.
 * This is currently used by the Java plugin (version 1.5 and
 * higher) to avoid duplicate authentication prompts when the
 * Java client fetches content from a HTTP site that the user
 * has already logged into.
 */
public interface nsIHttpAuthManager extends nsISupports {

  String NS_IHTTPAUTHMANAGER_IID =
    "{7ce8e9d1-8b4b-4883-a307-66fe12a50153}";

  /**
     * Lookup auth identity.
     *
     * @param aScheme
     *        the URL scheme (e.g., "http").  NOTE: for proxy authentication,
     *        this should be "http" (this includes authentication for SSL
     *        tunneling).
     * @param aHost
     *        the host of the server issuing a challenge (ASCII only).
     * @param aPort
     *        the port of the server issuing a challenge.
     * @param aAuthType
     *        optional string identifying auth type used (e.g., "basic")
     * @param aRealm
     *        optional string identifying auth realm.
     * @param aPath
     *        optional string identifying auth path. empty for proxy auth.
     * @param aUserDomain
     *        return value containing user domain.
     * @param aUserName
     *        return value containing user name.
     * @param aUserPassword
     *        return value containing user password.
     */
  void getAuthIdentity(String aScheme, String aHost, int aPort, String aAuthType, String aRealm, String aPath, String[] aUserDomain, String[] aUserName, String[] aUserPassword);

  /**
     * Store auth identity.
     *
     * @param aScheme
     *        the URL scheme (e.g., "http").  NOTE: for proxy authentication,
     *        this should be "http" (this includes authentication for SSL
     *        tunneling).
     * @param aHost
     *        the host of the server issuing a challenge (ASCII only).
     * @param aPort
     *        the port of the server issuing a challenge.
     * @param aAuthType
     *        optional string identifying auth type used (e.g., "basic")
     * @param aRealm
     *        optional string identifying auth realm.
     * @param aPath
     *        optional string identifying auth path. empty for proxy auth.
     * @param aUserDomain
     *        optional string containing user domain.
     * @param aUserName
     *        optional string containing user name.
     * @param aUserPassword
     *        optional string containing user password.
     */
  void setAuthIdentity(String aScheme, String aHost, int aPort, String aAuthType, String aRealm, String aPath, String aUserDomain, String aUserName, String aUserPassword);

  /**
     * Clear all auth cache.
     */
  void clearAll();

}