/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLLinkElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLLinkElement interface is the interface to a [X]HTML
 * link element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLLinkElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLLINKELEMENT_IID =
    "{a6cf9088-15b3-11d2-932e-00805f8add32}";

  boolean getDisabled();

  void setDisabled(boolean aDisabled);

  String getCharset();

  void setCharset(String aCharset);

  String getHref();

  void setHref(String aHref);

  String getHreflang();

  void setHreflang(String aHreflang);

  String getMedia();

  void setMedia(String aMedia);

  String getRel();

  void setRel(String aRel);

  String getRev();

  void setRev(String aRev);

  String getTarget();

  void setTarget(String aTarget);

  String getType();

  void setType(String aType);

}