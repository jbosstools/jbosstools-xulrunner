/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMPopupBlockedEvent.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMPopupBlockedEvent interface is the datatype for events
 * posted when a popup window is blocked.
 */
public interface nsIDOMPopupBlockedEvent extends nsIDOMEvent {

  String NS_IDOMPOPUPBLOCKEDEVENT_IID =
    "{05be571f-c3ea-4959-a340-c57b1591ae4b}";

  /**
   * The window object that attempted to open the blocked popup
   * (i.e. the window object on which open() was called).
   */
  nsIDOMWindow getRequestingWindow();

  /**
   * The URI of the window that was blocked.
   */
  nsIURI getPopupWindowURI();

  /**
   * The string of features passed to the window.open() call
   * (as the third argument)
   */
  String getPopupWindowFeatures();

  /**
   * The window name passed to the window.open() call
   * (as the second argument)
   */
  String getPopupWindowName();

  void initPopupBlockedEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, nsIDOMWindow requestingWindow, nsIURI popupWindowURI, String popupWindowName, String popupWindowFeatures);

}