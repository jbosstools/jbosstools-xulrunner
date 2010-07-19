/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/xul/nsIDOMXULCommandEvent.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMXULCommandEvent extends nsIDOMUIEvent {

  String NS_IDOMXULCOMMANDEVENT_IID =
    "{f9fa8205-a988-4828-9228-f3332d5475ac}";

  /**
   * Command events support the same set of modifier keys as mouse and key
   * events.
   */
  boolean getCtrlKey();

  boolean getShiftKey();

  boolean getAltKey();

  boolean getMetaKey();

  /**
   * If the command event was redispatched because of a command= attribute
   * on the original target, sourceEvent will be set to the original DOM Event.
   * Otherwise, sourceEvent is null.
   */
  nsIDOMEvent getSourceEvent();

  /**
   * Creates a new command event with the given attributes.
   */
  void initCommandEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, nsIDOMAbstractView viewArg, int detailArg, boolean ctrlKeyArg, boolean altKeyArg, boolean shiftKeyArg, boolean metaKeyArg, nsIDOMEvent sourceEvent);

}