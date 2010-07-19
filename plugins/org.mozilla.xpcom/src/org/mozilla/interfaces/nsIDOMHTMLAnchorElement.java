/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLAnchorElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLAnchorElement interface is the interface to a [X]HTML
 * a element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLAnchorElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLANCHORELEMENT_IID =
    "{a6cf90aa-15b3-11d2-932e-00805f8add32}";

  String getAccessKey();

  void setAccessKey(String aAccessKey);

  String getCharset();

  void setCharset(String aCharset);

  String getCoords();

  void setCoords(String aCoords);

  String getHref();

  void setHref(String aHref);

  String getHreflang();

  void setHreflang(String aHreflang);

  String getName();

  void setName(String aName);

  String getRel();

  void setRel(String aRel);

  String getRev();

  void setRev(String aRev);

  String getShape();

  void setShape(String aShape);

  int getTabIndex();

  void setTabIndex(int aTabIndex);

  String getTarget();

  void setTarget(String aTarget);

  String getType();

  void setType(String aType);

  void blur();

  void focus();

}