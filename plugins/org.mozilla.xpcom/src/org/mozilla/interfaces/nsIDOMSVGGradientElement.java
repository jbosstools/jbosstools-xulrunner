/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGGradientElement.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGGradientElement extends nsIDOMSVGElement {

  String NS_IDOMSVGGRADIENTELEMENT_IID =
    "{988b2de4-137b-4bb8-a15e-fe94038e9cf3}";

  int SVG_SPREADMETHOD_UNKNOWN = 0;

  int SVG_SPREADMETHOD_PAD = 1;

  int SVG_SPREADMETHOD_REFLECT = 2;

  int SVG_SPREADMETHOD_REPEAT = 3;

  nsIDOMSVGAnimatedEnumeration getGradientUnits();

  nsIDOMSVGAnimatedTransformList getGradientTransform();

  nsIDOMSVGAnimatedEnumeration getSpreadMethod();

}