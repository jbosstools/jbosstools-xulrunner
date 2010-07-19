/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/css/nsIDOMCSSPrimitiveValue.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMCSSPrimitiveValue extends nsIDOMCSSValue {

  String NS_IDOMCSSPRIMITIVEVALUE_IID =
    "{e249031f-8df9-4e7a-b644-18946dce0019}";

  /**
 * The nsIDOMCSSPrimitiveValue interface is a datatype for a primitive
 * CSS value in the Document Object Model.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-Style
 *
 * @status FROZEN
 */
  int CSS_UNKNOWN = 0;

  int CSS_NUMBER = 1;

  int CSS_PERCENTAGE = 2;

  int CSS_EMS = 3;

  int CSS_EXS = 4;

  int CSS_PX = 5;

  int CSS_CM = 6;

  int CSS_MM = 7;

  int CSS_IN = 8;

  int CSS_PT = 9;

  int CSS_PC = 10;

  int CSS_DEG = 11;

  int CSS_RAD = 12;

  int CSS_GRAD = 13;

  int CSS_MS = 14;

  int CSS_S = 15;

  int CSS_HZ = 16;

  int CSS_KHZ = 17;

  int CSS_DIMENSION = 18;

  int CSS_STRING = 19;

  int CSS_URI = 20;

  int CSS_IDENT = 21;

  int CSS_ATTR = 22;

  int CSS_COUNTER = 23;

  int CSS_RECT = 24;

  int CSS_RGBCOLOR = 25;

  int getPrimitiveType();

  void setFloatValue(int unitType, float floatValue);

  float getFloatValue(int unitType);

  void setStringValue(int stringType, String stringValue);

  String getStringValue();

  nsIDOMCounter getCounterValue();

  nsIDOMRect getRectValue();

  nsIDOMRGBColor getRGBColorValue();

}