/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGNumberList.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGNumberList extends nsISupports {

  String NS_IDOMSVGNUMBERLIST_IID =
    "{59364ec4-faf1-460f-bf58-e6a6a2769a3a}";

  long getNumberOfItems();

  void clear();

  nsIDOMSVGNumber initialize(nsIDOMSVGNumber newItem);

  nsIDOMSVGNumber getItem(long index);

  nsIDOMSVGNumber insertItemBefore(nsIDOMSVGNumber newItem, long index);

  nsIDOMSVGNumber replaceItem(nsIDOMSVGNumber newItem, long index);

  nsIDOMSVGNumber removeItem(long index);

  nsIDOMSVGNumber appendItem(nsIDOMSVGNumber newItem);

}