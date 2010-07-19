/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLTableElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLTableElement interface is the interface to a [X]HTML
 * table element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLTableElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLTABLEELEMENT_IID =
    "{a6cf90b2-15b3-11d2-932e-00805f8add32}";

  nsIDOMHTMLTableCaptionElement getCaption();

  void setCaption(nsIDOMHTMLTableCaptionElement aCaption);

  nsIDOMHTMLTableSectionElement getTHead();

  void setTHead(nsIDOMHTMLTableSectionElement aTHead);

  nsIDOMHTMLTableSectionElement getTFoot();

  void setTFoot(nsIDOMHTMLTableSectionElement aTFoot);

  nsIDOMHTMLCollection getRows();

  nsIDOMHTMLCollection getTBodies();

  String getAlign();

  void setAlign(String aAlign);

  String getBgColor();

  void setBgColor(String aBgColor);

  String getBorder();

  void setBorder(String aBorder);

  String getCellPadding();

  void setCellPadding(String aCellPadding);

  String getCellSpacing();

  void setCellSpacing(String aCellSpacing);

  String getFrame();

  void setFrame(String aFrame);

  String getRules();

  void setRules(String aRules);

  String getSummary();

  void setSummary(String aSummary);

  String getWidth();

  void setWidth(String aWidth);

  nsIDOMHTMLElement createTHead();

  void deleteTHead();

  nsIDOMHTMLElement createTFoot();

  void deleteTFoot();

  nsIDOMHTMLElement createCaption();

  void deleteCaption();

  nsIDOMHTMLElement insertRow(int index);

  void deleteRow(int index);

}