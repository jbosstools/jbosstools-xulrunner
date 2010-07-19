/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/profile/public/nsIProfileUnlocker.idl
 */

package org.mozilla.interfaces;

public interface nsIProfileUnlocker extends nsISupports {

  String NS_IPROFILEUNLOCKER_IID =
    "{08923af1-e7a3-4fae-ba02-128502193994}";

  long ATTEMPT_QUIT = 0L;

  long FORCE_QUIT = 1L;

  /**
   * Try to unlock the specified profile by attempting or forcing the
   * process that currently holds the lock to quit.
   *
   * @param aSeverity either ATTEMPT_QUIT or FORCE_QUIT
   * @throws NS_ERROR_FAILURE if unlocking failed.
   */
  void unlock(long aSeverity);

}