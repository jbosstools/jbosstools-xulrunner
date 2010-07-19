/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMPageTransitionEvent.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMPageTransitionEvent interface is used for the pageshow and
 * pagehide events, which are generic events that apply to both page
 * load/unload and saving/restoring a document from session history.
 */
public interface nsIDOMPageTransitionEvent extends nsIDOMEvent {

  String NS_IDOMPAGETRANSITIONEVENT_IID =
    "{b712418b-376f-4f75-b156-5d9ad99fe51f}";

  /**
   * Set to true if the document has been or will be persisted across
   * firing of the event.  For example, if a document is being cached in
   * session history, |persisted| is true for the PageHide event.
   */
  boolean getPersisted();

  void initPageTransitionEvent(String typeArg, boolean canBubbleArg, boolean canCancelArg, boolean persisted);

}