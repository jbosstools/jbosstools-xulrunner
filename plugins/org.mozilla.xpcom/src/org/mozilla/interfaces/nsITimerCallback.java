/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/threads/nsITimer.idl
 */

package org.mozilla.interfaces;

public interface nsITimerCallback extends nsISupports {

  String NS_ITIMERCALLBACK_IID =
    "{a796816d-7d47-4348-9ab8-c7aeb3216a7d}";

  /**
   * @param aTimer the timer which has expired
   */
  void _notify(nsITimer timer);

}