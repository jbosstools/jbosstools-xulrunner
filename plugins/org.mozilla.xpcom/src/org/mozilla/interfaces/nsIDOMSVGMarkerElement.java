/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGMarkerElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMSVGMarker interface is the interface to an SVG marker element.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/SVG11/painting.html#InterfaceSVGMarkerElement
 *
 */
public interface nsIDOMSVGMarkerElement extends nsIDOMSVGElement {

  String NS_IDOMSVGMARKERELEMENT_IID =
    "{6a3b7b40-e65a-4e9c-9ee7-ca03ed0a18c7}";

  int SVG_MARKERUNITS_UNKNOWN = 0;

  int SVG_MARKERUNITS_USERSPACEONUSE = 1;

  int SVG_MARKERUNITS_STROKEWIDTH = 2;

  int SVG_MARKER_ORIENT_UNKNOWN = 0;

  int SVG_MARKER_ORIENT_AUTO = 1;

  int SVG_MARKER_ORIENT_ANGLE = 2;

  nsIDOMSVGAnimatedLength getRefX();

  nsIDOMSVGAnimatedLength getRefY();

  nsIDOMSVGAnimatedEnumeration getMarkerUnits();

  nsIDOMSVGAnimatedLength getMarkerWidth();

  nsIDOMSVGAnimatedLength getMarkerHeight();

  nsIDOMSVGAnimatedEnumeration getOrientType();

  nsIDOMSVGAnimatedAngle getOrientAngle();

  void setOrientToAuto();

  void setOrientToAngle(nsIDOMSVGAngle angle);

}