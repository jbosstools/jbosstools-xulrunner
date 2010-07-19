/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIProtectedAuthThread.idl
 */

package org.mozilla.interfaces;

/**
 * nsIProtectedAuthThread
 *  This is used to communicate with the thread login on to 
 *  a token with CKF_PROTECTED_AUTHENTICATION_PATH set.
 */
public interface nsIProtectedAuthThread extends nsISupports {

  String NS_IPROTECTEDAUTHTHREAD_IID =
    "{4bb27cb7-8984-4cee-8ce7-9b014c3d091b}";

  /**
   * login - run the thread
   *   A user interface implementing this interface needs to
   *   call this method as soon as the message to the user is
   *   displayed. This will trigger login operation. No user 
   *   cancellation is possible during login operation.
   *
   *   When the login is done, the observe method of @observer will
   *   be called on the UI thread with a topic of "login-finished"
   *   and null data and subject.
   */
  void login(nsIObserver observer);

  /**
   * The PKCS11 slot
   */
  nsIPKCS11Slot getSlot();

  /**
   * Gets token to be logged in name.
   */
  String getTokenName();

}