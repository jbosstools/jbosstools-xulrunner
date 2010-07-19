/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIAuthPromptCallback.idl
 */

package org.mozilla.interfaces;

/**
 * Interface for callback methods for the asynchronous nsIAuthPrompt2 method.
 * Callers MUST call exactly one method if nsIAuthPrompt2::promptPasswordAsync
 * returns successfully. They MUST NOT call any method on this interface before
 * promptPasswordAsync returns.
 */
public interface nsIAuthPromptCallback extends nsISupports {

  String NS_IAUTHPROMPTCALLBACK_IID =
    "{bdc387d7-2d29-4cac-92f1-dd75d786631d}";

  /**
   * Authentication information is available.
   *
   * @param aContext
   *        The context as passed to promptPasswordAsync
   * @param aAuthInfo
   *        Authentication information. Must be the same object that was passed
   *        to promptPasswordAsync.
   *
   * @note  Any exceptions thrown from this method should be ignored.
   */
  void onAuthAvailable(nsISupports aContext, nsIAuthInformation aAuthInfo);

  /**
   * Notification that the prompt was cancelled.
   *
   * @param aContext
   *        The context that was passed to promptPasswordAsync.
   * @param userCancel
   *        If false, this prompt was cancelled by calling the
   *        the cancel method on the nsICancelable; otherwise,
   *        it was cancelled by the user.
   */
  void onAuthCancelled(nsISupports aContext, boolean userCancel);

}