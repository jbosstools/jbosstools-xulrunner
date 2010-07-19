/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsISupportsPrimitives.idl
 */

package org.mozilla.interfaces;

/**
 * Scriptable storage for NSPR date/time values
 * 
 * @status FROZEN
 */
public interface nsISupportsPRTime extends nsISupportsPrimitive {

  String NS_ISUPPORTSPRTIME_IID =
    "{e2563630-4a1c-11d3-9890-006008962422}";

  double getData();

  void setData(double aData);

  String toString();

}