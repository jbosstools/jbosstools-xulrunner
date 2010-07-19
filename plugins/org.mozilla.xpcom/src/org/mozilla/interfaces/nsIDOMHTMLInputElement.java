/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLInputElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLInputElement interface is the interface to a [X]HTML
 * input element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLInputElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLINPUTELEMENT_IID =
    "{a6cf9093-15b3-11d2-932e-00805f8add32}";

  String getDefaultValue();

  void setDefaultValue(String aDefaultValue);

  boolean getDefaultChecked();

  void setDefaultChecked(boolean aDefaultChecked);

  nsIDOMHTMLFormElement getForm();

  String getAccept();

  void setAccept(String aAccept);

  String getAccessKey();

  void setAccessKey(String aAccessKey);

  String getAlign();

  void setAlign(String aAlign);

  String getAlt();

  void setAlt(String aAlt);

  boolean getChecked();

  void setChecked(boolean aChecked);

  boolean getDisabled();

  void setDisabled(boolean aDisabled);

  int getMaxLength();

  void setMaxLength(int aMaxLength);

  String getName();

  void setName(String aName);

  boolean getReadOnly();

  void setReadOnly(boolean aReadOnly);

  long getSize();

  void setSize(long aSize);

  String getSrc();

  void setSrc(String aSrc);

  int getTabIndex();

  void setTabIndex(int aTabIndex);

  String getType();

  void setType(String aType);

  String getUseMap();

  void setUseMap(String aUseMap);

  String getValue();

  void setValue(String aValue);

  void blur();

  void focus();

  void select();

  void click();

}