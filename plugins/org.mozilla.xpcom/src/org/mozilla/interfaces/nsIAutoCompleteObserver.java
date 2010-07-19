/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/autocomplete/public/nsIAutoCompleteSearch.idl
 */

package org.mozilla.interfaces;

public interface nsIAutoCompleteObserver extends nsISupports {

  String NS_IAUTOCOMPLETEOBSERVER_IID =
    "{18c36504-9a4c-4ac3-8494-bd05e00ae27f}";

  void onSearchResult(nsIAutoCompleteSearch search, nsIAutoCompleteResult result);

}