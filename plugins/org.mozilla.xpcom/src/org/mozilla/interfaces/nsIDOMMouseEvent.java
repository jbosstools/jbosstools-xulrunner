/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMMouseEvent.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMMouseEvent interface is the datatype for all mouse events
 * in the Document Object Model.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-Events/
 *
 * @status FROZEN
 */
public interface nsIDOMMouseEvent extends nsIDOMUIEvent {

  String NS_IDOMMOUSEEVENT_IID =
    "{ff751edc-8b02-aae7-0010-8301838a3123}";

  int getScreenX();

  int getScreenY();

  int getClientX();

  int getClientY();

  boolean getCtrlKey();

  boolean getShiftKey();

  boolean getAltKey();

  boolean getMetaKey();

  int getButton();

  nsIDOMEventTarget getRelatedTarget();

  void initMouseEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, nsIDOMAbstractView viewArg, int detailArg, int screenXArg, int screenYArg, int clientXArg, int clientYArg, boolean ctrlKeyArg, boolean altKeyArg, boolean shiftKeyArg, boolean metaKeyArg, int buttonArg, nsIDOMEventTarget relatedTargetArg);

}