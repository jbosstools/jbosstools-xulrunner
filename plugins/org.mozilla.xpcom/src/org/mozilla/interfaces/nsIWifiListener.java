/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/wifi/public/nsIWifiListener.idl
 */

package org.mozilla.interfaces;

public interface nsIWifiListener extends nsISupports {

  String NS_IWIFILISTENER_IID =
    "{bcd4bede-f4a5-4a62-9071-d7a60174e376}";

  void onChange(nsIWifiAccessPoint[] accessPoints, long aLen);

  void onError(int error);

}