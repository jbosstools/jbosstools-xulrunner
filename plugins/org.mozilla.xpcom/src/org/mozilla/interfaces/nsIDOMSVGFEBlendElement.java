/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGFilters.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGFEBlendElement extends nsIDOMSVGFilterPrimitiveStandardAttributes {

  String NS_IDOMSVGFEBLENDELEMENT_IID =
    "{8f4daf4c-de2d-450f-a373-449ad62e3800}";

  int SVG_MODE_UNKNOWN = 0;

  int SVG_MODE_NORMAL = 1;

  int SVG_MODE_MULTIPLY = 2;

  int SVG_MODE_SCREEN = 3;

  int SVG_MODE_DARKEN = 4;

  int SVG_MODE_LIGHTEN = 5;

  nsIDOMSVGAnimatedString getIn1();

  nsIDOMSVGAnimatedString getIn2();

  nsIDOMSVGAnimatedEnumeration getMode();

}