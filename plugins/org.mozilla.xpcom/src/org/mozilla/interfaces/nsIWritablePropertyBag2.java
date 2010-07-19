/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsIWritablePropertyBag2.idl
 */

package org.mozilla.interfaces;

public interface nsIWritablePropertyBag2 extends nsIPropertyBag2 {

  String NS_IWRITABLEPROPERTYBAG2_IID =
    "{9cfd1587-360e-4957-a58f-4c2b1c5e7ed9}";

  void setPropertyAsInt32(String prop, int value);

  void setPropertyAsUint32(String prop, long value);

  void setPropertyAsInt64(String prop, long value);

  void setPropertyAsUint64(String prop, double value);

  void setPropertyAsDouble(String prop, double value);

  void setPropertyAsAString(String prop, String value);

  void setPropertyAsACString(String prop, String value);

  void setPropertyAsAUTF8String(String prop, String value);

  void setPropertyAsBool(String prop, boolean value);

  void setPropertyAsInterface(String prop, nsISupports value);

}