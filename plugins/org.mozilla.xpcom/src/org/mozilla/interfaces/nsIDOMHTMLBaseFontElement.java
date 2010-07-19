/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLBaseFontElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLBaseFontElement interface is the interface to a
 * [X]HTML basefont element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLBaseFontElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLBASEFONTELEMENT_IID =
    "{a6cf90a6-15b3-11d2-932e-00805f8add32}";

  String getColor();

  void setColor(String aColor);

  String getFace();

  void setFace(String aFace);

  int getSize();

  void setSize(int aSize);

}