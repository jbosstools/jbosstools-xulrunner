/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIChannelEventSink.idl
 */

package org.mozilla.interfaces;

/**
 * Implement this interface to receive control over various channel events.
 * Channels will try to get this interface from a channel's
 * notificationCallbacks or, if not available there, from the loadGroup's
 * notificationCallbacks.
 *
 * These methods are called before onStartRequest, and should be handled
 * SYNCHRONOUSLY.
 */
public interface nsIChannelEventSink extends nsISupports {

  String NS_ICHANNELEVENTSINK_IID =
    "{6757d790-2916-498e-aaca-6b668a956875}";

  /**
     * This is a temporary redirect. New requests for this resource should
     * continue to use the URI of the old channel.
     *
     * The new URI may be identical to the old one.
     */
  long REDIRECT_TEMPORARY = 1L;

  /**
     * This is a permanent redirect. New requests for this resource should use
     * the URI of the new channel (This might be an HTTP 301 reponse).
     * If this flag is not set, this is a temporary redirect.
     *
     * The new URI may be identical to the old one.
     */
  long REDIRECT_PERMANENT = 2L;

  /**
     * This is an internal redirect, i.e. it was not initiated by the remote
     * server, but is specific to the channel implementation.
     *
     * The new URI may be identical to the old one.
     */
  long REDIRECT_INTERNAL = 4L;

  /**
     * Called when a redirect occurs. This may happen due to an HTTP 3xx status
     * code.
     *
     * @param oldChannel
     *        The channel that's being redirected.
     * @param newChannel
     *        The new channel. This channel is not opened yet.
     * @param flags
     *        Flags indicating the type of redirect. A bitmask consisting
     *        of flags from above.
     *        One of REDIRECT_TEMPORARY and REDIRECT_PERMANENT will always be
     *        set.
     *
     * @throw <any> Throwing an exception will cancel the load. No network
     * request for the new channel will be made.
     */
  void onChannelRedirect(nsIChannel oldChannel, nsIChannel newChannel, long flags);

}