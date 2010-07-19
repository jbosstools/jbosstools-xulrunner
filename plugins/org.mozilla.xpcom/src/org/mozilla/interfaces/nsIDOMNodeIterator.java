/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/traversal/nsIDOMNodeIterator.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMNodeIterator extends nsISupports {

  String NS_IDOMNODEITERATOR_IID =
    "{5af83f50-c8d5-4824-be29-1aa9d640bacb}";

  nsIDOMNode getRoot();

  long getWhatToShow();

  nsIDOMNodeFilter getFilter();

  boolean getExpandEntityReferences();

  nsIDOMNode nextNode();

  nsIDOMNode previousNode();

  void detach();

  nsIDOMNode getReferenceNode();

  boolean getPointerBeforeReferenceNode();

}