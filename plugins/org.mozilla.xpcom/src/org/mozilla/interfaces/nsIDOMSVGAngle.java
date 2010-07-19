/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGAngle.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMSVGAngle interface is the interface to an SVG angle.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/SVG11/types.html#InterfaceSVGAngle
 *
 */
public interface nsIDOMSVGAngle extends nsISupports {

  String NS_IDOMSVGANGLE_IID =
    "{58b6190e-37b3-412a-ba02-1d5ad6c6ea7c}";

  int SVG_ANGLETYPE_UNKNOWN = 0;

  int SVG_ANGLETYPE_UNSPECIFIED = 1;

  int SVG_ANGLETYPE_DEG = 2;

  int SVG_ANGLETYPE_RAD = 3;

  int SVG_ANGLETYPE_GRAD = 4;

  int getUnitType();

  float getValue();

  void setValue(float aValue);

  float getValueInSpecifiedUnits();

  void setValueInSpecifiedUnits(float aValueInSpecifiedUnits);

  String getValueAsString();

  void setValueAsString(String aValueAsString);

  void newValueSpecifiedUnits(int unitType, float valueInSpecifiedUnits);

  void convertToSpecifiedUnits(int unitType);

}