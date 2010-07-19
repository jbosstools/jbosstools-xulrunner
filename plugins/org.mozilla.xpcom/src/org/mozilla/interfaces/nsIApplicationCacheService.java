/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIApplicationCacheService.idl
 */

package org.mozilla.interfaces;

/**
 * The application cache service manages the set of application cache
 * groups.
 */
public interface nsIApplicationCacheService extends nsISupports {

  String NS_IAPPLICATIONCACHESERVICE_IID =
    "{611161c8-37d0-450f-a4fe-457c47bbaf64}";

  /**
     * Create a new, empty application cache for the given cache
     * group.
     */
  nsIApplicationCache createApplicationCache(String group);

  /**
     * Get an application cache object for the given client ID.
     */
  nsIApplicationCache getApplicationCache(String clientID);

  /**
     * Get the currently active cache object for a cache group.
     */
  nsIApplicationCache getActiveCache(String group);

  /**
     * Deactivate the currently-active cache object for a cache group.
     */
  void deactivateGroup(String group);

  /**
     * Try to find the best application cache to serve a resource.
     */
  nsIApplicationCache chooseApplicationCache(String key);

  /**
     * Flags the key as being opportunistically cached.
     *
     * This method should also propagate the entry to other
     * application caches with the same opportunistic namespace, but
     * this is not currently implemented.
     *
     * @param cache
     *        The cache in which the entry is cached now.
     * @param key
     *        The cache entry key.
     */
  void cacheOpportunistically(nsIApplicationCache cache, String key);

  /**
     * Get the list of application cache groups.
     */
  String[] getGroups(long[] count);

}