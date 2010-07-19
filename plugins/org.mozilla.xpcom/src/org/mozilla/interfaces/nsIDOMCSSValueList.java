/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/css/nsIDOMCSSValueList.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMCSSValueList extends nsIDOMCSSValue {

  String NS_IDOMCSSVALUELIST_IID =
    "{8f09fa84-39b9-4dca-9b2f-db0eeb186286}";

  /**
 * The nsIDOMCSSValueList interface is a datatype for a list of CSS
 * values in the Document Object Model.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-Style
 *
 * @status FROZEN
 */
  long getLength();

  nsIDOMCSSValue item(long index);

}