/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMAttr.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMAttr extends nsIDOMNode {

  String NS_IDOMATTR_IID =
    "{a6cf9070-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMAttr interface represents an attribute in an "Element" object. 
 * Typically the allowable values for the attribute are defined in a document 
 * type definition.
 * 
 * For more information on this interface please see 
 * http://www.w3.org/TR/DOM-Level-2-Core/
 *
 * @status FROZEN
 */
  String getName();

  boolean getSpecified();

  String getValue();

  void setValue(String aValue);

  nsIDOMElement getOwnerElement();

}