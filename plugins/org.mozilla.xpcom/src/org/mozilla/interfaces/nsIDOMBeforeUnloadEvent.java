/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMBeforeUnloadEvent.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMBeforeUnloadEvent interface is the interface for events
 * sent to handlers of the "beforeunload" event. This event is
 * non-standard. Interface derived from Microsoft IE's event
 * implementation.
 *
 * http://msdn.microsoft.com/library/default.asp?url=/workshop/author/dhtml/reference/events.asp
 *
 */
public interface nsIDOMBeforeUnloadEvent extends nsIDOMEvent {

  String NS_IDOMBEFOREUNLOADEVENT_IID =
    "{da19e9dc-dea2-4a1d-a958-9be375c9799c}";

  /**
   * Attribute used to pass back a return value from a beforeunload
   * handler
   */
  String getReturnValue();

  /**
   * Attribute used to pass back a return value from a beforeunload
   * handler
   */
  void setReturnValue(String aReturnValue);

}