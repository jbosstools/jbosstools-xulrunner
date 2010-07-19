/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/autocomplete/public/nsIAutoCompleteSearch.idl
 */

package org.mozilla.interfaces;

public interface nsIAutoCompleteSearch extends nsISupports {

  String NS_IAUTOCOMPLETESEARCH_IID =
    "{de8db85f-c1de-4d87-94ba-7844890f91fe}";

  void startSearch(String searchString, String searchParam, nsIAutoCompleteResult previousResult, nsIAutoCompleteObserver listener);

  void stopSearch();

}