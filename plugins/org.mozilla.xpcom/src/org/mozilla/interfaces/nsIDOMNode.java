/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMNode.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMNode extends nsISupports {

  String NS_IDOMNODE_IID =
    "{a6cf907c-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMNode interface is the primary datatype for the entire 
 * Document Object Model.
 * It represents a single node in the document tree.
 *
 * For more information on this interface please see 
 * http://www.w3.org/TR/DOM-Level-2-Core/
 *
 * @status FROZEN
 */
  int ELEMENT_NODE = 1;

  int ATTRIBUTE_NODE = 2;

  int TEXT_NODE = 3;

  int CDATA_SECTION_NODE = 4;

  int ENTITY_REFERENCE_NODE = 5;

  int ENTITY_NODE = 6;

  int PROCESSING_INSTRUCTION_NODE = 7;

  int COMMENT_NODE = 8;

  int DOCUMENT_NODE = 9;

  int DOCUMENT_TYPE_NODE = 10;

  int DOCUMENT_FRAGMENT_NODE = 11;

  int NOTATION_NODE = 12;

  String getNodeName();

  String getNodeValue();

  void setNodeValue(String aNodeValue);

  int getNodeType();

  nsIDOMNode getParentNode();

  nsIDOMNodeList getChildNodes();

  nsIDOMNode getFirstChild();

  nsIDOMNode getLastChild();

  nsIDOMNode getPreviousSibling();

  nsIDOMNode getNextSibling();

  nsIDOMNamedNodeMap getAttributes();

  nsIDOMDocument getOwnerDocument();

  nsIDOMNode insertBefore(nsIDOMNode newChild, nsIDOMNode refChild);

  nsIDOMNode replaceChild(nsIDOMNode newChild, nsIDOMNode oldChild);

  nsIDOMNode removeChild(nsIDOMNode oldChild);

  nsIDOMNode appendChild(nsIDOMNode newChild);

  boolean hasChildNodes();

  nsIDOMNode cloneNode(boolean deep);

  void normalize();

  boolean isSupported(String feature, String version);

  String getNamespaceURI();

  String getPrefix();

  void setPrefix(String aPrefix);

  String getLocalName();

  boolean hasAttributes();

}