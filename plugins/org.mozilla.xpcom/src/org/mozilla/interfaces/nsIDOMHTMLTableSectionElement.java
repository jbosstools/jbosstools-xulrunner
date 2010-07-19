/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLTableSectionElem.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMHTMLTableSectionElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLTABLESECTIONELEMENT_IID =
    "{a6cf90b5-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMHTMLTableSectionElement interface is the interface to a
 * [X]HTML thead, tbody, and tfoot element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
  String getAlign();

  /**
 * The nsIDOMHTMLTableSectionElement interface is the interface to a
 * [X]HTML thead, tbody, and tfoot element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
  void setAlign(String aAlign);

  String getCh();

  void setCh(String aCh);

  String getChOff();

  void setChOff(String aChOff);

  String getVAlign();

  void setVAlign(String aVAlign);

  nsIDOMHTMLCollection getRows();

  nsIDOMHTMLElement insertRow(int index);

  void deleteRow(int index);

}