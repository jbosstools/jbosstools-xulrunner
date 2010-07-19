/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/xul/base/src/tree/public/nsITreeColumns.idl
 */

package org.mozilla.interfaces;

public interface nsITreeColumn extends nsISupports {

  String NS_ITREECOLUMN_IID =
    "{ae835ecf-6b32-4660-9b43-8a270df56e02}";

  nsIDOMElement getElement();

  nsITreeColumns getColumns();

  int getX();

  int getWidth();

  String getId();

  int getIndex();

  boolean getPrimary();

  boolean getCycler();

  boolean getEditable();

  boolean getSelectable();

  short TYPE_TEXT = 1;

  short TYPE_CHECKBOX = 2;

  short TYPE_PROGRESSMETER = 3;

  short getType();

  nsITreeColumn getNext();

  nsITreeColumn getPrevious();

  void invalidate();

}