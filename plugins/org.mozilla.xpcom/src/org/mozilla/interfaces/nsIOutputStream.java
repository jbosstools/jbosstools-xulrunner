/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIOutputStream.idl
 */

package org.mozilla.interfaces;

public interface nsIOutputStream extends nsISupports {

  String NS_IOUTPUTSTREAM_IID =
    "{0d0acd2a-61b4-11d4-9877-00c04fa0cf4a}";

  /**
 * nsIOutputStream
 *
 * An interface describing a writable stream of data.  An output stream may be
 * "blocking" or "non-blocking" (see the IsNonBlocking method).  A blocking
 * output stream may suspend the calling thread in order to satisfy a call to
 * Close, Flush, Write, WriteFrom, or WriteSegments.  A non-blocking output
 * stream, on the other hand, must not block the calling thread of execution.
 *
 * NOTE: blocking output streams are often written to on a background thread to
 * avoid locking up the main application thread.  For this reason, it is
 * generally the case that a blocking output stream should be implemented using
 * thread- safe AddRef and Release.
 *
 * @status FROZEN
 */
/** 
     * Close the stream. Forces the output stream to flush any buffered data.
     *
     * @throws NS_BASE_STREAM_WOULD_BLOCK if unable to flush without blocking 
     *   the calling thread (non-blocking mode only)
     */
  void close();

  /**
     * Flush the stream.
     *
     * @throws NS_BASE_STREAM_WOULD_BLOCK if unable to flush without blocking 
     *   the calling thread (non-blocking mode only)
     */
  void flush();

  /**
     * Write data into the stream.
     *
     * @param aBuf the buffer containing the data to be written
     * @param aCount the maximum number of bytes to be written
     *
     * @return number of bytes written (may be less than aCount)
     *
     * @throws NS_BASE_STREAM_WOULD_BLOCK if writing to the output stream would
     *   block the calling thread (non-blocking mode only)
     * @throws <other-error> on failure
     */
  long write(String aBuf, long aCount);

  /**
     * Writes data into the stream from an input stream.
     *
     * @param aFromStream the stream containing the data to be written
     * @param aCount the maximum number of bytes to be written
     *
     * @return number of bytes written (may be less than aCount)
     *
     * @throws NS_BASE_STREAM_WOULD_BLOCK if writing to the output stream would
     *    block the calling thread (non-blocking mode only)
     * @throws <other-error> on failure
     *
     * NOTE: This method is defined by this interface in order to allow the
     * output stream to efficiently copy the data from the input stream into
     * its internal buffer (if any). If this method was provided as an external
     * facility, a separate char* buffer would need to be used in order to call
     * the output stream's other Write method.
     */
  long writeFrom(nsIInputStream aFromStream, long aCount);

  /**
     * @return true if stream is non-blocking
     *
     * NOTE: writing to a blocking output stream will block the calling thread
     * until all given data can be consumed by the stream.
     *
     * NOTE: a non-blocking output stream may implement nsIAsyncOutputStream to
     * provide consumers with a way to wait for the stream to accept more data
     * once its write method is unable to accept any data without blocking.
     */
  boolean isNonBlocking();

}