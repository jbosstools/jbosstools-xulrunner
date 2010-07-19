/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIRequestObserver.idl
 */

package org.mozilla.interfaces;

/**
 * nsIRequestObserver
 *
 * @status FROZEN
 */
public interface nsIRequestObserver extends nsISupports {

  String NS_IREQUESTOBSERVER_IID =
    "{fd91e2e0-1481-11d3-9333-00104ba0fd40}";

  /**
     * Called to signify the beginning of an asynchronous request.
     *
     * @param aRequest request being observed
     * @param aContext user defined context
     *
     * An exception thrown from onStartRequest has the side-effect of
     * causing the request to be canceled.
     */
  void onStartRequest(nsIRequest aRequest, nsISupports aContext);

  /**
     * Called to signify the end of an asynchronous request.  This
     * call is always preceded by a call to onStartRequest.
     *
     * @param aRequest request being observed
     * @param aContext user defined context
     * @param aStatusCode reason for stopping (NS_OK if completed successfully)
     *
     * An exception thrown from onStopRequest is generally ignored.
     */
  void onStopRequest(nsIRequest aRequest, nsISupports aContext, long aStatusCode);

}