/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsITransport.idl
 */

package org.mozilla.interfaces;

/**
 * nsITransport
 *
 * This interface provides a common way of accessing i/o streams connected
 * to some resource.  This interface does not in any way specify the resource.
 * It provides methods to open blocking or non-blocking, buffered or unbuffered
 * streams to the resource.  The name "transport" is meant to connote the 
 * inherent data transfer implied by this interface (i.e., data is being
 * transfered in some fashion via the streams exposed by this interface).
 *
 * A transport can have an event sink associated with it.  The event sink 
 * receives transport-specific events as the transfer is occuring.  For a
 * socket transport, these events can include status about the connection.
 * See nsISocketTransport for more info about socket transport specifics.
 */
public interface nsITransport extends nsISupports {

  String NS_ITRANSPORT_IID =
    "{d8786c64-eb49-4a0b-b42c-0936a745fbe8}";

  /**
     * Open flags.
     */
  long OPEN_BLOCKING = 1L;

  long OPEN_UNBUFFERED = 2L;

  /**
     * Open an input stream on this transport.
     *
     * Flags have the following meaning:
     *
     * OPEN_BLOCKING
     *   If specified, then the resulting stream will have blocking stream
     *   semantics.  This means that if the stream has no data and is not
     *   closed, then reading from it will block the calling thread until
     *   at least one byte is available or until the stream is closed.
     *   If this flag is NOT specified, then the stream has non-blocking
     *   stream semantics.  This means that if the stream has no data and is
     *   not closed, then reading from it returns NS_BASE_STREAM_WOULD_BLOCK.
     *   In addition, in non-blocking mode, the stream is guaranteed to 
     *   support nsIAsyncInputStream.  This interface allows the consumer of
     *   the stream to be notified when the stream can again be read.
     *
     * OPEN_UNBUFFERED
     *   If specified, the resulting stream may not support ReadSegments.
     *   ReadSegments is only gauranteed to be implemented when this flag is
     *   NOT specified.
     *
     * @param aFlags
     *        optional transport specific flags.
     * @param aSegmentSize
     *        if OPEN_UNBUFFERED is not set, then this parameter specifies the
     *        size of each buffer segment (pass 0 to use default value).
     * @param aSegmentCount
     *        if OPEN_UNBUFFERED is not set, then this parameter specifies the
     *        maximum number of buffer segments (pass 0 to use default value).
     */
  nsIInputStream openInputStream(long aFlags, long aSegmentSize, long aSegmentCount);

  /**
     * Open an output stream on this transport.
     *
     * Flags have the following meaning:
     *
     * OPEN_BLOCKING
     *   If specified, then the resulting stream will have blocking stream
     *   semantics.  This means that if the stream is full and is not closed,
     *   then writing to it will block the calling thread until ALL of the
     *   data can be written or until the stream is closed.  If this flag is
     *   NOT specified, then the stream has non-blocking stream semantics.
     *   This means that if the stream is full and is not closed, then writing
     *   to it returns NS_BASE_STREAM_WOULD_BLOCK.  In addition, in non-
     *   blocking mode, the stream is guaranteed to support
     *   nsIAsyncOutputStream.  This interface allows the consumer of the
     *   stream to be notified when the stream can again accept more data.
     *
     * OPEN_UNBUFFERED
     *   If specified, the resulting stream may not support WriteSegments and
     *   WriteFrom.  WriteSegments and WriteFrom are only gauranteed to be
     *   implemented when this flag is NOT specified.
     *
     * @param aFlags
     *        optional transport specific flags.
     * @param aSegmentSize
     *        if OPEN_UNBUFFERED is not set, then this parameter specifies the
     *        size of each buffer segment (pass 0 to use default value).
     * @param aSegmentCount
     *        if OPEN_UNBUFFERED is not set, then this parameter specifies the
     *        maximum number of buffer segments (pass 0 to use default value).
     */
  nsIOutputStream openOutputStream(long aFlags, long aSegmentSize, long aSegmentCount);

  /**
     * Close the transport and any open streams.
     *
     * @param aReason
     *        the reason for closing the stream.
     */
  void close(long aReason);

  /**
     * Set the transport event sink.
     *
     * @param aSink
     *        receives transport layer notifications
     * @param aEventTarget
     *        indicates the event target to which the notifications should
     *        be delivered.  if NULL, then the notifications may occur on
     *        any thread.
     */
  void setEventSink(nsITransportEventSink aSink, nsIEventTarget aEventTarget);

  /**
     * Generic nsITransportEventSink status codes.  nsITransport
     * implementations may override these status codes with their own more
     * specific status codes (e.g., see nsISocketTransport).
     */
  long STATUS_READING = 2152398856L;

  long STATUS_WRITING = 2152398857L;

}