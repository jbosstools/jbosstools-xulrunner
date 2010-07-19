/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/cache/public/nsICacheListener.idl
 */

package org.mozilla.interfaces;

public interface nsICacheListener extends nsISupports {

  String NS_ICACHELISTENER_IID =
    "{638c3848-778b-4851-8ff3-9400f65b8773}";

  /**
     * Called when the requested access (or appropriate subset) is
     * acquired.  The status parameter equals NS_OK on success.
     * See nsICacheService.idl for accessGranted values.
     */
  void onCacheEntryAvailable(nsICacheEntryDescriptor descriptor, int accessGranted, long status);

}