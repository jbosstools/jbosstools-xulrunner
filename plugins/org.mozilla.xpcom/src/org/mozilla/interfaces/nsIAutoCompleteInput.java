/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/autocomplete/public/nsIAutoCompleteInput.idl
 */

package org.mozilla.interfaces;

public interface nsIAutoCompleteInput extends nsISupports {

  String NS_IAUTOCOMPLETEINPUT_IID =
    "{f5eddd39-f8e0-43b7-bc3d-03623f595e52}";

  nsIAutoCompletePopup getPopup();

  nsIAutoCompleteController getController();

  boolean getPopupOpen();

  void setPopupOpen(boolean aPopupOpen);

  boolean getDisableAutoComplete();

  void setDisableAutoComplete(boolean aDisableAutoComplete);

  boolean getCompleteDefaultIndex();

  void setCompleteDefaultIndex(boolean aCompleteDefaultIndex);

  boolean getCompleteSelectedIndex();

  void setCompleteSelectedIndex(boolean aCompleteSelectedIndex);

  boolean getForceComplete();

  void setForceComplete(boolean aForceComplete);

  long getMinResultsForPopup();

  void setMinResultsForPopup(long aMinResultsForPopup);

  long getMaxRows();

  void setMaxRows(long aMaxRows);

  boolean getShowCommentColumn();

  void setShowCommentColumn(boolean aShowCommentColumn);

  boolean getShowImageColumn();

  void setShowImageColumn(boolean aShowImageColumn);

  long getTimeout();

  void setTimeout(long aTimeout);

  String getSearchParam();

  void setSearchParam(String aSearchParam);

  long getSearchCount();

  String getSearchAt(long index);

  String getTextValue();

  void setTextValue(String aTextValue);

  int getSelectionStart();

  int getSelectionEnd();

  void selectTextRange(int startIndex, int endIndex);

  void onSearchBegin();

  void onSearchComplete();

  boolean onTextEntered();

  boolean onTextReverted();

  boolean getConsumeRollupEvent();

}