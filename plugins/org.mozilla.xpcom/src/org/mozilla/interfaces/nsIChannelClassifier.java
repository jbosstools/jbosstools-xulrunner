/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsIChannelClassifier.idl
 */

package org.mozilla.interfaces;

/**
 * An nsIChannelClassifier object checks a channel's URI against the
 * URI classifier service, and cancels the channel before OnStartRequest
 * if it is found on a blacklist.
 */
public interface nsIChannelClassifier extends nsISupports {

  String NS_ICHANNELCLASSIFIER_IID =
    "{1481c5b5-9f6e-4995-8fe3-2aad5c06440d}";

  /**
   * Checks a channel against the URI classifier service (if it exists).
   *
   * The channel will be suspended while the classifier is checked.  The
   * channel may be cancelled with an error code determined by the classifier
   * before it is resumed.
   *
   * If there is no URI classifier service, NS_ERROR_FACTORY_NOT_REGISTERED
   * will be returned.
   *
   * This method must be called immediately after AsyncOpen() has been called
   * on the channel.
   *
   * @param aChannel
   *        The channel to suspend.
   * @param aInstallListener
   *        If true, the classifier will install notification
   *        callbacks to listen for redirects.  The classifier will
   *        pass all notifications on to the channel's existing
   *        notification callbacks.
   */
  void start(nsIChannel aChannel, boolean aInstallListener);

  /**
   * Notify the classifier that the channel was redirected.  The new channel
   * will be suspended pending a new classifier lookup.
   *
   * @param aOldChannel
   *        The channel that's being redirected.
   * @param aNewChannel
   *        The new channel. This channel is not opened yet.
   */
  void onRedirect(nsIChannel aOldChannel, nsIChannel aNewChannel);

  /**
   * Cancel an existing query.  If a channel has been suspended, it will
   * be resumed.
   */
  void cancel();

}