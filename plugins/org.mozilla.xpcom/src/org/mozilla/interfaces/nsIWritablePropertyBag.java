/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsIWritablePropertyBag.idl
 */

package org.mozilla.interfaces;

public interface nsIWritablePropertyBag extends nsIPropertyBag {

  String NS_IWRITABLEPROPERTYBAG_IID =
    "{96fc4671-eeb4-4823-9421-e50fb70ad353}";

  /**
     * Set a property with the given name to the given value.  If
     * a property already exists with the given name, it is
     * overwritten.
     */
  void setProperty(String name, nsIVariant value);

  /**
     * Delete a property with the given name.
     * @throws NS_ERROR_FAILURE if a property with that name doesn't
     * exist.
     */
  void deleteProperty(String name);

}