/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsIVariant.idl
 */

package org.mozilla.interfaces;

/**
 * An object that implements nsIVariant may or may NOT also implement this
 * nsIWritableVariant.
 * 
 * If the 'writable' attribute is false then attempts to call any of the 'set'
 * methods can be expected to fail. Setting the 'writable' attribute may or
 * may not succeed.
 *
 */
public interface nsIWritableVariant extends nsIVariant {

  String NS_IWRITABLEVARIANT_IID =
    "{5586a590-8c82-11d5-90f3-0010a4e73d9a}";

  boolean getWritable();

  void setWritable(boolean aWritable);

  void setAsInt8(short aValue);

  void setAsInt16(short aValue);

  void setAsInt32(int aValue);

  void setAsInt64(long aValue);

  void setAsUint8(short aValue);

  void setAsUint16(int aValue);

  void setAsUint32(long aValue);

  void setAsUint64(double aValue);

  void setAsFloat(float aValue);

  void setAsDouble(double aValue);

  void setAsBool(boolean aValue);

  void setAsChar(char aValue);

  void setAsWChar(char aValue);

  void setAsID(String aValue);

  void setAsAString(String aValue);

  void setAsDOMString(String aValue);

  void setAsACString(String aValue);

  void setAsAUTF8String(String aValue);

  void setAsString(String aValue);

  void setAsWString(String aValue);

  void setAsISupports(nsISupports aValue);

  void setAsInterface(String iid, nsISupports iface);

  void setAsStringWithSize(long size, String str);

  void setAsWStringWithSize(long size, String str);

  void setAsVoid();

  void setAsEmpty();

  void setAsEmptyArray();

  void setFromVariant(nsIVariant aValue);

}