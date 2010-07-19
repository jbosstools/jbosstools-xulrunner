/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/xul/base/src/tree/public/nsITreeContentView.idl
 */

package org.mozilla.interfaces;

public interface nsITreeContentView extends nsISupports {

  String NS_ITREECONTENTVIEW_IID =
    "{5ef62896-0c0a-41f1-bb3c-44a60f5dfdab}";

  /**
   * Retrieve the content item associated with the specified index.
   */
  nsIDOMElement getItemAtIndex(int index);

  /**
   * Retrieve the index associated with the specified content item.
   */
  int getIndexOfItem(nsIDOMElement item);

}