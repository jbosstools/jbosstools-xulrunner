/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIInputStreamPump.idl
 */

package org.mozilla.interfaces;

/**
 * nsIInputStreamPump
 *
 * This interface provides a means to configure and use a input stream pump
 * instance.  The input stream pump will asynchronously read from a input
 * stream, and push data to a nsIStreamListener instance.  It utilizes the
 * current thread's nsIEventTarget in order to make reading from the stream
 * asynchronous.
 *
 * If the given stream supports nsIAsyncInputStream, then the stream pump will
 * call the stream's AsyncWait method to drive the stream listener.  Otherwise,
 * the stream will be read on a background thread utilizing the stream
 * transport service.  More details are provided below.
 */
public interface nsIInputStreamPump extends nsIRequest {

  String NS_IINPUTSTREAMPUMP_IID =
    "{400f5468-97e7-4d2b-9c65-a82aecc7ae82}";

  /**
     * Initialize the input stream pump.
     *
     * @param aStream
     *        contains the data to be read.  if the input stream is non-blocking,
     *        then it will be QI'd to nsIAsyncInputStream.  if the QI succeeds
     *        then the stream will be read directly.  otherwise, it will be read
     *        on a background thread using the stream transport service.
     * @param aStreamPos
     *        specifies the stream offset from which to start reading.  the
     *        offset value is absolute.  pass -1 to specify the current offset.
     *        NOTE: this parameter is ignored if the underlying stream does not
     *        implement nsISeekableStream.
     * @param aStreamLen
     *        specifies how much data to read from the stream.  pass -1 to read
     *        all data available in the stream.
     * @param aSegmentSize
     *        if the stream transport service is used, then this parameter
     *        specifies the segment size for the stream transport's buffer.
     *        pass 0 to specify the default value.
     * @param aSegmentCount
     *        if the stream transport service is used, then this parameter
     *        specifies the segment count for the stream transport's buffer.
     *        pass 0 to specify the default value.
     * @param aCloseWhenDone
     *        if true, the input stream will be closed after it has been read.
     */
  void init(nsIInputStream aStream, long aStreamPos, long aStreamLen, long aSegmentSize, long aSegmentCount, boolean aCloseWhenDone);

  /**
     * asyncRead causes the input stream to be read in chunks and delivered
     * asynchronously to the listener via OnDataAvailable.
     *
     * @param aListener
     *        receives notifications.
     * @param aListenerContext
     *        passed to listener methods.
     */
  void asyncRead(nsIStreamListener aListener, nsISupports aListenerContext);

}