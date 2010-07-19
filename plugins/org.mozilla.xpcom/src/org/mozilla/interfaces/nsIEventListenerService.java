/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/events/public/nsIEventListenerService.idl
 */

package org.mozilla.interfaces;

public interface nsIEventListenerService extends nsISupports {

  String NS_IEVENTLISTENERSERVICE_IID =
    "{551cac0f-31ed-45e0-8d67-bc0d6e117b31}";

  /**
   * Returns an array of nsIEventListenerInfo objects.
   * If aEventTarget doesn't have any listeners, this returns null.
   */
  nsIEventListenerInfo[] getListenerInfoFor(nsIDOMEventTarget aEventTarget, long[] aCount);

  /**
   * Returns an array of event targets.
   * aEventTarget will be at index 0.
   * The objects are the ones that would be used as DOMEvent.currentTarget while
   * dispatching an event to aEventTarget
   * @note Some events, especially 'load', may actually have a shorter
   *       event target chain than what this methods returns.
  */
  nsIDOMEventTarget[] getEventTargetChainFor(nsIDOMEventTarget aEventTarget, long[] aCount);

}