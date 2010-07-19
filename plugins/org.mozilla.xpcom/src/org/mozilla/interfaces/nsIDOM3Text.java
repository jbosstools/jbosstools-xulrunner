/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOM3Text.idl
 */

package org.mozilla.interfaces;

public interface nsIDOM3Text extends nsISupports {

  String NS_IDOM3TEXT_IID =
    "{bcca052e-46f4-4b8e-8859-a86776c2f1d7}";

  /**
   * Indicates whether this text node contains element content whitespace.
   * A text node is element content whitespace if it contains only XML
   * white space characters and is a child of an element whose content
   * model allows only child elements optionally separated by white space.
   */
  boolean getIsElementContentWhitespace();

  /**
   * The concatenation of all logically adjacent text nodes with this text
   * node, where "logically adjacent" consists of all text nodes which can be
   * reached by traversing the document tree in either direction without
   * passing an element, comment, or processing-instruction boundary.  
   */
  String getWholeText();

  /**
   * If content is empty, removes all logically adjacent text nodes (including
   * this node) from the DOM tree, returning null; otherwise, replaces the
   * contents of this node with aContent and removes all other logically
   * adjacent text nodes from the DOM tree, returning this node.
   */
  nsIDOMText replaceWholeText(String content);

}