/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsISimpleEnumerator.idl
 */

package org.mozilla.interfaces;

/**
 * Used to enumerate over elements defined by its implementor.
 * Although hasMoreElements() can be called independently of getNext(),
 * getNext() must be pre-ceeded by a call to hasMoreElements(). There is
 * no way to "reset" an enumerator, once you obtain one.
 *
 * @status FROZEN
 * @version 1.0
 */
public interface nsISimpleEnumerator extends nsISupports {

  String NS_ISIMPLEENUMERATOR_IID =
    "{d1899240-f9d2-11d2-bdd6-000064657374}";

  /**
   * Called to determine whether or not the enumerator has
   * any elements that can be returned via getNext(). This method
   * is generally used to determine whether or not to initiate or
   * continue iteration over the enumerator, though it can be
   * called without subsequent getNext() calls. Does not affect
   * internal state of enumerator.
   *
   * @see getNext()
   * @return PR_TRUE if there are remaining elements in the enumerator.
   *         PR_FALSE if there are no more elements in the enumerator.
   */
  boolean hasMoreElements();

  /**
   * Called to retrieve the next element in the enumerator. The "next"
   * element is the first element upon the first call. Must be
   * pre-ceeded by a call to hasMoreElements() which returns PR_TRUE.
   * This method is generally called within a loop to iterate over
   * the elements in the enumerator.
   *
   * @see hasMoreElements()
   * @return NS_OK if the call succeeded in returning a non-null
   *               value through the out parameter.
   *         NS_ERROR_FAILURE if there are no more elements
   *                          to enumerate.
   * @return the next element in the enumeration.
   */
  nsISupports getNext();

}