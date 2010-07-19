/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMNamedNodeMap.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMNamedNodeMap extends nsISupports {

  String NS_IDOMNAMEDNODEMAP_IID =
    "{a6cf907b-15b3-11d2-932e-00805f8add32}";

  /**
 * Objects implementing the nsIDOMNamedNodeMap interface are used to 
 * represent collections of nodes that can be accessed by name.
 *
 * For more information on this interface please see 
 * http://www.w3.org/TR/DOM-Level-2-Core/
 *
 * @status FROZEN
 */
  nsIDOMNode getNamedItem(String name);

  nsIDOMNode setNamedItem(nsIDOMNode arg);

  nsIDOMNode removeNamedItem(String name);

  nsIDOMNode item(long index);

  long getLength();

  nsIDOMNode getNamedItemNS(String namespaceURI, String localName);

  nsIDOMNode setNamedItemNS(nsIDOMNode arg);

  nsIDOMNode removeNamedItemNS(String namespaceURI, String localName);

}