/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/browser/webBrowser/nsIWebBrowserStream.idl
 */

package org.mozilla.interfaces;

/**
 * This interface provides a way to stream data to the web browser. This allows
 * loading of data from sources which can not be accessed using URIs and
 * nsIWebNavigation.
 *
 * @status FROZEN
 */
public interface nsIWebBrowserStream extends nsISupports {

  String NS_IWEBBROWSERSTREAM_IID =
    "{86d02f0e-219b-4cfc-9c88-bd98d2cce0b8}";

  /**
   * Prepare to load a stream of data. When this function returns successfully,
   * it must be paired by a call to closeStream.
   *
   * @param aBaseURI
   *        The base URI of the data. Must not be null. Relative
   *        URIs will be resolved relative to this URI.
   * @param aContentType
   *        ASCII string giving the content type of the data. If rendering
   *        content of this type is not supported, this method fails.
   *        This string may include a charset declaration, for example:
   *        text/html;charset=ISO-8859-1
   *
   * @throw NS_ERROR_NOT_AVAILABLE
   *        The requested content type is not supported.
   * @throw NS_ERROR_IN_PROGRESS
   *        openStream was called twice without an intermediate closeStream.
   */
  void openStream(nsIURI aBaseURI, String aContentType);

  /**
   * Append data to this stream.
   * @param aData The data to append
   * @param aLen  Length of the data to append.
   *
   * @note To append more than 4 GB of data, call this method multiple times.
   */
  void appendToStream(byte[] aData, long aLen);

  /**
   * Notifies the browser that all the data has been appended. This may notify
   * the user that the browser is "done loading" in some form.
   *
   * @throw NS_ERROR_UNEXPECTED
   *        This method was called without a preceding openStream.
   */
  void closeStream();

}