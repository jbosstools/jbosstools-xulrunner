/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/socket/base/nsISocketProvider.idl
 */

package org.mozilla.interfaces;

/**
 * nsISocketProvider
 */
public interface nsISocketProvider extends nsISupports {

  String NS_ISOCKETPROVIDER_IID =
    "{00b3df92-e830-11d8-d48e-0004e22243f8}";

  /**
     * PROXY_RESOLVES_HOST
     *
     * This flag is set if the proxy is to perform hostname resolution instead
     * of the client.  When set, the hostname parameter passed when in this
     * interface will be used instead of the address structure passed for a
     * later connect et al. request.
     */
  int PROXY_RESOLVES_HOST = 1;

  /**
     * When setting this flag, the socket will not apply any
     * credentials when establishing a connection. For example,
     * an SSL connection would not send any client-certificates
     * if this flag is set.
     */
  int ANONYMOUS_CONNECT = 2;

}