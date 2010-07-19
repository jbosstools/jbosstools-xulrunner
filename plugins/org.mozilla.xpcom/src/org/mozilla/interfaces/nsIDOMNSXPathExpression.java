/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/xpath/nsIDOMNSXPathExpression.idl
 */

package org.mozilla.interfaces;

/**
 * Interface for Mozilla specific XPathExpression functions.
 */
public interface nsIDOMNSXPathExpression extends nsISupports {

  String NS_IDOMNSXPATHEXPRESSION_IID =
    "{ce600ca8-e98a-4419-ad61-2f6d0cb0ecc8}";

  /**
   * Evaluate the expression with the given context. Similar to
   * nsIDOMXPathExpression::evaluate(), except that this takes the context
   * position and size too.
   *
   * @param contextNode       The context node
   * @param contextPosition   The context position
   * @param contextSize       The context size
   * @param type              The needed result type
   * @param result            The result
   */
  nsISupports evaluateWithContext(nsIDOMNode contextNode, long contextPosition, long contextSize, int type, nsISupports result);

}