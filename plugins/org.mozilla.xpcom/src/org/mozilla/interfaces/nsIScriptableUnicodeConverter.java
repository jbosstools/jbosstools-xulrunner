/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/intl/uconv/idl/nsIScriptableUConv.idl
 */

package org.mozilla.interfaces;

/**
 * This interface is a unicode encoder for use by scripts
 *
 * @created         8/Jun/2000
 * @author          Makoto Kato [m_kato@ga2.so-net.ne.jp]
 */
public interface nsIScriptableUnicodeConverter extends nsISupports {

  String NS_ISCRIPTABLEUNICODECONVERTER_IID =
    "{1ea19c6c-c59f-4fd7-9fc7-151e946baca0}";

  /**
   * Converts the data from Unicode to one Charset.
   * Returns the converted string. After converting, Finish should be called
   * and its return value appended to this return value.
   */
  String convertFromUnicode(String aSrc);

  /**
   * Returns the terminator string.
   * Should be called after ConvertFromUnicode() and appended to that
   * function's return value.
   */
  String finish();

  /**
   * Converts the data from one Charset to Unicode.
   */
  String convertToUnicode(String aSrc);

  /**
   * Converts an array of bytes to a unicode string.
   */
  String convertFromByteArray(byte[] aData, long aCount);

  /**
   * Convert a unicode string to an array of bytes. Finish does not need to be
   * called.
   */
  byte[] convertToByteArray(String aString, long[] aLen);

  /**
   * Converts a unicode string to an input stream. The bytes in the stream are
   * encoded according to the charset attribute.
   * The returned stream will be nonblocking.
   */
  nsIInputStream convertToInputStream(String aString);

  /**
   * Current character set.
   *
   * @throw NS_ERROR_UCONV_NOCONV
   *        The requested charset is not supported.
   */
  String getCharset();

  /**
   * Current character set.
   *
   * @throw NS_ERROR_UCONV_NOCONV
   *        The requested charset is not supported.
   */
  void setCharset(String aCharset);

}