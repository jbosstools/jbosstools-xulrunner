/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/storage/public/mozIStorageValueArray.idl
 */

package org.mozilla.interfaces;

/**
 * mozIStorageValueArray wraps an array of SQL values,
 * such as a single database row.
 */
public interface mozIStorageValueArray extends nsISupports {

  String MOZISTORAGEVALUEARRAY_IID =
    "{07b5b93e-113c-4150-863c-d247b003a55d}";

  /**
   * These type values are returned by getTypeOfIndex
   * to indicate what type of value is present at
   * a given column.
   */
  int VALUE_TYPE_NULL = 0;

  int VALUE_TYPE_INTEGER = 1;

  int VALUE_TYPE_FLOAT = 2;

  int VALUE_TYPE_TEXT = 3;

  int VALUE_TYPE_BLOB = 4;

  /**
   * numEntries
   *
   * number of entries in the array (each corresponding to a column
   * in the database row)
   */
  long getNumEntries();

  /**
   * Returns the type of the value at the given column index;
   * one of VALUE_TYPE_NULL, VALUE_TYPE_INTEGER, VALUE_TYPE_FLOAT,
   * VALUE_TYPE_TEXT, VALUE_TYPE_BLOB.
   */
  int getTypeOfIndex(long aIndex);

  /**
   * Obtain a value for the given entry (column) index.
   * Due to SQLite's type conversion rules, any of these are valid
   * for any column regardless of the column's data type.  However,
   * if the specific type matters, getTypeOfIndex should be used
   * first to identify the column type, and then the appropriate
   * get method should be called.
   *
   * If you ask for a string value for a NULL column, you will get an empty
   * string with IsVoid set to distinguish it from an explicitly set empty
   * string.
   */
  int getInt32(long aIndex);

  long getInt64(long aIndex);

  double getDouble(long aIndex);

  String getUTF8String(long aIndex);

  String getString(long aIndex);

  void getBlob(long aIndex, long[] aDataSize, byte[][] aData);

  boolean getIsNull(long aIndex);

}