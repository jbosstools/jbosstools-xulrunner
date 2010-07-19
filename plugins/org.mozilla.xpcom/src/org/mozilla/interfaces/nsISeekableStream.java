/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsISeekableStream.idl
 */

package org.mozilla.interfaces;

public interface nsISeekableStream extends nsISupports {

  String NS_ISEEKABLESTREAM_IID =
    "{8429d350-1040-4661-8b71-f2a6ba455980}";

  int NS_SEEK_SET = 0;

  int NS_SEEK_CUR = 1;

  int NS_SEEK_END = 2;

  /**
     *  seek
     *
     *  This method moves the stream offset of the steam implementing this
     *  interface.
     *
     *   @param whence specifies how to interpret the 'offset' parameter in
     *                 setting the stream offset associated with the implementing
     *                 stream.
     *     
     *   @param offset specifies a value, in bytes, that is used in conjunction
     *                 with the 'whence' parameter to set the stream offset of the 
     *                 implementing stream.  A negative value causes seeking in 
     *                 the reverse direction.
     *
     *   @throws NS_BASE_STREAM_CLOSED if called on a closed stream.
     */
  void seek(int whence, long offset);

  /**
     *  tell
     *
     *  This method reports the current offset, in bytes, from the start of the 
     *  stream. 
     *
     *   @throws NS_BASE_STREAM_CLOSED if called on a closed stream.
     */
  long tell();

  /**
     *  setEOF
     *
     *  This method truncates the stream at the current offset.
     *
     *   @throws NS_BASE_STREAM_CLOSED if called on a closed stream.
     */
  void setEOF();

}