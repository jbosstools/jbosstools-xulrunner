/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsIDocumentEncoder.idl
 */

package org.mozilla.interfaces;

public interface nsIDocumentEncoder extends nsISupports {

  String NS_IDOCUMENTENCODER_IID =
    "{f85c5a20-258d-11db-a98b-0800200c9a66}";

  /** 
   * Output only the selection (as opposed to the whole document).
   */
  long OutputSelectionOnly = 1L;

  /** Plaintext output: Convert html to plaintext that looks like the html.
    * Implies wrap (except inside <pre>), since html wraps.
    * HTML, XHTML and XML output: do prettyprinting, ignoring existing formatting.
    * XML output : it doesn't implicitly wrap
    */
  long OutputFormatted = 2L;

  /** Don't do prettyprinting. Don't do any wrapping that's not in the existing
   * HTML/XML source. This option overrides OutputFormatted if both are set.
   * HTML/XHTML output: If neither are set, there won't be prettyprinting too, but
   * long lines will be wrapped.
   * Supported also in XML and Plaintext output.
   * @note This option does not affect entity conversion.
   */
  long OutputRaw = 4L;

  /** 
   * Do not print html head tags.
   * XHTML/HTML output only.
   */
  long OutputBodyOnly = 8L;

  /**
   * Output as though the content is preformatted
   * (e.g. maybe it's wrapped in a PRE or PRE_WRAP style tag)
   * Plaintext output only.
   * XXXbz How does this interact with
   * OutputFormatted/OutputRaw/OutputPreformatted/OutputFormatFlowed?
   */
  long OutputPreformatted = 16L;

  /**
   * Wrap even if we're not doing formatted output (e.g. for text fields).
   * Supported in XML, XHTML, HTML and Plaintext output.
   * Set implicitly in HTML/XHTML output when no OutputRaw.
   * Ignored when OutputRaw.
   * XXXLJ: set implicitly in HTML/XHTML output, to keep compatible behaviors
   *        for old callers of this interface
   * XXXbz How does this interact with OutputFormatFlowed?
   */
  long OutputWrap = 32L;

  /**
   * Output for format flowed (RFC 2646). This is used when converting
   * to text for mail sending. This differs just slightly
   * but in an important way from normal formatted, and that is that
   * lines are space stuffed. This can't (correctly) be done later.
   * PlainText output only.
   * XXXbz How does this interact with
   * OutputFormatted/OutputRaw/OutputPreformatted/OutputWrap?
   */
  long OutputFormatFlowed = 64L;

  /**
   * Convert links, image src, and script src to absolute URLs when possible.
   * XHTML/HTML output only.
   */
  long OutputAbsoluteLinks = 128L;

  /**
   * Attempt to encode entities standardized at W3C (HTML, MathML, etc).
   * This is a catch-all flag for documents with mixed contents. Beware of
   * interoperability issues. See below for other flags which might likely
   * do what you want.
   * XHTML/HTML output only.
   */
  long OutputEncodeW3CEntities = 256L;

  /** 
   * LineBreak processing: if this flag is set than CR line breaks will
   * be written. If neither this nor OutputLFLineBreak is set, then we
   * will use platform line breaks. The combination of the two flags will
   * cause CRLF line breaks to be written.
   */
  long OutputCRLineBreak = 512L;

  /** 
   * LineBreak processing: if this flag is set than LF line breaks will
   * be written. If neither this nor OutputCRLineBreak is set, then we
   * will use platform line breaks. The combination of the two flags will
   * cause CRLF line breaks to be written.
   */
  long OutputLFLineBreak = 1024L;

  /**
   * Output the content of noscript elements (only for serializing
   * to plaintext).
   */
  long OutputNoScriptContent = 2048L;

  /**
   * Output the content of noframes elements (only for serializing
   * to plaintext).
   */
  long OutputNoFramesContent = 4096L;

  /**
   * Don't allow any formatting nodes (e.g. <br>, <b>) inside a <pre>.
   * This is used primarily by mail. XHTML/HTML output only.
   */
  long OutputNoFormattingInPre = 8192L;

  /**
   * Encode entities when outputting to a string.
   * E.g. If set, we'll output &nbsp; if clear, we'll output 0xa0.
   * The basic set is just &nbsp; &amp; &lt; &gt; &quot; for interoperability
   * with older products that don't support &alpha; and friends.
   * XHTML/HTML output only.
   */
  long OutputEncodeBasicEntities = 16384L;

  /**
   * Encode entities when outputting to a string.
   * The Latin1 entity set additionally includes 8bit accented letters
   * between 128 and 255.
   * XHTML/HTML output only.
   */
  long OutputEncodeLatin1Entities = 32768L;

  /**
   * Encode entities when outputting to a string.
   * The HTML entity set additionally includes accented letters, greek
   * letters, and other special markup symbols as defined in HTML4.
   * XHTML/HTML output only.
   */
  long OutputEncodeHTMLEntities = 65536L;

  /**
   * Normally &nbsp; is replaced with a space character when
   * encoding data as plain text, set this flag if that's
   * not desired.
   * Plaintext output only.
   */
  long OutputPersistNBSP = 131072L;

  /**
   * Normally when serializing the whole document using the HTML or 
   * XHTML serializer, the encoding declaration is rewritten to match.
   * This flag suppresses that behavior.
   */
  long OutputDontRewriteEncodingDeclaration = 262144L;

  /**
   * Initialize with a pointer to the document and the mime type.
   * @param aDocument Document to encode.
   * @param aMimeType MimeType to use. May also be set by SetMimeType.
   * @param aFlags Flags to use while encoding. May also be set by SetFlags.
   */
  void init(nsIDOMDocument aDocument, String aMimeType, long aFlags);

  /**
   *  If the selection is set to a non-null value, then the
   *  selection is used for encoding, otherwise the entire
   *  document is encoded.
   * @param aSelection The selection to encode.
   */
  void setSelection(nsISelection aSelection);

  /**
   *  If the range is set to a non-null value, then the
   *  range is used for encoding, otherwise the entire
   *  document or selection is encoded.
   * @param aRange The range to encode.
   */
  void setRange(nsIDOMRange aRange);

  /**
   *  If the node is set to a non-null value, then the
   *  node is used for encoding, otherwise the entire
   *  document or range or selection is encoded.
   * @param aNode The node to encode.
   */
  void setNode(nsIDOMNode aNode);

  /**
   *  If the container is set to a non-null value, then its
   *  child nodes are used for encoding, otherwise the entire
   *  document or range or selection or node is encoded.
   *  @param aContainer The node which child nodes will be encoded.
   */
  void setContainerNode(nsIDOMNode aContainer);

  /**
   *  Documents typically have an intrinsic character set,
   *  but if no intrinsic value is found, the platform character set
   *  is used. This function overrides both the intrinisc and platform
   *  charset.
   *  @param aCharset Overrides the both the intrinsic or platform
   *  character set when encoding the document.
   *
   *  Possible result codes: NS_ERROR_NO_CHARSET_CONVERTER
   */
  void setCharset(String aCharset);

  /**
   *  Set a wrap column.  This may have no effect in some types of encoders.
   * @param aWrapColumn Column to which to wrap.
   */
  void setWrapColumn(long aWrapColumn);

  /**
   *  The mime type preferred by the encoder.  This piece of api was
   *  added because the copy encoder may need to switch mime types on you
   *  if you ask it to copy html that really represents plaintext content.
   *  Call this AFTER Init() and SetSelection() have both been called.
   */
  String getMimeType();

  /**
   *  Encode the document and send the result to the nsIOutputStream.
   *
   *  Possible result codes are the stream errors which might have
   *  been encountered.
   * @param aStream Stream into which to encode.
   */
  void encodeToStream(nsIOutputStream aStream);

  /**
   * Encode the document into a string.
   *
   * @return The document encoded into a string.
   */
  String encodeToString();

  /**
   * Encode the document into a string. Stores the extra context information
   * into the two arguments.
   * @param [OUT] aContextString The string where the parent heirarchy
   *              information will be stored.
   * @param [OUT] aInfoString The string where extra context info will
   *              be stored.
   * @return The document encoded as a string.
   * 
   */
  String encodeToStringWithContext(String[] aContextString, String[] aInfoString);

  /**
   * Set the fixup object associated with node persistence.
   * @param aFixup The fixup object.
   */
  void setNodeFixup(nsIDocumentEncoderNodeFixup aFixup);

}