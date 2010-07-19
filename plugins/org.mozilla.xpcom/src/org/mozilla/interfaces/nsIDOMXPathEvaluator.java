/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/xpath/nsIDOMXPathEvaluator.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMXPathEvaluator extends nsISupports {

  String NS_IDOMXPATHEVALUATOR_IID =
    "{75506f8a-b504-11d5-a7f2-ca108ab8b6fc}";

  nsIDOMXPathExpression createExpression(String expression, nsIDOMXPathNSResolver resolver);

  nsIDOMXPathNSResolver createNSResolver(nsIDOMNode nodeResolver);

  nsISupports evaluate(String expression, nsIDOMNode contextNode, nsIDOMXPathNSResolver resolver, int type, nsISupports result);

}