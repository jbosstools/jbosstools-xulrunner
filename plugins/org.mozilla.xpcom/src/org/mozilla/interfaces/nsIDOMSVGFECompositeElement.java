/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGFilters.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGFECompositeElement extends nsIDOMSVGFilterPrimitiveStandardAttributes {

  String NS_IDOMSVGFECOMPOSITEELEMENT_IID =
    "{6ff3c539-1a3b-4a3f-8acd-354d349eb7fc}";

  int SVG_OPERATOR_UNKNOWN = 0;

  int SVG_OPERATOR_OVER = 1;

  int SVG_OPERATOR_IN = 2;

  int SVG_OPERATOR_OUT = 3;

  int SVG_OPERATOR_ATOP = 4;

  int SVG_OPERATOR_XOR = 5;

  int SVG_OPERATOR_ARITHMETIC = 6;

  nsIDOMSVGAnimatedString getIn1();

  nsIDOMSVGAnimatedString getIn2();

  nsIDOMSVGAnimatedNumber getK1();

  nsIDOMSVGAnimatedNumber getK2();

  nsIDOMSVGAnimatedNumber getK3();

  nsIDOMSVGAnimatedNumber getK4();

  nsIDOMSVGAnimatedEnumeration getOperator();

  void setK(float k1, float k2, float k3, float k4);

}