/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsICancelable.idl
 */

package org.mozilla.interfaces;

/**
 * This interface provides a means to cancel an operation that is in progress.
 *
 * @status UNDER_REVIEW
 */
public interface nsICancelable extends nsISupports {

  String NS_ICANCELABLE_IID =
    "{d94ac0a0-bb18-46b8-844e-84159064b0bd}";

  /**
   * Call this method to request that this object abort whatever operation it
   * may be performing.
   *
   * @param aReason
   *        Pass a failure code to indicate the reason why this operation is
   *        being canceled.  It is an error to pass a success code.
   */
  void cancel(long aReason);

}