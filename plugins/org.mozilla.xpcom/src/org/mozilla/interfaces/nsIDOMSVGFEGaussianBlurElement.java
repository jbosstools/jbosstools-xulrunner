/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGFilters.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGFEGaussianBlurElement extends nsIDOMSVGFilterPrimitiveStandardAttributes {

  String NS_IDOMSVGFEGAUSSIANBLURELEMENT_IID =
    "{43ff8d42-3380-4dbd-a916-7c2daa3ed7f4}";

  nsIDOMSVGAnimatedString getIn1();

  nsIDOMSVGAnimatedNumber getStdDeviationX();

  nsIDOMSVGAnimatedNumber getStdDeviationY();

  void setStdDeviation(float stdDeviationX, float stdDeviationY);

}