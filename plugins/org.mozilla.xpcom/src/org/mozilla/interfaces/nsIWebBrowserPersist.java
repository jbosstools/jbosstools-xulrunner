/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/components/webbrowserpersist/public/nsIWebBrowserPersist.idl
 */

package org.mozilla.interfaces;

/**
 * Interface for persisting DOM documents and URIs to local or remote storage.
 *
 * @status UNDER_REVIEW
 */
public interface nsIWebBrowserPersist extends nsICancelable {

  String NS_IWEBBROWSERPERSIST_IID =
    "{dd4e0a6a-210f-419a-ad85-40e8543b9465}";

  /** No special persistence behaviour. */
  long PERSIST_FLAGS_NONE = 0L;

  /** Only use cached data (could result in failure if data is not cached). */
  long PERSIST_FLAGS_FROM_CACHE = 1L;

  /** Bypass the cached data. */
  long PERSIST_FLAGS_BYPASS_CACHE = 2L;

  /** Ignore any redirected data (usually adverts). */
  long PERSIST_FLAGS_IGNORE_REDIRECTED_DATA = 4L;

  /** Ignore IFRAME content (usually adverts). */
  long PERSIST_FLAGS_IGNORE_IFRAMES = 8L;

  /** Do not run the incoming data through a content converter e.g. to decompress it */
  long PERSIST_FLAGS_NO_CONVERSION = 16L;

  /** Replace existing files on the disk (use with due diligence!) */
  long PERSIST_FLAGS_REPLACE_EXISTING_FILES = 32L;

  /** Don't modify or add base tags */
  long PERSIST_FLAGS_NO_BASE_TAG_MODIFICATIONS = 64L;

  /** Make changes to original dom rather than cloning nodes */
  long PERSIST_FLAGS_FIXUP_ORIGINAL_DOM = 128L;

  /** Fix links relative to destination location (not origin) */
  long PERSIST_FLAGS_FIXUP_LINKS_TO_DESTINATION = 256L;

  /** Don't make any adjustments to links */
  long PERSIST_FLAGS_DONT_FIXUP_LINKS = 512L;

  /** Force serialization of output (one file at a time; not concurrent) */
  long PERSIST_FLAGS_SERIALIZE_OUTPUT = 1024L;

  /** Don't make any adjustments to filenames */
  long PERSIST_FLAGS_DONT_CHANGE_FILENAMES = 2048L;

  /** Fail on broken inline links */
  long PERSIST_FLAGS_FAIL_ON_BROKEN_LINKS = 4096L;

  /**
   * Automatically cleanup after a failed or cancelled operation, deleting all
   * created files and directories. This flag does nothing for failed upload
   * operations to remote servers.
   */
  long PERSIST_FLAGS_CLEANUP_ON_FAILURE = 8192L;

  /**
   * Let the WebBrowserPersist decide whether the incoming data is encoded
   * and whether it needs to go through a content converter e.g. to
   * decompress it.
   */
  long PERSIST_FLAGS_AUTODETECT_APPLY_CONVERSION = 16384L;

  /**
   * Append the downloaded data to the target file.
   * This can only be used when persisting to a local file.
   */
  long PERSIST_FLAGS_APPEND_TO_FILE = 32768L;

  /**
   * Force relevant cookies to be sent with this load even if normally they
   * wouldn't be.
   */
  long PERSIST_FLAGS_FORCE_ALLOW_COOKIES = 65536L;

  /**
   * Flags governing how data is fetched and saved from the network. 
   * It is best to set this value explicitly unless you are prepared
   * to accept the default values.
   */
  long getPersistFlags();

  /**
   * Flags governing how data is fetched and saved from the network. 
   * It is best to set this value explicitly unless you are prepared
   * to accept the default values.
   */
  void setPersistFlags(long aPersistFlags);

  /** Persister is ready to save data */
  long PERSIST_STATE_READY = 1L;

  /** Persister is saving data */
  long PERSIST_STATE_SAVING = 2L;

  /** Persister has finished saving data */
  long PERSIST_STATE_FINISHED = 3L;

  /**
   * Current state of the persister object.
   */
  long getCurrentState();

  /**
   * Value indicating the success or failure of the persist
   * operation.
   *
   * @return NS_OK Operation was successful or is still ongoing.
   * @return NS_BINDING_ABORTED Operation cancelled.
   * @return NS_ERROR_FAILURE Non-specific failure.
   */
  long getResult();

  /**
   * Callback listener for progress notifications. The object that the
   * embbedder supplies may also implement nsIInterfaceRequestor and be
   * prepared to return nsIAuthPrompt or other interfaces that may be required
   * to download data.
   *
   * @see nsIAuthPrompt
   * @see nsIInterfaceRequestor
   */
  nsIWebProgressListener getProgressListener();

  /**
   * Callback listener for progress notifications. The object that the
   * embbedder supplies may also implement nsIInterfaceRequestor and be
   * prepared to return nsIAuthPrompt or other interfaces that may be required
   * to download data.
   *
   * @see nsIAuthPrompt
   * @see nsIInterfaceRequestor
   */
  void setProgressListener(nsIWebProgressListener aProgressListener);

  /**
   * Save the specified URI to file.
   *
   * @param aURI       URI to save to file. Some implementations of this interface
   *                   may also support <CODE>nsnull</CODE> to imply the currently
   *                   loaded URI.
   * @param aCacheKey  An object representing the URI in the cache or
   *                   <CODE>nsnull</CODE>.  This can be a necko cache key,
   *                   an nsIWebPageDescriptor, or the currentDescriptor of an
   *                   nsIWebPageDescriptor.
   * @param aReferrer  The referrer URI to pass with an HTTP request or
   *                   <CODE>nsnull</CODE>.
   * @param aPostData  Post data to pass with an HTTP request or
   *                   <CODE>nsnull</CODE>.
   * @param aExtraHeaders Additional headers to supply with an HTTP request
   *                   or <CODE>nsnull</CODE>.
   * @param aFile      Target file. This may be a nsILocalFile object or an
   *                   nsIURI object with a file scheme or a scheme that
   *                   supports uploading (e.g. ftp).
   *
   * @see nsILocalFile
   * @see nsIURI
   * @see nsIInputStream
   *
   * @return NS_OK Operation has been started.
   * @return NS_ERROR_INVALID_ARG One or more arguments was invalid.
   */
  void saveURI(nsIURI aURI, nsISupports aCacheKey, nsIURI aReferrer, nsIInputStream aPostData, String aExtraHeaders, nsISupports aFile);

  /**
   * Save a channel to a file. It must not be opened yet.
   * @see saveURI
   */
  void saveChannel(nsIChannel aChannel, nsISupports aFile);

  /** Output only the current selection as opposed to the whole document. */
  long ENCODE_FLAGS_SELECTION_ONLY = 1L;

  /**
   * For plaintext output. Convert html to plaintext that looks like the html.
   * Implies wrap (except inside &lt;pre&gt;), since html wraps.
   * HTML output: always do prettyprinting, ignoring existing formatting.
   */
  long ENCODE_FLAGS_FORMATTED = 2L;

  /**
   * Output without formatting or wrapping the content. This flag
   * may be used to preserve the original formatting as much as possible.
   */
  long ENCODE_FLAGS_RAW = 4L;

  /** Output only the body section, no HTML tags. */
  long ENCODE_FLAGS_BODY_ONLY = 8L;

  /** Wrap even if when not doing formatted output (e.g. for text fields). */
  long ENCODE_FLAGS_PREFORMATTED = 16L;

  /** Wrap documents at the specified column. */
  long ENCODE_FLAGS_WRAP = 32L;

  /**
   * For plaintext output. Output for format flowed (RFC 2646). This is used
   * when converting to text for mail sending. This differs just slightly
   * but in an important way from normal formatted, and that is that
   * lines are space stuffed. This can't (correctly) be done later.
   */
  long ENCODE_FLAGS_FORMAT_FLOWED = 64L;

  /** Convert links to absolute links where possible. */
  long ENCODE_FLAGS_ABSOLUTE_LINKS = 128L;

  /** 
   * Attempt to encode entities standardized at W3C (HTML, MathML, etc).
   * This is a catch-all flag for documents with mixed contents. Beware of
   * interoperability issues. See below for other flags which might likely
   * do what you want.
   */
  long ENCODE_FLAGS_ENCODE_W3C_ENTITIES = 256L;

  /**
   * Output with carriage return line breaks. May also be combined with
   * ENCODE_FLAGS_LF_LINEBREAKS and if neither is specified, the platform
   * default format is used.
   */
  long ENCODE_FLAGS_CR_LINEBREAKS = 512L;

  /**
   * Output with linefeed line breaks. May also be combined with
   * ENCODE_FLAGS_CR_LINEBREAKS and if neither is specified, the platform
   * default format is used.
   */
  long ENCODE_FLAGS_LF_LINEBREAKS = 1024L;

  /** For plaintext output. Output the content of noscript elements. */
  long ENCODE_FLAGS_NOSCRIPT_CONTENT = 2048L;

  /** For plaintext output. Output the content of noframes elements. */
  long ENCODE_FLAGS_NOFRAMES_CONTENT = 4096L;

  /**
   * Encode basic entities, e.g. output &nbsp; instead of character code 0xa0. 
   * The basic set is just &nbsp; &amp; &lt; &gt; &quot; for interoperability
   * with older products that don't support &alpha; and friends.
   */
  long ENCODE_FLAGS_ENCODE_BASIC_ENTITIES = 8192L;

  /**
   * Encode Latin1 entities. This includes the basic set and
   * accented letters between 128 and 255.
   */
  long ENCODE_FLAGS_ENCODE_LATIN1_ENTITIES = 16384L;

  /**
   * Encode HTML4 entities. This includes the basic set, accented
   * letters, greek letters and certain special markup symbols.
   */
  long ENCODE_FLAGS_ENCODE_HTML_ENTITIES = 32768L;

  /**
   * Save the specified DOM document to file and optionally all linked files
   * (e.g. images, CSS, JS & subframes). Do not call this method until the
   * document has finished loading!
   *
   * @param aDocument          Document to save to file. Some implementations of
   *                           this interface may also support <CODE>nsnull</CODE>
   *                           to imply the currently loaded document.
   * @param aFile              Target local file. This may be a nsILocalFile object or an
   *                           nsIURI object with a file scheme or a scheme that
   *                           supports uploading (e.g. ftp).
   * @param aDataPath          Path to directory where URIs linked to the document
   *                           are saved or nsnull if no linked URIs should be saved.
   *                           This may be a nsILocalFile object or an nsIURI object
   *                           with a file scheme.
   * @param aOutputContentType The desired MIME type format to save the 
   *                           document and all subdocuments into or nsnull to use
   *                           the default behaviour.
   * @param aEncodingFlags     Flags to pass to the encoder.
   * @param aWrapColumn        For text documents, indicates the desired width to
   *                           wrap text at. Parameter is ignored if wrapping is not
   *                           specified by the encoding flags.
   *
   * @see nsILocalFile
   * @see nsIURI
   *
   * @return NS_OK Operation has been started.
   * @return NS_ERROR_INVALID_ARG One or more arguments was invalid.
   */
  void saveDocument(nsIDOMDocument aDocument, nsISupports aFile, nsISupports aDataPath, String aOutputContentType, long aEncodingFlags, long aWrapColumn);

  /**
   * Cancels the current operation. The caller is responsible for cleaning up
   * partially written files or directories. This has the same effect as calling
   * cancel with an argument of NS_BINDING_ABORTED.
   */
  void cancelSave();

}