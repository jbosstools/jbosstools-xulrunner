/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/xul/nsIDOMXULButtonElement.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMXULButtonElement extends nsIDOMXULLabeledControlElement {

  String NS_IDOMXULBUTTONELEMENT_IID =
    "{6852d9a6-1dd2-11b2-a29d-cd7977a91b1b}";

  short CHECKSTATE_UNCHECKED = 0;

  short CHECKSTATE_CHECKED = 1;

  short CHECKSTATE_MIXED = 2;

  String getType();

  void setType(String aType);

  String getDlgType();

  void setDlgType(String aDlgType);

  boolean getOpen();

  void setOpen(boolean aOpen);

  boolean getChecked();

  void setChecked(boolean aChecked);

  int getCheckState();

  void setCheckState(int aCheckState);

  boolean getAutoCheck();

  void setAutoCheck(boolean aAutoCheck);

  String getGroup();

  void setGroup(String aGroup);

}