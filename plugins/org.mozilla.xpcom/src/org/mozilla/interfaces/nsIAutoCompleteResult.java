/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/autocomplete/public/nsIAutoCompleteResult.idl
 */

package org.mozilla.interfaces;

public interface nsIAutoCompleteResult extends nsISupports {

  String NS_IAUTOCOMPLETERESULT_IID =
    "{d2fcba9a-3f5c-40fc-a9fc-4adc87dc61ef}";

  /**
   * Possible values for the searchResult attribute
   */
  int RESULT_IGNORED = 1;

  int RESULT_FAILURE = 2;

  int RESULT_NOMATCH = 3;

  int RESULT_SUCCESS = 4;

  int RESULT_NOMATCH_ONGOING = 5;

  int RESULT_SUCCESS_ONGOING = 6;

  /**
   * The original search string
   */
  String getSearchString();

  /**
   * The result of the search
   */
  int getSearchResult();

  /**
   * Index of the default item that should be entered if none is selected
   */
  int getDefaultIndex();

  /**
   * A string describing the cause of a search failure
   */
  String getErrorDescription();

  /**
   * The number of matches
   */
  long getMatchCount();

  /**
   * Get the value of the result at the given index
   */
  String getValueAt(int index);

  /**
   * Get the comment of the result at the given index
   */
  String getCommentAt(int index);

  /**
   * Get the style hint for the result at the given index
   */
  String getStyleAt(int index);

  /**
   * Get the image of the result at the given index
   */
  String getImageAt(int index);

  /**
   * Remove the value at the given index from the autocomplete results.
   * If removeFromDb is set to true, the value should be removed from
   * persistent storage as well.
   */
  void removeValueAt(int rowIndex, boolean removeFromDb);

}