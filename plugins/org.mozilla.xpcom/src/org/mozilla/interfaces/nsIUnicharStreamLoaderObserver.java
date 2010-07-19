/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIUnicharStreamLoader.idl
 */

package org.mozilla.interfaces;

public interface nsIUnicharStreamLoaderObserver extends nsISupports {

  String NS_IUNICHARSTREAMLOADEROBSERVER_IID =
    "{6bb3e55b-69c0-4fc9-87e5-bed780d997ce}";

  /**
   * Called when the first full segment of data if available.
   *
   * @param aLoader the unichar stream loader
   * @param aContext the context parameter of the underlying channel
   * @param aFirstSegment the raw bytes of the first full data segment
   * @param aLength the length of aFirstSegment
   *
   * @return charset corresponding to this stream
   *
   * @note this method will only be called if the stream loader receives an
   *       OnDataAvailable call.
   */
  String onDetermineCharset(nsIUnicharStreamLoader aLoader, nsISupports aContext, String aFirstSegment, long aLength);

  /**
   * Called when the entire stream has been loaded.
   *
   * @param aLoader the unichar stream loader
   * @param aContext the context parameter of the underlying channel
   * @param aStatus the status of the underlying channel
   * @param aUnicharData the unichar input stream containing the data.  This
   *        can be null in some failure conditions.
   *
   * This method will always be called asynchronously by the
   * nsUnicharIStreamLoader involved, on the thread that called the
   * loader's init() method.
   *
   * @note If the stream loader does not receive an OnDataAvailable call,
   *       aUnicharData will be null, and aStatus will be a success value.
   */
  void onStreamComplete(nsIUnicharStreamLoader aLoader, nsISupports aContext, long aStatus, nsIUnicharInputStream aUnicharData);

}