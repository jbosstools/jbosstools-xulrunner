/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/mime/public/nsIMIMEHeaderParam.idl
 */

package org.mozilla.interfaces;

public interface nsIMIMEHeaderParam extends nsISupports {

  String NS_IMIMEHEADERPARAM_IID =
    "{ddbbdfb8-a1c0-4dd5-a31b-5d2a7a3bb6ec}";

  /** 
   * Given the value of a single header field  (such as
   * Content-Disposition and Content-Type) and the name of a parameter
   * (e.g. filename, name, charset), returns the value of the parameter.
   * The value is obtained by decoding RFC 2231-style encoding,
   * RFC 2047-style encoding, and converting to UniChar(UTF-16)
   * from charset specified in RFC 2231/2047 encoding, UTF-8, 
   * <code>aFallbackCharset</code>, the locale charset as fallback if
   * <code>TryLocaleCharset</code> is set, and null-padding as last resort
   * if all else fails.
   *
   * <p> 
   * This method internally invokes <code>getParameterInternal</code>, 
   * However, it does not stop at decoding RFC 2231 (the task for
   * <code>getParameterInternal</code> but tries to cope
   * with several non-standard-compliant cases mentioned below.
   *
   * <p>
   * Note that a lot of MUAs and HTTP servers put RFC 2047-encoded parameters 
   * in mail headers and HTTP headers. Unfortunately, this includes Mozilla 
   * as of 2003-05-30. Even more standard-ignorant MUAs, web servers and 
   * application servers put 'raw 8bit characters'. This will try to cope 
   * with all these cases as gracefully as possible. Additionally, it 
   * returns the language tag if the parameter is encoded per RFC 2231 and 
   * includes lang.
   *
   *
   *
   * @param  aHeaderVal        a header string to get the value of a parameter 
   *                           from.
   * @param  aParamName        the name of a MIME header parameter (e.g. 
   *                           filename, name, charset). If empty,  returns 
   *                           the first (possibly) _unnamed_ 'parameter'.
   * @param  aFallbackCharset  fallback charset to try if  the string after
   *                           RFC 2231/2047 decoding or the raw 8bit 
   *                           string is not UTF-8
   * @param  aTryLocaleCharset If set, makes yet another attempt 
   *                           with the locale charset.
   * @param  aLang             If non-null, assigns it to a pointer 
   *                           to a string containing the value of language 
   *                           obtained from RFC 2231 parsing. Caller has to 
   *                           nsMemory::Free it.
   * @return the value of <code>aParamName</code> in Unichar(UTF-16).
   */
  String getParameter(String aHeaderVal, String aParamName, String aFallbackCharset, boolean aTryLocaleCharset, String[] aLang);

}