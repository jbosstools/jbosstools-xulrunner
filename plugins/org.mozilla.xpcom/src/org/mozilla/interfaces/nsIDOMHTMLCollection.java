/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLCollection.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMHTMLCollection extends nsISupports {

  String NS_IDOMHTMLCOLLECTION_IID =
    "{a6cf9083-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMHTMLCollection interface is an interface to a collection
 * of [X]HTML elements.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
  long getLength();

  nsIDOMNode item(long index);

  nsIDOMNode namedItem(String name);

}