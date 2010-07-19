/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIProtocolProxyService2.idl
 */

package org.mozilla.interfaces;

/**
 * An extension of nsIProtocolProxyService
 */
public interface nsIProtocolProxyService2 extends nsIProtocolProxyService {

  String NS_IPROTOCOLPROXYSERVICE2_IID =
    "{dbd9565d-29b1-437a-bff5-2fc339e2c5df}";

  /**
   * Call this method to cause the PAC file (if any is configured) to be
   * reloaded.  The PAC file is loaded asynchronously.
   */
  void reloadPAC();

}