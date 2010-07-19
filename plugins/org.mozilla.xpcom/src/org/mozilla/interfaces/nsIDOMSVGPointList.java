/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGPointList.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGPointList extends nsISupports {

  String NS_IDOMSVGPOINTLIST_IID =
    "{4c12af24-0fc2-4fe7-b71d-5d6b41d463c1}";

  long getNumberOfItems();

  void clear();

  nsIDOMSVGPoint initialize(nsIDOMSVGPoint newItem);

  nsIDOMSVGPoint getItem(long index);

  nsIDOMSVGPoint insertItemBefore(nsIDOMSVGPoint newItem, long index);

  nsIDOMSVGPoint replaceItem(nsIDOMSVGPoint newItem, long index);

  nsIDOMSVGPoint removeItem(long index);

  nsIDOMSVGPoint appendItem(nsIDOMSVGPoint newItem);

}