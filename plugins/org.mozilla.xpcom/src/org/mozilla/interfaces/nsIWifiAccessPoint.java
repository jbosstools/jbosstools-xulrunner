/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/wifi/public/nsIWifiAccessPoint.idl
 */

package org.mozilla.interfaces;

public interface nsIWifiAccessPoint extends nsISupports {

  String NS_IWIFIACCESSPOINT_IID =
    "{e28e614f-8f86-44ff-bcf5-5f18225834a0}";

  String getMac();

  String getSsid();

  String getRawSSID();

  int getSignal();

}