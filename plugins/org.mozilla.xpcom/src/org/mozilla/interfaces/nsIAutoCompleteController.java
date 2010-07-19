/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/autocomplete/public/nsIAutoCompleteController.idl
 */

package org.mozilla.interfaces;

public interface nsIAutoCompleteController extends nsISupports {

  String NS_IAUTOCOMPLETECONTROLLER_IID =
    "{46a86173-0ab5-44b2-ab51-722cb3db1b60}";

  int STATUS_NONE = 1;

  int STATUS_SEARCHING = 2;

  int STATUS_COMPLETE_NO_MATCH = 3;

  int STATUS_COMPLETE_MATCH = 4;

  nsIAutoCompleteInput getInput();

  void setInput(nsIAutoCompleteInput aInput);

  int getSearchStatus();

  long getMatchCount();

  void startSearch(String searchString);

  void stopSearch();

  void handleText();

  boolean handleEnter(boolean aIsPopupSelection);

  boolean handleEscape();

  void handleStartComposition();

  void handleEndComposition();

  void handleTab();

  boolean handleKeyNavigation(long key);

  boolean handleDelete();

  String getValueAt(int index);

  String getCommentAt(int index);

  String getStyleAt(int index);

  String getImageAt(int index);

  String getSearchString();

  void setSearchString(String aSearchString);

}