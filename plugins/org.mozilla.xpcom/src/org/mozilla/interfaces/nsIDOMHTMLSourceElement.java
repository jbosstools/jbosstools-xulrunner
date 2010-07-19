/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLSourceElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLVideoElement interface is the interface to a HTML
 * <source> element.
 *
 * For more information on this interface, please see
 * http://www.whatwg.org/specs/web-apps/current-work/#source
 *
 * @status UNDER_DEVELOPMENT
 */
public interface nsIDOMHTMLSourceElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLSOURCEELEMENT_IID =
    "{be281029-7dd9-4268-963e-96f5196acc19}";

  String getSrc();

  void setSrc(String aSrc);

  String getType();

  void setType(String aType);

}