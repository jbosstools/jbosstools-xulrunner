/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/cache/public/nsICacheService.idl
 */

package org.mozilla.interfaces;

public interface nsICacheService extends nsISupports {

  String NS_ICACHESERVICE_IID =
    "{de114eb4-29fc-4959-b2f7-2d03eb9bc771}";

  /**
     * Create a cache session
     *
     * A cache session represents a client's access into the cache.  The cache
     * session is not "owned" by the cache service.  Hence, it is possible to
     * create duplicate cache sessions.  Entries created by a cache session
     * are invisible to other cache sessions, unless the cache sessions are
     * equivalent.
     *
     * @param clientID - Specifies the name of the client using the cache.
     * @param storagePolicy - Limits the storage policy for all entries
     *   accessed via the returned session.  As a result, devices excluded
     *   by the storage policy will not be searched when opening entries
     *   from the returned session.
     * @param streamBased - Indicates whether or not the data being cached
     *   can be represented as a stream.  The storagePolicy must be 
     *   consistent with the value of this field.  For example, a non-stream-
     *   based cache entry can only have a storage policy of STORE_IN_MEMORY.
     * @return new cache session.
     */
  nsICacheSession createSession(String clientID, int storagePolicy, boolean streamBased);

  /**
     * Visit entries stored in the cache.  Used to implement about:cache.
     */
  void visitEntries(nsICacheVisitor visitor);

  /**
     * Evicts all entries in all devices implied by the storage policy.
     */
  void evictEntries(int storagePolicy);

}