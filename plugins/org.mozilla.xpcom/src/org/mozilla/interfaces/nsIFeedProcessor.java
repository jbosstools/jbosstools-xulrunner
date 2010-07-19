/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/feeds/public/nsIFeedProcessor.idl
 */

package org.mozilla.interfaces;

/**
 * An nsIFeedProcessor parses feeds, triggering callbacks based on
 * their contents.
 */
public interface nsIFeedProcessor extends nsIStreamListener {

  String NS_IFEEDPROCESSOR_IID =
    "{8a0b2908-21b0-45d7-b14d-30df0f92afc7}";

  /**
   * The listener that will respond to feed events. 
   */
  nsIFeedResultListener getListener();

  /**
   * The listener that will respond to feed events. 
   */
  void setListener(nsIFeedResultListener aListener);

  /**
   * Parse a feed from an nsIInputStream.
   *
   * @param stream The input stream.
   * @param uri The base URI.
   */
  void parseFromStream(nsIInputStream stream, nsIURI uri);

  /**
   * Parse a feed from a string.
   *
   * @param str The string to parse.
   * @param uri The base URI.
   */
  void parseFromString(String str, nsIURI uri);

  /**
   * Parse a feed asynchronously. The caller must then call the
   * nsIFeedProcessor's nsIStreamListener methods to drive the
   * parse. Do not call the other parse methods during an asynchronous
   * parse.
   *
   * @param requestObserver The observer to notify on start/stop. This
   *                        argument can be null.
   * @param uri The base URI.
   */
  void parseAsync(nsIRequestObserver requestObserver, nsIURI uri);

}