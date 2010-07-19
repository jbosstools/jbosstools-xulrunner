/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIUnicharStreamListener.idl
 */

package org.mozilla.interfaces;

/**
 * nsIUnicharStreamListener is very similar to nsIStreamListener with
 * the difference being that this interface gives notifications about
 * data being available after the raw data has been converted to
 * UTF-16.
 *
 * nsIUnicharStreamListener
 *
 * @status FROZEN
 */
public interface nsIUnicharStreamListener extends nsIRequestObserver {

  String NS_IUNICHARSTREAMLISTENER_IID =
    "{4a7e9b62-fef8-400d-9865-d6820f630b4c}";

  /**
     * Called when the next chunk of data (corresponding to the
     * request) is available.
     *
     * @param aRequest request corresponding to the source of the data
     * @param aContext user defined context
     * @param aData the data chunk
     *
     * An exception thrown from onUnicharDataAvailable has the
     * side-effect of causing the request to be canceled.
     */
  void onUnicharDataAvailable(nsIRequest aRequest, nsISupports aContext, String aData);

}