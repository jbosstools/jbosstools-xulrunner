/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/autocomplete/public/nsIAutoCompletePopup.idl
 */

package org.mozilla.interfaces;

public interface nsIAutoCompletePopup extends nsISupports {

  String NS_IAUTOCOMPLETEPOPUP_IID =
    "{1b9d7d8a-6dd0-11dc-8314-0800200c9a66}";

  nsIAutoCompleteInput getInput();

  String getOverrideValue();

  int getSelectedIndex();

  void setSelectedIndex(int aSelectedIndex);

  boolean getPopupOpen();

  void openAutocompletePopup(nsIAutoCompleteInput input, nsIDOMElement element);

  void closePopup();

  void invalidate();

  void selectBy(boolean reverse, boolean page);

}