/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIBufferedStreams.idl
 */

package org.mozilla.interfaces;

/**
 * An input stream that reads ahead and keeps a buffer coming from another input
 * stream so that fewer accesses to the underlying stream are necessary.
 */
public interface nsIBufferedInputStream extends nsIInputStream {

  String NS_IBUFFEREDINPUTSTREAM_IID =
    "{616f5b48-da09-11d3-8cda-0060b0fc14a3}";

  /**
     * @param fillFromStream - add buffering to this stream
     * @param bufferSize     - specifies the maximum buffer size
     */
  void init(nsIInputStream fillFromStream, long bufferSize);

}