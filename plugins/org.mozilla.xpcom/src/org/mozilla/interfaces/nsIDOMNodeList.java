/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMNodeList.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMNodeList extends nsISupports {

  String NS_IDOMNODELIST_IID =
    "{a6cf907d-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMNodeList interface provides the abstraction of an ordered 
 * collection of nodes, without defining or constraining how this collection 
 * is implemented.
 * The items in the list are accessible via an integral index, starting from 0.
 *
 * For more information on this interface please see 
 * http://www.w3.org/TR/DOM-Level-2-Core/
 *
 * @status FROZEN
 */
  nsIDOMNode item(long index);

  long getLength();

}