/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIUploadChannel.idl
 */

package org.mozilla.interfaces;

/**
 * nsIUploadChannel
 *
 * A channel may optionally implement this interface if it supports the
 * notion of uploading a data stream.  The upload stream may only be set
 * prior to the invocation of asyncOpen on the channel.
 *
 * @status FROZEN
 */
public interface nsIUploadChannel extends nsISupports {

  String NS_IUPLOADCHANNEL_IID =
    "{ddf633d8-e9a4-439d-ad88-de636fd9bb75}";

  /**
     * Sets a stream to be uploaded by this channel.
     *
     * Most implementations of this interface require that the stream:
     *   (1) implement threadsafe addRef and release
     *   (2) implement nsIInputStream::readSegments
     *   (3) implement nsISeekableStream::seek
     *
     * History here is that we need to support both streams that already have
     * headers (e.g., Content-Type and Content-Length) information prepended to
     * the stream (by plugins) as well as clients (composer, uploading
     * application) that want to upload data streams without any knowledge of
     * protocol specifications.  For this reason, we have a special meaning
     * for the aContentType parameter (see below).
     * 
     * @param aStream
     *        The stream to be uploaded by this channel.
     * @param aContentType
     *        If aContentType is empty, the protocol will assume that no
     *        content headers are to be added to the uploaded stream and that
     *        any required headers are already encoded in the stream.  In the
     *        case of HTTP, if this parameter is non-empty, then its value will
     *        replace any existing Content-Type header on the HTTP request.
     *        In the case of FTP and FILE, this parameter is ignored.
     * @param aContentLength
     *        A value of -1 indicates that the length of the stream should be
     *        determined by calling the stream's |available| method.
     */
  void setUploadStream(nsIInputStream aStream, String aContentType, int aContentLength);

  /**
     * Get the stream (to be) uploaded by this channel.
     */
  nsIInputStream getUploadStream();

}