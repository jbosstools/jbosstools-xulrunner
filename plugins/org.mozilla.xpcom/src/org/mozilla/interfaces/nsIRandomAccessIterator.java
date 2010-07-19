/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsISupportsIterators.idl
 */

package org.mozilla.interfaces;

/**
   * ...
   */
public interface nsIRandomAccessIterator extends nsISupports {

  String NS_IRANDOMACCESSITERATOR_IID =
    "{9bd6fdb0-1dd1-11b2-9101-d15375968230}";

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
       * Retrieve (and |AddRef()|) an element at some offset from where this iterator currently points.
       * The offset may be negative.  |getElementAt(0)| is equivalent to |getElement()|.
       *
       * The result is undefined if this iterator currently points outside the
       * useful range of the underlying container or sequence.
       *
       * @param anOffset a |0|-based offset from the position to which this iterator currently points
       * @result a new reference to the indicated element (if any)
       */
  nsISupports getElementAt(int anOffset);

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
       * Put |anElementToPut| into the underlying container or sequence at the position |anOffset| away from that currently pointed to by this iterator.
       * The iterator and the underlying container or sequence cooperate to |Release()|
       * the replaced element, if any and if necessary, and to |AddRef()| the new element.
       * |putElementAt(0, obj)| is equivalent to |putElement(obj)|.
       *
       * The result is undefined if this iterator currently points outside the
       * useful range of the underlying container or sequence.
       *
       * @param anOffset a |0|-based offset from the position to which this iterator currently points
       * @param anElementToPut the element to place into the underlying container or sequence
       */
  void putElementAt(int anOffset, nsISupports anElementToPut);

  /**
       * Advance this iterator to the next position in the underlying container or sequence.
       */
  void stepForward();

  /**
       * Move this iterator by |anOffset| positions in the underlying container or sequence.
       * |anOffset| may be negative.  |stepForwardBy(1)| is equivalent to |stepForward()|.
       * |stepForwardBy(0)| is a no-op.
       *
       * @param anOffset a |0|-based offset from the position to which this iterator currently points
       */
  void stepForwardBy(int anOffset);

  /**
       * Move this iterator to the previous position in the underlying container or sequence.
       */
  void stepBackward();

  /**
       * Move this iterator backwards by |anOffset| positions in the underlying container or sequence.
       * |anOffset| may be negative.  |stepBackwardBy(1)| is equivalent to |stepBackward()|.
       * |stepBackwardBy(n)| is equivalent to |stepForwardBy(-n)|.  |stepBackwardBy(0)| is a no-op.
       *
       * @param anOffset a |0|-based offset from the position to which this iterator currently points
       */
  void stepBackwardBy(int anOffset);

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