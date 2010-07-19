/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGPathSegList.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGPathSegList extends nsISupports {

  String NS_IDOMSVGPATHSEGLIST_IID =
    "{94a6db98-3f34-4529-a35f-89ef49713795}";

  long getNumberOfItems();

  void clear();

  nsIDOMSVGPathSeg initialize(nsIDOMSVGPathSeg newItem);

  nsIDOMSVGPathSeg getItem(long index);

  nsIDOMSVGPathSeg insertItemBefore(nsIDOMSVGPathSeg newItem, long index);

  nsIDOMSVGPathSeg replaceItem(nsIDOMSVGPathSeg newItem, long index);

  nsIDOMSVGPathSeg removeItem(long index);

  nsIDOMSVGPathSeg appendItem(nsIDOMSVGPathSeg newItem);

}