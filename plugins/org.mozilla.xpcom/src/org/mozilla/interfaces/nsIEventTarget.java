/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/threads/nsIEventTarget.idl
 */

package org.mozilla.interfaces;

public interface nsIEventTarget extends nsISupports {

  String NS_IEVENTTARGET_IID =
    "{4e8febe4-6631-49dc-8ac9-308c1cb9b09c}";

  /**
   * Dispatch an event to this event target.  This function may be called from
   * any thread, and it may be called re-entrantly.
   *
   * @param event
   *   The event to dispatch.
   * @param flags
   *   The flags modifying event dispatch.  The flags are described in detail
   *   below.
   * 
   * @throws NS_ERROR_INVALID_ARG
   *   Indicates that event is null.
   * @throws NS_ERROR_UNEXPECTED
   *   Indicates that the thread is shutting down and has finished processing
   * events, so this event would never run and has not been dispatched. 
   */
  void dispatch(nsIRunnable event, long flags);

  /**
   * This flag specifies the default mode of event dispatch, whereby the event
   * is simply queued for later processing.  When this flag is specified,
   * dispatch returns immediately after the event is queued.
   */
  long DISPATCH_NORMAL = 0L;

  /**
   * This flag specifies the synchronous mode of event dispatch, in which the
   * dispatch method does not return until the event has been processed.
   *
   * NOTE: passing this flag to dispatch may have the side-effect of causing
   * other events on the current thread to be processed while waiting for the
   * given event to be processed.
   */
  long DISPATCH_SYNC = 1L;

  /**
   * Check to see if this event target is associated with the current thread.
   *
   * @returns
   *   A boolean value that if "true" indicates that events dispatched to this
   *   event target will run on the current thread (i.e., the thread calling
   *   this method).
   */
  boolean isOnCurrentThread();

}