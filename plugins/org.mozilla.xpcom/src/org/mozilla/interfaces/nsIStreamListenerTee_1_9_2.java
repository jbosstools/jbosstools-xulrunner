/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIStreamListenerTee_1_9_2.idl
 */

package org.mozilla.interfaces;

/**
 * As data "flows" into a stream listener tee, it is copied to the output stream
 * and then forwarded to the real listener.
 */
public interface nsIStreamListenerTee_1_9_2 extends nsISupports {

  String NS_ISTREAMLISTENERTEE_1_9_2_IID =
    "{18b1e3d7-8083-4b19-a077-82ceea6fd296}";

  /** 
     * Initalize the tee.
     *
     * @param listener
     *    the original listener the tee will propagate onStartRequest,
     *    onDataAvailable and onStopRequest notifications to, exceptions from 
     *    the listener will be propagated back to the channel
     * @param sink
     *    the stream the data coming from the channel will be written to,
     *    should be blocking
     * @param requestObserver
     *    optional parameter, listener that gets only onStartRequest and
     *    onStopRequest notifications; exceptions threw within this optional
     *    observer are also propagated to the channel, but exceptions from
     *    the original listener (listener parameter) are privileged 
     */
  void initWithObserver(nsIStreamListener listener, nsIOutputStream sink, nsIRequestObserver requestObserver);

}