/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/xul/nsIDOMXULTextboxElement.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMXULTextBoxElement extends nsIDOMXULControlElement {

  String NS_IDOMXULTEXTBOXELEMENT_IID =
    "{71135b6c-294e-4634-a8e4-a72398f1e72a}";

  nsIDOMNode getInputField();

  int getTextLength();

  int getMaxLength();

  void setMaxLength(int aMaxLength);

  int getSize();

  void setSize(int aSize);

  int getSelectionStart();

  void setSelectionStart(int aSelectionStart);

  int getSelectionEnd();

  void setSelectionEnd(int aSelectionEnd);

  String getValue();

  void setValue(String aValue);

  String getType();

  void setType(String aType);

  void select();

  void setSelectionRange(int selectionStart, int selectionEnd);

}