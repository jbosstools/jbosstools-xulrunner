/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsISimpleStreamListener.idl
 */

package org.mozilla.interfaces;

/**
 * A simple stream listener can be used with AsyncRead to supply data to
 * a output stream.
 */
public interface nsISimpleStreamListener extends nsIStreamListener {

  String NS_ISIMPLESTREAMLISTENER_IID =
    "{a9b84f6a-0824-4278-bae6-bfca0570a26e}";

  /**
     * Initialize the simple stream listener.
     *
     * @param aSink data will be read from the channel to this output stream.
     *              Must implement writeFrom.
     * @param aObserver optional stream observer (can be NULL)
     */
  void init(nsIOutputStream aSink, nsIRequestObserver aObserver);

}