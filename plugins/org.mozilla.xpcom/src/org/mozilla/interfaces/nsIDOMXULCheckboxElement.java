/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/xul/nsIDOMXULCheckboxElement.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMXULCheckboxElement extends nsIDOMXULLabeledControlElement {

  String NS_IDOMXULCHECKBOXELEMENT_IID =
    "{5afaba88-1dd2-11b2-9249-dd65a129d0e4}";

  short CHECKSTATE_UNCHECKED = 0;

  short CHECKSTATE_CHECKED = 1;

  short CHECKSTATE_MIXED = 2;

  boolean getChecked();

  void setChecked(boolean aChecked);

  int getCheckState();

  void setCheckState(int aCheckState);

  boolean getAutoCheck();

  void setAutoCheck(boolean aAutoCheck);

}