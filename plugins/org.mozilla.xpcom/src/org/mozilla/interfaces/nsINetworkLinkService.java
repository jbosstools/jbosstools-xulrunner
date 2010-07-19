/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsINetworkLinkService.idl
 */

package org.mozilla.interfaces;

/**
 * Network link status monitoring service.
 */
public interface nsINetworkLinkService extends nsISupports {

  String NS_INETWORKLINKSERVICE_IID =
    "{61618a52-ea91-4277-a4ab-ebe10d7b9a64}";

  /**
   * This is set to true when the system is believed to have a usable
   * network connection.
   *
   * The link is only up when network connections can be established. For
   * example, the link is down during DHCP configuration (unless there
   * is another usable interface already configured).
   *
   * If the link status is not currently known, we generally assume that
   * it is up.
   */
  boolean getIsLinkUp();

  /**
   * This is set to true when we believe that isLinkUp is accurate.
   */
  boolean getLinkStatusKnown();

}