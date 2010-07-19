/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLFontElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLFontElement interface is the interface to a [X]HTML
 * font element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLFontElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLFONTELEMENT_IID =
    "{a6cf90a7-15b3-11d2-932e-00805f8add32}";

  String getColor();

  void setColor(String aColor);

  String getFace();

  void setFace(String aFace);

  String getSize();

  void setSize(String aSize);

}