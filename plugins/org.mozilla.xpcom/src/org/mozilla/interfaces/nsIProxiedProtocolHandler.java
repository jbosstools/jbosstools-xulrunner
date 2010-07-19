/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIProxiedProtocolHandler.idl
 */

package org.mozilla.interfaces;

public interface nsIProxiedProtocolHandler extends nsIProtocolHandler {

  String NS_IPROXIEDPROTOCOLHANDLER_IID =
    "{0a24fed4-1dd2-11b2-a75c-9f8b9a8f9ba7}";

  /** Create a new channel with the given proxyInfo
     *
     */
  nsIChannel newProxiedChannel(nsIURI uri, nsIProxyInfo proxyInfo);

}