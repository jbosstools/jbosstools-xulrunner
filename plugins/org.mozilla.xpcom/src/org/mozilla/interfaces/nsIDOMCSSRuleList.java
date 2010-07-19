/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/css/nsIDOMCSSRuleList.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMCSSRuleList extends nsISupports {

  String NS_IDOMCSSRULELIST_IID =
    "{a6cf90c0-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMCSSRuleList interface is a datatype for a list of CSS
 * style rules in the Document Object Model.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-Style
 *
 * @status FROZEN
 */
  long getLength();

  nsIDOMCSSRule item(long index);

}