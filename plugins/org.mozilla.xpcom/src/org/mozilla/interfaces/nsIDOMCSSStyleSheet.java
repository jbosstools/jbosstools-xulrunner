/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/css/nsIDOMCSSStyleSheet.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMCSSStyleSheet extends nsIDOMStyleSheet {

  String NS_IDOMCSSSTYLESHEET_IID =
    "{a6cf90c2-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMCSSStyleSheet interface is a datatype for a CSS style
 * sheet in the Document Object Model.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-Style
 *
 * @status FROZEN
 */
  nsIDOMCSSRule getOwnerRule();

  nsIDOMCSSRuleList getCssRules();

  long insertRule(String rule, long index);

  void deleteRule(long index);

}