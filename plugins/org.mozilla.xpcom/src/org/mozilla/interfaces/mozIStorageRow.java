/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/storage/public/mozIStorageRow.idl
 */

package org.mozilla.interfaces;

public interface mozIStorageRow extends mozIStorageValueArray {

  String MOZISTORAGEROW_IID =
    "{62d1b6bd-cbfe-4f9b-aee1-0ead4af4e6dc}";

  /**
   * Obtains the result of a given column specified by aIndex.
   *
   * @param aIndex
   *        Zero-based index of the result to get from the tuple.
   * @returns the result of the specified column.
   */
  nsIVariant getResultByIndex(long aIndex);

  /**
   * Obtains the result of a given column specified by aIndex.
   *
   * @param aName
   *        Name of the result to get from the tuple.
   * @returns the result of the specified column.
   */
  nsIVariant getResultByName(String aName);

}