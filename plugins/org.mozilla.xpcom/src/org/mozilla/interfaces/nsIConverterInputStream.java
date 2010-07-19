/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIConverterInputStream.idl
 */

package org.mozilla.interfaces;

/**
 * A unichar input stream that wraps an input stream.
 * This allows reading unicode strings from a stream, automatically converting
 * the bytes from a selected character encoding.
 */
public interface nsIConverterInputStream extends nsIUnicharInputStream {

  String NS_ICONVERTERINPUTSTREAM_IID =
    "{fc66ffb6-5404-4908-a4a3-27f92fa0579d}";

  /**
     * Default replacement char value, U+FFFD REPLACEMENT CHARACTER.
     */
  int DEFAULT_REPLACEMENT_CHARACTER = 65533;

  /**
     * Initialize this stream.
     * @param aStream 
     *        The underlying stream to read from.
     * @param aCharset
     *        The character encoding to use for converting the bytes of the
     *        stream. A null charset will be interpreted as UTF-8.
     * @param aBufferSize
     *        How many bytes to buffer.
     * @param aReplacementChar
     *        The character to replace unknown byte sequences in the stream
     *        with. The standard replacement character is U+FFFD.
     *        A value of 0x0000 will cause an exception to be thrown if unknown
     *        byte sequences are encountered in the stream.
     */
  void init(nsIInputStream aStream, String aCharset, int aBufferSize, int aReplacementChar);

}