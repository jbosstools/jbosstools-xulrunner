/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/protocol/http/public/nsIHttpEventSink.idl
 */

package org.mozilla.interfaces;

/**
 * nsIHttpEventSink
 *
 * Implement this interface to receive control over various HTTP events.  The
 * HTTP channel will try to get this interface from its notificationCallbacks
 * attribute, and if it doesn't find it there it will look for it from its
 * loadGroup's notificationCallbacks attribute.
 *
 * These methods are called before onStartRequest, and should be handled
 * SYNCHRONOUSLY.
 *
 * @deprecated Newly written code should use nsIChannelEventSink instead of this
 * interface.
 */
public interface nsIHttpEventSink extends nsISupports {

  String NS_IHTTPEVENTSINK_IID =
    "{9475a6af-6352-4251-90f9-d65b1cd2ea15}";

  /**
     * Called when a redirect occurs due to a HTTP response like 302.  The
     * redirection may be to a non-http channel.
     *
     * @return failure cancels redirect
     */
  void onRedirect(nsIHttpChannel httpChannel, nsIChannel newChannel);

}