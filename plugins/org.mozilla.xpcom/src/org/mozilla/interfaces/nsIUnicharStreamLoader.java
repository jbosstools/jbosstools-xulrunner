/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIUnicharStreamLoader.idl
 */

package org.mozilla.interfaces;

public interface nsIUnicharStreamLoader extends nsIStreamListener {

  String NS_IUNICHARSTREAMLOADER_IID =
    "{9037f476-7c08-4729-b690-3e425269802b}";

  /**
 * Asynchronously load a channel, converting the data to UTF-16.
 *
 * To use this interface, first call init() with a
 * nsIUnicharStreamLoaderObserver that will be notified when the data has been
 * loaded. Then call asyncOpen() on the channel with the nsIUnicharStreamLoader
 * as the listener. The context argument in the asyncOpen() call will be
 * passed to the onStreamComplete() callback.
 */
  long DEFAULT_SEGMENT_SIZE = 4096L;

  /**
   * Initializes the unichar stream loader
   *
   * @param aObserver the observer to notify when a charset is needed and when
   *        the load is complete
   * @param aSegmentSize the size of the segments to use for the data, in bytes
   */
  void init(nsIUnicharStreamLoaderObserver aObserver, long aSegmentSize);

  /**
   * The channel attribute is only valid inside the onDetermineCharset
   * and onStreamComplete callbacks.  Otherwise it will be null.
   */
  nsIChannel getChannel();

  /**
   * The charset that onDetermineCharset returned, if that's been
   * called.
   */
  String getCharset();

}