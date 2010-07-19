/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLMapElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLMapElement interface is the interface to a [X]HTML
 * map element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLMapElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLMAPELEMENT_IID =
    "{a6cf90af-15b3-11d2-932e-00805f8add32}";

  nsIDOMHTMLCollection getAreas();

  String getName();

  void setName(String aName);

}