/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/storage/public/mozIStorageError.idl
 */

package org.mozilla.interfaces;

public interface mozIStorageError extends nsISupports {

  String MOZISTORAGEERROR_IID =
    "{1f350f96-7023-434a-8864-40a1c493aac1}";

  /**
   * General SQL error or missing database.
   */
  int ERROR = 1;

  /**
   * Internal logic error.
   */
  int INTERNAL = 2;

  /**
   * Access permission denied.
   */
  int PERM = 3;

  /**
   * A callback routine requested an abort.
   */
  int ABORT = 4;

  /**
   * The database file is locked.
   */
  int BUSY = 5;

  /**
   * A table in the database is locked.
   */
  int LOCKED = 6;

  /**
   * An allocation failed.
   */
  int NOMEM = 7;

  /**
   * Attempt to write to a readonly database.
   */
  int READONLY = 8;

  /**
   * Operation was terminated by an interrupt.
   */
  int INTERRUPT = 9;

  /**
   * Some kind of disk I/O error occurred.
   */
  int IOERR = 10;

  /**
   * The database disk image is malformed.
   */
  int CORRUPT = 11;

  /**
   * An insertion failed because the database is full.
   */
  int FULL = 13;

  /**
   * Unable to open the database file.
   */
  int CANTOPEN = 14;

  /**
   * The database is empty.
   */
  int EMPTY = 16;

  /**
   * The database scheme changed.
   */
  int SCHEMA = 17;

  /**
   * A string or blob exceeds the size limit.
   */
  int TOOBIG = 18;

  /**
   * Abort due to a constraint violation.
   */
  int CONSTRAINT = 19;

  /**
   * Data type mismatch.
   */
  int MISMATCH = 20;

  /**
   * Library used incorrectly.
   */
  int MISUSE = 21;

  /**
   * Uses OS features not supported on the host system.
   */
  int NOLFS = 22;

  /**
   * Authorization denied.
   */
  int AUTH = 23;

  /**
   * Auxiliary database format error.
   */
  int FORMAT = 24;

  /**
   * File opened that is not a database file.
   */
  int NOTADB = 26;

  /**
   * Indicates what type of error occurred.
   */
  int getResult();

  /**
   * An error string the gives more details, if available.
   */
  String getMessage();

}