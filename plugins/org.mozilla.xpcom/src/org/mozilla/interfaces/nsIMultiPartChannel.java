/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIMultiPartChannel.idl
 */

package org.mozilla.interfaces;

/**
 * An interface to access the the base channel 
 * associated with a MultiPartChannel.
 */
public interface nsIMultiPartChannel extends nsISupports {

  String NS_IMULTIPARTCHANNEL_IID =
    "{ba78db7b-b88c-4b76-baf9-3c2296a585ae}";

  /**
     * readonly attribute to access the underlying channel
     */
  nsIChannel getBaseChannel();

  /**
     * Access to the Content-Disposition header field of this part of
     * a multipart message.  This allows getting the preferred
     * handling method, preferred filename, etc.  See RFC 2183.
     */
  String getContentDisposition();

  /**
     * Access to the Content-Disposition header field of this part of
     * a multipart message.  This allows getting the preferred
     * handling method, preferred filename, etc.  See RFC 2183.
     */
  void setContentDisposition(String aContentDisposition);

  /**
     * Attribute guaranteed to be different for different parts of
     * the same multipart document.
     */
  long getPartID();

  /**
     * Set to true when onStopRequest is received from the base channel.
     * The listener can check this from its onStopRequest to determine
     * whether more data can be expected.
     */
  boolean getIsLastPart();

}