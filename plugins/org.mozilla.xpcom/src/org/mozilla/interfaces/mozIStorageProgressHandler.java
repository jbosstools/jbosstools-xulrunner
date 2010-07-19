/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/storage/public/mozIStorageProgressHandler.idl
 */

package org.mozilla.interfaces;

/**
 * mozIProgressHandler is to be implemented by storage consumers that
 * wish to receive callbacks during the request execution.
 */
public interface mozIStorageProgressHandler extends nsISupports {

  String MOZISTORAGEPROGRESSHANDLER_IID =
    "{a3a6fcd4-bf89-4208-a837-bf2a73afd30c}";

  /**
   * onProgress is invoked periodically during long running calls.
   * 
   * @param aConnection    connection, for which progress handler is
   *                       invoked.
   *
   * @return true to abort request, false to continue work.
   */
  boolean onProgress(mozIStorageConnection aConnection);

}