/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIMultiplexInputStream.idl
 */

package org.mozilla.interfaces;

/**
 * The multiplex stream concatenates a list of input streams into a single
 * stream.
 */
public interface nsIMultiplexInputStream extends nsIInputStream {

  String NS_IMULTIPLEXINPUTSTREAM_IID =
    "{a076fd12-1dd1-11b2-b19a-d53b5dffaade}";

  /**
     * Number of streams in this multiplex-stream
     */
  long getCount();

  /**
     * Appends a stream to the end of the streams. The cursor of the stream
     * should be located at the beginning of the stream if the implementation
     * of this nsIMultiplexInputStream also is used as an nsISeekableStream.
     * @param stream  stream to append
     */
  void appendStream(nsIInputStream stream);

  /**
     * Insert a stream at specified index.  If the cursor of this stream is at
     * the beginning of the stream at index, the cursor will be placed at the
     * beginning of the inserted stream instead.
     * The cursor of the new stream should be located at the beginning of the
     * stream if the implementation of this nsIMultiplexInputStream also is
     * used as an nsISeekableStream.
     * @param stream  stream to insert
     * @param index   index to insert stream at, must be <= count
     */
  void insertStream(nsIInputStream stream, long index);

  /**
     * Remove stream at specified index. If this stream is the one currently
     * being read the readcursor is moved to the beginning of the next
     * stream
     * @param index   remove stream at this index, must be < count
     */
  void removeStream(long index);

  /**
     * Get stream at specified index.
     * @param index   return stream at this index, must be < count
     * @return        stream at specified index
     */
  nsIInputStream getStream(long index);

}