/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLOptionElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLOptionElement interface is the interface to a [X]HTML
 * option element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLOptionElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLOPTIONELEMENT_IID =
    "{a6cf9092-15b3-11d2-932e-00805f8add32}";

  nsIDOMHTMLFormElement getForm();

  boolean getDefaultSelected();

  void setDefaultSelected(boolean aDefaultSelected);

  String getText();

  int getIndex();

  boolean getDisabled();

  void setDisabled(boolean aDisabled);

  String getLabel();

  void setLabel(String aLabel);

  boolean getSelected();

  void setSelected(boolean aSelected);

  String getValue();

  void setValue(String aValue);

}