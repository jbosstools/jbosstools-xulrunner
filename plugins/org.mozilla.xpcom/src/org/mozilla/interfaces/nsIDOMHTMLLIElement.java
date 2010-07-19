/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLLIElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLLIElement interface is the interface to a [X]HTML li
 * element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLLIElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLLIELEMENT_IID =
    "{a6cf909e-15b3-11d2-932e-00805f8add32}";

  String getType();

  void setType(String aType);

  int getValue();

  void setValue(int aValue);

}