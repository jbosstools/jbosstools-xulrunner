/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLDocument.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLDocument interface is the interface to a [X]HTML
 * document object.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLDocument extends nsIDOMDocument {

  String NS_IDOMHTMLDOCUMENT_IID =
    "{a6cf9084-15b3-11d2-932e-00805f8add32}";

  String getTitle();

  void setTitle(String aTitle);

  String getReferrer();

  String getURL();

  nsIDOMHTMLElement getBody();

  void setBody(nsIDOMHTMLElement aBody);

  nsIDOMHTMLCollection getImages();

  nsIDOMHTMLCollection getApplets();

  nsIDOMHTMLCollection getLinks();

  nsIDOMHTMLCollection getForms();

  nsIDOMHTMLCollection getAnchors();

  String getCookie();

  void setCookie(String aCookie);

  void close();

  nsIDOMNodeList getElementsByName(String elementName);

}