/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/satchel/public/nsIFormAutoComplete.idl
 */

package org.mozilla.interfaces;

public interface nsIFormAutoComplete extends nsISupports {

  String NS_IFORMAUTOCOMPLETE_IID =
    "{997c0c05-5d1d-47e5-9cbc-765c0b8ec699}";

  /**
     * Generate results for a form input autocomplete menu.
     */
  nsIAutoCompleteResult autoCompleteSearch(String aInputName, String aSearchString, nsIDOMHTMLInputElement aField, nsIAutoCompleteResult aPreviousResult);

}