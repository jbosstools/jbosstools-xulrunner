/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLOListElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLOListElement interface is the interface to a [X]HTML
 * ol element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLOListElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLOLISTELEMENT_IID =
    "{a6cf909a-15b3-11d2-932e-00805f8add32}";

  boolean getCompact();

  void setCompact(boolean aCompact);

  int getStart();

  void setStart(int aStart);

  String getType();

  void setType(String aType);

}