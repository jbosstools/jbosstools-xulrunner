/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/css/nsIDOMCSSValue.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMCSSValue extends nsISupports {

  String NS_IDOMCSSVALUE_IID =
    "{009f7ea5-9e80-41be-b008-db62f10823f2}";

  /**
 * The nsIDOMCSSValue interface is a datatype for a CSS value in the
 * Document Object Model.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-Style
 *
 * @status FROZEN
 */
  int CSS_INHERIT = 0;

  int CSS_PRIMITIVE_VALUE = 1;

  int CSS_VALUE_LIST = 2;

  int CSS_CUSTOM = 3;

  String getCssText();

  void setCssText(String aCssText);

  int getCssValueType();

}