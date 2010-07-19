/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMElement.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMElement extends nsIDOMNode {

  String NS_IDOMELEMENT_IID =
    "{a6cf9078-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMElement interface represents an element in an HTML or 
 * XML document. 
 *
 * For more information on this interface please see 
 * http://www.w3.org/TR/DOM-Level-2-Core/
 *
 * @status FROZEN
 */
  String getTagName();

  String getAttribute(String name);

  void setAttribute(String name, String value);

  void removeAttribute(String name);

  nsIDOMAttr getAttributeNode(String name);

  nsIDOMAttr setAttributeNode(nsIDOMAttr newAttr);

  nsIDOMAttr removeAttributeNode(nsIDOMAttr oldAttr);

  nsIDOMNodeList getElementsByTagName(String name);

  String getAttributeNS(String namespaceURI, String localName);

  void setAttributeNS(String namespaceURI, String qualifiedName, String value);

  void removeAttributeNS(String namespaceURI, String localName);

  nsIDOMAttr getAttributeNodeNS(String namespaceURI, String localName);

  nsIDOMAttr setAttributeNodeNS(nsIDOMAttr newAttr);

  nsIDOMNodeList getElementsByTagNameNS(String namespaceURI, String localName);

  boolean hasAttribute(String name);

  boolean hasAttributeNS(String namespaceURI, String localName);

}