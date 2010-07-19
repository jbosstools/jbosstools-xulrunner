/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/cache/public/nsICacheSession.idl
 */

package org.mozilla.interfaces;

public interface nsICacheSession extends nsISupports {

  String NS_ICACHESESSION_IID =
    "{ae9e84b5-3e2d-457e-8fcd-5bbd2a8b832e}";

  /**
     * Expired entries will be doomed or evicted if this attribute is set to
     * true.  If false, expired entries will be returned (useful for offline-
     * mode and clients, such as HTTP, that can update the valid lifetime of
     * cached content).  This attribute defaults to true.
     */
  boolean getDoomEntriesIfExpired();

  /**
     * Expired entries will be doomed or evicted if this attribute is set to
     * true.  If false, expired entries will be returned (useful for offline-
     * mode and clients, such as HTTP, that can update the valid lifetime of
     * cached content).  This attribute defaults to true.
     */
  void setDoomEntriesIfExpired(boolean aDoomEntriesIfExpired);

  /**
     * A cache session can only give out one descriptor with WRITE access
     * to a given cache entry at a time.  Until the client calls MarkValid on
     * its descriptor, other attempts to open the same cache entry will block.
     */
/**
     * Synchronous cache access.  This returns a unique descriptor each
     * time it is called, even if the same key is specified.  When
     * called by multiple threads for write access, only one writable
     * descriptor will be granted.  If 'blockingMode' is set to false, it will
     * return NS_ERROR_CACHE_WAIT_FOR_VALIDATION rather than block when another
     * descriptor has been given WRITE access but hasn't validated the entry yet.
     */
  nsICacheEntryDescriptor openCacheEntry(String key, int accessRequested, boolean blockingMode);

  /**
     * Asynchronous cache access. Does not block the calling thread.
     * Instead, the listener will be notified when the descriptor is
     * available.
     */
  void asyncOpenCacheEntry(String key, int accessRequested, nsICacheListener listener);

  /**
     * Evict all entries for this session's clientID according to its storagePolicy.
     */
  void evictEntries();

  /**
     * Return whether any of the cache devices implied by the session storage policy
     * are currently enabled for instantiation if they don't already exist.
     */
  boolean isStorageEnabled();

}