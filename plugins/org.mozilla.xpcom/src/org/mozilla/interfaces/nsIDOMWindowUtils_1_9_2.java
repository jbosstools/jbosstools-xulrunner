/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/base/nsIDOMWindowUtils.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMWindowUtils_1_9_2 extends nsISupports {

  String NS_IDOMWINDOWUTILS_1_9_2_IID =
    "{b0f803f7-98c0-4152-812c-d6678ba23049}";

  /**
   * Dispatches aEvent via the nsIPresShell object of the window's document.
   * The event is dispatched to aTarget, which should be an object
   * which implements nsIContent interface (#element, #text, etc).
   *
   * Cannot be accessed from unprivileged context (not
   * content-accessible) Will throw a DOM security error if called
   * without UniversalXPConnect privileges.
   *
   * @note Event handlers won't get aEvent as parameter, but a similar event.
   *       Also, aEvent should not be reused.
   */
  boolean dispatchDOMEventViaPresShell(nsIDOMNode aTarget, nsIDOMEvent aEvent, boolean aTrusted);

}