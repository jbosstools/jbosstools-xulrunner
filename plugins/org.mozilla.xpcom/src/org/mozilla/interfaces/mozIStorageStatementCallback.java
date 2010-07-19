/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/storage/public/mozIStorageStatementCallback.idl
 */

package org.mozilla.interfaces;

public interface mozIStorageStatementCallback extends nsISupports {

  String MOZISTORAGESTATEMENTCALLBACK_IID =
    "{29383d00-d8c4-4ddd-9f8b-c2feb0f2fcfa}";

  /**
   * Called when some result is obtained from the database.  This function can
   * be called more than once with a different storageIResultSet each time for
   * any given asynchronous statement.
   *
   * @param aResultSet
   *        The result set containing the data from the database.
   */
  void handleResult(mozIStorageResultSet aResultSet);

  /**
   * Called when some error occurs while executing the statement.  This function
   * may be called more than once with a different storageIError each time for
   * any given asynchronous statement.
   *
   * @param aError
   *        An object containing information about the error.
   */
  void handleError(mozIStorageError aError);

  /**
   * Called when the statement has finished executing.  This function will only
   * be called once for any given asynchronous statement.
   *
   * @param aReason
   *        Indicates if the statement is no longer executing because it either
   *        finished (REASON_FINISHED), was canceled (REASON_CANCELED), or
   *        a fatal error occurred (REASON_ERROR).
   */
  int REASON_FINISHED = 0;

  int REASON_CANCELED = 1;

  int REASON_ERROR = 2;

  void handleCompletion(int aReason);

}