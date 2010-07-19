/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLIFrameElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLIFrameElement interface is the interface to a [X]HTML
 * iframe element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLIFrameElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLIFRAMEELEMENT_IID =
    "{a6cf90ba-15b3-11d2-932e-00805f8add32}";

  String getAlign();

  void setAlign(String aAlign);

  String getFrameBorder();

  void setFrameBorder(String aFrameBorder);

  String getHeight();

  void setHeight(String aHeight);

  String getLongDesc();

  void setLongDesc(String aLongDesc);

  String getMarginHeight();

  void setMarginHeight(String aMarginHeight);

  String getMarginWidth();

  void setMarginWidth(String aMarginWidth);

  String getName();

  void setName(String aName);

  String getScrolling();

  void setScrolling(String aScrolling);

  String getSrc();

  void setSrc(String aSrc);

  String getWidth();

  void setWidth(String aWidth);

  nsIDOMDocument getContentDocument();

}