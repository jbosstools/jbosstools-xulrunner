/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMDocumentType.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMDocumentType extends nsIDOMNode {

  String NS_IDOMDOCUMENTTYPE_IID =
    "{a6cf9077-15b3-11d2-932e-00805f8add32}";

  /**
 * Each Document has a doctype attribute whose value is either null 
 * or a DocumentType object. 
 * The nsIDOMDocumentType interface in the DOM Core provides an 
 * interface to the list of entities that are defined for the document.
 *
 * For more information on this interface please see 
 * http://www.w3.org/TR/DOM-Level-2-Core/
 *
 * @status FROZEN
 */
  String getName();

  nsIDOMNamedNodeMap getEntities();

  nsIDOMNamedNodeMap getNotations();

  String getPublicId();

  String getSystemId();

  String getInternalSubset();

}