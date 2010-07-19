/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/storage/public/mozIStorageConnection.idl
 */

package org.mozilla.interfaces;

/**
 * mozIStorageConnection represents a database connection attached to
 * a specific file or to the in-memory data storage.  It is the
 * primary interface for interacting with a database, including
 * creating prepared statements, executing SQL, and examining database
 * errors.
 *
 * @threadsafe
 */
public interface mozIStorageConnection extends nsISupports {

  String MOZISTORAGECONNECTION_IID =
    "{ac3c486c-69a1-4cbe-8f25-2ad20880eab3}";

  /**
   * Closes a database connection.  C++ callers should simply set the database
   * variable to NULL.
   */
  void close();

  /**
   * Indicates if the connection is open and ready to use.  This will be false
   * if the connection failed to open, or it has been closed.
   */
  boolean getConnectionReady();

  /**
   * The current database nsIFile.  Null if the database
   * connection refers to an in-memory database.
   */
  nsIFile getDatabaseFile();

  /**
   * lastInsertRowID returns the row ID from the last INSERT
   * operation.
   */
  long getLastInsertRowID();

  /**
   * The last error SQLite error code.
   */
  int getLastError();

  /**
   * The last SQLite error as a string (in english, straight from the
   * sqlite library).
   */
  String getLastErrorString();

  /**
   * The schema version of the database.  This should not be used until the 
   * database is ready.  The schema will be reported as zero if it is not set.
   */
  int getSchemaVersion();

  /**
   * The schema version of the database.  This should not be used until the 
   * database is ready.  The schema will be reported as zero if it is not set.
   */
  void setSchemaVersion(int aSchemaVersion);

  /**
   * Create a mozIStorageStatement for the given SQL expression.  The
   * expression may use ? to indicate sequential numbered arguments,
   * ?1, ?2 etc. to indicate specific numbered arguments or :name and 
   * $var to indicate named arguments.
   *
   * @param aSQLStatement  The SQL statement to execute
   *
   * @returns a new mozIStorageStatement
   */
  mozIStorageStatement createStatement(String aSQLStatement);

  /**
   * Execute a SQL expression, expecting no arguments.
   *
   * @param aSQLStatement  The SQL statement to execute
   */
  void executeSimpleSQL(String aSQLStatement);

  /**
   * Execute an array of queries created with this connection asynchronously
   * using any currently bound parameters.  The statements are ran wrapped in a
   * transaction.  These statements can be reused immediately, and reset does
   * not need to be called.
   *
   * Note:  If you have any custom defined functions, they must be re-entrant
   *        since they can be called on multiple threads.
   *
   * @param aStatements
   *        The array of statements to execute asynchronously, in the order they
   *        are given in the array.
   * @param aNumStatements
   *        The number of statements in aStatements.
   * @param aCallback [optional]
   *        The callback object that will be notified of progress, errors, and
   *        completion.
   * @returns an object that can be used to cancel the statements execution.
   */
  mozIStoragePendingStatement executeAsync(mozIStorageStatement[] aStatements, long aNumStatements, mozIStorageStatementCallback aCallback);

  /**
   * Check if the given table exists.
   *
   * @param aTableName   The table to check
   * @returns TRUE if table exists, FALSE otherwise.
   */
  boolean tableExists(String aTableName);

  /**
   * Check if the given index exists.
   *
   * @param aIndexName   The index to check
   * @returns TRUE if the index exists, FALSE otherwise.
   */
  boolean indexExists(String aIndexName);

  /**
   * Returns true if a transaction is active on this connection.
   */
  boolean getTransactionInProgress();

  /**
   * Begin a new transaction.  sqlite default transactions are deferred.
   * If a transaction is active, throws an error.
   */
  void beginTransaction();

  /**
   * Begins a new transaction with the given type.
   */
  int TRANSACTION_DEFERRED = 0;

  int TRANSACTION_IMMEDIATE = 1;

  int TRANSACTION_EXCLUSIVE = 2;

  void beginTransactionAs(int transactionType);

  /**
   * Commits the current transaction.  If no transaction is active,
   * @throws NS_ERROR_STORAGE_NO_TRANSACTION.
   */
  void commitTransaction();

  /**
   * Rolls back the current transaction.  If no transaction is active,
   * @throws NS_ERROR_STORAGE_NO_TRANSACTION.
   */
  void rollbackTransaction();

  /**
   * Create the table with the given name and schema.
   *
   * If the table already exists, NS_ERROR_FAILURE is thrown.
   * (XXX at some point in the future it will check if the schema is
   * the same as what is specified, but that doesn't happen currently.)
   *
   * @param aTableName the table name to be created, consisting of
   * [A-Za-z0-9_], and beginning with a letter.
   *
   * @param aTableSchema the schema of the table; what would normally
   * go between the parens in a CREATE TABLE statement: e.g., "foo
   * INTEGER, bar STRING".
   *
   * @throws NS_ERROR_FAILURE if the table already exists or could not
   * be created for any other reason.
   *
   */
  void createTable(String aTableName, String aTableSchema);

  /**
   * Create a new SQL function.  If you use your connection on multiple threads,
   * your function needs to be threadsafe, or it should only be called on one
   * thread.
   *
   * @param aFunctionName  The name of function to create, as seen in SQL.
   * @param aNumArguments  The number of arguments the function takes. Pass
   *                       -1 for variable-argument functions.
   * @param aFunction      The instance of mozIStorageFunction, which implements
   *                       the function in question.
   */
  void createFunction(String aFunctionName, int aNumArguments, mozIStorageFunction aFunction);

  /**
   * Create a new SQL aggregate function.  If you use your connection on
   * multiple threads, your function needs to be threadsafe, or it should only
   * be called on one thread.
   *
   * @param aFunctionName  The name of aggregate function to create, as seen
   *                       in SQL.
   * @param aNumArguments  The number of arguments the function takes. Pass
   *                       -1 for variable-argument functions.
   * @param aFunction      The instance of mozIStorageAggreagteFunction,
   *                       which implements the function in question.
   */
  void createAggregateFunction(String aFunctionName, int aNumArguments, mozIStorageAggregateFunction aFunction);

  /**
   * Delete custom SQL function (simple or aggregate one).
   *
   * @param aFunctionName  The name of function to remove.
   */
  void removeFunction(String aFunctionName);

  /**
   * Sets a progress handler. Only one handler can be registered at a time.
   * If you need more than one, you need to chain them yourself.  This progress
   * handler should be threadsafe if you use this connection object on more than
   * one thread.
   *
   * @param aGranularity   The number of SQL virtual machine steps between
   *                       progress handler callbacks.
   * @param aHandler       The instance of mozIStorageProgressHandler.
   *
   * @return previous registered handler.
   */
  mozIStorageProgressHandler setProgressHandler(int aGranularity, mozIStorageProgressHandler aHandler);

  /**
   * Remove a progress handler.
   *
   * @return previous registered handler.
   */
  mozIStorageProgressHandler removeProgressHandler();

}