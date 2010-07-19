/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIUnicharOutputStream.idl
 */

package org.mozilla.interfaces;

/**
 * An interface that allows writing unicode data.
 */
public interface nsIUnicharOutputStream extends nsISupports {

  String NS_IUNICHAROUTPUTSTREAM_IID =
    "{2d00b1bb-8b21-4a63-bcc6-7213f513ac2e}";

  /**
     * Write a single character to the stream. When writing many characters,
     * prefer the string-taking write method.
     *
     * @retval true The character was written successfully
     * @retval false Not all bytes of the character could be written.
     */
  boolean write(long aCount, int[] c);

  /**
     * Write a string to the stream.
     *
     * @retval true The string was written successfully
     * @retval false Not all bytes of the string could be written.
     */
  boolean writeString(String str);

  /**
     * Flush the stream. This finishes the conversion and writes any bytes that
     * finish the current byte sequence.
     *
     * It does NOT flush the underlying stream.
     *
     * @see nsIUnicodeEncoder::Finish
     */
  void flush();

  /**
     * Close the stream and free associated resources. This also closes the
     * underlying stream.
     */
  void close();

}