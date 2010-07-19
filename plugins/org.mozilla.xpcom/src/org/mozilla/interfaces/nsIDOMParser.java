/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsIDOMParser.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMParser interface is a non-SAX interface that can be used
 * to parse a string or byte stream containing XML or HTML content
 * to a DOM document. Parsing is always synchronous - a document is always
 * returned from the parsing methods. This is as opposed to loading and
 * parsing with the XMLHttpRequest interface, which can be used for
 * asynchronous (callback-based) loading.
 */
public interface nsIDOMParser extends nsISupports {

  String NS_IDOMPARSER_IID =
    "{5677f36e-1842-4c6f-a39c-2e5576ab8b40}";

  /**
   * The string passed in is parsed into a DOM document.
   *
   * @param str The UTF16 string to be parsed
   * @param contentType The content type of the string (see parseFromStream)
   * @returns The DOM document created as a result of parsing the 
   *          string
   */
  nsIDOMDocument parseFromString(String str, String contentType);

  /**
   * The buffer is parsed into a DOM document.
   * The charset is determined from the xml entity decl.
   *
   * @param buf The octet array data to be parsed
   * @param bufLen Length (in bytes) of the data
   * @param contentType The content type of the data (see parseFromStream)
   * @returns The DOM document created as a result of parsing the 
   *          string
   */
  nsIDOMDocument parseFromBuffer(byte[] buf, long bufLen, String contentType);

  /**
   * The byte stream passed in is parsed into a DOM document.
   *
   * Not accessible from web content.
   *
   * @param stream The byte stream whose contents are parsed
   * @param charset The character set that was used to encode the byte
   *                stream. NULL if not specified.
   * @param contentLength The number of bytes in the input stream.
   * @param contentType The content type of the string - either text/xml,
   *                    application/xml, or application/xhtml+xml.
   *                    Must not be NULL.
   * @returns The DOM document created as a result of parsing the 
   *          stream
   */
  nsIDOMDocument parseFromStream(nsIInputStream stream, String charset, int contentLength, String contentType);

}