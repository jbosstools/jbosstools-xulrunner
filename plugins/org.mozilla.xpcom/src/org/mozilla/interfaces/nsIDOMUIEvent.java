/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMUIEvent.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMUIEvent interface is the datatype for all UI events in the
 * Document Object Model.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-Events/
 *
 * @status FROZEN
 */
public interface nsIDOMUIEvent extends nsIDOMEvent {

  String NS_IDOMUIEVENT_IID =
    "{a6cf90c3-15b3-11d2-932e-00805f8add32}";

  nsIDOMAbstractView getView();

  int getDetail();

  void initUIEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, nsIDOMAbstractView viewArg, int detailArg);

}