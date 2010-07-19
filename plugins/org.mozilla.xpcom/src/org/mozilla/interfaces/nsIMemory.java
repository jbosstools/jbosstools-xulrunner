/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/base/nsIMemory.idl
 */

package org.mozilla.interfaces;

/**
 *
 * nsIMemory: interface to allocate and deallocate memory. Also provides
 * for notifications in low-memory situations.
 *
 * The frozen exported symbols NS_Alloc, NS_Realloc, and NS_Free
 * provide a more efficient way to access XPCOM memory allocation. Using
 * those symbols is preferred to using the methods on this interface.
 *
 * A client that wishes to be notified of low memory situations (for
 * example, because the client maintains a large memory cache that
 * could be released when memory is tight) should register with the
 * observer service (see nsIObserverService) using the topic 
 * "memory-pressure". There are three specific types of notications 
 * that can occur.  These types will be passed as the |aData| 
 * parameter of the of the "memory-pressure" notification: 
 * 
 * "low-memory"
 * This will be passed as the extra data when the pressure 
 * observer is being asked to flush for low-memory conditions.
 *
 * "heap-minimize"
 * This will be passed as the extra data when the pressure 
 * observer is being asked to flush because of a heap minimize 
 * call.
 *
 * "alloc-failure"
 * This will be passed as the extra data when the pressure 
 * observer has been asked to flush because a malloc() or 
 * realloc() has failed.
 *
 * @status FROZEN
 */
public interface nsIMemory extends nsISupports {

  String NS_IMEMORY_IID =
    "{59e7e77a-38e4-11d4-8cf5-0060b0fc14a3}";

  /**
     * Attempts to shrink the heap.
     * @param immediate - if true, heap minimization will occur
     *   immediately if the call was made on the main thread. If
     *   false, the flush will be scheduled to happen when the app is
     *   idle.
     * @return NS_ERROR_FAILURE if 'immediate' is set an the call
     *   was not on the application's main thread.
     */
  void heapMinimize(boolean immediate);

  /**
     * This predicate can be used to determine if we're in a low-memory
     * situation (what constitutes low-memory is platform dependent). This
     * can be used to trigger the memory pressure observers.
     */
  boolean isLowMemory();

}