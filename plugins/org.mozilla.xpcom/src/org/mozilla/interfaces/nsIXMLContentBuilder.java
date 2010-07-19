/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/xtf/public/nsIXMLContentBuilder.idl
 */

package org.mozilla.interfaces;

public interface nsIXMLContentBuilder extends nsISupports {

  String NS_IXMLCONTENTBUILDER_IID =
    "{e9c4cd4f-cd41-43d0-bf3b-48abb9cde90f}";

  void clear(nsIDOMElement root);

  void setDocument(nsIDOMDocument doc);

  void setElementNamespace(String ns);

  void beginElement(String tagname);

  void endElement();

  void attrib(String name, String value);

  void textNode(String text);

  nsIDOMElement getRoot();

  nsIDOMElement getCurrent();

}