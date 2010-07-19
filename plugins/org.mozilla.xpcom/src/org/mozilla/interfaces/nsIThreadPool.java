/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/threads/nsIThreadPool.idl
 */

package org.mozilla.interfaces;

/**
 * An interface to a thread pool.  A thread pool creates a limited number of
 * anonymous (unnamed) worker threads.  An event dispatched to the thread pool
 * will be run on the next available worker thread.
 */
public interface nsIThreadPool extends nsIEventTarget {

  String NS_ITHREADPOOL_IID =
    "{d628159b-1a03-4985-aa77-43122eb23bfc}";

  /**
   * Shutdown the thread pool.  This method may not be executed from any thread
   * in the thread pool.  Instead, it is meant to be executed from another
   * thread (usually the thread that created this thread pool).  When this
   * function returns, the thread pool and all of its threads will be shutdown,
   * and it will no longer be possible to dispatch tasks to the thread pool.
   */
  void shutdown();

  /**
   * Get/set the maximum number of threads allowed at one time in this pool.
   */
  long getThreadLimit();

  /**
   * Get/set the maximum number of threads allowed at one time in this pool.
   */
  void setThreadLimit(long aThreadLimit);

  /**
   * Get/set the maximum number of idle threads kept alive.
   */
  long getIdleThreadLimit();

  /**
   * Get/set the maximum number of idle threads kept alive.
   */
  void setIdleThreadLimit(long aIdleThreadLimit);

  /**
   * Get/set the amount of time in milliseconds before an idle thread is
   * destroyed.
   */
  long getIdleThreadTimeout();

  /**
   * Get/set the amount of time in milliseconds before an idle thread is
   * destroyed.
   */
  void setIdleThreadTimeout(long aIdleThreadTimeout);

  /**
   * An optional listener that will be notified when a thread is created or
   * destroyed in the course of the thread pool's operation.
   *
   * A listener will only receive notifications about threads created after the
   * listener is set so it is recommended that the consumer set the listener
   * before dispatching the first event. A listener that receives an
   * onThreadCreated() notification is guaranteed to always receive the
   * corresponding onThreadShuttingDown() notification.
   *
   * The thread pool takes ownership of the listener and releases it when the
   * shutdown() method is called. Threads created after the listener is set will
   * also take ownership of the listener so that the listener will be kept alive
   * long enough to receive the guaranteed onThreadShuttingDown() notification.
   */
  nsIThreadPoolListener getListener();

  /**
   * An optional listener that will be notified when a thread is created or
   * destroyed in the course of the thread pool's operation.
   *
   * A listener will only receive notifications about threads created after the
   * listener is set so it is recommended that the consumer set the listener
   * before dispatching the first event. A listener that receives an
   * onThreadCreated() notification is guaranteed to always receive the
   * corresponding onThreadShuttingDown() notification.
   *
   * The thread pool takes ownership of the listener and releases it when the
   * shutdown() method is called. Threads created after the listener is set will
   * also take ownership of the listener so that the listener will be kept alive
   * long enough to receive the guaranteed onThreadShuttingDown() notification.
   */
  void setListener(nsIThreadPoolListener aListener);

}