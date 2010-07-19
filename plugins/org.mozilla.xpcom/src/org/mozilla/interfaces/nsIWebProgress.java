/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/uriloader/base/nsIWebProgress.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIWebProgress interface is used to add or remove nsIWebProgressListener
 * instances to observe the loading of asynchronous requests (usually in the
 * context of a DOM window).
 *
 * nsIWebProgress instances may be arranged in a parent-child configuration,
 * corresponding to the parent-child configuration of their respective DOM
 * windows.  However, in some cases a nsIWebProgress instance may not have an
 * associated DOM window.  The parent-child relationship of nsIWebProgress
 * instances is not made explicit by this interface, but the relationship may
 * exist in some implementations.
 *
 * A nsIWebProgressListener instance receives notifications for the
 * nsIWebProgress instance to which it added itself, and it may also receive
 * notifications from any nsIWebProgress instances that are children of that
 * nsIWebProgress instance.
 *
 * @status FROZEN
 */
public interface nsIWebProgress extends nsISupports {

  String NS_IWEBPROGRESS_IID =
    "{570f39d0-efd0-11d3-b093-00a024ffc08c}";

  /**
   * The following flags may be combined to form the aNotifyMask parameter for
   * the addProgressListener method.  They limit the set of events that are
   * delivered to an nsIWebProgressListener instance.
   */
/**
   * These flags indicate the state transistions to observe, corresponding to
   * nsIWebProgressListener::onStateChange.
   *
   * NOTIFY_STATE_REQUEST
   *   Only receive the onStateChange event if the aStateFlags parameter
   *   includes nsIWebProgressListener::STATE_IS_REQUEST.
   *   
   * NOTIFY_STATE_DOCUMENT
   *   Only receive the onStateChange event if the aStateFlags parameter
   *   includes nsIWebProgressListener::STATE_IS_DOCUMENT.
   *
   * NOTIFY_STATE_NETWORK
   *   Only receive the onStateChange event if the aStateFlags parameter
   *   includes nsIWebProgressListener::STATE_IS_NETWORK.
   *
   * NOTIFY_STATE_WINDOW
   *   Only receive the onStateChange event if the aStateFlags parameter
   *   includes nsIWebProgressListener::STATE_IS_WINDOW.
   *
   * NOTIFY_STATE_ALL
   *   Receive all onStateChange events.
   */
  long NOTIFY_STATE_REQUEST = 1L;

  long NOTIFY_STATE_DOCUMENT = 2L;

  long NOTIFY_STATE_NETWORK = 4L;

  long NOTIFY_STATE_WINDOW = 8L;

  long NOTIFY_STATE_ALL = 15L;

  /**
   * These flags indicate the other events to observe, corresponding to the
   * other four methods defined on nsIWebProgressListener.
   *
   * NOTIFY_PROGRESS
   *   Receive onProgressChange events.
   *
   * NOTIFY_STATUS
   *   Receive onStatusChange events.
   *
   * NOTIFY_SECURITY
   *   Receive onSecurityChange events.
   *
   * NOTIFY_LOCATION
   *   Receive onLocationChange events.
   *
   * NOTIFY_REFRESH
   *   Receive onRefreshAttempted events.
   *   This is defined on nsIWebProgressListener2.
   */
  long NOTIFY_PROGRESS = 16L;

  long NOTIFY_STATUS = 32L;

  long NOTIFY_SECURITY = 64L;

  long NOTIFY_LOCATION = 128L;

  long NOTIFY_REFRESH = 256L;

  /**
   * This flag enables all notifications.
   */
  long NOTIFY_ALL = 511L;

  /**
   * Registers a listener to receive web progress events.
   *
   * @param aListener
   *        The listener interface to be called when a progress event occurs.
   *        This object must also implement nsISupportsWeakReference.
   * @param aNotifyMask
   *        The types of notifications to receive.
   *
   * @throw NS_ERROR_INVALID_ARG
   *        Indicates that aListener was either null or that it does not
   *        support weak references.
   * @throw NS_ERROR_FAILURE
   *        Indicates that aListener was already registered.
   */
  void addProgressListener(nsIWebProgressListener aListener, long aNotifyMask);

  /**
   * Removes a previously registered listener of progress events.
   *
   * @param aListener
   *        The listener interface previously registered with a call to
   *        addProgressListener.
   *
   * @throw NS_ERROR_FAILURE
   *        Indicates that aListener was not registered.
   */
  void removeProgressListener(nsIWebProgressListener aListener);

  /**
   * The DOM window associated with this nsIWebProgress instance.
   *
   * @throw NS_ERROR_FAILURE
   *        Indicates that there is no associated DOM window.
   */
  nsIDOMWindow getDOMWindow();

  /**
   * Indicates whether or not a document is currently being loaded
   * in the context of this nsIWebProgress instance.
   */
  boolean getIsLoadingDocument();

}