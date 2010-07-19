/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIBufferedStreams.idl
 */

package org.mozilla.interfaces;

/**
 * An output stream that stores up data to write out to another output stream
 * and does the entire write only when the buffer is full, so that fewer writes
 * to the underlying output stream are necessary.
 */
public interface nsIBufferedOutputStream extends nsIOutputStream {

  String NS_IBUFFEREDOUTPUTSTREAM_IID =
    "{6476378a-da09-11d3-8cda-0060b0fc14a3}";

  /**
     * @param sinkToStream - add buffering to this stream
     * @param bufferSize   - specifies the maximum buffer size
     */
  void init(nsIOutputStream sinkToStream, long bufferSize);

}