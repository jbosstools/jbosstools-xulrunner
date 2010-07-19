/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/inspector/public/inIDOMUtils.idl
 */

package org.mozilla.interfaces;

public interface inIDOMUtils extends nsISupports {

  String INIDOMUTILS_IID =
    "{78fd16c2-bdfb-4b1d-8738-d536d0a8f430}";

  nsISupportsArray getCSSStyleRules(nsIDOMElement aElement);

  long getRuleLine(nsIDOMCSSStyleRule aRule);

  boolean isIgnorableWhitespace(nsIDOMCharacterData aDataNode);

  nsIDOMNode getParentForNode(nsIDOMNode aNode, boolean aShowingAnonymousContent);

  nsIArray getBindingURLs(nsIDOMElement aElement);

  int getContentState(nsIDOMElement aElement);

  void setContentState(nsIDOMElement aElement, int aState);

}