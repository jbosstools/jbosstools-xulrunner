/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOM3Node.idl
 */

package org.mozilla.interfaces;

public interface nsIDOM3Node extends nsISupports {

  String NS_IDOM3NODE_IID =
    "{29fb2a18-1dd2-11b2-8dd9-a6fd5d5ad12f}";

  String getBaseURI();

  int DOCUMENT_POSITION_DISCONNECTED = 1;

  int DOCUMENT_POSITION_PRECEDING = 2;

  int DOCUMENT_POSITION_FOLLOWING = 4;

  int DOCUMENT_POSITION_CONTAINS = 8;

  int DOCUMENT_POSITION_CONTAINED_BY = 16;

  int DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC = 32;

  int compareDocumentPosition(nsIDOMNode other);

  String getTextContent();

  void setTextContent(String aTextContent);

  boolean isSameNode(nsIDOMNode other);

  String lookupPrefix(String namespaceURI);

  boolean isDefaultNamespace(String namespaceURI);

  String lookupNamespaceURI(String prefix);

  boolean isEqualNode(nsIDOMNode arg);

  nsISupports getFeature(String feature, String version);

  nsIVariant setUserData(String key, nsIVariant data, nsIDOMUserDataHandler handler);

  nsIVariant getUserData(String key);

}