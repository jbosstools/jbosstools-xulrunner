/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLScriptElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLScriptElement interface is the interface to a [X]HTML
 * script element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLScriptElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLSCRIPTELEMENT_IID =
    "{a6cf90b1-15b3-11d2-932e-00805f8add32}";

  String getText();

  void setText(String aText);

  String getHtmlFor();

  void setHtmlFor(String aHtmlFor);

  String getEvent();

  void setEvent(String aEvent);

  String getCharset();

  void setCharset(String aCharset);

  boolean getDefer();

  void setDefer(boolean aDefer);

  String getSrc();

  void setSrc(String aSrc);

  String getType();

  void setType(String aType);

}