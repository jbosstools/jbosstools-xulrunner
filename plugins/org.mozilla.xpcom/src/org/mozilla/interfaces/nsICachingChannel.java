/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsICachingChannel.idl
 */

package org.mozilla.interfaces;

/**
 * A channel may optionally implement this interface to allow clients
 * to affect its behavior with respect to how it uses the cache service.
 *
 * This interface provides:
 *   1) Support for "stream as file" semantics (for JAR and plugins).
 *   2) Support for "pinning" cached data in the cache (for printing and save-as).
 *   3) Support for uniquely identifying cached data in cases when the URL
 *      is insufficient (e.g., HTTP form submission).
 */
public interface nsICachingChannel extends nsISupports {

  String NS_ICACHINGCHANNEL_IID =
    "{830d4bcb-3e46-4011-9bda-51a5d1af891f}";

  /**
     * Set/get the cache token... uniquely identifies the data in the cache.
     * Holding a reference to this token prevents the cached data from being
     * removed.
     * 
     * A cache token retrieved from a particular instance of nsICachingChannel
     * could be set on another instance of nsICachingChannel provided the
     * underlying implementations are compatible.  The implementation of
     * nsICachingChannel would be expected to only read from the cache entry
     * identified by the cache token and not try to validate it.
     *
     * The cache token can be QI'd to a nsICacheEntryInfo if more detail
     * about the cache entry is needed (e.g., expiration time).
     */
  nsISupports getCacheToken();

  /**
     * Set/get the cache token... uniquely identifies the data in the cache.
     * Holding a reference to this token prevents the cached data from being
     * removed.
     * 
     * A cache token retrieved from a particular instance of nsICachingChannel
     * could be set on another instance of nsICachingChannel provided the
     * underlying implementations are compatible.  The implementation of
     * nsICachingChannel would be expected to only read from the cache entry
     * identified by the cache token and not try to validate it.
     *
     * The cache token can be QI'd to a nsICacheEntryInfo if more detail
     * about the cache entry is needed (e.g., expiration time).
     */
  void setCacheToken(nsISupports aCacheToken);

  /**
     * The same as above but accessing the offline app cache token if there
     * is any.
     *
     * @throws
     *      NS_ERROR_NOT_AVAILABLE when there is not offline cache token
     */
  nsISupports getOfflineCacheToken();

  /**
     * The same as above but accessing the offline app cache token if there
     * is any.
     *
     * @throws
     *      NS_ERROR_NOT_AVAILABLE when there is not offline cache token
     */
  void setOfflineCacheToken(nsISupports aOfflineCacheToken);

  /**
     * Set/get the cache key... uniquely identifies the data in the cache
     * for this channel.  Holding a reference to this key does NOT prevent
     * the cached data from being removed.
     * 
     * A cache key retrieved from a particular instance of nsICachingChannel
     * could be set on another instance of nsICachingChannel provided the
     * underlying implementations are compatible and provided the new 
     * channel instance was created with the same URI.  The implementation of
     * nsICachingChannel would be expected to use the cache entry identified
     * by the cache token.  Depending on the value of nsIRequest::loadFlags,
     * the cache entry may be validated, overwritten, or simply read.
     *
     * The cache key may be NULL indicating that the URI of the channel is
     * sufficient to locate the same cache entry.  Setting a NULL cache key
     * is likewise valid.
     */
  nsISupports getCacheKey();

  /**
     * Set/get the cache key... uniquely identifies the data in the cache
     * for this channel.  Holding a reference to this key does NOT prevent
     * the cached data from being removed.
     * 
     * A cache key retrieved from a particular instance of nsICachingChannel
     * could be set on another instance of nsICachingChannel provided the
     * underlying implementations are compatible and provided the new 
     * channel instance was created with the same URI.  The implementation of
     * nsICachingChannel would be expected to use the cache entry identified
     * by the cache token.  Depending on the value of nsIRequest::loadFlags,
     * the cache entry may be validated, overwritten, or simply read.
     *
     * The cache key may be NULL indicating that the URI of the channel is
     * sufficient to locate the same cache entry.  Setting a NULL cache key
     * is likewise valid.
     */
  void setCacheKey(nsISupports aCacheKey);

  /**
     * Specifies whether or not the data should be cached to a file.  This
     * may fail if the disk cache is not present.  The value of this attribute
     * is usually only settable during the processing of a channel's
     * OnStartRequest.  The default value of this attribute depends on the
     * particular implementation of nsICachingChannel.
     */
  boolean getCacheAsFile();

  /**
     * Specifies whether or not the data should be cached to a file.  This
     * may fail if the disk cache is not present.  The value of this attribute
     * is usually only settable during the processing of a channel's
     * OnStartRequest.  The default value of this attribute depends on the
     * particular implementation of nsICachingChannel.
     */
  void setCacheAsFile(boolean aCacheAsFile);

  /**
     * Specifies whether or not the data should be placed in the offline cache,
     * in addition to normal memory/disk caching.  This may fail if the offline
     * cache is not present.  The value of this attribute should be set before
     * opening the channel.
     */
  boolean getCacheForOfflineUse();

  /**
     * Specifies whether or not the data should be placed in the offline cache,
     * in addition to normal memory/disk caching.  This may fail if the offline
     * cache is not present.  The value of this attribute should be set before
     * opening the channel.
     */
  void setCacheForOfflineUse(boolean aCacheForOfflineUse);

  /**
     * The session into which to cache offline data.  If not specified,
     * data will be placed in "HTTP-offline"
     */
  String getOfflineCacheClientID();

  /**
     * The session into which to cache offline data.  If not specified,
     * data will be placed in "HTTP-offline"
     */
  void setOfflineCacheClientID(String aOfflineCacheClientID);

  /**
     * Get the "file" where the cached data can be found.  This is valid for
     * as long as a reference to the cache token is held.  This may return
     * an error if cacheAsFile is false.
     */
  nsIFile getCacheFile();

  /**
     * TRUE if this channel's data is being loaded from the cache.  This value
     * is undefined before the channel fires its OnStartRequest notification
     * and after the channel fires its OnStopRequest notification.
     */
  boolean isFromCache();

  /**************************************************************************
     * Caching channel specific load flags:
     */
/**
     * This load flag inhibits fetching from the net.  An error of
     * NS_ERROR_DOCUMENT_NOT_CACHED will be sent to the listener's
     * onStopRequest if network IO is necessary to complete the request.
     *
     * This flag can be used to find out whether fetching this URL would
     * cause validation of the cache entry via the network.
     *
     * Combining this flag with LOAD_BYPASS_LOCAL_CACHE will cause all
     * loads to fail. This flag differs from LOAD_ONLY_FROM_CACHE in that
     * this flag fails the load if validation is required while
     * LOAD_ONLY_FROM_CACHE skips validation where possible.
     */
  long LOAD_NO_NETWORK_IO = 67108864L;

  /**
     * This load flag causes the offline cache to be checked when fetching
     * a request.  It will be set automatically if the browser is offline.
     *
     * This flag will not be transferred through a redirect.
     */
  long LOAD_CHECK_OFFLINE_CACHE = 134217728L;

  /**
     * This load flag causes the local cache to be skipped when fetching a
     * request.  Unlike LOAD_BYPASS_CACHE, it does not force an end-to-end load
     * (i.e., it does not affect proxy caches).
     */
  long LOAD_BYPASS_LOCAL_CACHE = 268435456L;

  /**
     * This load flag causes the local cache to be skipped if the request
     * would otherwise block waiting to access the cache.
     */
  long LOAD_BYPASS_LOCAL_CACHE_IF_BUSY = 536870912L;

  /**
     * This load flag inhibits fetching from the net if the data in the cache
     * has been evicted.  An error of NS_ERROR_DOCUMENT_NOT_CACHED will be sent
     * to the listener's onStopRequest in this case.  This flag is set
     * automatically when the application is offline.
     */
  long LOAD_ONLY_FROM_CACHE = 1073741824L;

  /**
     * This load flag controls what happens when a document would be loaded
     * from the cache to satisfy a call to AsyncOpen.  If this attribute is
     * set to TRUE, then the document will not be loaded from the cache.  A
     * stream listener can check nsICachingChannel::isFromCache to determine
     * if the AsyncOpen will actually result in data being streamed.
     *
     * If this flag has been set, and the request can be satisfied via the
     * cache, then the OnDataAvailable events will be skipped.  The listener
     * will only see OnStartRequest followed by OnStopRequest.
     */
  long LOAD_ONLY_IF_MODIFIED = 2147483648L;

}