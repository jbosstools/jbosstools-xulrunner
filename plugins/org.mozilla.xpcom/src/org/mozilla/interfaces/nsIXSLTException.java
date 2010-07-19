/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/xslt/public/nsIXSLTException.idl
 */

package org.mozilla.interfaces;

public interface nsIXSLTException extends nsIException {

  String NS_IXSLTEXCEPTION_IID =
    "{e06dfaea-92d5-47f7-a800-c5f5404d8771}";

  /**
     * The node in the stylesheet that triggered the exception.
     */
  nsIDOMNode getStyleNode();

  /**
     * The context node, may be null
     */
  nsIDOMNode getSourceNode();

}