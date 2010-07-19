/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMEntity.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMEntity extends nsIDOMNode {

  String NS_IDOMENTITY_IID =
    "{a6cf9079-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMEntity interface represents an entity, either parsed 
 * or unparsed, in an XML document.
 *
 * For more information on this interface please see 
 * http://www.w3.org/TR/DOM-Level-2-Core/
 *
 * @status FROZEN
 */
  String getPublicId();

  String getSystemId();

  String getNotationName();

}