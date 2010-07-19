/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/storage/public/mozIStorageStatementWrapper.idl
 */

package org.mozilla.interfaces;

public interface mozIStorageStatementWrapper extends nsISupports {

  String MOZISTORAGESTATEMENTWRAPPER_IID =
    "{eee6f7c9-5586-4eaf-b35c-dca987c4ffd1}";

  /**
   * Initialize this wrapper with aStatement.
   */
  void initialize(mozIStorageStatement aStatement);

  /**
   * The statement that is wrapped.
   */
  mozIStorageStatement getStatement();

  /**
   * Step, reset, and execute the wrapped statement.
   */
  void reset();

  boolean step();

  void execute();

  /**
   * The current row.  Throws an exception if no row is currently
   * available.  Useful only from script.  The value of this is only
   * valid while the statement is still executing, and is still on the
   * appropriate row.
   */
  mozIStorageStatementRow getRow();

  /**
   * The parameters; these can be set in lieu of using the call
   * notation on this.
   */
  mozIStorageStatementParams getParams();

}