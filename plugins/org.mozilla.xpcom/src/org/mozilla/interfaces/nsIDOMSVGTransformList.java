/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGTransformList.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGTransformList extends nsISupports {

  String NS_IDOMSVGTRANSFORMLIST_IID =
    "{cee0a9d4-8554-4bf6-bf9b-7d0cebb4269d}";

  long getNumberOfItems();

  void clear();

  nsIDOMSVGTransform initialize(nsIDOMSVGTransform newItem);

  nsIDOMSVGTransform getItem(long index);

  nsIDOMSVGTransform insertItemBefore(nsIDOMSVGTransform newItem, long index);

  nsIDOMSVGTransform replaceItem(nsIDOMSVGTransform newItem, long index);

  nsIDOMSVGTransform removeItem(long index);

  nsIDOMSVGTransform appendItem(nsIDOMSVGTransform newItem);

  nsIDOMSVGTransform createSVGTransformFromMatrix(nsIDOMSVGMatrix matrix);

  nsIDOMSVGTransform consolidate();

}