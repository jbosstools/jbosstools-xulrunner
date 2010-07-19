/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIKeygenThread.idl
 */

package org.mozilla.interfaces;

/**
 * nsIKeygenThread
 *  This is used to communicate with the thread generating a key pair,
 *  to be used by the dialog displaying status information.
 */
public interface nsIKeygenThread extends nsISupports {

  String NS_IKEYGENTHREAD_IID =
    "{8712a243-5539-447c-9f47-8653f40c3a09}";

  /**
   * startKeyGeneration - run the thread
   *   A user interface using this interface needs to
   *   call this method as soon as the status information
   *   is displaying. This will trigger key generation.
   *   To allow the closure of the status information,
   *   the thread needs a handle to an observer.
   *
   *   observer will be called on the UI thread.
   *   When the key generation is done, the observe method will
   *   be called with a topic of "keygen-finished" and null data
   *   and subject.
   */
  void startKeyGeneration(nsIObserver observer);

  /**
   * userCanceled - notify the thread
   *   If the user canceled, the thread is no longer allowed to
   *   close the dialog. However, if the thread already closed
   *   it, we are not allowed to close it.
   */
  void userCanceled(boolean[] threadAlreadyClosedDialog);

}