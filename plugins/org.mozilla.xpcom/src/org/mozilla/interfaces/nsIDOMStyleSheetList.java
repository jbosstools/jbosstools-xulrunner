/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/stylesheets/nsIDOMStyleSheetList.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMStyleSheetList extends nsISupports {

  String NS_IDOMSTYLESHEETLIST_IID =
    "{a6cf9081-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMStyleSheetList interface is a datatype for a style sheet
 * list in the Document Object Model.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-Style
 *
 * @status FROZEN
 */
  long getLength();

  nsIDOMStyleSheet item(long index);

}