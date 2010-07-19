/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsIProperty.idl
 */

package org.mozilla.interfaces;

public interface nsIProperty extends nsISupports {

  String NS_IPROPERTY_IID =
    "{6dcf9030-a49f-11d5-910d-0010a4e73d9a}";

  /**
     * Get the name of the property.
     */
  String getName();

  /**
     * Get the value of the property.
     */
  nsIVariant getValue();

}