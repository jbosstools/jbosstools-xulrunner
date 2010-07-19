/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGFilters.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGFETurbulenceElement extends nsIDOMSVGFilterPrimitiveStandardAttributes {

  String NS_IDOMSVGFETURBULENCEELEMENT_IID =
    "{77bc4d70-0d49-4c81-b7a7-7432f0fe3e04}";

  int SVG_TURBULENCE_TYPE_UNKNOWN = 0;

  int SVG_TURBULENCE_TYPE_FRACTALNOISE = 1;

  int SVG_TURBULENCE_TYPE_TURBULENCE = 2;

  int SVG_STITCHTYPE_UNKNOWN = 0;

  int SVG_STITCHTYPE_STITCH = 1;

  int SVG_STITCHTYPE_NOSTITCH = 2;

  nsIDOMSVGAnimatedNumber getBaseFrequencyX();

  nsIDOMSVGAnimatedNumber getBaseFrequencyY();

  nsIDOMSVGAnimatedInteger getNumOctaves();

  nsIDOMSVGAnimatedNumber getSeed();

  nsIDOMSVGAnimatedEnumeration getStitchTiles();

  nsIDOMSVGAnimatedEnumeration getType();

}