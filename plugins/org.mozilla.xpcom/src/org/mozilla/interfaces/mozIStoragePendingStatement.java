/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/storage/public/mozIStoragePendingStatement.idl
 */

package org.mozilla.interfaces;

public interface mozIStoragePendingStatement extends nsISupports {

  String MOZISTORAGEPENDINGSTATEMENT_IID =
    "{00da7d20-3768-4398-bedc-e310c324b3f0}";

  /**
   * Cancels a pending statement, if possible.  This will only fail if you try
   * cancel more than once.
   *
   * @note For read statements (such as SELECT), you will no longer receive any
   *       notifications about results once cancel is called.
   */
  void cancel();

}