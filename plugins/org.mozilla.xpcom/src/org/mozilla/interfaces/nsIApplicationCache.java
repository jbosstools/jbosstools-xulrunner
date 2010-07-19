/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIApplicationCache.idl
 */

package org.mozilla.interfaces;

/**
 * Application caches store resources for offline use.  Each
 * application cache has a unique client ID for use with
 * nsICacheService::openSession() to access the cache's entries.
 *
 * Each entry in the application cache can be marked with a set of
 * types, as discussed in the WHAT-WG offline applications
 * specification.
 *
 * All application caches with the same group ID belong to a cache
 * group.  Each group has one "active" cache that will service future
 * loads.  Inactive caches will be removed from the cache when they are
 * no longer referenced.
 */
public interface nsIApplicationCache extends nsISupports {

  String NS_IAPPLICATIONCACHE_IID =
    "{663e2e2e-04a0-47b6-87b3-a122be46cb53}";

  /**
     * Entries in an application cache can be marked as one or more of
     * the following types.
     */
  long ITEM_MANIFEST = 1L;

  long ITEM_EXPLICIT = 2L;

  long ITEM_IMPLICIT = 4L;

  long ITEM_DYNAMIC = 8L;

  long ITEM_FOREIGN = 16L;

  long ITEM_FALLBACK = 32L;

  long ITEM_OPPORTUNISTIC = 64L;

  /**
     * The group ID for this cache group.  This is the URI of the
     * manifest file.
     **/
  String getGroupID();

  /**
     * The client ID for this application cache.  Clients can open a
     * session with nsICacheService::createSession() using this client
     * ID and a storage policy of STORE_OFFLINE to access this cache.
     */
  String getClientID();

  /**
     * TRUE if the cache is the active cache for this group.
     */
  boolean getActive();

  /**
     * The disk usage of the application cache, in bytes.
     */
  long getUsage();

  /**
     * Makes this cache the active application cache for this group.
     * Future loads associated with this group will come from this
     * cache.  Other caches from this cache group will be deactivated.
     */
  void activate();

  /**
     * Discard this application cache.  Removes all cached resources
     * for this cache.  If this is the active application cache for the
     * group, the group will be removed.
     */
  void discard();

  /**
     * Adds item types to a given entry.
     */
  void markEntry(String key, long typeBits);

  /**
     * Removes types from a given entry.  If the resulting entry has
     * no types left, the entry is removed.
     */
  void unmarkEntry(String key, long typeBits);

  /**
     * Gets the types for a given entry.
     */
  long getTypes(String key);

  /**
     * Returns any entries in the application cache whose type matches
     * one or more of the bits in typeBits.
     */
  void gatherEntries(long typeBits, long[] count, String[][] keys);

  /**
     * Add a set of namespace entries to the application cache.
     * @param namespaces
     *        An nsIArray of nsIApplicationCacheNamespace entries.
     */
  void addNamespaces(nsIArray namespaces);

  /**
     * Get the most specific namespace matching a given key.
     */
  nsIApplicationCacheNamespace getMatchingNamespace(String key);

}