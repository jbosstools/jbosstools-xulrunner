/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/libpr0n/public/imgIDecoder.idl
 */

package org.mozilla.interfaces;

/**
 * imgIDecoder interface
 *
 * @author Stuart Parmenter <pavlov@netscape.com>
 * @version 0.2
 * @see imagelib2
 */
public interface imgIDecoder extends nsISupports {

  String IMGIDECODER_IID =
    "{9eebf43a-1dd1-11b2-953e-f1782f4cbad3}";

  /**
   * Initialize an image decoder.
   * @param aRequest the request that owns the decoder.
   *
   * @note The decode should QI \a aLoad to an imgIDecoderObserver
   * and should send decoder notifications to the request.
   * The decoder should always pass NULL as the first two parameters to
   * all of the imgIDecoderObserver APIs.
   */
  void init(imgILoad aLoad);

  /** 
   * Closes the stream. 
   */
  void close();

  /**
   * Flushes the stream.
   */
  void flush();

  /**
   * Writes data into the stream from an input stream.
   * Implementer's note: This method is defined by this interface in order
   * to allow the output stream to efficiently copy the data from the input
   * stream into its internal buffer (if any). If this method was provide
   * as an external facility, a separate char* buffer would need to be used
   * in order to call the output stream's other Write method.
   * @param fromStream the stream from which the data is read
   * @param count the maximun number of bytes to write
   * @return aWriteCount out parameter to hold the number of
   *         bytes written. if an error occurs, the writecount
   *         is undefined
   */
  long writeFrom(nsIInputStream inStr, long count);

}