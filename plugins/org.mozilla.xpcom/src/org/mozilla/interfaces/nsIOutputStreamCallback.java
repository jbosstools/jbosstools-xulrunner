/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIAsyncOutputStream.idl
 */

package org.mozilla.interfaces;

public interface nsIOutputStreamCallback extends nsISupports {

  String NS_IOUTPUTSTREAMCALLBACK_IID =
    "{40dbcdff-9053-42c5-a57c-3ec910d0f148}";

  /**
 * This is a companion interface for nsIAsyncOutputStream::asyncWait.
 */
/**
     * Called to indicate that the stream is either writable or closed.
     *
     * @param aStream
     *        The stream whose asyncWait method was called.
     */
  void onOutputStreamReady(nsIAsyncOutputStream aStream);

}