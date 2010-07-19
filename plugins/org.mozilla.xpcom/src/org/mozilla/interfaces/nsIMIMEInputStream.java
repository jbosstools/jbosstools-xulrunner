/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIMIMEInputStream.idl
 */

package org.mozilla.interfaces;

/**
 * The MIME stream separates headers and a datastream. It also allows
 * automatic creation of the content-length header.
 */
public interface nsIMIMEInputStream extends nsIInputStream {

  String NS_IMIMEINPUTSTREAM_IID =
    "{dcbce63c-1dd1-11b2-b94d-91f6d49a3161}";

  /**
     * When true a "Content-Length" header is automatically added to the
     * stream. The value of the content-length is automatically calculated
     * using the available() method on the data stream. The value is
     * recalculated every time the stream is rewinded to the start.
     * Not allowed to be changed once the stream has been started to be read.
     */
  boolean getAddContentLength();

  /**
     * When true a "Content-Length" header is automatically added to the
     * stream. The value of the content-length is automatically calculated
     * using the available() method on the data stream. The value is
     * recalculated every time the stream is rewinded to the start.
     * Not allowed to be changed once the stream has been started to be read.
     */
  void setAddContentLength(boolean aAddContentLength);

  /**
     * Adds an additional header to the stream on the form "name: value". May
     * not be called once the stream has been started to be read.
     * @param name   name of the header
     * @param value  value of the header
     */
  void addHeader(String name, String value);

  /**
     * Sets data-stream. May not be called once the stream has been started
     * to be read.
     * The cursor of the new stream should be located at the beginning of the
     * stream if the implementation of the nsIMIMEInputStream also is used as
     * an nsISeekableStream.
     * @param stream  stream containing the data for the stream
     */
  void setData(nsIInputStream stream);

}