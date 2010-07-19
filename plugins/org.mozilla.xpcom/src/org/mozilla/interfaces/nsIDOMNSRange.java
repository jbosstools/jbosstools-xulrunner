/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/range/nsIDOMNSRange.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMNSRange extends nsISupports {

  String NS_IDOMNSRANGE_IID =
    "{59188642-23b4-41d6-bde1-302c3906d1f0}";

  nsIDOMDocumentFragment createContextualFragment(String fragment);

  boolean isPointInRange(nsIDOMNode parent, int offset);

  short comparePoint(nsIDOMNode parent, int offset);

}