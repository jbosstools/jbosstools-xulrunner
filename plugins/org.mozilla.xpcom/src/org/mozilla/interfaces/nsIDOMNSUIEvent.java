/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMNSUIEvent.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMNSUIEvent extends nsIDOMNSEvent {

  String NS_IDOMNSUIEVENT_IID =
    "{72c9f79c-98cd-4224-a467-86b59c0a38f7}";

  int SCROLL_PAGE_UP = -32768;

  int SCROLL_PAGE_DOWN = 32768;

  int getLayerX();

  int getLayerY();

  int getPageX();

  int getPageY();

  long getWhich();

  nsIDOMNode getRangeParent();

  int getRangeOffset();

  boolean getCancelBubble();

  void setCancelBubble(boolean aCancelBubble);

  boolean getIsChar();

}