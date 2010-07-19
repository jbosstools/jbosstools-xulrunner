/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/threads/nsIThreadInternal.idl
 */

package org.mozilla.interfaces;

public interface nsIThreadObserver extends nsISupports {

  String NS_ITHREADOBSERVER_IID =
    "{81d0b509-f198-4417-8020-08eb4271491f}";

  /**
 * This interface provides the observer with hooks to implement a layered
 * event queue.  For example, it is possible to overlay processing events
 * for a GUI toolkit on top of the events for a thread:
 *
 *   var NativeQueue;
 *   Observer = {
 *     onDispatchedEvent(thread) {
 *       NativeQueue.signal();
 *     }
 *     onProcessNextEvent(thread, mayWait, recursionDepth) {
 *       if (NativeQueue.hasNextEvent())
 *         NativeQueue.processNextEvent();
 *       while (mayWait && !thread.hasPendingEvent()) {
 *         NativeQueue.wait();
 *         NativeQueue.processNextEvent();
 *       }
 *     }
 *   };
 *
 * NOTE: The implementation of this interface must be threadsafe.
 * 
 * NOTE: It is valid to change the thread's observer during a call to an
 *       observer method.
 */
/**
   * This method is called after an event has been dispatched to the thread.
   * This method may be called from any thread. 
   *
   * @param thread
   *   The thread where the event is being dispatched.
   */
  void onDispatchedEvent(nsIThreadInternal thread);

  /**
   * This method is called (from nsIThread::ProcessNextEvent) before an event
   * is processed.  This method is only called on the target thread.
   *
   * @param thread
   *   The thread being asked to process another event.
   * @param mayWait
   *   Indicates whether or not the method is allowed to block the calling
   *   thread.  For example, this parameter is false during thread shutdown.
   * @param recursionDepth
   *   Indicates the number of calls to ProcessNextEvent on the call stack in
   *   addition to the current call.
   */
  void onProcessNextEvent(nsIThreadInternal thread, boolean mayWait, long recursionDepth);

  /**
   * This method is called (from nsIThread::ProcessNextEvent) after an event
   * is processed.  This method is only called on the target thread.
   *
   * @param thread
   *   The thread that processed another event.
   * @param recursionDepth
   *   Indicates the number of calls to ProcessNextEvent on the call stack in
   *   addition to the current call.
   */
  void afterProcessNextEvent(nsIThreadInternal thread, long recursionDepth);

}