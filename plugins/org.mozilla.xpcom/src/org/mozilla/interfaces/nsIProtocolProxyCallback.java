/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIProtocolProxyCallback.idl
 */

package org.mozilla.interfaces;

/**
 * This interface serves as a closure for nsIProtocolProxyService's
 * asyncResolve method.
 *
 * @status UNDER_REVIEW
 */
public interface nsIProtocolProxyCallback extends nsISupports {

  String NS_IPROTOCOLPROXYCALLBACK_IID =
    "{a9967200-f95e-45c2-beb3-9b060d874bfd}";

  /**
   * This method is called when proxy info is available or when an error
   * in the proxy resolution occurs.
   *
   * @param aRequest
   *        The value returned from asyncResolve.
   * @param aURI
   *        The URI passed to asyncResolve.
   * @param aProxyInfo
   *        The resulting proxy info or null if there is no associated proxy
   *        info for aURI.  As with the result of nsIProtocolProxyService's
   *        resolve method, a null result implies that a direct connection
   *        should be used.
   * @param aStatus
   *        The status of the callback.  This is a failure code if the request
   *        could not be satisfied, in which case the value of aStatus
   *        indicates the reason for the failure and aProxyInfo will be null.
   */
  void onProxyAvailable(nsICancelable aRequest, nsIURI aURI, nsIProxyInfo aProxyInfo, long aStatus);

}