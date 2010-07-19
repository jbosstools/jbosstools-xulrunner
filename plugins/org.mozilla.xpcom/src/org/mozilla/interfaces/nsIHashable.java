/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsIHashable.idl
 */

package org.mozilla.interfaces;

/**
 * Represents an object that can be stored in a hashtable.
 *
 * @status FROZEN - This interface will not change in the Mozilla 1.x lifetime
 */
public interface nsIHashable extends nsISupports {

  String NS_IHASHABLE_IID =
    "{17e595fa-b57a-4933-bd0f-b1812e8ab188}";

  /**
   * Is this object the equivalent of the other object?
   */
  boolean _equals(nsIHashable aOther);

  /**
   * A generated hashcode for this object. Objects that are equivalent
   * must have the same hash code. Getting this property should never
   * throw an exception!
   */
  long getHashCode();

}