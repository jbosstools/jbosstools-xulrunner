/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/xul/base/public/nsIListBoxObject.idl
 */

package org.mozilla.interfaces;

public interface nsIListBoxObject extends nsISupports {

  String NS_ILISTBOXOBJECT_IID =
    "{aa9def4e-2e59-412d-a6df-b76f52167795}";

  int getRowCount();

  int getNumberOfVisibleRows();

  int getIndexOfFirstVisibleRow();

  void ensureIndexIsVisible(int rowIndex);

  void scrollToIndex(int rowIndex);

  void scrollByLines(int numLines);

  nsIDOMElement getItemAtIndex(int index);

  int getIndexOfItem(nsIDOMElement item);

}