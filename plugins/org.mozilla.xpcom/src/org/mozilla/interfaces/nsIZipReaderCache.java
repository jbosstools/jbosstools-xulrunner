/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/libjar/nsIZipReader.idl
 */

package org.mozilla.interfaces;

public interface nsIZipReaderCache extends nsISupports {

  String NS_IZIPREADERCACHE_IID =
    "{52c45d86-0cc3-11d4-986e-00c04fa0cf4a}";

  /**
     * Initializes a new zip reader cache. 
     * @param cacheSize - the number of released entries to maintain before
     *   beginning to throw some out (note that the number of outstanding
     *   entries can be much greater than this number -- this is the count
     *   for those otherwise unused entries)
     */
  void init(long cacheSize);

  /**
     * Returns a (possibly shared) nsIZipReader for an nsIFile.
     *
     * If the zip reader for given file is not in the cache, a new zip reader
     * is created, initialized, and opened (see nsIZipReader::init and 
     * nsIZipReader::open). Otherwise the previously created zip reader is 
     * returned.
     *
     * @note If someone called close() on the shared nsIZipReader, this method 
     *       will return the closed zip reader.
     */
  nsIZipReader getZip(nsIFile zipFile);

}