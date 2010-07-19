/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/xslt/public/txIFunctionEvaluationContext.idl
 */

package org.mozilla.interfaces;

public interface txIFunctionEvaluationContext extends nsISupports {

  String TXIFUNCTIONEVALUATIONCONTEXT_IID =
    "{0ecbb00c-6a78-11d9-9791-000a95dc234c}";

  long getPosition();

  long getSize();

  nsIDOMNode getContextNode();

  nsISupports getState();

}