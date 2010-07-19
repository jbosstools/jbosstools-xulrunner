/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGFilterElement.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGFilterElement extends nsIDOMSVGElement {

  String NS_IDOMSVGFILTERELEMENT_IID =
    "{9e81d4ae-190c-4b9d-a076-ebc52a7bf231}";

  nsIDOMSVGAnimatedEnumeration getFilterUnits();

  nsIDOMSVGAnimatedEnumeration getPrimitiveUnits();

  nsIDOMSVGAnimatedLength getX();

  nsIDOMSVGAnimatedLength getY();

  nsIDOMSVGAnimatedLength getWidth();

  nsIDOMSVGAnimatedLength getHeight();

  nsIDOMSVGAnimatedInteger getFilterResX();

  nsIDOMSVGAnimatedInteger getFilterResY();

  void setFilterRes(long filterResX, long filterResY);

}