/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGFilters.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGFEColorMatrixElement extends nsIDOMSVGFilterPrimitiveStandardAttributes {

  String NS_IDOMSVGFECOLORMATRIXELEMENT_IID =
    "{0e966878-ebf1-4455-86fd-f4c7b1f24777}";

  int SVG_FECOLORMATRIX_TYPE_UNKNOWN = 0;

  int SVG_FECOLORMATRIX_TYPE_MATRIX = 1;

  int SVG_FECOLORMATRIX_TYPE_SATURATE = 2;

  int SVG_FECOLORMATRIX_TYPE_HUE_ROTATE = 3;

  int SVG_FECOLORMATRIX_TYPE_LUMINANCE_TO_ALPHA = 4;

  nsIDOMSVGAnimatedString getIn1();

  nsIDOMSVGAnimatedEnumeration getType();

  nsIDOMSVGAnimatedNumberList getValues();

}