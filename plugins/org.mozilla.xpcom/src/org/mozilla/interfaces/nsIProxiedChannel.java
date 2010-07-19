/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIProxiedChannel.idl
 */

package org.mozilla.interfaces;

/**
 * An interface for accessing the proxy info that a channel was
 * constructed with.
 *
 * @see nsIProxiedProtocolHandler
 */
public interface nsIProxiedChannel extends nsISupports {

  String NS_IPROXIEDCHANNEL_IID =
    "{6238f134-8c3f-4354-958f-dfd9d54a4446}";

  /**
   * Gets the proxy info the channel was constructed with. null or a
   * proxyInfo with type "direct" mean no proxy.
   *
   * The returned proxy info must not be modified.
   */
  nsIProxyInfo getProxyInfo();

}