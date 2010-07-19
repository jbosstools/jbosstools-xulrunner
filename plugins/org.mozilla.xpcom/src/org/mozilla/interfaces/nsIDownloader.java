/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIDownloader.idl
 */

package org.mozilla.interfaces;

/**
 * nsIDownloader
 *
 * A downloader is a special implementation of a nsIStreamListener that will
 * make the contents of the stream available as a file.  This may utilize the
 * disk cache as an optimization to avoid an extra copy of the data on disk.
 * The resulting file is valid from the time the downloader completes until
 * the last reference to the downloader is released.
 */
public interface nsIDownloader extends nsIStreamListener {

  String NS_IDOWNLOADER_IID =
    "{fafe41a9-a531-4d6d-89bc-588a6522fb4e}";

  /**
     * Initialize this downloader
     *
     * @param observer
     *        the observer to be notified when the download completes.
     * @param downloadLocation
     *        the location where the stream contents should be written.
     *        if null, the downloader will select a location and the
     *        resulting file will be deleted (or otherwise made invalid)
     *        when the downloader object is destroyed.  if an explicit
     *        download location is specified then the resulting file will
     *        not be deleted, and it will be the callers responsibility
     *        to keep track of the file, etc.
     */
  void init(nsIDownloadObserver observer, nsIFile downloadLocation);

}