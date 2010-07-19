/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIStreamListener.idl
 */

package org.mozilla.interfaces;

/**
 * nsIStreamListener
 *
 * @status FROZEN
 */
public interface nsIStreamListener extends nsIRequestObserver {

  String NS_ISTREAMLISTENER_IID =
    "{1a637020-1482-11d3-9333-00104ba0fd40}";

  /**
     * Called when the next chunk of data (corresponding to the request) may
     * be read without blocking the calling thread.  The onDataAvailable impl
     * must read exactly |aCount| bytes of data before returning.
     *
     * @param aRequest request corresponding to the source of the data
     * @param aContext user defined context
     * @param aInputStream input stream containing the data chunk
     * @param aOffset
     *        Number of bytes that were sent in previous onDataAvailable calls
     *        for this request. In other words, the sum of all previous count
     *        parameters.
     *        If that number is greater than or equal to 2^32, this parameter
     *        will be PR_UINT32_MAX (2^32 - 1).
     * @param aCount number of bytes available in the stream
     *
     * NOTE: The aInputStream parameter must implement readSegments.
     *
     * An exception thrown from onDataAvailable has the side-effect of
     * causing the request to be canceled.
     */
  void onDataAvailable(nsIRequest aRequest, nsISupports aContext, nsIInputStream aInputStream, long aOffset, long aCount);

}