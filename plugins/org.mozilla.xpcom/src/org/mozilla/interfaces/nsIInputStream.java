/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIInputStream.idl
 */

package org.mozilla.interfaces;

public interface nsIInputStream extends nsISupports {

  String NS_IINPUTSTREAM_IID =
    "{fa9c7f6c-61b3-11d4-9877-00c04fa0cf4a}";

  /**
 * nsIInputStream
 *
 * An interface describing a readable stream of data.  An input stream may be
 * "blocking" or "non-blocking" (see the IsNonBlocking method).  A blocking
 * input stream may suspend the calling thread in order to satisfy a call to
 * Close, Available, Read, or ReadSegments.  A non-blocking input stream, on
 * the other hand, must not block the calling thread of execution.
 *
 * NOTE: blocking input streams are often read on a background thread to avoid
 * locking up the main application thread.  For this reason, it is generally
 * the case that a blocking input stream should be implemented using thread-
 * safe AddRef and Release.
 *
 * @status FROZEN
 */
/** 
     * Close the stream.  This method causes subsequent calls to Read and
     * ReadSegments to return 0 bytes read to indicate end-of-file.  Any
     * subsequent calls to Available should throw NS_BASE_STREAM_CLOSED.
     */
  void close();

  /**
     * Determine number of bytes available in the stream.  A non-blocking
     * stream that does not yet have any data to read should return 0 bytes
     * from this method (i.e., it must not throw the NS_BASE_STREAM_WOULD_BLOCK
     * exception).
     * 
     * In addition to the number of bytes available in the stream, this method
     * also informs the caller of the current status of the stream.  A stream
     * that is closed will throw an exception when this method is called.  That
     * enables the caller to know the condition of the stream before attempting
     * to read from it.  If a stream is at end-of-file, but not closed, then
     * this method should return 0 bytes available.
     *
     * @return number of bytes currently available in the stream, or
     *   PR_UINT32_MAX if the size of the stream exceeds PR_UINT32_MAX.
     *
     * @throws NS_BASE_STREAM_CLOSED if the stream is closed normally or at
     *   end-of-file
     * @throws <other-error> if the stream is closed due to some error
     *   condition
     */
  long available();

  /**
     * @return true if stream is non-blocking
     *
     * NOTE: reading from a blocking input stream will block the calling thread
     * until at least one byte of data can be extracted from the stream.
     *
     * NOTE: a non-blocking input stream may implement nsIAsyncInputStream to
     * provide consumers with a way to wait for the stream to have more data
     * once its read method is unable to return any data without blocking.
     */
  boolean isNonBlocking();

}