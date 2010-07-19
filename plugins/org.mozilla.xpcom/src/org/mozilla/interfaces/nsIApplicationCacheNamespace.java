/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIApplicationCache.idl
 */

package org.mozilla.interfaces;

/**
 * Application caches can store a set of namespace entries that affect
 * loads from the application cache.  If a load from the cache fails
 * to match an exact cache entry, namespaces entries will be searched
 * for a substring match, and should be applied appropriately.
 */
public interface nsIApplicationCacheNamespace extends nsISupports {

  String NS_IAPPLICATIONCACHENAMESPACE_IID =
    "{96e4c264-2065-4ce9-93bb-43734c62c4eb}";

  /**
     * Items matching this namespace can be fetched from the network
     * when loading from this cache.  The "data" attribute is unused.
     */
  long NAMESPACE_BYPASS = 1L;

  /**
     * Items matching this namespace can be fetched from the network
     * when loading from this cache.  If the load fails, the cache entry
     * specified by the "data" attribute should be loaded instead.
     */
  long NAMESPACE_FALLBACK = 2L;

  /**
     * Items matching this namespace should be cached
     * opportunistically.  Successful toplevel loads of documents
     * in this namespace should be placed in the application cache.
     * Namespaces specifying NAMESPACE_OPPORTUNISTIC may also specify
     * NAMESPACE_FALLBACK to supply a fallback entry.
     */
  long NAMESPACE_OPPORTUNISTIC = 4L;

  /**
     * Initialize the namespace.
     */
  void init(long itemType, String namespaceSpec, String data);

  /**
     * The namespace type.
     */
  long getItemType();

  /**
     * The prefix of this namespace.  This should be the asciiSpec of the
     * URI prefix.
     */
  String getNamespaceSpec();

  /**
     * Data associated with this namespace, such as a fallback.  URI data should
     * use the asciiSpec of the URI.
     */
  String getData();

}