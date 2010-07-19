/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/storage/public/mozIStorageBindingParamsArray.idl
 */

package org.mozilla.interfaces;

public interface mozIStorageBindingParamsArray extends nsISupports {

  String MOZISTORAGEBINDINGPARAMSARRAY_IID =
    "{e676e1a3-1dc6-4802-ac03-291fa9de7f93}";

  /**
   * Creates a new mozIStorageBindingParams object that can be added to this
   * array.
   *
   * @returns a mozIStorageBindingParams object that can be used to specify
   *          parameters that need to be bound.
   */
  mozIStorageBindingParams newBindingParams();

  /**
   * Adds the parameters to the end of this array.
   *
   * @param aParameters
   *        The parameters to add to this array.
   */
  void addParams(mozIStorageBindingParams aParameters);

}