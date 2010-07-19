/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/threads/nsIThreadManager.idl
 */

package org.mozilla.interfaces;

/**
 * An interface for creating and locating nsIThread instances.
 */
public interface nsIThreadManager extends nsISupports {

  String NS_ITHREADMANAGER_IID =
    "{056216f5-8803-46b4-9199-d95bc1f0446f}";

  /**
   * Create a new thread (a global, user PRThread).
   *
   * @param creationFlags
   *   Reserved for future use.  Pass 0.
   *
   * @returns
   *   The newly created nsIThread object.
   */
  nsIThread newThread(long creationFlags);

  /**
   * Get the main thread.
   */
  nsIThread getMainThread();

  /**
   * Get the current thread.  If the calling thread does not already have a
   * nsIThread associated with it, then a new nsIThread will be created and
   * associated with the current PRThread.
   */
  nsIThread getCurrentThread();

  /**
   * This attribute is true if the calling thread is the main thread of the
   * application process.
   */
  boolean getIsMainThread();

}