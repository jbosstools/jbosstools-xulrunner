/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/wifi/public/nsIWifiMonitor.idl
 */

package org.mozilla.interfaces;

public interface nsIWifiMonitor extends nsISupports {

  String NS_IWIFIMONITOR_IID =
    "{f289701e-d9af-4685-bc2f-e4226ff7c018}";

  void startWatching(nsIWifiListener aListener);

  void stopWatching(nsIWifiListener aListener);

}