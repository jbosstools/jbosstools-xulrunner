/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsISupportsIterators.idl
 */

package org.mozilla.interfaces;

/**
   * ...
   */
public interface nsIInputIterator extends nsISupports {

  String NS_IINPUTITERATOR_IID =
    "{85585e12-1dd2-11b2-a930-f6929058269a}";

  /**
       * Retrieve (and |AddRef()|) the element this iterator currently points to.
       *
       * The result is undefined if this iterator currently points outside the
       * useful range of the underlying container or sequence.
       *
       * @result a new reference to the element this iterator currently points to (if any)
       */
  nsISupports getElement();

  /**
       * Advance this iterator to the next position in the underlying container or sequence.
       */
  void stepForward();

  /**
       * Test if |anotherIterator| points to the same position in the underlying container or sequence.
       *
       * The result is undefined if |anotherIterator| was not created by or for the same underlying container or sequence.
       *
       * @param anotherIterator another iterator to compare against, created by or for the same underlying container or sequence
       * @result true if |anotherIterator| points to the same position in the underlying container or sequence
       */
  boolean isEqualTo(nsISupports anotherIterator);

  /**
       * Create a new iterator pointing to the same position in the underlying container or sequence to which this iterator currently points.
       * The returned iterator is suitable for use in a subsequent call to |isEqualTo()| against this iterator.
       *
       * @result a new iterator pointing at the same position in the same underlying container or sequence as this iterator
       */
  nsISupports _clone();

}