/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLTableCellElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLTableCellElement interface is the interface to a
 * [X]HTML td element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLTableCellElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLTABLECELLELEMENT_IID =
    "{a6cf90b7-15b3-11d2-932e-00805f8add32}";

  int getCellIndex();

  String getAbbr();

  void setAbbr(String aAbbr);

  String getAlign();

  void setAlign(String aAlign);

  String getAxis();

  void setAxis(String aAxis);

  String getBgColor();

  void setBgColor(String aBgColor);

  String getCh();

  void setCh(String aCh);

  String getChOff();

  void setChOff(String aChOff);

  int getColSpan();

  void setColSpan(int aColSpan);

  String getHeaders();

  void setHeaders(String aHeaders);

  String getHeight();

  void setHeight(String aHeight);

  boolean getNoWrap();

  void setNoWrap(boolean aNoWrap);

  int getRowSpan();

  void setRowSpan(int aRowSpan);

  String getScope();

  void setScope(String aScope);

  String getVAlign();

  void setVAlign(String aVAlign);

  String getWidth();

  void setWidth(String aWidth);

}