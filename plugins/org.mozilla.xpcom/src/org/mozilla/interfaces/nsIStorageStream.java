/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIStorageStream.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIStorageStream interface maintains an internal data buffer that can be
 * filled using a single output stream.  One or more independent input streams
 * can be created to read the data from the buffer non-destructively.
 */
public interface nsIStorageStream extends nsISupports {

  String NS_ISTORAGESTREAM_IID =
    "{604ad9d0-753e-11d3-90ca-34278643278f}";

  /**
     *
     * Initialize the stream, setting up the amount of space that will be
     * allocated for the stream's backing-store.
     *
     * @param segmentSize
     *        Size of each segment. Must be a power of two.
     * @param maxSize
     *        Maximum total size of this stream. length will always be less
     *        than or equal to this value. Passing PR_UINT32_MAX is safe.
     * @param segmentAllocator
     *        Which allocator to use for the segments. May be null, in which
     *        case a default allocator will be used.
     */
  void init(long segmentSize, long maxSize, nsIMemory segmentAllocator);

  /**
     * Get a reference to the one and only output stream for this instance.
     * The zero-based startPosition argument is used is used to set the initial
     * write cursor position.  The startPosition cannot be set larger than the
     * current buffer length.  Calling this method has the side-effect of
     * truncating the internal buffer to startPosition bytes.
     */
  nsIOutputStream getOutputStream(int startPosition);

  /**
     * Create a new input stream to read data (written by the singleton output
     * stream) from the internal buffer.  Multiple, independent input streams
     * can be created.
     */
  nsIInputStream newInputStream(int startPosition);

  /** 
     * The length attribute indicates the total number of bytes stored in the
     * nsIStorageStream internal buffer, regardless of any consumption by input
     * streams.  Assigning to the length field can be used to truncate the
     * buffer data, but can not be used when either the instance's output
     * stream is in use.
     *
     * @See #writeInProgress */
  long getLength();

  /** 
     * The length attribute indicates the total number of bytes stored in the
     * nsIStorageStream internal buffer, regardless of any consumption by input
     * streams.  Assigning to the length field can be used to truncate the
     * buffer data, but can not be used when either the instance's output
     * stream is in use.
     *
     * @See #writeInProgress */
  void setLength(long aLength);

  /**
     * True, when output stream has not yet been Close'ed
     */
  boolean getWriteInProgress();

}