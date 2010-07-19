/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/xul/nsIDOMXULTreeElement.idl
 */

package org.mozilla.interfaces;

/**
 * @status UNDER_DEVELOPMENT
 */
public interface nsIDOMXULTreeElement extends nsIDOMXULElement {

  String NS_IDOMXULTREEELEMENT_IID =
    "{1f8111b2-d44d-4d11-845a-a70ae06b7d04}";

  nsITreeColumns getColumns();

  nsITreeView getView();

  void setView(nsITreeView aView);

  nsIDOMElement getBody();

  boolean getEditable();

  void setEditable(boolean aEditable);

  nsIDOMXULTextBoxElement getInputField();

}