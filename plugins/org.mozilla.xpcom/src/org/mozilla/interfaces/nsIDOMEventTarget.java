/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMEventTarget.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMEventTarget extends nsISupports {

  String NS_IDOMEVENTTARGET_IID =
    "{1c773b30-d1cf-11d2-bd95-00805f8ae3f4}";

  /**
 * The nsIDOMEventTarget interface is the interface implemented by all
 * event targets in the Document Object Model.
 *
 * For more information on this interface please see 
 * http://www.w3.org/TR/DOM-Level-2-Events/
 *
 * @status FROZEN
 */
/**
   * This method allows the registration of event listeners on the event target.
   * If an EventListener is added to an EventTarget while it is processing an
   * event, it will not be triggered by the current actions but may be 
   * triggered during a later stage of event flow, such as the bubbling phase.
   * 
   * If multiple identical EventListeners are registered on the same 
   * EventTarget with the same parameters the duplicate instances are 
   * discarded. They do not cause the EventListener to be called twice 
   * and since they are discarded they do not need to be removed with the 
   * removeEventListener method.
   *
   * @param   type The event type for which the user is registering
   * @param   listener The listener parameter takes an interface 
   *                   implemented by the user which contains the methods 
   *                   to be called when the event occurs.
   * @param   useCapture If true, useCapture indicates that the user 
   *                     wishes to initiate capture. After initiating 
   *                     capture, all events of the specified type will be 
   *                     dispatched to the registered EventListener before 
   *                     being dispatched to any EventTargets beneath them 
   *                     in the tree. Events which are bubbling upward 
   *                     through the tree will not trigger an 
   *                     EventListener designated to use capture.
   */
  void addEventListener(String type, nsIDOMEventListener listener, boolean useCapture);

  /**
   * This method allows the removal of event listeners from the event 
   * target. If an EventListener is removed from an EventTarget while it 
   * is processing an event, it will not be triggered by the current actions. 
   * EventListeners can never be invoked after being removed.
   * Calling removeEventListener with arguments which do not identify any 
   * currently registered EventListener on the EventTarget has no effect.
   *
   * @param   type Specifies the event type of the EventListener being 
   *               removed.
   * @param   listener The EventListener parameter indicates the 
   *                   EventListener to be removed.
   * @param   useCapture Specifies whether the EventListener being 
   *                     removed was registered as a capturing listener or 
   *                     not. If a listener was registered twice, one with 
   *                     capture and one without, each must be removed 
   *                     separately. Removal of a capturing listener does 
   *                     not affect a non-capturing version of the same 
   *                     listener, and vice versa.
   */
  void removeEventListener(String type, nsIDOMEventListener listener, boolean useCapture);

  /**
   * This method allows the dispatch of events into the implementations 
   * event model. Events dispatched in this manner will have the same 
   * capturing and bubbling behavior as events dispatched directly by the 
   * implementation. The target of the event is the EventTarget on which 
   * dispatchEvent is called.
   *
   * @param   evt Specifies the event type, behavior, and contextual 
   *              information to be used in processing the event.
   * @return  Indicates whether any of the listeners which handled the 
   *          event called preventDefault. If preventDefault was called 
   *          the value is false, else the value is true.
   * @throws  UNSPECIFIED_EVENT_TYPE_ERR: Raised if the Event's type was 
   *              not specified by initializing the event before 
   *              dispatchEvent was called. Specification of the Event's 
   *              type as null or an empty string will also trigger this 
   *              exception.
   */
  boolean dispatchEvent(nsIDOMEvent evt);

}