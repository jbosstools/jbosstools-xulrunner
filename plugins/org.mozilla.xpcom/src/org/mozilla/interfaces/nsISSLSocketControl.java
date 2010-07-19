/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/socket/base/nsISSLSocketControl.idl
 */

package org.mozilla.interfaces;

public interface nsISSLSocketControl extends nsISupports {

  String NS_ISSLSOCKETCONTROL_IID =
    "{a092097c-8386-4f1b-97b1-90eb70008c2d}";

  nsIInterfaceRequestor getNotificationCallbacks();

  void setNotificationCallbacks(nsIInterfaceRequestor aNotificationCallbacks);

  void proxyStartSSL();

  void startTLS();

}