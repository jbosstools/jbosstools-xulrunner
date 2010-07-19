/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIStreamLoader.idl
 */

package org.mozilla.interfaces;

public interface nsIStreamLoaderObserver extends nsISupports {

  String NS_ISTREAMLOADEROBSERVER_IID =
    "{359f7990-d4e9-11d3-a1a5-0050041caf44}";

  /**
     * Called when the entire stream has been loaded.
     *
     * @param loader the stream loader that loaded the stream.
     * @param ctxt the context parameter of the underlying channel
     * @param status the status of the underlying channel
     * @param resultLength the length of the data loaded
     * @param result the data
     *
     * This method will always be called asynchronously by the
     * nsIStreamLoader involved, on the thread that called the
     * loader's init() method.
     *
     * If the observer wants to take over responsibility for the
     * data buffer (result), it returns NS_SUCCESS_ADOPTED_DATA
     * in place of NS_OK as its success code. The loader will then
     * "forget" about the data, and not NS_Free() it in its own
     * destructor; observer must call NS_Free() when the data is
     * no longer required.
     */
  void onStreamComplete(nsIStreamLoader loader, nsISupports ctxt, long status, long resultLength, byte[] result);

}