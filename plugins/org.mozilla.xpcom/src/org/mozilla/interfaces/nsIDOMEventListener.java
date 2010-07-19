/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMEventListener.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMEventListener extends nsISupports {

  String NS_IDOMEVENTLISTENER_IID =
    "{df31c120-ded6-11d1-bd85-00805f8ae3f4}";

  /**
 * The nsIDOMEventListener interface is a callback interface for
 * listening to events in the Document Object Model.
 *
 * For more information on this interface please see 
 * http://www.w3.org/TR/DOM-Level-2-Events/
 *
 * @status FROZEN
 */
/**
   * This method is called whenever an event occurs of the type for which 
   * the EventListener interface was registered.
   *
   * @param   evt The Event contains contextual information about the 
   *              event. It also contains the stopPropagation and 
   *              preventDefault methods which are used in determining the 
   *              event's flow and default action.
   */
  void handleEvent(nsIDOMEvent event);

}