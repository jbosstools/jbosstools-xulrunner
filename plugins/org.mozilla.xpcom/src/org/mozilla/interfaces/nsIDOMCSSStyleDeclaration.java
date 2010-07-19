/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/css/nsIDOMCSSStyleDeclaration.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMCSSStyleDeclaration extends nsISupports {

  String NS_IDOMCSSSTYLEDECLARATION_IID =
    "{a6cf90be-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMCSSStyleDeclaration interface is a datatype for a CSS
 * style declaration in the Document Object Model.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-Style
 *
 * @status FROZEN
 */
  String getCssText();

  /**
 * The nsIDOMCSSStyleDeclaration interface is a datatype for a CSS
 * style declaration in the Document Object Model.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-Style
 *
 * @status FROZEN
 */
  void setCssText(String aCssText);

  String getPropertyValue(String propertyName);

  nsIDOMCSSValue getPropertyCSSValue(String propertyName);

  String removeProperty(String propertyName);

  String getPropertyPriority(String propertyName);

  void setProperty(String propertyName, String value, String priority);

  long getLength();

  String item(long index);

  nsIDOMCSSRule getParentRule();

}