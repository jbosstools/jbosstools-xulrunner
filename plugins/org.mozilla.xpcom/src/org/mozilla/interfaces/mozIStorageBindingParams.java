/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/storage/public/mozIStorageBindingParams.idl
 */

package org.mozilla.interfaces;

public interface mozIStorageBindingParams extends nsISupports {

  String MOZISTORAGEBINDINGPARAMS_IID =
    "{a8d4827c-641c-45e3-a9ea-493570b4106b}";

  /**
   * Binds aValue to the parameter with the name aName.
   *
   * @param aName
   *        The name of the parameter to bind aValue to.
   * @param aValue
   *        The value to bind.
   */
  void bindByName(String aName, nsIVariant aValue);

  void bindBlobByName(String aName, byte[] aValue, long aValueSize);

  /**
    * Binds aValue to the parameter with the index aIndex.
    *
    * @param aIndex
    *        The zero-based index of the parameter to bind aValue to.
    * @param aValue
    *        The value to bind.
    */
  void bindByIndex(long aIndex, nsIVariant aValue);

  void bindBlobByIndex(long aIndex, byte[] aValue, long aValueSize);

}