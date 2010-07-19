/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLParamElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLParamElement interface is the interface to a [X]HTML
 * param element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLParamElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLPARAMELEMENT_IID =
    "{a6cf90ad-15b3-11d2-932e-00805f8add32}";

  String getName();

  void setName(String aName);

  String getType();

  void setType(String aType);

  String getValue();

  void setValue(String aValue);

  String getValueType();

  void setValueType(String aValueType);

}