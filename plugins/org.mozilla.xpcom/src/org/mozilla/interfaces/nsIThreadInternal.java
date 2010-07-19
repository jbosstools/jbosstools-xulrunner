/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/threads/nsIThreadInternal.idl
 */

package org.mozilla.interfaces;

/**
 * The XPCOM thread object implements this interface, which allows a consumer
 * to observe dispatch activity on the thread.
 */
public interface nsIThreadInternal extends nsIThread {

  String NS_ITHREADINTERNAL_IID =
    "{f89b5063-b06d-42f8-bf23-4dfcf2d80d6a}";

  /**
   * Get/set the current thread observer (may be null).  This attribute may be
   * read from any thread, but must only be set on the thread corresponding to
   * this thread object.  The observer will be released on the thread
   * corresponding to this thread object after all other events have been
   * processed during a call to Shutdown.
   */
  nsIThreadObserver getObserver();

  /**
   * Get/set the current thread observer (may be null).  This attribute may be
   * read from any thread, but must only be set on the thread corresponding to
   * this thread object.  The observer will be released on the thread
   * corresponding to this thread object after all other events have been
   * processed during a call to Shutdown.
   */
  void setObserver(nsIThreadObserver aObserver);

  /**
   * This method causes any events currently enqueued on the thread to be
   * suppressed until PopEventQueue is called.  Additionally, any new events
   * dispatched to the thread will only be processed if they are accepted by
   * the given filter.  If the filter is null, then new events are accepted.
   * Calls to PushEventQueue may be nested and must each be paired with a call
   * to PopEventQueue in order to restore the original state of the thread.
   *
   * @param filter
   *   The thread event filter to apply to dispatched events, or null to accept
   *   all dispatched events.
   */
  void pushEventQueue(nsIThreadEventFilter filter);

  /**
   * Revert a call to PushEventQueue.  When an event queue is popped, any
   * events remaining in the queue are appended to the elder queue.
   */
  void popEventQueue();

}