/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLTableRowElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLTableRowElement interface is the interface to a
 * [X]HTML tr element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLTableRowElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLTABLEROWELEMENT_IID =
    "{a6cf90b6-15b3-11d2-932e-00805f8add32}";

  int getRowIndex();

  int getSectionRowIndex();

  nsIDOMHTMLCollection getCells();

  String getAlign();

  void setAlign(String aAlign);

  String getBgColor();

  void setBgColor(String aBgColor);

  String getCh();

  void setCh(String aCh);

  String getChOff();

  void setChOff(String aChOff);

  String getVAlign();

  void setVAlign(String aVAlign);

  nsIDOMHTMLElement insertCell(int index);

  void deleteCell(int index);

}