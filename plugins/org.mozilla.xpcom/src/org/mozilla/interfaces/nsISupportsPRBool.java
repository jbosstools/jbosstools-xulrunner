/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsISupportsPrimitives.idl
 */

package org.mozilla.interfaces;

/**
 * The rest are truly primitive and are passed by value
 */
/**
 * Scriptable storage for booleans
 * 
 * @status FROZEN
 */
public interface nsISupportsPRBool extends nsISupportsPrimitive {

  String NS_ISUPPORTSPRBOOL_IID =
    "{ddc3b490-4a1c-11d3-9890-006008962422}";

  boolean getData();

  void setData(boolean aData);

  String toString();

}