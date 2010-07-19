/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/cookie/public/nsICookieManager.idl
 */

package org.mozilla.interfaces;

/** 
 * An optional interface for accessing or removing the cookies
 * that are in the cookie list
 * 
 * @status FROZEN
 */
public interface nsICookieManager extends nsISupports {

  String NS_ICOOKIEMANAGER_IID =
    "{aaab6710-0f2c-11d5-a53b-0010a401eb10}";

  /**
   * Called to remove all cookies from the cookie list
   */
  void removeAll();

  /**
   * Called to enumerate through each cookie in the cookie list.
   * The objects enumerated over are of type nsICookie
   */
  nsISimpleEnumerator getEnumerator();

  /**
   * Called to remove an individual cookie from the cookie list
   *
   * @param aDomain The host or domain for which the cookie was set
   * @param aName The name specified in the cookie
   * @param aPath The path for which the cookie was set
   * @param aBlocked Indicates if cookies from this host should be permanently blocked
   *
   */
  void remove(String aDomain, String aName, String aPath, boolean aBlocked);

}