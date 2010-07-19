/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIByteRangeRequest.idl
 */

package org.mozilla.interfaces;

public interface nsIByteRangeRequest extends nsISupports {

  String NS_IBYTERANGEREQUEST_IID =
    "{c1b1f426-7e83-4759-9f88-0e1b17f49366}";

  /** 
     * Returns true IFF this request is a byte range request, otherwise it
     * returns false (This is effectively the same as checking to see if 
     * |startRequest| is zero and |endRange| is the content length.)
     */
  boolean getIsByteRangeRequest();

  /** 
     * Absolute start position in remote file for this request.
     */
  long getStartRange();

  /**
     * Absolute end postion in remote file for this request
     */
  long getEndRange();

}