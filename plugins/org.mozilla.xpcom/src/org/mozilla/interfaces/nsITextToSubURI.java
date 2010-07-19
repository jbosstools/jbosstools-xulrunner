/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/intl/uconv/idl/nsITextToSubURI.idl
 */

package org.mozilla.interfaces;

public interface nsITextToSubURI extends nsISupports {

  String NS_ITEXTTOSUBURI_IID =
    "{8b042e24-6f87-11d3-b3c8-00805f8a6670}";

  String convertAndEscape(String charset, String text);

  String unEscapeAndConvert(String charset, String text);

  /**
   * Unescapes the given URI fragment (for UI purpose only)
   * Note: 
   * <ul>
   *  <li> escaping back the result (unescaped string) is not guaranteed to 
   *       give the original escaped string
   *  <li> In case of a conversion error, the URI fragment (escaped) is 
   *       assumed to be in UTF-8 and converted to AString (UTF-16)
   *  <li> Always succeeeds (callers don't need to do error checking)
   * </ul>
   *
   * @param aCharset the charset to convert from
   * @param aURIFragment the URI (or URI fragment) to unescape
   * @return Unescaped aURIFragment  converted to unicode
   */
  String unEscapeURIForUI(String aCharset, String aURIFragment);

  /**
   * Unescapes only non ASCII characters in the given URI fragment 
   * note: this method assumes the URI as UTF-8 and fallbacks to the given charset
   * in case the data is not UTF-8
   *
   * @param aCharset the charset to convert from
   * @param aURIFragment the URI (or URI fragment) to unescape
   * @return Unescaped aURIFragment  converted to unicode
   * @throws NS_ERROR_UCONV_NOCONV when there is no decoder for aCharset
   *         or error code of nsIUnicodeDecoder in case of conversion failure
   */
  String unEscapeNonAsciiURI(String aCharset, String aURIFragment);

}