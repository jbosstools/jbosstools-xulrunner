/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/xul/base/public/nsIBoxObject.idl
 */

package org.mozilla.interfaces;

public interface nsIBoxObject extends nsISupports {

  String NS_IBOXOBJECT_IID =
    "{ce572460-b0f2-4650-a9e7-c53a99d3b6ad}";

  nsIDOMElement getElement();

  int getX();

  int getY();

  int getScreenX();

  int getScreenY();

  int getWidth();

  int getHeight();

  nsISupports getPropertyAsSupports(String propertyName);

  void setPropertyAsSupports(String propertyName, nsISupports value);

  String getProperty(String propertyName);

  void setProperty(String propertyName, String propertyValue);

  void removeProperty(String propertyName);

  nsIDOMElement getParentBox();

  nsIDOMElement getFirstChild();

  nsIDOMElement getLastChild();

  nsIDOMElement getNextSibling();

  nsIDOMElement getPreviousSibling();

}