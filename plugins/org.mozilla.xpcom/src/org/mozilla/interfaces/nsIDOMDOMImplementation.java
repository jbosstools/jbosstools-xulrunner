/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMDOMImplementation.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMDOMImplementation extends nsISupports {

  String NS_IDOMDOMIMPLEMENTATION_IID =
    "{a6cf9074-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMDOMImplementation interface provides a number of methods for 
 * performing operations that are independent of any particular instance 
 * of the document object model.
 *
 * For more information on this interface please see 
 * http://www.w3.org/TR/DOM-Level-2-Core/
 *
 * @status FROZEN
 */
  boolean hasFeature(String feature, String version);

  nsIDOMDocumentType createDocumentType(String qualifiedName, String publicId, String systemId);

  nsIDOMDocument createDocument(String namespaceURI, String qualifiedName, nsIDOMDocumentType doctype);

}