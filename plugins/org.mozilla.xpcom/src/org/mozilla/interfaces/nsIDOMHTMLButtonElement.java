/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLButtonElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLButtonElement interface is the interface to a [X]HTML
 * button element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLButtonElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLBUTTONELEMENT_IID =
    "{a6cf9095-15b3-11d2-932e-00805f8add32}";

  nsIDOMHTMLFormElement getForm();

  String getAccessKey();

  void setAccessKey(String aAccessKey);

  boolean getDisabled();

  void setDisabled(boolean aDisabled);

  String getName();

  void setName(String aName);

  int getTabIndex();

  void setTabIndex(int aTabIndex);

  String getValue();

  void setValue(String aValue);

}