/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMDocumentEvent.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMDocumentEvent interface is the interface to the event
 * factory method on a DOM document object.
 *
 * For more information on this interface please see 
 * http://www.w3.org/TR/DOM-Level-2-Events/
 *
 * @status FROZEN
 */
public interface nsIDOMDocumentEvent extends nsISupports {

  String NS_IDOMDOCUMENTEVENT_IID =
    "{46b91d66-28e2-11d4-ab1e-0010830123b4}";

  nsIDOMEvent createEvent(String eventType);

}