/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/traversal/nsIDOMDocumentTraversal.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMDocumentTraversal extends nsISupports {

  String NS_IDOMDOCUMENTTRAVERSAL_IID =
    "{13f236c0-47f8-11d5-b6a3-009027446e84}";

  nsIDOMNodeIterator createNodeIterator(nsIDOMNode root, long whatToShow, nsIDOMNodeFilter filter, boolean entityReferenceExpansion);

  nsIDOMTreeWalker createTreeWalker(nsIDOMNode root, long whatToShow, nsIDOMNodeFilter filter, boolean entityReferenceExpansion);

}