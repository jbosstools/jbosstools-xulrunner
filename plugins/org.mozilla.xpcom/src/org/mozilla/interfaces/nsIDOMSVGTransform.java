/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGTransform.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGTransform extends nsISupports {

  String NS_IDOMSVGTRANSFORM_IID =
    "{29cc2e14-6d18-4710-bda9-a88d9d3bc8dc}";

  int SVG_TRANSFORM_UNKNOWN = 0;

  int SVG_TRANSFORM_MATRIX = 1;

  int SVG_TRANSFORM_TRANSLATE = 2;

  int SVG_TRANSFORM_SCALE = 3;

  int SVG_TRANSFORM_ROTATE = 4;

  int SVG_TRANSFORM_SKEWX = 5;

  int SVG_TRANSFORM_SKEWY = 6;

  int getType();

  nsIDOMSVGMatrix getMatrix();

  float getAngle();

  void setMatrix(nsIDOMSVGMatrix matrix);

  void setTranslate(float tx, float ty);

  void setScale(float sx, float sy);

  void setRotate(float angle, float cx, float cy);

  void setSkewX(float angle);

  void setSkewY(float angle);

}