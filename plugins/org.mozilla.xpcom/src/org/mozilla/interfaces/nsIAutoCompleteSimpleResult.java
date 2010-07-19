/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/autocomplete/public/nsIAutoCompleteSimpleResult.idl
 */

package org.mozilla.interfaces;

/**
 * This class implements nsIAutoCompleteResult and provides simple methods
 * for setting the value and result items. It can be used whenever some basic
 * auto complete results are needed that can be pre-generated and filled into
 * an array.
 */
public interface nsIAutoCompleteSimpleResult extends nsIAutoCompleteResult {

  String NS_IAUTOCOMPLETESIMPLERESULT_IID =
    "{f9841787-ad26-49e6-a2dd-ba9020ee1c64}";

  /**
   * A writer for the readonly attribute 'searchString' which should contain
   * the string that the user typed.
   */
  void setSearchString(String aSearchString);

  /**
   * A writer for the readonly attribute 'errorDescription'.
   */
  void setErrorDescription(String aErrorDescription);

  /**
   * A writer for the readonly attribute 'defaultIndex' which should contain
   * the index of the list that will be selected by default (normally 0).
   */
  void setDefaultIndex(int aDefaultIndex);

  /**
   * A writer for the readonly attribute 'searchResult' which should contain
   * one of the constants nsIAutoCompleteResult.RESULT_* indicating the success
   * of the search.
   */
  void setSearchResult(int aSearchResult);

  /**
   * Appends a result item consisting of the given value, comment, image and style.
   * This is how you add results.  Note:  image and style are optional. 
   */
  void appendMatch(String aValue, String aComment, String aImage, String aStyle);

  /**
   * Sets a listener for changes in the result.
   */
  void setListener(nsIAutoCompleteSimpleResultListener aListener);

}