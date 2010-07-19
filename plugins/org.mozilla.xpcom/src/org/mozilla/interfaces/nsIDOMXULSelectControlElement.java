/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/xul/nsIDOMXULSelectCntrlEl.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMXULSelectControlElement extends nsIDOMXULControlElement {

  String NS_IDOMXULSELECTCONTROLELEMENT_IID =
    "{919d9808-8937-4cec-9390-91225eb8864b}";

  nsIDOMXULSelectControlItemElement getSelectedItem();

  void setSelectedItem(nsIDOMXULSelectControlItemElement aSelectedItem);

  int getSelectedIndex();

  void setSelectedIndex(int aSelectedIndex);

  String getValue();

  void setValue(String aValue);

  nsIDOMXULSelectControlItemElement appendItem(String label, String value);

  nsIDOMXULSelectControlItemElement insertItemAt(int index, String label, String value);

  nsIDOMXULSelectControlItemElement removeItemAt(int index);

  long getItemCount();

  int getIndexOfItem(nsIDOMXULSelectControlItemElement item);

  nsIDOMXULSelectControlItemElement getItemAtIndex(int index);

}