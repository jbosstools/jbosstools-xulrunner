/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/xbl/nsIDOMDocumentXBL.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMDocumentXBL extends nsISupports {

  String NS_IDOMDOCUMENTXBL_IID =
    "{1a38762b-4da5-4f61-80fb-9317e198cb92}";

  nsIDOMNodeList getAnonymousNodes(nsIDOMElement elt);

  nsIDOMElement getAnonymousElementByAttribute(nsIDOMElement elt, String attrName, String attrValue);

  void addBinding(nsIDOMElement elt, String bindingURL);

  void removeBinding(nsIDOMElement elt, String bindingURL);

  nsIDOMElement getBindingParent(nsIDOMNode node);

  void loadBindingDocument(String documentURL);

}