/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLMetaElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLMetaElement interface is the interface to a [X]HTML
 * meta element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLMetaElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLMETAELEMENT_IID =
    "{a6cf908a-15b3-11d2-932e-00805f8add32}";

  String getContent();

  void setContent(String aContent);

  String getHttpEquiv();

  void setHttpEquiv(String aHttpEquiv);

  String getName();

  void setName(String aName);

  String getScheme();

  void setScheme(String aScheme);

}