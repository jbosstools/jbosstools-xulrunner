/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLIsIndexElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLIsIndexElement interface is the interface to a
 * [X]HTML isindex element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLIsIndexElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLISINDEXELEMENT_IID =
    "{a6cf908c-15b3-11d2-932e-00805f8add32}";

  nsIDOMHTMLFormElement getForm();

  String getPrompt();

  void setPrompt(String aPrompt);

}