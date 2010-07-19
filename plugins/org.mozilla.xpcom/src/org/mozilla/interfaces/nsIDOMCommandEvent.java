/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMCommandEvent.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMCommandEvent extends nsIDOMEvent {

  String NS_IDOMCOMMANDEVENT_IID =
    "{37fb1798-0f76-4870-af6f-0135b4d973c8}";

  String getCommand();

  void initCommandEvent(String typeArg, boolean canBubbleArg, boolean canCancelArg, String command);

}