/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGFilters.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGComponentTransferFunctionElement extends nsIDOMSVGElement {

  String NS_IDOMSVGCOMPONENTTRANSFERFUNCTIONELEMENT_IID =
    "{cb615c0f-8d4a-4e30-9695-a3dd6f4216ee}";

  int SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN = 0;

  int SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY = 1;

  int SVG_FECOMPONENTTRANSFER_TYPE_TABLE = 2;

  int SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE = 3;

  int SVG_FECOMPONENTTRANSFER_TYPE_LINEAR = 4;

  int SVG_FECOMPONENTTRANSFER_TYPE_GAMMA = 5;

  nsIDOMSVGAnimatedEnumeration getType();

  nsIDOMSVGAnimatedNumberList getTableValues();

  nsIDOMSVGAnimatedNumber getSlope();

  nsIDOMSVGAnimatedNumber getIntercept();

  nsIDOMSVGAnimatedNumber getAmplitude();

  nsIDOMSVGAnimatedNumber getExponent();

  nsIDOMSVGAnimatedNumber getOffset();

}