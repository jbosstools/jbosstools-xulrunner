/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLOptionsCollection.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLOptionsCollection interface is the interface to a
 * collection of [X]HTML option elements.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLOptionsCollection extends nsISupports {

  String NS_IDOMHTMLOPTIONSCOLLECTION_IID =
    "{bce0213c-f70f-488f-b93f-688acca55d63}";

  long getLength();

  void setLength(long aLength);

  nsIDOMNode item(long index);

  nsIDOMNode namedItem(String name);

}