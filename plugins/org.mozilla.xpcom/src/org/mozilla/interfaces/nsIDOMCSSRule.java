/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/css/nsIDOMCSSRule.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMCSSRule extends nsISupports {

  String NS_IDOMCSSRULE_IID =
    "{a6cf90c1-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMCSSRule interface is a datatype for a CSS style rule in
 * the Document Object Model.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-Style
 *
 * @status FROZEN
 */
  int UNKNOWN_RULE = 0;

  int STYLE_RULE = 1;

  int CHARSET_RULE = 2;

  int IMPORT_RULE = 3;

  int MEDIA_RULE = 4;

  int FONT_FACE_RULE = 5;

  int PAGE_RULE = 6;

  int getType();

  String getCssText();

  void setCssText(String aCssText);

  nsIDOMCSSStyleSheet getParentStyleSheet();

  nsIDOMCSSRule getParentRule();

}