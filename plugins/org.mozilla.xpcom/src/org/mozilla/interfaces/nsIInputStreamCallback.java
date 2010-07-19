/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIAsyncInputStream.idl
 */

package org.mozilla.interfaces;

public interface nsIInputStreamCallback extends nsISupports {

  String NS_IINPUTSTREAMCALLBACK_IID =
    "{d1f28e94-3a6e-4050-a5f5-2e81b1fc2a43}";

  /**
 * This is a companion interface for nsIAsyncInputStream::asyncWait.
 */
/**
     * Called to indicate that the stream is either readable or closed.
     *
     * @param aStream
     *        The stream whose asyncWait method was called.
     */
  void onInputStreamReady(nsIAsyncInputStream aStream);

}