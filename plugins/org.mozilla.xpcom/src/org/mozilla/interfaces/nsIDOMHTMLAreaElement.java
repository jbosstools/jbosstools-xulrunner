/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLAreaElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLAreaElement interface is the interface to a [X]HTML
 * area element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLAreaElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLAREAELEMENT_IID =
    "{a6cf90b0-15b3-11d2-932e-00805f8add32}";

  String getAccessKey();

  void setAccessKey(String aAccessKey);

  String getAlt();

  void setAlt(String aAlt);

  String getCoords();

  void setCoords(String aCoords);

  String getHref();

  void setHref(String aHref);

  boolean getNoHref();

  void setNoHref(boolean aNoHref);

  String getShape();

  void setShape(String aShape);

  int getTabIndex();

  void setTabIndex(int aTabIndex);

  String getTarget();

  void setTarget(String aTarget);

}