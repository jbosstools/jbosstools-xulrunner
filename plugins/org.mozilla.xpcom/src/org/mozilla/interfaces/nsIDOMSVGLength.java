/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/svg/nsIDOMSVGLength.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMSVGLength extends nsISupports {

  String NS_IDOMSVGLENGTH_IID =
    "{2596325c-aed0-487e-96a1-0a6d589b9c6b}";

  int SVG_LENGTHTYPE_UNKNOWN = 0;

  int SVG_LENGTHTYPE_NUMBER = 1;

  int SVG_LENGTHTYPE_PERCENTAGE = 2;

  int SVG_LENGTHTYPE_EMS = 3;

  int SVG_LENGTHTYPE_EXS = 4;

  int SVG_LENGTHTYPE_PX = 5;

  int SVG_LENGTHTYPE_CM = 6;

  int SVG_LENGTHTYPE_MM = 7;

  int SVG_LENGTHTYPE_IN = 8;

  int SVG_LENGTHTYPE_PT = 9;

  int SVG_LENGTHTYPE_PC = 10;

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