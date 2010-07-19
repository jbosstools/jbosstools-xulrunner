/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIPrivateBrowsingService.idl
 */

package org.mozilla.interfaces;

public interface nsIPrivateBrowsingService extends nsISupports {

  String NS_IPRIVATEBROWSINGSERVICE_IID =
    "{49d6f133-80c0-48c7-876d-0b70bbfd0289}";

  boolean getPrivateBrowsingEnabled();

  void setPrivateBrowsingEnabled(boolean aPrivateBrowsingEnabled);

  boolean getAutoStarted();

  /**
     * Removes all data stored for a given domain.  This includes all data for
     * subdomains of the given domain.
     *
     * @param aDomain
     *        The domain that will have its data removed.
     */
  void removeDataFromDomain(String aDomain);

}