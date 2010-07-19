/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/storage/public/mozIStorageAggregateFunction.idl
 */

package org.mozilla.interfaces;

/**
 * mozIStorageAggregateFunction represents aggregate SQL function.
 * Common examples of aggregate functions are SUM() and COUNT().
 *
 * An aggregate function calculates one result for a given set of data, where
 * a set of data is a group of tuples. There can be one group
 * per request or many of them, if GROUP BY clause is used or not.
 */
public interface mozIStorageAggregateFunction extends nsISupports {

  String MOZISTORAGEAGGREGATEFUNCTION_IID =
    "{763217b7-3123-11da-918d-000347412e16}";

  /**
   * onStep is called when next value should be passed to
   * a custom function.
   * 
   * @param aFunctionArguments    The arguments passed in to the function
   */
  void onStep(mozIStorageValueArray aFunctionArguments);

  /**
   * Called when all tuples in a group have been processed and the engine
   * needs the aggregate function's value.
   *
   * @returns aggregate result as Variant.
   */
  nsIVariant onFinal();

}