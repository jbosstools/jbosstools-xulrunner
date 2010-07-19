/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpfe/appshell/public/nsIWindowMediator.idl
 */

package org.mozilla.interfaces;

public interface nsIWindowMediator extends nsISupports {

  String NS_IWINDOWMEDIATOR_IID =
    "{0659cb81-faad-11d2-8e19-b206620a657c}";

  /** Return an enumerator which iterates over all windows of type aWindowType
    * from the oldest window to the youngest.
    * @param  aWindowType the returned enumerator will enumerate only
    *                     windows of this type. ("type" is the
    *                     |windowtype| attribute of the XML <window> element.)
    *                     If null, all windows will be enumerated.
    * @return an enumerator of nsIDOMWindows
    */
  nsISimpleEnumerator getEnumerator(String aWindowType);

  /** Identical to getEnumerator except:
    * @return an enumerator of nsIXULWindows
  */
  nsISimpleEnumerator getXULWindowEnumerator(String aWindowType);

  /** Return an enumerator which iterates over all windows of type aWindowType
    * in their z (front-to-back) order. Note this interface makes
    * no requirement that a window couldn't be revisited if windows
    * are re-ordered while z-order enumerators are active.
    * @param  aWindowType the returned enumerator will enumerate only
    *                     windows of this type. ("type" is the
    *                     |windowtype| attribute of the XML <window> element.)
    *                     If null, all windows will be enumerated.
    * @param  aFrontToBack if true, the enumerator enumerates windows in order
    *                      from front to back. back to front if false.
    * @return an enumerator of nsIDOMWindows
    */
  nsISimpleEnumerator getZOrderDOMWindowEnumerator(String aWindowType, boolean aFrontToBack);

  /** Identical to getZOrderDOMWindowEnumerator except:
    * @return an enumerator of nsIXULWindows
    */
  nsISimpleEnumerator getZOrderXULWindowEnumerator(String aWindowType, boolean aFrontToBack);

  /** This is a shortcut for simply fetching the first window in
    * front to back order.
    * @param  aWindowType return the topmost window of this type.
    *                     ("type" is the |windowtype| attribute of
    *                     the XML <window> element.)
    *                     If null, return the topmost window of any type.
    * @return the topmost window
    */
  nsIDOMWindowInternal getMostRecentWindow(String aWindowType);

  long zLevelTop = 1L;

  long zLevelBottom = 2L;

  long zLevelBelow = 3L;

  /** Register a listener for window status changes.
    * keeps strong ref? (to be decided)
    * @param aListener the listener to register
    */
  void addListener(nsIWindowMediatorListener aListener);

  /** Unregister a listener of window status changes.
    * @param aListener the listener to unregister
    */
  void removeListener(nsIWindowMediatorListener aListener);

}