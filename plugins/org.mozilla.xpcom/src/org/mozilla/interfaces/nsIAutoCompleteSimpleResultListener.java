/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/autocomplete/public/nsIAutoCompleteSimpleResult.idl
 */

package org.mozilla.interfaces;

public interface nsIAutoCompleteSimpleResultListener extends nsISupports {

  String NS_IAUTOCOMPLETESIMPLERESULTLISTENER_IID =
    "{004efdc5-1989-4874-8a7a-345bf2fa33af}";

  /**
   * Dispatched after a value is removed from the result.
   * @param aResult
   *        The result from which aValue has been removed.
   * @param aValue
   *        The removed value.
   * @param aRemoveFromDb
   *        Whether the value should be removed from persistent storage as well.
   */
  void onValueRemoved(nsIAutoCompleteSimpleResult aResult, String aValue, boolean aRemoveFromDb);

}