/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIInputStreamChannel.idl
 */

package org.mozilla.interfaces;

/**
 * nsIInputStreamChannel
 *
 * This interface provides methods to initialize an input stream channel.
 * The input stream channel serves as a data pump for an input stream.
 */
public interface nsIInputStreamChannel extends nsISupports {

  String NS_IINPUTSTREAMCHANNEL_IID =
    "{274c4d7a-2447-4ceb-a6de-80db1b83f5d2}";

  /**
     * Sets the URI for this channel.  This must be called before the
     * channel is opened, and it may only be called once.
     */
  void setURI(nsIURI aURI);

  /**
     * Get/set the content stream
     *
     * This stream contains the data that will be pushed to the channel's
     * stream listener.  If the stream is non-blocking and supports the
     * nsIAsyncInputStream interface, then the stream will be read directly.
     * Otherwise, the stream will be read on a background thread.
     *
     * This attribute must be set before the channel is opened, and it may
     * only be set once.
     *
     * @throws NS_ERROR_IN_PROGRESS if the setter is called after the channel
     * has been opened.
     */
  nsIInputStream getContentStream();

  /**
     * Get/set the content stream
     *
     * This stream contains the data that will be pushed to the channel's
     * stream listener.  If the stream is non-blocking and supports the
     * nsIAsyncInputStream interface, then the stream will be read directly.
     * Otherwise, the stream will be read on a background thread.
     *
     * This attribute must be set before the channel is opened, and it may
     * only be set once.
     *
     * @throws NS_ERROR_IN_PROGRESS if the setter is called after the channel
     * has been opened.
     */
  void setContentStream(nsIInputStream aContentStream);

}