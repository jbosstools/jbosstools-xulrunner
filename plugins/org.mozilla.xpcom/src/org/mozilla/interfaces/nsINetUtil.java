/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsINetUtil.idl
 */

package org.mozilla.interfaces;

/**
 * nsINetUtil provides various network-related utility methods.
 */
public interface nsINetUtil extends nsISupports {

  String NS_INETUTIL_IID =
    "{a50d5516-5c0a-4f08-b427-703ca0c44ac3}";

  /**
   * Parse a content-type header and return the content type and
   * charset (if any).
   *
   * @param aTypeHeader the header string to parse
   * @param [out] aCharset the charset parameter specified in the
   *              header, if any.
   * @param [out] aHadCharset whether a charset was explicitly specified.
   * @return the MIME type specified in the header, in lower-case.
   */
  String parseContentType(String aTypeHeader, String[] aCharset, boolean[] aHadCharset);

  /**
   * Test whether the given URI's handler has the given protocol flags.
   *
   * @param aURI the URI in question
   * @param aFlags the flags we're testing for.
   *
   * @return whether the protocol handler for aURI has all the flags
   *         in aFlags.
   */
  boolean protocolHasFlags(nsIURI aURI, long aFlag);

  /**
   * Test whether the protocol handler for this URI or that for any of
   * its inner URIs has the given protocol flags.  This will QI aURI to
   * nsINestedURI and walk the nested URI chain.
   *
   * @param aURI the URI in question
   * @param aFlags the flags we're testing for.
   *
   * @return whether any of the protocol handlers involved have all the flags
   *         in aFlags.
   */
  boolean uRIChainHasFlags(nsIURI aURI, long aFlags);

  /**
   * Take aURI and produce an immutable version of it for the caller.  If aURI
   * is immutable this will be aURI itself; otherwise this will be a clone,
   * marked immutable if possible.  Passing null to this method is allowed; in
   * that case it will return null.
   */
  nsIURI toImmutableURI(nsIURI aURI);

  /** Escape every character with its %XX-escaped equivalent */
  long ESCAPE_ALL = 0L;

  /** Leave alphanumeric characters intact and %XX-escape all others */
  long ESCAPE_XALPHAS = 1L;

  /** Leave alphanumeric characters intact, convert spaces to '+',
      %XX-escape all others */
  long ESCAPE_XPALPHAS = 2L;

  /** Leave alphanumeric characters and forward slashes intact,
      %XX-escape all others */
  long ESCAPE_URL_PATH = 4L;

  /**
   * escape a string with %00-style escaping
   */
  String escapeString(String aString, long aEscapeType);

  /** %XX-escape URL scheme */
  long ESCAPE_URL_SCHEME = 1L;

  /** %XX-escape username in the URL */
  long ESCAPE_URL_USERNAME = 2L;

  /** %XX-escape password in the URL */
  long ESCAPE_URL_PASSWORD = 4L;

  /** %XX-escape URL host */
  long ESCAPE_URL_HOST = 8L;

  /** %XX-escape URL directory */
  long ESCAPE_URL_DIRECTORY = 16L;

  /** %XX-escape file basename in the URL */
  long ESCAPE_URL_FILE_BASENAME = 32L;

  /** %XX-escape file extension in the URL */
  long ESCAPE_URL_FILE_EXTENSION = 64L;

  /** %XX-escape URL parameters */
  long ESCAPE_URL_PARAM = 128L;

  /** %XX-escape URL query */
  long ESCAPE_URL_QUERY = 256L;

  /** %XX-escape URL ref */
  long ESCAPE_URL_REF = 512L;

  /** %XX-escape URL path - same as escaping directory, basename and extension */
  long ESCAPE_URL_FILEPATH = 112L;

  /** %XX-escape scheme, username, password, host, path, params, query and ref */
  long ESCAPE_URL_MINIMAL = 1023L;

  /** Force %XX-escaping of already escaped sequences */
  long ESCAPE_URL_FORCED = 1024L;

  /** Skip non-ascii octets, %XX-escape all others */
  long ESCAPE_URL_ONLY_ASCII = 2048L;

  /** 
   * Skip graphic octets (0x20-0x7E) when escaping
   * Skips all ASCII octets (0x00-0x7F) when unescaping 
   */
  long ESCAPE_URL_ONLY_NONASCII = 4096L;

  /** Force %XX-escape of colon */
  long ESCAPE_URL_COLON = 16384L;

  /** Skip C0 and DEL from unescaping */
  long ESCAPE_URL_SKIP_CONTROL = 32768L;

  /**
   * %XX-Escape invalid chars in a URL segment. 
   *
   * @param aStr the URL to be escaped
   * @param aFlags the URL segment type flags
   *
   * @return the escaped string (the string itself if escaping did not happen)
   *
   */
  String escapeURL(String aStr, long aFlags);

  /**
   * Expands URL escape sequences
   *
   * @param aStr the URL to be unescaped
   * @param aFlags only ESCAPE_URL_ONLY_NONASCII and ESCAPE_URL_SKIP_CONTROL
   *               are recognized.  If |aFlags| is 0 all escape sequences are 
   *               unescaped
   * @return unescaped string
   */
  String unescapeString(String aStr, long aFlags);

  /**
   * Extract the charset parameter location and value from a content-type
   * header.
   *
   * @param aTypeHeader the header string to parse
   * @param [out] aCharset the charset parameter specified in the
   *              header, if any.
   * @param [out] aCharsetStart index of the start of the charset parameter
   *              (the ';' separating it from what came before) in aTypeHeader.
   *              If this function returns false, this argument will still be
   *              set, to the index of the location where a new charset should
   *              be inserted.
   * @param [out] aCharsetEnd index of the end of the charset parameter (the
   *              ';' separating it from what comes after, or the end
   *              of the string) in aTypeHeader.  If this function returns
   *              false, this argument will still be set, to the index of the
   *              location where a new charset should be inserted.
   *
   * @return whether a charset parameter was found.  This can be false even in
   * cases when parseContentType would claim to have a charset, if the type
   * that won out does not have a charset parameter specified.
   */
  boolean extractCharsetFromContentType(String aTypeHeader, String[] aCharset, int[] aCharsetStart, int[] aCharsetEnd);

}