/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsIAtom.idl
 */

package org.mozilla.interfaces;

public interface nsIAtom extends nsISupports {

  String NS_IATOM_IID =
    "{3d1b15b0-93b4-11d1-895b-006008911b81}";

  /**
   * Get the Unicode or UTF8 value for the string
   */
  String toString();

  String toUTF8String();

  /**
   * Compare the atom to a specific string value
   * Note that this will NEVER return/throw an error condition.
   */
  boolean _equals(String aString);

  boolean equalsUTF8(String aString);

}