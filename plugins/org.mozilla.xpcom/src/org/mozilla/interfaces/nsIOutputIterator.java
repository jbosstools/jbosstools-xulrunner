/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsISupportsIterators.idl
 */

package org.mozilla.interfaces;

/**
   * ...
   */
public interface nsIOutputIterator extends nsISupports {

  String NS_IOUTPUTITERATOR_IID =
    "{7330650e-1dd2-11b2-a0c2-9ff86ee97bed}";

  /**
       * Put |anElementToPut| into the underlying container or sequence at the position currently pointed to by this iterator.
       * The iterator and the underlying container or sequence cooperate to |Release()|
       * the replaced element, if any and if necessary, and to |AddRef()| the new element.
       *
       * The result is undefined if this iterator currently points outside the
       * useful range of the underlying container or sequence.
       *
       * @param anElementToPut the element to place into the underlying container or sequence
       */
  void putElement(nsISupports anElementToPut);

  /**
       * Advance this iterator to the next position in the underlying container or sequence.
       */
  void stepForward();

}