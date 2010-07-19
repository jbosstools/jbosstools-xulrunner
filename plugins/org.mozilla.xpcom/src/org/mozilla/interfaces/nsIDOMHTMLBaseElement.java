/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLBaseElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLBaseElement interface is the interface to a [X]HTML
 * base element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLBaseElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLBASEELEMENT_IID =
    "{a6cf908b-15b3-11d2-932e-00805f8add32}";

  String getHref();

  void setHref(String aHref);

  String getTarget();

  void setTarget(String aTarget);

}