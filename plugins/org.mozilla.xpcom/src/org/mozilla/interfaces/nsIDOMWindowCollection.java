/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/base/nsIDOMWindowCollection.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMWindowCollection extends nsISupports {

  String NS_IDOMWINDOWCOLLECTION_IID =
    "{a6cf906f-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMWindowCollection interface is an interface for a
 * collection of DOM window objects.
 *
 * @status FROZEN
 */
/**
   * Accessor for the number of windows in this collection.
   */
  long getLength();

  /**
   * Method for accessing an item in this collection by index.
   */
  nsIDOMWindow item(long index);

  /**
   * Method for accessing an item in this collection by window name.
   */
  nsIDOMWindow namedItem(String name);

}