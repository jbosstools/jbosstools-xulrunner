/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMNSHTMLInputElement.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMNSHTMLInputElement extends nsISupports {

  String NS_IDOMNSHTMLINPUTELEMENT_IID =
    "{2cb61f32-b21f-4b87-904c-8876d8bb5f33}";

  nsIControllers getControllers();

  int getTextLength();

  int getSelectionStart();

  void setSelectionStart(int aSelectionStart);

  int getSelectionEnd();

  void setSelectionEnd(int aSelectionEnd);

  nsIDOMFileList getFiles();

  boolean getIndeterminate();

  void setIndeterminate(boolean aIndeterminate);

  boolean getMultiple();

  void setMultiple(boolean aMultiple);

  String[] mozGetFileNameArray(long[] aLength);

  void mozSetFileNameArray(String[] aFileNames, long aLength);

  void setSelectionRange(int selectionStart, int selectionEnd);

}