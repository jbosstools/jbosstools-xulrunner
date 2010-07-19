/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIIOService2.idl
 */

package org.mozilla.interfaces;

/**
 * nsIIOService2 extends nsIIOService with support for automatic
 * online/offline management.
 */
public interface nsIIOService2 extends nsIIOService {

  String NS_IIOSERVICE2_IID =
    "{d44fe6d4-ee35-4789-886a-eb8f0554d04e}";

  /**
   * While this is set, IOService will monitor an nsINetworkLinkService
   * (if available) and set its offline status to "true" whenever
   * isLinkUp is false.
   *
   * Applications that want to control changes to the IOService's offline
   * status should set this to false, watch for network:link-status-changed
   * broadcasts, and change nsIIOService::offline as they see fit. Note
   * that this means during application startup, IOService may be offline
   * if there is no link, until application code runs and can turn off
   * this management.
   */
  boolean getManageOfflineStatus();

  /**
   * While this is set, IOService will monitor an nsINetworkLinkService
   * (if available) and set its offline status to "true" whenever
   * isLinkUp is false.
   *
   * Applications that want to control changes to the IOService's offline
   * status should set this to false, watch for network:link-status-changed
   * broadcasts, and change nsIIOService::offline as they see fit. Note
   * that this means during application startup, IOService may be offline
   * if there is no link, until application code runs and can turn off
   * this management.
   */
  void setManageOfflineStatus(boolean aManageOfflineStatus);

}