/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGFilters.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGFEConvolveMatrixElement extends nsIDOMSVGFilterPrimitiveStandardAttributes {

  String NS_IDOMSVGFECONVOLVEMATRIXELEMENT_IID =
    "{42109b58-a8c1-4078-b44c-ec1d5d6b9574}";

  int SVG_EDGEMODE_UNKNOWN = 0;

  int SVG_EDGEMODE_DUPLICATE = 1;

  int SVG_EDGEMODE_WRAP = 2;

  int SVG_EDGEMODE_NONE = 3;

  nsIDOMSVGAnimatedString getIn1();

  nsIDOMSVGAnimatedInteger getOrderX();

  nsIDOMSVGAnimatedInteger getOrderY();

  nsIDOMSVGAnimatedNumberList getKernelMatrix();

  nsIDOMSVGAnimatedNumber getDivisor();

  nsIDOMSVGAnimatedNumber getBias();

  nsIDOMSVGAnimatedInteger getTargetX();

  nsIDOMSVGAnimatedInteger getTargetY();

  nsIDOMSVGAnimatedEnumeration getEdgeMode();

  nsIDOMSVGAnimatedNumber getKernelUnitLengthX();

  nsIDOMSVGAnimatedNumber getKernelUnitLengthY();

  nsIDOMSVGAnimatedBoolean getPreserveAlpha();

}