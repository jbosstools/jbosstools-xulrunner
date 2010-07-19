/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMNotation.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMNotation extends nsIDOMNode {

  String NS_IDOMNOTATION_IID =
    "{a6cf907e-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMNotation interface represents a notation declared in the DTD.
 * A notation  either declares, by name, the format of an unparsed entity, 
 * or is used for formal declaration of processing instruction targets.
 *
 * For more information on this interface please see 
 * http://www.w3.org/TR/DOM-Level-2-Core/
 *
 * @status FROZEN
 */
  String getPublicId();

  String getSystemId();

}