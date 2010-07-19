/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLSelectElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLSelectElement interface is the interface to a [X]HTML
 * select element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLSelectElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLSELECTELEMENT_IID =
    "{a6cf9090-15b3-11d2-932e-00805f8add32}";

  String getType();

  int getSelectedIndex();

  void setSelectedIndex(int aSelectedIndex);

  String getValue();

  void setValue(String aValue);

  long getLength();

  void setLength(long aLength);

  nsIDOMHTMLFormElement getForm();

  nsIDOMHTMLOptionsCollection getOptions();

  boolean getDisabled();

  void setDisabled(boolean aDisabled);

  boolean getMultiple();

  void setMultiple(boolean aMultiple);

  String getName();

  void setName(String aName);

  int getSize();

  void setSize(int aSize);

  int getTabIndex();

  void setTabIndex(int aTabIndex);

  void add(nsIDOMHTMLElement element, nsIDOMHTMLElement before);

  void remove(int index);

  void blur();

  void focus();

}