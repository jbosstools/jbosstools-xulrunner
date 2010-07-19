/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLLegendElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLLegendElement interface is the interface to a [X]HTML
 * legend element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLLegendElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLLEGENDELEMENT_IID =
    "{a6cf9098-15b3-11d2-932e-00805f8add32}";

  nsIDOMHTMLFormElement getForm();

  String getAccessKey();

  void setAccessKey(String aAccessKey);

  String getAlign();

  void setAlign(String aAlign);

}