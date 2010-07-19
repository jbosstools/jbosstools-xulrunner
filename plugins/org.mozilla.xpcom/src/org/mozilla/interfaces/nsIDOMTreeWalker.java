/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/traversal/nsIDOMTreeWalker.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMTreeWalker extends nsISupports {

  String NS_IDOMTREEWALKER_IID =
    "{400af3ca-1dd2-11b2-a50a-887ecca2e63a}";

  nsIDOMNode getRoot();

  long getWhatToShow();

  nsIDOMNodeFilter getFilter();

  boolean getExpandEntityReferences();

  nsIDOMNode getCurrentNode();

  void setCurrentNode(nsIDOMNode aCurrentNode);

  nsIDOMNode parentNode();

  nsIDOMNode firstChild();

  nsIDOMNode lastChild();

  nsIDOMNode previousSibling();

  nsIDOMNode nextSibling();

  nsIDOMNode previousNode();

  nsIDOMNode nextNode();

}