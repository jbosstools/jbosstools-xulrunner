/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/storage/public/mozIStorageResultSet.idl
 */

package org.mozilla.interfaces;

public interface mozIStorageResultSet extends nsISupports {

  String MOZISTORAGERESULTSET_IID =
    "{18dd7953-076d-4598-8105-3e32ad26ab24}";

  /**
   * Obtains the next row from the result set from the statement that was
   * executed.
   *
   * @returns the next row from the result set.  This will be null when there
   *          are no more results.
   */
  mozIStorageRow getNextRow();

}