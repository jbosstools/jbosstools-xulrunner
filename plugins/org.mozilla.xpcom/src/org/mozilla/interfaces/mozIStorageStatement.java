/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/storage/public/mozIStorageStatement.idl
 */

package org.mozilla.interfaces;

public interface mozIStorageStatement extends mozIStorageValueArray {

  String MOZISTORAGESTATEMENT_IID =
    "{20c45bdd-51d4-4f07-b70e-5feaa6302197}";

  /**
   * Finalizes a statement so you can successfully close a database connection.
   * This method does not need to be used from native callers since you can just
   * set the statement to null, but is extremely useful to JS callers.
   */
  void _finalize();

  /**
   * Create a clone of this statement, by initializing a new statement
   * with the same connection and same SQL statement as this one.  It
   * does not preserve statement state; that is, if a statement is
   * being executed when it is cloned, the new statement will not be
   * executing.
   */
  mozIStorageStatement _clone();

  long getParameterCount();

  /**
   * Name of nth parameter, if given
   */
  String getParameterName(long aParamIndex);

  /**
   * Returns the index of the named parameter.
   *
   * @param aName
   *        The name of the parameter you want the index for.  This does not
   *        include the leading ':'.
   * @returns the index of the named parameter.
   */
  long getParameterIndex(String aName);

  /**
   * Number of columns returned
   */
  long getColumnCount();

  /**
   * Name of nth column
   */
  String getColumnName(long aColumnIndex);

  /**
   * Obtains the index of the column with the specified name.
   *
   * @param aName The name of the column.
   * @return The index of the column with the specified name.
   */
  long getColumnIndex(String aName);

  /**
   * Obtains the declared column type of a prepared statement.
   *
   * @param aParamIndex The zero-based index of the column who's declared type
   *                    we are interested in.
   * @returns the declared index type.
   */
  String getColumnDecltype(long aParamIndex);

  /**
   * Reset parameters/statement execution
   */
  void reset();

  /**
   * Bind the given value to the parameter at aParamIndex. Index 0
   * denotes the first numbered argument or ?1.
   */
  void bindUTF8StringParameter(long aParamIndex, String aValue);

  void bindStringParameter(long aParamIndex, String aValue);

  void bindDoubleParameter(long aParamIndex, double aValue);

  void bindInt32Parameter(long aParamIndex, int aValue);

  void bindInt64Parameter(long aParamIndex, long aValue);

  void bindNullParameter(long aParamIndex);

  void bindBlobParameter(long aParamIndex, byte[] aValue, long aValueSize);

  /**
   * Binds the array of parameters to the statement.  When executeAsync is
   * called, all the parameters in aParameters are bound and then executed.
   *
   * @param aParameters
   *        The array of parameters to bind to the statement upon execution.
   */
  void bindParameters(mozIStorageBindingParamsArray aParameters);

  /**
   * Creates a new mozIStorageBindingParamsArray that can be used to bind
   * multiple sets of data to a statement.
   *
   * @returns a mozIStorageBindingParamsArray that multiple sets of parameters
   *          can be bound to.
   */
  mozIStorageBindingParamsArray newBindingParamsArray();

  /**
   * Execute the query, ignoring any results.  This is accomplished by
   * calling step() once, and then calling reset().
   *
   * Error and last insert info, etc. are available from
   * the mozStorageConnection.
   */
  void execute();

  /**
   * Execute a query, using any currently-bound parameters.  Reset
   * must be called on the statement after the last call of
   * executeStep.
   *
   * @returns a boolean indicating whether there are more rows or not;
   * row data may be accessed using mozIStorageValueArray methods on
   * the statement.
   *
   */
  boolean executeStep();

  /**
   * Execute a query, using any currently-bound parameters.  Reset is called
   * when no more data is returned.  This method is only available to JavaScript
   * consumers.
   *
   * @returns a boolean indicating whether there are more rows or not.
   *
   * boolean step();
   */
/**
   * Obtains the current list of named parameters, which are settable.  This
   * property is only available to JavaScript consumers.
   *
   * readonly attribute mozIStorageStatementParams params;
   */
/**
   * Obtains the current row, with access to all the data members by name.  This
   * property is only available to JavaScript consumers.
   *
   * readonly attribute mozIStorageStatementRow row;
   */
/**
   * Execute a query asynchronously using any currently bound parameters.  This
   * statement can be reused immediately, and reset does not need to be called.
   *
   * Note:  If you have any custom defined functions, they must be re-entrant
   *        since they can be called on multiple threads.
   *
   * @param aCallback [optional]
   *        The callback object that will be notified of progress, errors, and
   *        completion.
   * @returns an object that can be used to cancel the statements execution.
   */
  mozIStoragePendingStatement executeAsync(mozIStorageStatementCallback aCallback);

  /**
   * The current state.  Row getters are only valid while
   * the statement is in the "executing" state.
   */
  int MOZ_STORAGE_STATEMENT_INVALID = 0;

  int MOZ_STORAGE_STATEMENT_READY = 1;

  int MOZ_STORAGE_STATEMENT_EXECUTING = 2;

  int getState();

  /**
   * Escape a string for SQL LIKE search.
   *
   * @param     aValue the string to escape for SQL LIKE 
   * @param     aEscapeChar the escape character
   * @returns   an AString of an escaped version of aValue
   *            (%, _ and the escape char are escaped with the escape char)
   *            For example, we will convert "foo/bar_baz%20cheese" 
   *            into "foo//bar/_baz/%20cheese" (if the escape char is '/').
   * @note      consumers will have to use same escape char
   *            when doing statements such as:   ...LIKE '?1' ESCAPE '/'...
   */
  String escapeStringForLIKE(String aValue, char aEscapeChar);

}