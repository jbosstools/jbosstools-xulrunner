/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGLengthList.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGLengthList extends nsISupports {

  String NS_IDOMSVGLENGTHLIST_IID =
    "{a8760fcd-3de5-446a-a009-5cf877e7a4df}";

  long getNumberOfItems();

  void clear();

  nsIDOMSVGLength initialize(nsIDOMSVGLength newItem);

  nsIDOMSVGLength getItem(long index);

  nsIDOMSVGLength insertItemBefore(nsIDOMSVGLength newItem, long index);

  nsIDOMSVGLength replaceItem(nsIDOMSVGLength newItem, long index);

  nsIDOMSVGLength removeItem(long index);

  nsIDOMSVGLength appendItem(nsIDOMSVGLength newItem);

}