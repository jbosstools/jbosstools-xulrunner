/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/socket/base/nsISocketProviderService.idl
 */

package org.mozilla.interfaces;

/**
 * nsISocketProviderService
 *
 * Provides a mapping between a socket type and its associated socket provider
 * instance.  One could also use the service manager directly.
 */
public interface nsISocketProviderService extends nsISupports {

  String NS_ISOCKETPROVIDERSERVICE_IID =
    "{8f8a23d0-5472-11d3-bbc8-0000861d1237}";

  nsISocketProvider getSocketProvider(String socketType);

}