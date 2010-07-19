/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGFilters.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGFEMorphologyElement extends nsIDOMSVGFilterPrimitiveStandardAttributes {

  String NS_IDOMSVGFEMORPHOLOGYELEMENT_IID =
    "{16154319-fb5f-4473-b360-5065b6096d33}";

  int SVG_OPERATOR_UNKNOWN = 0;

  int SVG_OPERATOR_ERODE = 1;

  int SVG_OPERATOR_DILATE = 2;

  nsIDOMSVGAnimatedString getIn1();

  nsIDOMSVGAnimatedNumber getRadiusX();

  nsIDOMSVGAnimatedNumber getRadiusY();

  nsIDOMSVGAnimatedEnumeration getOperator();

  void setRadius(float rx, float ry);

}