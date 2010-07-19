/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/cache/public/nsICacheVisitor.idl
 */

package org.mozilla.interfaces;

public interface nsICacheEntryInfo extends nsISupports {

  String NS_ICACHEENTRYINFO_IID =
    "{fab51c92-95c3-4468-b317-7de4d7588254}";

  /**
     * Get the client id associated with this cache entry.
     */
  String getClientID();

  /**
     * Get the id for the device that stores this cache entry.
     */
  String getDeviceID();

  /**
     * Get the key identifying the cache entry.
     */
  String getKey();

  /**
     * Get the number of times the cache entry has been opened.
     */
  int getFetchCount();

  /**
     * Get the last time the cache entry was opened (in seconds since the Epoch).
     */
  long getLastFetched();

  /**
     * Get the last time the cache entry was modified (in seconds since the Epoch).
     */
  long getLastModified();

  /**
     * Get the expiration time of the cache entry (in seconds since the Epoch).
     */
  long getExpirationTime();

  /**
     * Get the cache entry data size.
     */
  long getDataSize();

  /**
     * Find out whether or not the cache entry is stream based.
     */
  boolean isStreamBased();

}