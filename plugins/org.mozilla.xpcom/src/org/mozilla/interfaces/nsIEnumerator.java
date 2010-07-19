/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsIEnumerator.idl
 */

package org.mozilla.interfaces;

public interface nsIEnumerator extends nsISupports {

  String NS_IENUMERATOR_IID =
    "{ad385286-cbc4-11d2-8cca-0060b0fc14a3}";

  /** First will reset the list. will return NS_FAILED if no items
   */
  void first();

  /** Next will advance the list. will return failed if already at end
   */
  void next();

  /** CurrentItem will return the CurrentItem item it will fail if the 
   *  list is empty
   */
  nsISupports currentItem();

  /** return if the collection is at the end.  that is the beginning following 
   *  a call to Prev and it is the end of the list following a call to next
   */
  void isDone();

}