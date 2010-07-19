/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/range/nsIDOMRange.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMRange extends nsISupports {

  String NS_IDOMRANGE_IID =
    "{a6cf90ce-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMRange interface is an interface to a DOM range object.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-Traversal-Range/
 *
 * @status FROZEN
 */
  nsIDOMNode getStartContainer();

  int getStartOffset();

  nsIDOMNode getEndContainer();

  int getEndOffset();

  boolean getCollapsed();

  nsIDOMNode getCommonAncestorContainer();

  void setStart(nsIDOMNode refNode, int offset);

  void setEnd(nsIDOMNode refNode, int offset);

  void setStartBefore(nsIDOMNode refNode);

  void setStartAfter(nsIDOMNode refNode);

  void setEndBefore(nsIDOMNode refNode);

  void setEndAfter(nsIDOMNode refNode);

  void collapse(boolean toStart);

  void selectNode(nsIDOMNode refNode);

  void selectNodeContents(nsIDOMNode refNode);

  int START_TO_START = 0;

  int START_TO_END = 1;

  int END_TO_END = 2;

  int END_TO_START = 3;

  short compareBoundaryPoints(int how, nsIDOMRange sourceRange);

  void deleteContents();

  nsIDOMDocumentFragment extractContents();

  nsIDOMDocumentFragment cloneContents();

  void insertNode(nsIDOMNode newNode);

  void surroundContents(nsIDOMNode newParent);

  nsIDOMRange cloneRange();

  String toString();

  void detach();

}