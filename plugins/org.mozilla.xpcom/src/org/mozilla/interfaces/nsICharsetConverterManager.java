/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/intl/uconv/idl/nsICharsetConverterManager.idl
 */

package org.mozilla.interfaces;

/**
 *
 * Here Charsets are identified by ASCII strings. Charset alias
 * resolution is provided by default in most methods. "Raw"
 * versions that do not need this resolution are also provided.
 *
 * @created         21/Feb/2000
 * @author  Catalin Rotaru [CATA]
 */
public interface nsICharsetConverterManager extends nsISupports {

  String NS_ICHARSETCONVERTERMANAGER_IID =
    "{f5323a76-c8f7-4c65-8d0c-1250e969c7d5}";

  /**
     * Get the Unicode decoder for the given charset.
     * The "Raw" version skips charset alias resolution
     */
  nsISupports getUnicodeDecoder(String charset);

  nsISupports getUnicodeDecoderRaw(String charset);

  /**
     * Get the Unicode encoder for the given charset.
     * The "Raw" version skips charset alias resolution
     */
  nsISupports getUnicodeEncoder(String charset);

  nsISupports getUnicodeEncoderRaw(String charset);

  /**
     * A shortcut to calling nsICharsetAlias to do alias resolution
     */
  String getCharsetAlias(String charset);

  /**
     * Get the complete list of available decoders.
     */
  nsIUTF8StringEnumerator getDecoderList();

  /**
     * Get the complete list of available encoders.
     */
  nsIUTF8StringEnumerator getEncoderList();

  /**
     * Get the complete list of available charset detectors.
     */
  nsIUTF8StringEnumerator getCharsetDetectorList();

  /**
     * Get the human-readable name for the given charset.
     */
  String getCharsetTitle(String charset);

  /**
     * Get some data about the given charset. This includes whether the 
     * character encoding may be used for certain purposes, if it is 
     * multi-byte, and the language code for it. See charsetData.properties
     * for the source of this data. Some known property names:
     *    notForBrowser  - not to be used in the bowser.
     *    notForOutgoing - not to be used for exporting files.
     *    LangGroup      - language code for charset, e.g. 'he' and 'zh-CN'.
     *    isMultibyte    - is this a multi-byte charset?
     * 
     * @param charset name of the character encoding, e.g. 'iso-8859-15'.
     * @param prop property desired for the character encoding.
     * @return the value of the property, for the character encoding.
     */
  String getCharsetData(String charset, String prop);

  /**
     * Get the language group for the given charset. This is similar to 
     * calling <tt>getCharsetData</tt> with the <tt>prop</tt> "LangGroup".
     * 
     * @param charset name of the character encoding, e.g. 'iso-8859-15'.
     * @return the language code for the character encoding.
     */
  nsIAtom getCharsetLangGroup(String charset);

  nsIAtom getCharsetLangGroupRaw(String charset);

}