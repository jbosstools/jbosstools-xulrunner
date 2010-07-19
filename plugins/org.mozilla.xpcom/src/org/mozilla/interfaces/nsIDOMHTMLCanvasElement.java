/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLCanvasElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLCanvasElement interface is the interface to a HTML
 * <canvas> element.
 *
 * For more information on this interface, please see
 * http://www.whatwg.org/specs/web-apps/current-work/#graphics
 *
 * @status UNDER_DEVELOPMENT
 */
public interface nsIDOMHTMLCanvasElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLCANVASELEMENT_IID =
    "{d87394af-d31a-484e-8b7c-75381045384d}";

  int getWidth();

  void setWidth(int aWidth);

  int getHeight();

  void setHeight(int aHeight);

  boolean getMozOpaque();

  void setMozOpaque(boolean aMozOpaque);

  nsISupports getContext(String contextId);

  String toDataURL();

}