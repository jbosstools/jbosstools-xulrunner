/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIStreamLoader.idl
 */

package org.mozilla.interfaces;

public interface nsIStreamLoader extends nsIStreamListener {

  String NS_ISTREAMLOADER_IID =
    "{8ea7e890-8211-11d9-8bde-f66bad1e3f3a}";

  /**
 * Asynchronously loads a channel into a memory buffer.
 *
 * To use this interface, first call init() with a nsIStreamLoaderObserver
 * that will be notified when the data has been loaded. Then call asyncOpen()
 * on the channel with the nsIStreamLoader as the listener. The context
 * argument in the asyncOpen() call will be passed to the onStreamComplete()
 * callback.
 *
 * XXX define behaviour for sizes >4 GB
 */
/**
     * Initialize this stream loader, and start loading the data.
     *
     * @param aObserver
     *        An observer that will be notified when the data is complete.
     */
  void init(nsIStreamLoaderObserver aObserver);

  /**
     * Gets the number of bytes read so far.
     */
  long getNumBytesRead();

  /**
     * Gets the request that loaded this file.
     * null after the request has finished loading.
     */
  nsIRequest getRequest();

}