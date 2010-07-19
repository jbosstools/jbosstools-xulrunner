/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGPathElement.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGPathElement extends nsIDOMSVGElement {

  String NS_IDOMSVGPATHELEMENT_IID =
    "{2b19e692-3338-440f-a998-3cb1e8474999}";

  nsIDOMSVGAnimatedNumber getPathLength();

  float getTotalLength();

  nsIDOMSVGPoint getPointAtLength(float distance);

  long getPathSegAtLength(float distance);

  nsIDOMSVGPathSegClosePath createSVGPathSegClosePath();

  nsIDOMSVGPathSegMovetoAbs createSVGPathSegMovetoAbs(float x, float y);

  nsIDOMSVGPathSegMovetoRel createSVGPathSegMovetoRel(float x, float y);

  nsIDOMSVGPathSegLinetoAbs createSVGPathSegLinetoAbs(float x, float y);

  nsIDOMSVGPathSegLinetoRel createSVGPathSegLinetoRel(float x, float y);

  nsIDOMSVGPathSegCurvetoCubicAbs createSVGPathSegCurvetoCubicAbs(float x, float y, float x1, float y1, float x2, float y2);

  nsIDOMSVGPathSegCurvetoCubicRel createSVGPathSegCurvetoCubicRel(float x, float y, float x1, float y1, float x2, float y2);

  nsIDOMSVGPathSegCurvetoQuadraticAbs createSVGPathSegCurvetoQuadraticAbs(float x, float y, float x1, float y1);

  nsIDOMSVGPathSegCurvetoQuadraticRel createSVGPathSegCurvetoQuadraticRel(float x, float y, float x1, float y1);

  nsIDOMSVGPathSegArcAbs createSVGPathSegArcAbs(float x, float y, float r1, float r2, float angle, boolean largeArcFlag, boolean sweepFlag);

  nsIDOMSVGPathSegArcRel createSVGPathSegArcRel(float x, float y, float r1, float r2, float angle, boolean largeArcFlag, boolean sweepFlag);

  nsIDOMSVGPathSegLinetoHorizontalAbs createSVGPathSegLinetoHorizontalAbs(float x);

  nsIDOMSVGPathSegLinetoHorizontalRel createSVGPathSegLinetoHorizontalRel(float x);

  nsIDOMSVGPathSegLinetoVerticalAbs createSVGPathSegLinetoVerticalAbs(float y);

  nsIDOMSVGPathSegLinetoVerticalRel createSVGPathSegLinetoVerticalRel(float y);

  nsIDOMSVGPathSegCurvetoCubicSmoothAbs createSVGPathSegCurvetoCubicSmoothAbs(float x, float y, float x2, float y2);

  nsIDOMSVGPathSegCurvetoCubicSmoothRel createSVGPathSegCurvetoCubicSmoothRel(float x, float y, float x2, float y2);

  nsIDOMSVGPathSegCurvetoQuadraticSmoothAbs createSVGPathSegCurvetoQuadraticSmoothAbs(float x, float y);

  nsIDOMSVGPathSegCurvetoQuadraticSmoothRel createSVGPathSegCurvetoQuadraticSmoothRel(float x, float y);

}