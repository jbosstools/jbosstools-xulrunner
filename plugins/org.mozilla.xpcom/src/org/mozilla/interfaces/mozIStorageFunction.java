/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/storage/public/mozIStorageFunction.idl
 */

package org.mozilla.interfaces;

/**
 * mozIStorageFunction is to be implemented by storage consumers that
 * wish to receive callbacks during the request execution.
 *
 * SQL can apply functions to values from tables. Examples of
 * such functions are MIN(a1,a2) or SQRT(num). Many functions are
 * implemented in SQL engine.
 *
 * This interface allows consumers to implement their own,
 * problem-specific functions.
 * These functions can be called from triggers, too.
 *
 */
public interface mozIStorageFunction extends nsISupports {

  String MOZISTORAGEFUNCTION_IID =
    "{9ff02465-21cb-49f3-b975-7d5b38ceec73}";

  /**
   * onFunctionCall is called when execution of a custom
   * function should occur.
   * 
   * @param aNumArguments         The number of arguments
   * @param aFunctionArguments    The arguments passed in to the function
   *
   * @returns any value as Variant type.
   */
  nsIVariant onFunctionCall(mozIStorageValueArray aFunctionArguments);

}