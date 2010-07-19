/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/xul/nsIDOMXULPopupElement.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMXULPopupElement extends nsIDOMXULElement {

  String NS_IDOMXULPOPUPELEMENT_IID =
    "{c32390a8-2bd8-4d1b-bf9f-1b1d0a944d19}";

  int BEFORE_START = 1;

  int BEFORE_END = 2;

  int AFTER_START = 3;

  int AFTER_END = 4;

  int START_BEFORE = 5;

  int START_AFTER = 6;

  int END_BEFORE = 7;

  int END_AFTER = 8;

  int OVERLAP = 9;

  int AT_POINTER = 10;

  int AFTER_POINTER = 11;

  String getPosition();

  void setPosition(String aPosition);

  void showPopup(int alignment, nsIDOMElement target, nsIDOMElement anchor);

  void hidePopup();

}