/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/threads/nsIThreadPool.idl
 */

package org.mozilla.interfaces;

public interface nsIThreadPoolListener extends nsISupports {

  String NS_ITHREADPOOLLISTENER_IID =
    "{ef194cab-3f86-4b61-b132-e5e96a79e5d1}";

  /**
   * Called when a new thread is created by the thread pool. The notification
   * happens on the newly-created thread.
   */
  void onThreadCreated();

  /**
   * Called when a thread is about to be destroyed by the thread pool. The
   * notification happens on the thread that is about to be destroyed.
   */
  void onThreadShuttingDown();

}