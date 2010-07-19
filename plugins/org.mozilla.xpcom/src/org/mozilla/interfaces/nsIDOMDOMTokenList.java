/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMDOMTokenList.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMDOMTokenList extends nsISupports {

  String NS_IDOMDOMTOKENLIST_IID =
    "{c6f1e160-eeeb-404a-98b0-6f1246520b6e}";

  /**
 * The DOMTokenList interface represents an interface to an underlying string
 * that consists of a set of space-separated tokens.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/html5/infrastructure.html#domtokenlist
 *
 */
  long getLength();

  String item(long index);

  boolean contains(String token);

  void add(String token);

  void remove(String token);

  boolean toggle(String token);

  String toString();

}