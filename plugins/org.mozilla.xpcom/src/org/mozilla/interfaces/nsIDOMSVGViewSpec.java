/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGViewSpec.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGViewSpec extends nsIDOMSVGZoomAndPan {

  String NS_IDOMSVGVIEWSPEC_IID =
    "{ede34b03-57b6-45bf-a259-3550b5697286}";

  nsIDOMSVGTransformList getTransform();

  nsIDOMSVGElement getViewTarget();

  String getViewBoxString();

  String getPreserveAspectRatioString();

  String getTransformString();

  String getViewTargetString();

}