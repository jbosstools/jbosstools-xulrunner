/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/xul/base/public/nsIMenuBoxObject.idl
 */

package org.mozilla.interfaces;

public interface nsIMenuBoxObject extends nsISupports {

  String NS_IMENUBOXOBJECT_IID =
    "{f5099746-5049-4e81-a03e-945d5110fee2}";

  void openMenu(boolean openFlag);

  nsIDOMElement getActiveChild();

  void setActiveChild(nsIDOMElement aActiveChild);

  boolean handleKeyPress(nsIDOMKeyEvent keyEvent);

}