/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/cache/public/nsICacheVisitor.idl
 */

package org.mozilla.interfaces;

public interface nsICacheDeviceInfo extends nsISupports {

  String NS_ICACHEDEVICEINFO_IID =
    "{31d1c294-1dd2-11b2-be3a-c79230dca297}";

  /**
     * Get a human readable description of the cache device.
     */
  String getDescription();

  /**
     * Get a usage report, statistics, miscellaneous data about
     * the cache device.
     */
  String getUsageReport();

  /**
     * Get the number of stored cache entries.
     */
  long getEntryCount();

  /**
     * Get the total size of the stored cache entries.
     */
  long getTotalSize();

  /**
     * Get the upper limit of the size of the data the cache can store.
     */
  long getMaximumSize();

}