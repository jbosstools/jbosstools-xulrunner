/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLObjectElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLObjectElement interface is the interface to a [X]HTML
 * object element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-HTML/
 *
 * @status FROZEN
 */
public interface nsIDOMHTMLObjectElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLOBJECTELEMENT_IID =
    "{a6cf90ac-15b3-11d2-932e-00805f8add32}";

  nsIDOMHTMLFormElement getForm();

  String getCode();

  void setCode(String aCode);

  String getAlign();

  void setAlign(String aAlign);

  String getArchive();

  void setArchive(String aArchive);

  String getBorder();

  void setBorder(String aBorder);

  String getCodeBase();

  void setCodeBase(String aCodeBase);

  String getCodeType();

  void setCodeType(String aCodeType);

  String getData();

  void setData(String aData);

  boolean getDeclare();

  void setDeclare(boolean aDeclare);

  String getHeight();

  void setHeight(String aHeight);

  int getHspace();

  void setHspace(int aHspace);

  String getName();

  void setName(String aName);

  String getStandby();

  void setStandby(String aStandby);

  int getTabIndex();

  void setTabIndex(int aTabIndex);

  String getType();

  void setType(String aType);

  String getUseMap();

  void setUseMap(String aUseMap);

  int getVspace();

  void setVspace(int aVspace);

  String getWidth();

  void setWidth(String aWidth);

  nsIDOMDocument getContentDocument();

}