/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOM3EventTarget.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMEventTarget interface is the interface implemented by all
 * event targets in the Document Object Model.
 *
 * For more information on this interface please see 
 * http://www.w3.org/TR/DOM-Level-3-Events/
 */
public interface nsIDOM3EventTarget extends nsISupports {

  String NS_IDOM3EVENTTARGET_IID =
    "{3e9c01a7-de97-4c3b-8294-b4bd9d7056d1}";

  void addGroupedEventListener(String type, nsIDOMEventListener listener, boolean useCapture, nsIDOMEventGroup evtGroup);

  void removeGroupedEventListener(String type, nsIDOMEventListener listener, boolean useCapture, nsIDOMEventGroup evtGroup);

  boolean canTrigger(String type);

  boolean isRegisteredHere(String type);

}