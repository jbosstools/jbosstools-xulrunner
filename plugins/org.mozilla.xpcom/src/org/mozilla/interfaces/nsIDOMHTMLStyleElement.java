/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLStyleElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLStyleElement interface is the interface to a [X]HTML
 * style element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLStyleElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLSTYLEELEMENT_IID =
    "{a6cf908d-15b3-11d2-932e-00805f8add32}";

  boolean getDisabled();

  void setDisabled(boolean aDisabled);

  String getMedia();

  void setMedia(String aMedia);

  String getType();

  void setType(String aType);

}