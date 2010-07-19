/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMDocument.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMDocument extends nsIDOMNode {

  String NS_IDOMDOCUMENT_IID =
    "{a6cf9075-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMDocument interface represents the entire HTML or XML document.
 * Conceptually, it is the root of the document tree, and provides the 
 * primary access to the document's data.
 * Since elements, text nodes, comments, processing instructions, etc. 
 * cannot exist outside the context of a Document, the nsIDOMDocument 
 * interface also contains the factory methods needed to create these 
 * objects.
 *
 * For more information on this interface please see 
 * http://www.w3.org/TR/DOM-Level-2-Core/
 *
 * @status FROZEN
 */
  nsIDOMDocumentType getDoctype();

  nsIDOMDOMImplementation getImplementation();

  nsIDOMElement getDocumentElement();

  nsIDOMElement createElement(String tagName);

  nsIDOMDocumentFragment createDocumentFragment();

  nsIDOMText createTextNode(String data);

  nsIDOMComment createComment(String data);

  nsIDOMCDATASection createCDATASection(String data);

  nsIDOMProcessingInstruction createProcessingInstruction(String target, String data);

  nsIDOMAttr createAttribute(String name);

  nsIDOMEntityReference createEntityReference(String name);

  nsIDOMNodeList getElementsByTagName(String tagname);

  nsIDOMNode importNode(nsIDOMNode importedNode, boolean deep);

  nsIDOMElement createElementNS(String namespaceURI, String qualifiedName);

  nsIDOMAttr createAttributeNS(String namespaceURI, String qualifiedName);

  nsIDOMNodeList getElementsByTagNameNS(String namespaceURI, String localName);

  nsIDOMElement getElementById(String elementId);

}