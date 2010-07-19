/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsIPropertyBag2.idl
 */

package org.mozilla.interfaces;

public interface nsIPropertyBag2 extends nsIPropertyBag {

  String NS_IPROPERTYBAG2_IID =
    "{625cfd1e-da1e-4417-9ee9-dbc8e0b3fd79}";

  int getPropertyAsInt32(String prop);

  long getPropertyAsUint32(String prop);

  long getPropertyAsInt64(String prop);

  double getPropertyAsUint64(String prop);

  double getPropertyAsDouble(String prop);

  String getPropertyAsAString(String prop);

  String getPropertyAsACString(String prop);

  String getPropertyAsAUTF8String(String prop);

  boolean getPropertyAsBool(String prop);

  /**
   * This method returns null if the value exists, but is null.
   */
  nsISupports getPropertyAsInterface(String prop, String iid);

  /**
   * This method returns null if the value does not exist,
   * or exists but is null.
   */
  nsIVariant get(String prop);

  /**
   * Check for the existence of a key.
   */
  boolean hasKey(String prop);

}