/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLLabelElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLLabelElement interface is the interface to a [X]HTML
 * label element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLLabelElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLLABELELEMENT_IID =
    "{a6cf9096-15b3-11d2-932e-00805f8add32}";

  nsIDOMHTMLFormElement getForm();

  String getAccessKey();

  void setAccessKey(String aAccessKey);

  String getHtmlFor();

  void setHtmlFor(String aHtmlFor);

}