/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsIPropertyBag.idl
 */

package org.mozilla.interfaces;

public interface nsIPropertyBag extends nsISupports {

  String NS_IPROPERTYBAG_IID =
    "{bfcd37b0-a49f-11d5-910d-0010a4e73d9a}";

  /**
     * Get a nsISimpleEnumerator whose elements are nsIProperty objects.
     */
  nsISimpleEnumerator getEnumerator();

  /**
     * Get a property value for the given name.
     * @throws NS_ERROR_FAILURE if a property with that name doesn't
     * exist.
     */
  nsIVariant getProperty(String name);

}