/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/cache/public/nsICacheEntryDescriptor.idl
 */

package org.mozilla.interfaces;

public interface nsICacheEntryDescriptor extends nsICacheEntryInfo {

  String NS_ICACHEENTRYDESCRIPTOR_IID =
    "{49c1a11d-f5d2-4f09-8262-551e64908ada}";

  /**
     * Set the time at which the cache entry should be considered invalid (in
     * seconds since the Epoch).
     */
  void setExpirationTime(long expirationTime);

  /**
     * Set the cache entry data size.  This will fail if the cache entry
     * IS stream based.
     */
  void setDataSize(long size);

  /**
     * Open blocking input stream to cache data.  This will fail if the cache
     * entry IS NOT stream based.  Use the stream transport service to
     * asynchronously read this stream on a background thread.  The returned
     * stream MAY implement nsISeekableStream.
     *
     * @param offset
     *        read starting from this offset into the cached data.  an offset
     *        beyond the end of the stream has undefined consequences.
     *
     * @return blocking, unbuffered input stream.
     */
  nsIInputStream openInputStream(long offset);

  /**
     * Open blocking output stream to cache data.  This will fail if the cache
     * entry IS NOT stream based.  Use the stream transport service to
     * asynchronously write to this stream on a background thread.  The returned
     * stream MAY implement nsISeekableStream.
     *
     * If opening an output stream to existing cached data, the data will be
     * truncated to the specified offset.
     *
     * @param offset
     *        write starting from this offset into the cached data.  an offset
     *        beyond the end of the stream has undefined consequences.
     *
     * @return blocking, unbuffered output stream.
     */
  nsIOutputStream openOutputStream(long offset);

  /**
     * Get/set the cache data element.  This will fail if the cache entry
     * IS stream based.  The cache entry holds a strong reference to this
     * object.  The object will be released when the cache entry is destroyed.
     */
  nsISupports getCacheElement();

  /**
     * Get/set the cache data element.  This will fail if the cache entry
     * IS stream based.  The cache entry holds a strong reference to this
     * object.  The object will be released when the cache entry is destroyed.
     */
  void setCacheElement(nsISupports aCacheElement);

  /**
     * Get the access granted to this descriptor.  See nsICache.idl for the
     * definitions of the access modes and a thorough description of their
     * corresponding meanings.
     */
  int getAccessGranted();

  /**
     * Get/set the storage policy of the cache entry.  See nsICache.idl for
     * the definitions of the storage policies.
     */
  int getStoragePolicy();

  /**
     * Get/set the storage policy of the cache entry.  See nsICache.idl for
     * the definitions of the storage policies.
     */
  void setStoragePolicy(int aStoragePolicy);

  /**
     * Get the disk file associated with the cache entry.
     */
  nsIFile getFile();

  /**
     * Get/set security info on the cache entry for this descriptor.  This fails
     * if the storage policy is not STORE_IN_MEMORY.
     */
  nsISupports getSecurityInfo();

  /**
     * Get/set security info on the cache entry for this descriptor.  This fails
     * if the storage policy is not STORE_IN_MEMORY.
     */
  void setSecurityInfo(nsISupports aSecurityInfo);

  /**
     * Doom the cache entry this descriptor references in order to slate it for 
     * removal.  Once doomed a cache entry cannot be undoomed.
     *
     * A descriptor with WRITE access can doom the cache entry and choose to
     * fail pending requests.  This means that pending requests will not get
     * a cache descriptor.  This is meant as a tool for clients that wish to
     * instruct pending requests to skip the cache.
     */
  void doom();

  void doomAndFailPendingRequests(long status);

  /**
     * A writer must validate this cache object before any readers are given
     * a descriptor to the object.
     */
  void markValid();

  /**
     *  Explicitly close the descriptor (optional).
     */
  void close();

  /**
     * Methods for accessing meta data.  Meta data is a table of key/value
     * string pairs.  The strings do not have to conform to any particular
     * charset, but they must be null terminated.
     */
  String getMetaDataElement(String key);

  void setMetaDataElement(String key, String value);

  /**
     * Visitor will be called with key/value pair for each meta data element.
     */
  void visitMetaData(nsICacheMetaDataVisitor visitor);

}