/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/xul/nsIDOMXULMultSelectCntrlEl.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMXULMultiSelectControlElement extends nsIDOMXULSelectControlElement {

  String NS_IDOMXULMULTISELECTCONTROLELEMENT_IID =
    "{82c72eca-9886-473e-94cd-9de5694b3f88}";

  String getSelType();

  void setSelType(String aSelType);

  nsIDOMXULSelectControlItemElement getCurrentItem();

  void setCurrentItem(nsIDOMXULSelectControlItemElement aCurrentItem);

  int getCurrentIndex();

  void setCurrentIndex(int aCurrentIndex);

  nsIDOMNodeList getSelectedItems();

  void addItemToSelection(nsIDOMXULSelectControlItemElement item);

  void removeItemFromSelection(nsIDOMXULSelectControlItemElement item);

  void toggleItemSelection(nsIDOMXULSelectControlItemElement item);

  void selectItem(nsIDOMXULSelectControlItemElement item);

  void selectItemRange(nsIDOMXULSelectControlItemElement startItem, nsIDOMXULSelectControlItemElement item);

  void selectAll();

  void invertSelection();

  void clearSelection();

  int getSelectedCount();

  nsIDOMXULSelectControlItemElement getSelectedItem(int index);

}