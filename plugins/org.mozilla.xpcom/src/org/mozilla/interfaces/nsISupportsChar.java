/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsISupportsPrimitives.idl
 */

package org.mozilla.interfaces;

/**
 * Scriptable storage for single character values
 * (often used to store an ASCII character)
 * 
 * @status FROZEN
 */
public interface nsISupportsChar extends nsISupportsPrimitive {

  String NS_ISUPPORTSCHAR_IID =
    "{e2b05e40-4a1c-11d3-9890-006008962422}";

  char getData();

  void setData(char aData);

  String toString();

}