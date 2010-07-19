/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/cache/public/nsICacheVisitor.idl
 */

package org.mozilla.interfaces;

public interface nsICacheVisitor extends nsISupports {

  String NS_ICACHEVISITOR_IID =
    "{f8c08c4b-d778-49d1-a59b-866fdc500d95}";

  /**
     * Called to provide information about a cache device.
     *
     * @param deviceID - specifies the device being visited.
     * @param deviceInfo - specifies information about this device.
     *
     * @return true to start visiting all entries for this device.
     * @return false to advance to the next device.
     */
  boolean visitDevice(String deviceID, nsICacheDeviceInfo deviceInfo);

  /**
     * Called to provide information about a cache entry.
     *
     * @param deviceID - specifies the device being visited.
     * @param entryInfo - specifies information about this entry.
     * 
     * @return true to visit the next entry on the current device, or if the
     *   end of the device has been reached, advance to the next device.
     * @return false to advance to the next device.
     */
  boolean visitEntry(String deviceID, nsICacheEntryInfo entryInfo);

}