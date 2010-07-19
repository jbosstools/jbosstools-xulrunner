/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLTextAreaElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLTextAreaElement interface is the interface to a
 * [X]HTML textarea element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLTextAreaElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLTEXTAREAELEMENT_IID =
    "{a6cf9094-15b3-11d2-932e-00805f8add32}";

  String getDefaultValue();

  void setDefaultValue(String aDefaultValue);

  nsIDOMHTMLFormElement getForm();

  String getAccessKey();

  void setAccessKey(String aAccessKey);

  int getCols();

  void setCols(int aCols);

  boolean getDisabled();

  void setDisabled(boolean aDisabled);

  String getName();

  void setName(String aName);

  boolean getReadOnly();

  void setReadOnly(boolean aReadOnly);

  int getRows();

  void setRows(int aRows);

  int getTabIndex();

  void setTabIndex(int aTabIndex);

  String getType();

  String getValue();

  void setValue(String aValue);

  void blur();

  void focus();

  void select();

}