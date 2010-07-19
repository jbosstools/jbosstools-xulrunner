/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIUploadChannel2.idl
 */

package org.mozilla.interfaces;

public interface nsIUploadChannel2 extends nsISupports {

  String NS_IUPLOADCHANNEL2_IID =
    "{8821e259-7252-4464-b874-a55d8ef6b222}";

  /**
     * Sets a stream to be uploaded by this channel with the specified
     * Content-Type and Content-Length header values.
     *
     * Most implementations of this interface require that the stream:
     *   (1) implement threadsafe addRef and release
     *   (2) implement nsIInputStream::readSegments
     *   (3) implement nsISeekableStream::seek
     *
     * @param aStream
     *        The stream to be uploaded by this channel.
     * @param aContentType
     *        This value will replace any existing Content-Type
     *        header on the HTTP request, regardless of whether
     *        or not its empty.
     * @param aContentLength
     *        A value of -1 indicates that the length of the stream should be
     *        determined by calling the stream's |available| method.
     * @param aMethod
     *        The HTTP request method to set on the stream.
     * @param aStreamHasHeaders
     *        True if the stream already contains headers for the HTTP request.
     */
  void explicitSetUploadStream(nsIInputStream aStream, String aContentType, long aContentLength, String aMethod, boolean aStreamHasHeaders);

}