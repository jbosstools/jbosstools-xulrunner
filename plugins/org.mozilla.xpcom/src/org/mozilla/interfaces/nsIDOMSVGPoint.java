/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGPoint.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGPoint extends nsISupports {

  String NS_IDOMSVGPOINT_IID =
    "{45f18f8f-1315-4447-a7d5-8aeca77bdcaf}";

  float getX();

  void setX(float aX);

  float getY();

  void setY(float aY);

  nsIDOMSVGPoint matrixTransform(nsIDOMSVGMatrix matrix);

}