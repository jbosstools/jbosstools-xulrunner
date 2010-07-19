/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLFrameElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLFrameElement interface is the interface to a [X]HTML
 * frame element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLFrameElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLFRAMEELEMENT_IID =
    "{a6cf90b9-15b3-11d2-932e-00805f8add32}";

  String getFrameBorder();

  void setFrameBorder(String aFrameBorder);

  String getLongDesc();

  void setLongDesc(String aLongDesc);

  String getMarginHeight();

  void setMarginHeight(String aMarginHeight);

  String getMarginWidth();

  void setMarginWidth(String aMarginWidth);

  String getName();

  void setName(String aName);

  boolean getNoResize();

  void setNoResize(boolean aNoResize);

  String getScrolling();

  void setScrolling(String aScrolling);

  String getSrc();

  void setSrc(String aSrc);

  nsIDOMDocument getContentDocument();

}