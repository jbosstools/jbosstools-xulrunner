/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsISupportsPrimitives.idl
 */

package org.mozilla.interfaces;

/**
 * Primitive base interface.
 *
 * These first three are pointer types and do data copying
 * using the nsIMemory. Be careful!
 *
 * @status FROZEN
 */
public interface nsISupportsPrimitive extends nsISupports {

  String NS_ISUPPORTSPRIMITIVE_IID =
    "{d0d4b136-1dd1-11b2-9371-f0727ef827c0}";

  int TYPE_ID = 1;

  int TYPE_CSTRING = 2;

  int TYPE_STRING = 3;

  int TYPE_PRBOOL = 4;

  int TYPE_PRUINT8 = 5;

  int TYPE_PRUINT16 = 6;

  int TYPE_PRUINT32 = 7;

  int TYPE_PRUINT64 = 8;

  int TYPE_PRTIME = 9;

  int TYPE_CHAR = 10;

  int TYPE_PRINT16 = 11;

  int TYPE_PRINT32 = 12;

  int TYPE_PRINT64 = 13;

  int TYPE_FLOAT = 14;

  int TYPE_DOUBLE = 15;

  int TYPE_VOID = 16;

  int TYPE_INTERFACE_POINTER = 17;

  int getType();

}