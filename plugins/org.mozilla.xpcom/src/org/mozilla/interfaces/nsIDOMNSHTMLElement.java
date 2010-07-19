/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMNSHTMLElement.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMNSHTMLElement extends nsISupports {

  String NS_IDOMNSHTMLELEMENT_IID =
    "{7f142f9a-fba7-4949-93d6-cf08a974ac51}";

  int getOffsetTop();

  int getOffsetLeft();

  int getOffsetWidth();

  int getOffsetHeight();

  nsIDOMElement getOffsetParent();

  String getInnerHTML();

  void setInnerHTML(String aInnerHTML);

  int getTabIndex();

  void setTabIndex(int aTabIndex);

  String getContentEditable();

  void setContentEditable(String aContentEditable);

  boolean getDraggable();

  void setDraggable(boolean aDraggable);

  void blur();

  void focus();

  void scrollIntoView(boolean top);

  boolean getSpellcheck();

  void setSpellcheck(boolean aSpellcheck);

}