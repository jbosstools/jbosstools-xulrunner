/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIEncodedChannel.idl
 */

package org.mozilla.interfaces;

/**
 * A channel interface which allows special handling of encoded content
 */
public interface nsIEncodedChannel extends nsISupports {

  String NS_IENCODEDCHANNEL_IID =
    "{30d7ec3a-f376-4652-9276-3092ec57abb6}";

  /**
     * This attribute holds the MIME types corresponding to the content
     * encodings on the channel.  The enumerator returns nsISupportsCString
     * objects.  The first one corresponds to the outermost encoding on the
     * channel and then we work our way inward.  "identity" is skipped and not
     * represented on the list.  Unknown encodings make the enumeration stop.
     * If you want the actual Content-Encoding value, use
     * getResponseHeader("Content-Encoding").
     *
     * When there is no Content-Encoding header, this property is null.
     *
     * Modifying the Content-Encoding header on the channel will cause
     * this enumerator to have undefined behavior.  Don't do it.
     *
     * Also note that contentEncodings only exist during or after OnStartRequest.
     * Calling contentEncodings before OnStartRequest is an error.
     */
  nsIUTF8StringEnumerator getContentEncodings();

  /**
     * This attribute controls whether or not content conversion should be
     * done per the Content-Encoding response header.  applyConversion can only 
     * be set before or during OnStartRequest.  Calling this during 
     * OnDataAvailable is an error. 
     *
     * TRUE by default.
     */
  boolean getApplyConversion();

  /**
     * This attribute controls whether or not content conversion should be
     * done per the Content-Encoding response header.  applyConversion can only 
     * be set before or during OnStartRequest.  Calling this during 
     * OnDataAvailable is an error. 
     *
     * TRUE by default.
     */
  void setApplyConversion(boolean aApplyConversion);

}