/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOM3Document.idl
 */

package org.mozilla.interfaces;

/**
 * For more information on this interface, please see
 * http://www.w3.org/TR/DOM-Level-3-Core/
 */
public interface nsIDOM3Document extends nsIDOM3Node {

  String NS_IDOM3DOCUMENT_IID =
    "{2e0e9ea1-72ab-4d9e-bdeb-ca64e1abeba4}";

  String getInputEncoding();

  String getXmlEncoding();

  boolean getXmlStandalone();

  void setXmlStandalone(boolean aXmlStandalone);

  String getXmlVersion();

  void setXmlVersion(String aXmlVersion);

  boolean getStrictErrorChecking();

  void setStrictErrorChecking(boolean aStrictErrorChecking);

  String getDocumentURI();

  void setDocumentURI(String aDocumentURI);

  nsIDOMNode adoptNode(nsIDOMNode source);

  nsIDOMDOMConfiguration getDomConfig();

  void normalizeDocument();

  nsIDOMNode renameNode(nsIDOMNode node, String namespaceURI, String qualifiedName);

}